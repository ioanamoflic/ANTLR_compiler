grammar lexAnalysis;

start: (expr NEWLINE?)*;

expr:	number
    |   expr SEMI_COLON
    |	LEFT_PAR expr RIGHT_PAR
    |   LEFT_PAR expr
    |   expr RIGHT_PAR
    |   expr WS expr
    |   expr NEWLINE
    |   DIGIT
    |   NOT_NULL_DIGIT
    |   WS
    |   NEWLINE
    |   CHAR
    |   WORD
    |   BOOLEAN
    |   method
    |   instructions
    |   VAR
    |   COMMENT
    |   TEXT_TYPE
    |   assignment
    ;

assignment           :  id ASSIGN id_assign;
assignment_expr      : assignment SEMI_COLON;
define_var           :  DATATYPE (VAR|assignment) SEMI_COLON;

parameter_method     :   ((DATATYPE REF? (WORD|CHAR|VAR))|parameter_call_function);
parameter_call_function: (TEXT_TYPE|number|VAR);
method               :  METHOD_NAME LEFT_PAR (parameter_method)?(( COMMA (parameter_method))+)? RIGHT_PAR block_instructions;
call_method          :  METHOD_NAME LEFT_PAR (parameter_call_function)?(( COMMA (parameter_call_function))+)? RIGHT_PAR SEMI_COLON;

pre_increment        : INCR id;
pre_decrement        : DECR id;
post_increment       : id INCR;
post_decrement       : id DECR;
incr_decr            : (pre_increment|pre_decrement|post_increment|post_decrement);
incr_decr_expr       : incr_decr SEMI_COLON;

//math_expression      :  (WORD|CHAR|number|VAR) ((SIGN|MULT|DIV|POW) (WORD|CHAR|number|VAR))+;
math_by              :  id (ADD_TO|SUB_FROM|MULT_BY|DIV_BY) (id|number);
operator_expression  :  operator_expression (MULT|DIV) operator_expression
                        | operator_expression (SIGN) operator_expression
                        | VAR ASSIGN operator_expression
                        | LEFT_PAR operator_expression RIGHT_PAR
                        | math_by
                        | (WORD|CHAR|number|VAR);
comparator           :  (id|number|operator_expression|incr_decr) (GREATER_EQUAL|GREATER_THAN|LOWER_EQUAL|LOWER_THAN|DIFFERENT|EQUAL) (number|id|operator_expression|BOOLEAN|incr_decr);

for_rule             : FOR LEFT_PAR first_statement second_statement third_statement RIGHT_PAR block_instructions;
first_statement      : (define_var|assignment SEMI_COLON) ;
second_statement     : (assignment| comparator) SEMI_COLON;
third_statement      :  (assignment|incr_decr|math_by);

while_rule           : WHILE LEFT_PAR(comparator|BOOLEAN|number) (((AND|OR)? (comparator|BOOLEAN|number))+)? RIGHT_PAR block_instructions;

if_rule              : IF LEFT_PAR(comparator) (((AND|OR)? comparator)+)? RIGHT_PAR block_instructions 'else'? block_instructions?;

number               : (TINY|SIGNED_TINY|DOUBLE|SIGNED_DOUBLE|HUGE|SIGNED_HUGE|EXPONENTIAL|SIGNED_EXPONENTIAL|'0');

instructions         : (define_var|assignment_expr|if_rule|for_rule|do_while_rule|while_rule|math_by|operator_expression|incr_decr_expr|call_method|switch_rule|BREAK)+;
block_instructions   : LEFT_BR (instructions|NEWLINE*) RIGHT_BR;

while_do             :  WHILE LEFT_PAR(comparator|BOOLEAN|number) (((AND|OR)? (comparator|BOOLEAN|number))+)? RIGHT_PAR SEMI_COLON;
do_while_rule        : DO block_instructions while_do ;

switch_rule          : SWITCH LEFT_PAR VAR RIGHT_PAR LEFT_BR (switch_case+) (default_case)? RIGHT_BR;

switch_case          : CASE (number|TEXT_TYPE) COLON block_instructions;
default_case         : DEFAULT COLON block_instructions;
id                   :(WORD|CHAR|VAR);
id_assign            :(number|CHAR|WORD|BOOLEAN|operator_expression|TEXT_TYPE);
TEXT_TYPE            : '"' (WORD|CHAR|TINY|'!'|'@'|'#'|SIGN|'%'|'$'|'&'|'*'|LEFT_PAR|RIGHT_PAR|'_'|'='|','|'.'|' ')* '"';

TINY 		         : (NOT_NULL_DIGIT)(DIGIT)?(DIGIT)?(DIGIT)?(DIGIT)?(DIGIT)?(DIGIT)?(DIGIT)?(DIGIT)?;
SIGNED_TINY          : (LEFT_PAR)(MINUS)TINY(RIGHT_PAR);
HUGE		         : NOT_NULL_DIGIT (DIGIT+);
SIGNED_HUGE          : (LEFT_PAR)(MINUS)HUGE(RIGHT_PAR);
DOUBLE               : ((NOT_NULL_DIGIT)(DIGIT+)([.]DIGIT+) | (DIGIT)([.]DIGIT+));
SIGNED_DOUBLE        : (LEFT_PAR)(MINUS)DOUBLE(RIGHT_PAR);
EXPONENTIAL          : ((NOT_NULL_DIGIT+)([.]DIGIT+)?([Ee][+-]DIGIT*) |  (DIGIT)([.]DIGIT+)?([Ee][+-]DIGIT*));
SIGNED_EXPONENTIAL   : (LEFT_PAR)(MINUS)EXPONENTIAL(RIGHT_PAR);

BREAK 		    : 'break;';
WHILE		    : 'while';
IF		        : 'if';
ELSE		    : 'else';
FOR		        : 'for';
SWITCH		    : 'switch';
CASE		    : 'case';
DEFAULT		    : 'default';
DO		        : 'do';
MAIN		    : 'main';

INSTRUCTION     : (BREAK|WHILE|IF|ELSE|FOR|SWITCH|CASE|DEFAULT|DO|MAIN);

BOOLEAN		    : (TRUE|FALSE);
TRUE            : 'true';
FALSE           : 'false';

METHOD_NAME     : 'function ' (WORD|CHAR);
DATATYPE        : (LET|CONST);
VAR             : (CHAR|WORD) (TINY|CHAR|WORD)*;
WORD		    : CHAR+;

NOT_NULL_DIGIT  : [1-9];
DIGIT  		    : [0-9];
SIGN		    : (PLUS|MINUS);
CHAR  		    : (LOWERCASE|UPPERCASE);

PLUS		    : '+';
MINUS		    : '-';
LOWERCASE       : [a-z];
UPPERCASE       : [A-Z];

NEWLINE 	    : ('\n')+ -> skip;
WS	            : (' '|'\t'|'\r')+ -> skip;
COMMENT		    : '##' (WORD|WS)+ -> skip;

CONST 		    : 'const';
LET             : 'let';

COMMA           : ',';
SEMI_COLON	    : ';';
COLON    	    : ':' ;
MULT	        : '*';
DIV		        : '/' ;
MOD		        : '%' ;
LEFT_PAR		: '(' ;
RIGHT_PAR		: ')' ;
LEFT_BR         : '{';
RIGHT_BR         : '}';
ASSIGN	        : '=';
NOT 		    : '!' ;
AND 		    : '&&';
REF	            : '&' ;
OR		        : '||';
GREATER_THAN	: '>' ;
GREATER_EQUAL	: '>=';
LOWER_THAN      : '<' ;
LOWER_EQUAL     : '<=';
EQUAL		    : '==';
DIFFERENT		: '!=';
INCR		    : '++';
DECR		    : '--';
ADD_TO          : '+=';
SUB_FROM        : '-=';
MULT_BY         : '*=';
DIV_BY		    : '/=';
POW		        : '**';