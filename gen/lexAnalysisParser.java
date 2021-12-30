// Generated from E:/Cursuri/AN 2/LFC/Compilator Final/Compiler/out/production/Compiler\lexAnalysis.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lexAnalysisParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TEXT_TYPE=2, TINY=3, SIGNED_TINY=4, HUGE=5, SIGNED_HUGE=6, DOUBLE=7, 
		SIGNED_DOUBLE=8, EXPONENTIAL=9, SIGNED_EXPONENTIAL=10, BREAK=11, WHILE=12, 
		IF=13, ELSE=14, FOR=15, SWITCH=16, CASE=17, DEFAULT=18, DO=19, MAIN=20, 
		INSTRUCTION=21, BOOLEAN=22, TRUE=23, FALSE=24, METHOD_NAME=25, DATATYPE=26, 
		VAR=27, WORD=28, NOT_NULL_DIGIT=29, DIGIT=30, SIGN=31, CHAR=32, PLUS=33, 
		MINUS=34, LOWERCASE=35, UPPERCASE=36, NEWLINE=37, WS=38, COMMENT=39, CONST=40, 
		LET=41, COMMA=42, SEMI_COLON=43, COLON=44, MULT=45, DIV=46, MOD=47, LEFT_PAR=48, 
		RIGHT_PAR=49, LEFT_BR=50, RIGHT_BR=51, ASSIGN=52, NOT=53, AND=54, REF=55, 
		OR=56, GREATER_THAN=57, GREATER_EQUAL=58, LOWER_THAN=59, LOWER_EQUAL=60, 
		EQUAL=61, DIFFERENT=62, INCR=63, DECR=64, ADD_TO=65, SUB_FROM=66, MULT_BY=67, 
		DIV_BY=68, POW=69;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_assignment = 2, RULE_assignment_expr = 3, 
		RULE_define_var = 4, RULE_parameter_method = 5, RULE_parameter_call_function = 6, 
		RULE_method = 7, RULE_call_method = 8, RULE_pre_increment = 9, RULE_pre_decrement = 10, 
		RULE_post_increment = 11, RULE_post_decrement = 12, RULE_incr_decr = 13, 
		RULE_incr_decr_expr = 14, RULE_math_by = 15, RULE_operator_expression = 16, 
		RULE_comparator = 17, RULE_for_rule = 18, RULE_first_statement = 19, RULE_second_statement = 20, 
		RULE_third_statement = 21, RULE_while_rule = 22, RULE_if_rule = 23, RULE_number = 24, 
		RULE_instructions = 25, RULE_block_instructions = 26, RULE_while_do = 27, 
		RULE_do_while_rule = 28, RULE_switch_rule = 29, RULE_switch_case = 30, 
		RULE_default_case = 31, RULE_id = 32, RULE_id_assign = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "assignment", "assignment_expr", "define_var", "parameter_method", 
			"parameter_call_function", "method", "call_method", "pre_increment", 
			"pre_decrement", "post_increment", "post_decrement", "incr_decr", "incr_decr_expr", 
			"math_by", "operator_expression", "comparator", "for_rule", "first_statement", 
			"second_statement", "third_statement", "while_rule", "if_rule", "number", 
			"instructions", "block_instructions", "while_do", "do_while_rule", "switch_rule", 
			"switch_case", "default_case", "id", "id_assign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", null, null, null, null, null, null, null, null, null, "'break;'", 
			"'while'", "'if'", "'else'", "'for'", "'switch'", "'case'", "'default'", 
			"'do'", "'main'", null, null, "'true'", "'false'", null, null, null, 
			null, null, null, null, null, "'+'", "'-'", null, null, null, null, null, 
			"'const'", "'let'", "','", "';'", "':'", "'*'", "'/'", "'%'", "'('", 
			"')'", "'{'", "'}'", "'='", "'!'", "'&&'", "'&'", "'||'", "'>'", "'>='", 
			"'<'", "'<='", "'=='", "'!='", "'++'", "'--'", "'+='", "'-='", "'*='", 
			"'/='", "'**'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TEXT_TYPE", "TINY", "SIGNED_TINY", "HUGE", "SIGNED_HUGE", 
			"DOUBLE", "SIGNED_DOUBLE", "EXPONENTIAL", "SIGNED_EXPONENTIAL", "BREAK", 
			"WHILE", "IF", "ELSE", "FOR", "SWITCH", "CASE", "DEFAULT", "DO", "MAIN", 
			"INSTRUCTION", "BOOLEAN", "TRUE", "FALSE", "METHOD_NAME", "DATATYPE", 
			"VAR", "WORD", "NOT_NULL_DIGIT", "DIGIT", "SIGN", "CHAR", "PLUS", "MINUS", 
			"LOWERCASE", "UPPERCASE", "NEWLINE", "WS", "COMMENT", "CONST", "LET", 
			"COMMA", "SEMI_COLON", "COLON", "MULT", "DIV", "MOD", "LEFT_PAR", "RIGHT_PAR", 
			"LEFT_BR", "RIGHT_BR", "ASSIGN", "NOT", "AND", "REF", "OR", "GREATER_THAN", 
			"GREATER_EQUAL", "LOWER_THAN", "LOWER_EQUAL", "EQUAL", "DIFFERENT", "INCR", 
			"DECR", "ADD_TO", "SUB_FROM", "MULT_BY", "DIV_BY", "POW"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "lexAnalysis.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lexAnalysisParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(lexAnalysisParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(lexAnalysisParser.NEWLINE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (TEXT_TYPE - 1)) | (1L << (TINY - 1)) | (1L << (SIGNED_TINY - 1)) | (1L << (HUGE - 1)) | (1L << (SIGNED_HUGE - 1)) | (1L << (DOUBLE - 1)) | (1L << (SIGNED_DOUBLE - 1)) | (1L << (EXPONENTIAL - 1)) | (1L << (SIGNED_EXPONENTIAL - 1)) | (1L << (BREAK - 1)) | (1L << (WHILE - 1)) | (1L << (IF - 1)) | (1L << (FOR - 1)) | (1L << (SWITCH - 1)) | (1L << (DO - 1)) | (1L << (BOOLEAN - 1)) | (1L << (METHOD_NAME - 1)) | (1L << (DATATYPE - 1)) | (1L << (VAR - 1)) | (1L << (WORD - 1)) | (1L << (NOT_NULL_DIGIT - 1)) | (1L << (DIGIT - 1)) | (1L << (CHAR - 1)) | (1L << (NEWLINE - 1)) | (1L << (WS - 1)) | (1L << (COMMENT - 1)) | (1L << (LEFT_PAR - 1)) | (1L << (INCR - 1)) | (1L << (DECR - 1)))) != 0)) {
				{
				{
				setState(68);
				expr(0);
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(69);
					match(NEWLINE);
					}
					break;
				}
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode LEFT_PAR() { return getToken(lexAnalysisParser.LEFT_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHT_PAR() { return getToken(lexAnalysisParser.RIGHT_PAR, 0); }
		public TerminalNode DIGIT() { return getToken(lexAnalysisParser.DIGIT, 0); }
		public TerminalNode NOT_NULL_DIGIT() { return getToken(lexAnalysisParser.NOT_NULL_DIGIT, 0); }
		public TerminalNode WS() { return getToken(lexAnalysisParser.WS, 0); }
		public TerminalNode NEWLINE() { return getToken(lexAnalysisParser.NEWLINE, 0); }
		public TerminalNode CHAR() { return getToken(lexAnalysisParser.CHAR, 0); }
		public TerminalNode WORD() { return getToken(lexAnalysisParser.WORD, 0); }
		public TerminalNode BOOLEAN() { return getToken(lexAnalysisParser.BOOLEAN, 0); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode VAR() { return getToken(lexAnalysisParser.VAR, 0); }
		public TerminalNode COMMENT() { return getToken(lexAnalysisParser.COMMENT, 0); }
		public TerminalNode TEXT_TYPE() { return getToken(lexAnalysisParser.TEXT_TYPE, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(lexAnalysisParser.SEMI_COLON, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(78);
				number();
				}
				break;
			case 2:
				{
				setState(79);
				match(LEFT_PAR);
				setState(80);
				expr(0);
				setState(81);
				match(RIGHT_PAR);
				}
				break;
			case 3:
				{
				setState(83);
				match(LEFT_PAR);
				setState(84);
				expr(17);
				}
				break;
			case 4:
				{
				setState(85);
				match(DIGIT);
				}
				break;
			case 5:
				{
				setState(86);
				match(NOT_NULL_DIGIT);
				}
				break;
			case 6:
				{
				setState(87);
				match(WS);
				}
				break;
			case 7:
				{
				setState(88);
				match(NEWLINE);
				}
				break;
			case 8:
				{
				setState(89);
				match(CHAR);
				}
				break;
			case 9:
				{
				setState(90);
				match(WORD);
				}
				break;
			case 10:
				{
				setState(91);
				match(BOOLEAN);
				}
				break;
			case 11:
				{
				setState(92);
				method();
				}
				break;
			case 12:
				{
				setState(93);
				instructions();
				}
				break;
			case 13:
				{
				setState(94);
				match(VAR);
				}
				break;
			case 14:
				{
				setState(95);
				match(COMMENT);
				}
				break;
			case 15:
				{
				setState(96);
				match(TEXT_TYPE);
				}
				break;
			case 16:
				{
				setState(97);
				assignment();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(101);
						match(WS);
						setState(102);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(104);
						match(SEMI_COLON);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(106);
						match(RIGHT_PAR);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(108);
						match(NEWLINE);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(lexAnalysisParser.ASSIGN, 0); }
		public Id_assignContext id_assign() {
			return getRuleContext(Id_assignContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			id();
			setState(115);
			match(ASSIGN);
			setState(116);
			id_assign();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_exprContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(lexAnalysisParser.SEMI_COLON, 0); }
		public Assignment_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterAssignment_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitAssignment_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitAssignment_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_exprContext assignment_expr() throws RecognitionException {
		Assignment_exprContext _localctx = new Assignment_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			assignment();
			setState(119);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_varContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(lexAnalysisParser.DATATYPE, 0); }
		public TerminalNode SEMI_COLON() { return getToken(lexAnalysisParser.SEMI_COLON, 0); }
		public TerminalNode VAR() { return getToken(lexAnalysisParser.VAR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Define_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterDefine_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitDefine_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitDefine_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_varContext define_var() throws RecognitionException {
		Define_varContext _localctx = new Define_varContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_define_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(DATATYPE);
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(122);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(123);
				assignment();
				}
				break;
			}
			setState(126);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_methodContext extends ParserRuleContext {
		public Parameter_call_functionContext parameter_call_function() {
			return getRuleContext(Parameter_call_functionContext.class,0);
		}
		public TerminalNode DATATYPE() { return getToken(lexAnalysisParser.DATATYPE, 0); }
		public TerminalNode WORD() { return getToken(lexAnalysisParser.WORD, 0); }
		public TerminalNode CHAR() { return getToken(lexAnalysisParser.CHAR, 0); }
		public TerminalNode VAR() { return getToken(lexAnalysisParser.VAR, 0); }
		public TerminalNode REF() { return getToken(lexAnalysisParser.REF, 0); }
		public Parameter_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterParameter_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitParameter_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitParameter_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_methodContext parameter_method() throws RecognitionException {
		Parameter_methodContext _localctx = new Parameter_methodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATATYPE:
				{
				{
				setState(128);
				match(DATATYPE);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REF) {
					{
					setState(129);
					match(REF);
					}
				}

				setState(132);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << WORD) | (1L << CHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case T__0:
			case TEXT_TYPE:
			case TINY:
			case SIGNED_TINY:
			case HUGE:
			case SIGNED_HUGE:
			case DOUBLE:
			case SIGNED_DOUBLE:
			case EXPONENTIAL:
			case SIGNED_EXPONENTIAL:
			case VAR:
				{
				setState(133);
				parameter_call_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_call_functionContext extends ParserRuleContext {
		public TerminalNode TEXT_TYPE() { return getToken(lexAnalysisParser.TEXT_TYPE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode VAR() { return getToken(lexAnalysisParser.VAR, 0); }
		public Parameter_call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterParameter_call_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitParameter_call_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitParameter_call_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_call_functionContext parameter_call_function() throws RecognitionException {
		Parameter_call_functionContext _localctx = new Parameter_call_functionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter_call_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_TYPE:
				{
				setState(136);
				match(TEXT_TYPE);
				}
				break;
			case T__0:
			case TINY:
			case SIGNED_TINY:
			case HUGE:
			case SIGNED_HUGE:
			case DOUBLE:
			case SIGNED_DOUBLE:
			case EXPONENTIAL:
			case SIGNED_EXPONENTIAL:
				{
				setState(137);
				number();
				}
				break;
			case VAR:
				{
				setState(138);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode METHOD_NAME() { return getToken(lexAnalysisParser.METHOD_NAME, 0); }
		public TerminalNode LEFT_PAR() { return getToken(lexAnalysisParser.LEFT_PAR, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(lexAnalysisParser.RIGHT_PAR, 0); }
		public Block_instructionsContext block_instructions() {
			return getRuleContext(Block_instructionsContext.class,0);
		}
		public List<Parameter_methodContext> parameter_method() {
			return getRuleContexts(Parameter_methodContext.class);
		}
		public Parameter_methodContext parameter_method(int i) {
			return getRuleContext(Parameter_methodContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(lexAnalysisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(lexAnalysisParser.COMMA, i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(METHOD_NAME);
			setState(142);
			match(LEFT_PAR);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TEXT_TYPE) | (1L << TINY) | (1L << SIGNED_TINY) | (1L << HUGE) | (1L << SIGNED_HUGE) | (1L << DOUBLE) | (1L << SIGNED_DOUBLE) | (1L << EXPONENTIAL) | (1L << SIGNED_EXPONENTIAL) | (1L << DATATYPE) | (1L << VAR))) != 0)) {
				{
				setState(143);
				parameter_method();
				}
			}

			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(146);
					match(COMMA);
					{
					setState(147);
					parameter_method();
					}
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(154);
			match(RIGHT_PAR);
			setState(155);
			block_instructions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_methodContext extends ParserRuleContext {
		public TerminalNode METHOD_NAME() { return getToken(lexAnalysisParser.METHOD_NAME, 0); }
		public TerminalNode LEFT_PAR() { return getToken(lexAnalysisParser.LEFT_PAR, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(lexAnalysisParser.RIGHT_PAR, 0); }
		public TerminalNode SEMI_COLON() { return getToken(lexAnalysisParser.SEMI_COLON, 0); }
		public List<Parameter_call_functionContext> parameter_call_function() {
			return getRuleContexts(Parameter_call_functionContext.class);
		}
		public Parameter_call_functionContext parameter_call_function(int i) {
			return getRuleContext(Parameter_call_functionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(lexAnalysisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(lexAnalysisParser.COMMA, i);
		}
		public Call_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterCall_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitCall_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitCall_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_methodContext call_method() throws RecognitionException {
		Call_methodContext _localctx = new Call_methodContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_call_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(METHOD_NAME);
			setState(158);
			match(LEFT_PAR);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TEXT_TYPE) | (1L << TINY) | (1L << SIGNED_TINY) | (1L << HUGE) | (1L << SIGNED_HUGE) | (1L << DOUBLE) | (1L << SIGNED_DOUBLE) | (1L << EXPONENTIAL) | (1L << SIGNED_EXPONENTIAL) | (1L << VAR))) != 0)) {
				{
				setState(159);
				parameter_call_function();
				}
			}

			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(162);
					match(COMMA);
					{
					setState(163);
					parameter_call_function();
					}
					}
					}
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(170);
			match(RIGHT_PAR);
			setState(171);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_incrementContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(lexAnalysisParser.INCR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Pre_incrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterPre_increment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitPre_increment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitPre_increment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_incrementContext pre_increment() throws RecognitionException {
		Pre_incrementContext _localctx = new Pre_incrementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pre_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(INCR);
			setState(174);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_decrementContext extends ParserRuleContext {
		public TerminalNode DECR() { return getToken(lexAnalysisParser.DECR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Pre_decrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterPre_decrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitPre_decrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitPre_decrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_decrementContext pre_decrement() throws RecognitionException {
		Pre_decrementContext _localctx = new Pre_decrementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pre_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(DECR);
			setState(177);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Post_incrementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INCR() { return getToken(lexAnalysisParser.INCR, 0); }
		public Post_incrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterPost_increment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitPost_increment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitPost_increment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Post_incrementContext post_increment() throws RecognitionException {
		Post_incrementContext _localctx = new Post_incrementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_post_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			id();
			setState(180);
			match(INCR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Post_decrementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DECR() { return getToken(lexAnalysisParser.DECR, 0); }
		public Post_decrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterPost_decrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitPost_decrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitPost_decrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Post_decrementContext post_decrement() throws RecognitionException {
		Post_decrementContext _localctx = new Post_decrementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_post_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			id();
			setState(183);
			match(DECR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Incr_decrContext extends ParserRuleContext {
		public Pre_incrementContext pre_increment() {
			return getRuleContext(Pre_incrementContext.class,0);
		}
		public Pre_decrementContext pre_decrement() {
			return getRuleContext(Pre_decrementContext.class,0);
		}
		public Post_incrementContext post_increment() {
			return getRuleContext(Post_incrementContext.class,0);
		}
		public Post_decrementContext post_decrement() {
			return getRuleContext(Post_decrementContext.class,0);
		}
		public Incr_decrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incr_decr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterIncr_decr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitIncr_decr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitIncr_decr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Incr_decrContext incr_decr() throws RecognitionException {
		Incr_decrContext _localctx = new Incr_decrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_incr_decr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(185);
				pre_increment();
				}
				break;
			case 2:
				{
				setState(186);
				pre_decrement();
				}
				break;
			case 3:
				{
				setState(187);
				post_increment();
				}
				break;
			case 4:
				{
				setState(188);
				post_decrement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Incr_decr_exprContext extends ParserRuleContext {
		public Incr_decrContext incr_decr() {
			return getRuleContext(Incr_decrContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(lexAnalysisParser.SEMI_COLON, 0); }
		public Incr_decr_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incr_decr_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterIncr_decr_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitIncr_decr_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitIncr_decr_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Incr_decr_exprContext incr_decr_expr() throws RecognitionException {
		Incr_decr_exprContext _localctx = new Incr_decr_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_incr_decr_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			incr_decr();
			setState(192);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_byContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ADD_TO() { return getToken(lexAnalysisParser.ADD_TO, 0); }
		public TerminalNode SUB_FROM() { return getToken(lexAnalysisParser.SUB_FROM, 0); }
		public TerminalNode MULT_BY() { return getToken(lexAnalysisParser.MULT_BY, 0); }
		public TerminalNode DIV_BY() { return getToken(lexAnalysisParser.DIV_BY, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Math_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterMath_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitMath_by(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitMath_by(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_byContext math_by() throws RecognitionException {
		Math_byContext _localctx = new Math_byContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_math_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			id();
			setState(195);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ADD_TO - 65)) | (1L << (SUB_FROM - 65)) | (1L << (MULT_BY - 65)) | (1L << (DIV_BY - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case WORD:
			case CHAR:
				{
				setState(196);
				id();
				}
				break;
			case T__0:
			case TINY:
			case SIGNED_TINY:
			case HUGE:
			case SIGNED_HUGE:
			case DOUBLE:
			case SIGNED_DOUBLE:
			case EXPONENTIAL:
			case SIGNED_EXPONENTIAL:
				{
				setState(197);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_expressionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lexAnalysisParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(lexAnalysisParser.ASSIGN, 0); }
		public List<Operator_expressionContext> operator_expression() {
			return getRuleContexts(Operator_expressionContext.class);
		}
		public Operator_expressionContext operator_expression(int i) {
			return getRuleContext(Operator_expressionContext.class,i);
		}
		public TerminalNode LEFT_PAR() { return getToken(lexAnalysisParser.LEFT_PAR, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(lexAnalysisParser.RIGHT_PAR, 0); }
		public Math_byContext math_by() {
			return getRuleContext(Math_byContext.class,0);
		}
		public TerminalNode WORD() { return getToken(lexAnalysisParser.WORD, 0); }
		public TerminalNode CHAR() { return getToken(lexAnalysisParser.CHAR, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode MULT() { return getToken(lexAnalysisParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(lexAnalysisParser.DIV, 0); }
		public TerminalNode SIGN() { return getToken(lexAnalysisParser.SIGN, 0); }
		public Operator_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterOperator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitOperator_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitOperator_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_expressionContext operator_expression() throws RecognitionException {
		return operator_expression(0);
	}

	private Operator_expressionContext operator_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Operator_expressionContext _localctx = new Operator_expressionContext(_ctx, _parentState);
		Operator_expressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_operator_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(201);
				match(VAR);
				setState(202);
				match(ASSIGN);
				setState(203);
				operator_expression(4);
				}
				break;
			case 2:
				{
				setState(204);
				match(LEFT_PAR);
				setState(205);
				operator_expression(0);
				setState(206);
				match(RIGHT_PAR);
				}
				break;
			case 3:
				{
				setState(208);
				math_by();
				}
				break;
			case 4:
				{
				setState(213);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WORD:
					{
					setState(209);
					match(WORD);
					}
					break;
				case CHAR:
					{
					setState(210);
					match(CHAR);
					}
					break;
				case T__0:
				case TINY:
				case SIGNED_TINY:
				case HUGE:
				case SIGNED_HUGE:
				case DOUBLE:
				case SIGNED_DOUBLE:
				case EXPONENTIAL:
				case SIGNED_EXPONENTIAL:
					{
					setState(211);
					number();
					}
					break;
				case VAR:
					{
					setState(212);
					match(VAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(217);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(218);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(219);
						operator_expression(7);
						}
						break;
					case 2:
						{
						_localctx = new Operator_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operator_expression);
						setState(220);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(221);
						match(SIGN);
						}
						setState(222);
						operator_expression(6);
						}
						break;
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode GREATER_EQUAL() { return getToken(lexAnalysisParser.GREATER_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(lexAnalysisParser.GREATER_THAN, 0); }
		public TerminalNode LOWER_EQUAL() { return getToken(lexAnalysisParser.LOWER_EQUAL, 0); }
		public TerminalNode LOWER_THAN() { return getToken(lexAnalysisParser.LOWER_THAN, 0); }
		public TerminalNode DIFFERENT() { return getToken(lexAnalysisParser.DIFFERENT, 0); }
		public TerminalNode EQUAL() { return getToken(lexAnalysisParser.EQUAL, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<Operator_expressionContext> operator_expression() {
			return getRuleContexts(Operator_expressionContext.class);
		}
		public Operator_expressionContext operator_expression(int i) {
			return getRuleContext(Operator_expressionContext.class,i);
		}
		public List<Incr_decrContext> incr_decr() {
			return getRuleContexts(Incr_decrContext.class);
		}
		public Incr_decrContext incr_decr(int i) {
			return getRuleContext(Incr_decrContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(lexAnalysisParser.BOOLEAN, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(228);
				id();
				}
				break;
			case 2:
				{
				setState(229);
				number();
				}
				break;
			case 3:
				{
				setState(230);
				operator_expression(0);
				}
				break;
			case 4:
				{
				setState(231);
				incr_decr();
				}
				break;
			}
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_THAN) | (1L << GREATER_EQUAL) | (1L << LOWER_THAN) | (1L << LOWER_EQUAL) | (1L << EQUAL) | (1L << DIFFERENT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(235);
				number();
				}
				break;
			case 2:
				{
				setState(236);
				id();
				}
				break;
			case 3:
				{
				setState(237);
				operator_expression(0);
				}
				break;
			case 4:
				{
				setState(238);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(239);
				incr_decr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_ruleContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(lexAnalysisParser.FOR, 0); }
		public TerminalNode LEFT_PAR() { return getToken(lexAnalysisParser.LEFT_PAR, 0); }
		public First_statementContext first_statement() {
			return getRuleContext(First_statementContext.class,0);
		}
		public Second_statementContext second_statement() {
			return getRuleContext(Second_statementContext.class,0);
		}
		public Third_statementContext third_statement() {
			return getRuleContext(Third_statementContext.class,0);
		}
		public TerminalNode RIGHT_PAR() { return getToken(lexAnalysisParser.RIGHT_PAR, 0); }
		public Block_instructionsContext block_instructions() {
			return getRuleContext(Block_instructionsContext.class,0);
		}
		public For_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterFor_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitFor_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitFor_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_ruleContext for_rule() throws RecognitionException {
		For_ruleContext _localctx = new For_ruleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_for_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(FOR);
			setState(243);
			match(LEFT_PAR);
			setState(244);
			first_statement();
			setState(245);
			second_statement();
			setState(246);
			third_statement();
			setState(247);
			match(RIGHT_PAR);
			setState(248);
			block_instructions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class First_statementContext extends ParserRuleContext {
		public Define_varContext define_var() {
			return getRuleContext(Define_varContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(lexAnalysisParser.SEMI_COLON, 0); }
		public First_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterFirst_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitFirst_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitFirst_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final First_statementContext first_statement() throws RecognitionException {
		First_statementContext _localctx = new First_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_first_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATATYPE:
				{
				setState(250);
				define_var();
				}
				break;
			case VAR:
			case WORD:
			case CHAR:
				{
				setState(251);
				assignment();
				setState(252);
				match(SEMI_COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Second_statementContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(lexAnalysisParser.SEMI_COLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public Second_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterSecond_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitSecond_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitSecond_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Second_statementContext second_statement() throws RecognitionException {
		Second_statementContext _localctx = new Second_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_second_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(256);
				assignment();
				}
				break;
			case 2:
				{
				setState(257);
				comparator();
				}
				break;
			}
			setState(260);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Third_statementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Incr_decrContext incr_decr() {
			return getRuleContext(Incr_decrContext.class,0);
		}
		public Math_byContext math_by() {
			return getRuleContext(Math_byContext.class,0);
		}
		public Third_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_third_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterThird_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitThird_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitThird_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Third_statementContext third_statement() throws RecognitionException {
		Third_statementContext _localctx = new Third_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_third_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(262);
				assignment();
				}
				break;
			case 2:
				{
				setState(263);
				incr_decr();
				}
				break;
			case 3:
				{
				setState(264);
				math_by();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_ruleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(lexAnalysisParser.WHILE, 0); }
		public TerminalNode LEFT_PAR() { return getToken(lexAnalysisParser.LEFT_PAR, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(lexAnalysisParser.RIGHT_PAR, 0); }
		public Block_instructionsContext block_instructions() {
			return getRuleContext(Block_instructionsContext.class,0);
		}
		public List<ComparatorContext> comparator() {
			return getRuleContexts(ComparatorContext.class);
		}
		public ComparatorContext comparator(int i) {
			return getRuleContext(ComparatorContext.class,i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(lexAnalysisParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(lexAnalysisParser.BOOLEAN, i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(lexAnalysisParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(lexAnalysisParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(lexAnalysisParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(lexAnalysisParser.OR, i);
		}
		public While_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterWhile_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitWhile_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitWhile_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_ruleContext while_rule() throws RecognitionException {
		While_ruleContext _localctx = new While_ruleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_while_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(WHILE);
			setState(268);
			match(LEFT_PAR);
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(269);
				comparator();
				}
				break;
			case 2:
				{
				setState(270);
				match(BOOLEAN);
				}
				break;
			case 3:
				{
				setState(271);
				number();
				}
				break;
			}
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (TINY - 1)) | (1L << (SIGNED_TINY - 1)) | (1L << (HUGE - 1)) | (1L << (SIGNED_HUGE - 1)) | (1L << (DOUBLE - 1)) | (1L << (SIGNED_DOUBLE - 1)) | (1L << (EXPONENTIAL - 1)) | (1L << (SIGNED_EXPONENTIAL - 1)) | (1L << (BOOLEAN - 1)) | (1L << (VAR - 1)) | (1L << (WORD - 1)) | (1L << (CHAR - 1)) | (1L << (LEFT_PAR - 1)) | (1L << (AND - 1)) | (1L << (OR - 1)) | (1L << (INCR - 1)) | (1L << (DECR - 1)))) != 0)) {
				{
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AND || _la==OR) {
						{
						setState(274);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(280);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(277);
						comparator();
						}
						break;
					case 2:
						{
						setState(278);
						match(BOOLEAN);
						}
						break;
					case 3:
						{
						setState(279);
						number();
						}
						break;
					}
					}
					}
					setState(284); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (TINY - 1)) | (1L << (SIGNED_TINY - 1)) | (1L << (HUGE - 1)) | (1L << (SIGNED_HUGE - 1)) | (1L << (DOUBLE - 1)) | (1L << (SIGNED_DOUBLE - 1)) | (1L << (EXPONENTIAL - 1)) | (1L << (SIGNED_EXPONENTIAL - 1)) | (1L << (BOOLEAN - 1)) | (1L << (VAR - 1)) | (1L << (WORD - 1)) | (1L << (CHAR - 1)) | (1L << (LEFT_PAR - 1)) | (1L << (AND - 1)) | (1L << (OR - 1)) | (1L << (INCR - 1)) | (1L << (DECR - 1)))) != 0) );
				}
			}

			setState(288);
			match(RIGHT_PAR);
			setState(289);
			block_instructions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_ruleContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(lexAnalysisParser.IF, 0); }
		public TerminalNode LEFT_PAR() { return getToken(lexAnalysisParser.LEFT_PAR, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(lexAnalysisParser.RIGHT_PAR, 0); }
		public List<Block_instructionsContext> block_instructions() {
			return getRuleContexts(Block_instructionsContext.class);
		}
		public Block_instructionsContext block_instructions(int i) {
			return getRuleContext(Block_instructionsContext.class,i);
		}
		public List<ComparatorContext> comparator() {
			return getRuleContexts(ComparatorContext.class);
		}
		public ComparatorContext comparator(int i) {
			return getRuleContext(ComparatorContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(lexAnalysisParser.ELSE, 0); }
		public List<TerminalNode> AND() { return getTokens(lexAnalysisParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(lexAnalysisParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(lexAnalysisParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(lexAnalysisParser.OR, i);
		}
		public If_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterIf_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitIf_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitIf_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_ruleContext if_rule() throws RecognitionException {
		If_ruleContext _localctx = new If_ruleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(IF);
			setState(292);
			match(LEFT_PAR);
			{
			setState(293);
			comparator();
			}
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (TINY - 1)) | (1L << (SIGNED_TINY - 1)) | (1L << (HUGE - 1)) | (1L << (SIGNED_HUGE - 1)) | (1L << (DOUBLE - 1)) | (1L << (SIGNED_DOUBLE - 1)) | (1L << (EXPONENTIAL - 1)) | (1L << (SIGNED_EXPONENTIAL - 1)) | (1L << (VAR - 1)) | (1L << (WORD - 1)) | (1L << (CHAR - 1)) | (1L << (LEFT_PAR - 1)) | (1L << (AND - 1)) | (1L << (OR - 1)) | (1L << (INCR - 1)) | (1L << (DECR - 1)))) != 0)) {
				{
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AND || _la==OR) {
						{
						setState(294);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(297);
					comparator();
					}
					}
					setState(300); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (TINY - 1)) | (1L << (SIGNED_TINY - 1)) | (1L << (HUGE - 1)) | (1L << (SIGNED_HUGE - 1)) | (1L << (DOUBLE - 1)) | (1L << (SIGNED_DOUBLE - 1)) | (1L << (EXPONENTIAL - 1)) | (1L << (SIGNED_EXPONENTIAL - 1)) | (1L << (VAR - 1)) | (1L << (WORD - 1)) | (1L << (CHAR - 1)) | (1L << (LEFT_PAR - 1)) | (1L << (AND - 1)) | (1L << (OR - 1)) | (1L << (INCR - 1)) | (1L << (DECR - 1)))) != 0) );
				}
			}

			setState(304);
			match(RIGHT_PAR);
			setState(305);
			block_instructions();
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(306);
				match(ELSE);
				}
				break;
			}
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(309);
				block_instructions();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode TINY() { return getToken(lexAnalysisParser.TINY, 0); }
		public TerminalNode SIGNED_TINY() { return getToken(lexAnalysisParser.SIGNED_TINY, 0); }
		public TerminalNode DOUBLE() { return getToken(lexAnalysisParser.DOUBLE, 0); }
		public TerminalNode SIGNED_DOUBLE() { return getToken(lexAnalysisParser.SIGNED_DOUBLE, 0); }
		public TerminalNode HUGE() { return getToken(lexAnalysisParser.HUGE, 0); }
		public TerminalNode SIGNED_HUGE() { return getToken(lexAnalysisParser.SIGNED_HUGE, 0); }
		public TerminalNode EXPONENTIAL() { return getToken(lexAnalysisParser.EXPONENTIAL, 0); }
		public TerminalNode SIGNED_EXPONENTIAL() { return getToken(lexAnalysisParser.SIGNED_EXPONENTIAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TINY) | (1L << SIGNED_TINY) | (1L << HUGE) | (1L << SIGNED_HUGE) | (1L << DOUBLE) | (1L << SIGNED_DOUBLE) | (1L << EXPONENTIAL) | (1L << SIGNED_EXPONENTIAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionsContext extends ParserRuleContext {
		public List<Define_varContext> define_var() {
			return getRuleContexts(Define_varContext.class);
		}
		public Define_varContext define_var(int i) {
			return getRuleContext(Define_varContext.class,i);
		}
		public List<Assignment_exprContext> assignment_expr() {
			return getRuleContexts(Assignment_exprContext.class);
		}
		public Assignment_exprContext assignment_expr(int i) {
			return getRuleContext(Assignment_exprContext.class,i);
		}
		public List<If_ruleContext> if_rule() {
			return getRuleContexts(If_ruleContext.class);
		}
		public If_ruleContext if_rule(int i) {
			return getRuleContext(If_ruleContext.class,i);
		}
		public List<For_ruleContext> for_rule() {
			return getRuleContexts(For_ruleContext.class);
		}
		public For_ruleContext for_rule(int i) {
			return getRuleContext(For_ruleContext.class,i);
		}
		public List<Do_while_ruleContext> do_while_rule() {
			return getRuleContexts(Do_while_ruleContext.class);
		}
		public Do_while_ruleContext do_while_rule(int i) {
			return getRuleContext(Do_while_ruleContext.class,i);
		}
		public List<While_ruleContext> while_rule() {
			return getRuleContexts(While_ruleContext.class);
		}
		public While_ruleContext while_rule(int i) {
			return getRuleContext(While_ruleContext.class,i);
		}
		public List<Math_byContext> math_by() {
			return getRuleContexts(Math_byContext.class);
		}
		public Math_byContext math_by(int i) {
			return getRuleContext(Math_byContext.class,i);
		}
		public List<Operator_expressionContext> operator_expression() {
			return getRuleContexts(Operator_expressionContext.class);
		}
		public Operator_expressionContext operator_expression(int i) {
			return getRuleContext(Operator_expressionContext.class,i);
		}
		public List<Incr_decr_exprContext> incr_decr_expr() {
			return getRuleContexts(Incr_decr_exprContext.class);
		}
		public Incr_decr_exprContext incr_decr_expr(int i) {
			return getRuleContext(Incr_decr_exprContext.class,i);
		}
		public List<Call_methodContext> call_method() {
			return getRuleContexts(Call_methodContext.class);
		}
		public Call_methodContext call_method(int i) {
			return getRuleContext(Call_methodContext.class,i);
		}
		public List<Switch_ruleContext> switch_rule() {
			return getRuleContexts(Switch_ruleContext.class);
		}
		public Switch_ruleContext switch_rule(int i) {
			return getRuleContext(Switch_ruleContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(lexAnalysisParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(lexAnalysisParser.BREAK, i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_instructions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(314);
						define_var();
						}
						break;
					case 2:
						{
						setState(315);
						assignment_expr();
						}
						break;
					case 3:
						{
						setState(316);
						if_rule();
						}
						break;
					case 4:
						{
						setState(317);
						for_rule();
						}
						break;
					case 5:
						{
						setState(318);
						do_while_rule();
						}
						break;
					case 6:
						{
						setState(319);
						while_rule();
						}
						break;
					case 7:
						{
						setState(320);
						math_by();
						}
						break;
					case 8:
						{
						setState(321);
						operator_expression(0);
						}
						break;
					case 9:
						{
						setState(322);
						incr_decr_expr();
						}
						break;
					case 10:
						{
						setState(323);
						call_method();
						}
						break;
					case 11:
						{
						setState(324);
						switch_rule();
						}
						break;
					case 12:
						{
						setState(325);
						match(BREAK);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(328); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_instructionsContext extends ParserRuleContext {
		public TerminalNode LEFT_BR() { return getToken(lexAnalysisParser.LEFT_BR, 0); }
		public TerminalNode RIGHT_BR() { return getToken(lexAnalysisParser.RIGHT_BR, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(lexAnalysisParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(lexAnalysisParser.NEWLINE, i);
		}
		public Block_instructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterBlock_instructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitBlock_instructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitBlock_instructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_instructionsContext block_instructions() throws RecognitionException {
		Block_instructionsContext _localctx = new Block_instructionsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_block_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(LEFT_BR);
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case TINY:
			case SIGNED_TINY:
			case HUGE:
			case SIGNED_HUGE:
			case DOUBLE:
			case SIGNED_DOUBLE:
			case EXPONENTIAL:
			case SIGNED_EXPONENTIAL:
			case BREAK:
			case WHILE:
			case IF:
			case FOR:
			case SWITCH:
			case DO:
			case METHOD_NAME:
			case DATATYPE:
			case VAR:
			case WORD:
			case CHAR:
			case LEFT_PAR:
			case INCR:
			case DECR:
				{
				setState(331);
				instructions();
				}
				break;
			case NEWLINE:
			case RIGHT_BR:
				{
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(332);
					match(NEWLINE);
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(340);
			match(RIGHT_BR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_doContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(lexAnalysisParser.WHILE, 0); }
		public TerminalNode LEFT_PAR() { return getToken(lexAnalysisParser.LEFT_PAR, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(lexAnalysisParser.RIGHT_PAR, 0); }
		public TerminalNode SEMI_COLON() { return getToken(lexAnalysisParser.SEMI_COLON, 0); }
		public List<ComparatorContext> comparator() {
			return getRuleContexts(ComparatorContext.class);
		}
		public ComparatorContext comparator(int i) {
			return getRuleContext(ComparatorContext.class,i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(lexAnalysisParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(lexAnalysisParser.BOOLEAN, i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(lexAnalysisParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(lexAnalysisParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(lexAnalysisParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(lexAnalysisParser.OR, i);
		}
		public While_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterWhile_do(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitWhile_do(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitWhile_do(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_doContext while_do() throws RecognitionException {
		While_doContext _localctx = new While_doContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_while_do);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(WHILE);
			setState(343);
			match(LEFT_PAR);
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(344);
				comparator();
				}
				break;
			case 2:
				{
				setState(345);
				match(BOOLEAN);
				}
				break;
			case 3:
				{
				setState(346);
				number();
				}
				break;
			}
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (TINY - 1)) | (1L << (SIGNED_TINY - 1)) | (1L << (HUGE - 1)) | (1L << (SIGNED_HUGE - 1)) | (1L << (DOUBLE - 1)) | (1L << (SIGNED_DOUBLE - 1)) | (1L << (EXPONENTIAL - 1)) | (1L << (SIGNED_EXPONENTIAL - 1)) | (1L << (BOOLEAN - 1)) | (1L << (VAR - 1)) | (1L << (WORD - 1)) | (1L << (CHAR - 1)) | (1L << (LEFT_PAR - 1)) | (1L << (AND - 1)) | (1L << (OR - 1)) | (1L << (INCR - 1)) | (1L << (DECR - 1)))) != 0)) {
				{
				setState(357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AND || _la==OR) {
						{
						setState(349);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(355);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(352);
						comparator();
						}
						break;
					case 2:
						{
						setState(353);
						match(BOOLEAN);
						}
						break;
					case 3:
						{
						setState(354);
						number();
						}
						break;
					}
					}
					}
					setState(359); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (T__0 - 1)) | (1L << (TINY - 1)) | (1L << (SIGNED_TINY - 1)) | (1L << (HUGE - 1)) | (1L << (SIGNED_HUGE - 1)) | (1L << (DOUBLE - 1)) | (1L << (SIGNED_DOUBLE - 1)) | (1L << (EXPONENTIAL - 1)) | (1L << (SIGNED_EXPONENTIAL - 1)) | (1L << (BOOLEAN - 1)) | (1L << (VAR - 1)) | (1L << (WORD - 1)) | (1L << (CHAR - 1)) | (1L << (LEFT_PAR - 1)) | (1L << (AND - 1)) | (1L << (OR - 1)) | (1L << (INCR - 1)) | (1L << (DECR - 1)))) != 0) );
				}
			}

			setState(363);
			match(RIGHT_PAR);
			setState(364);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_ruleContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(lexAnalysisParser.DO, 0); }
		public Block_instructionsContext block_instructions() {
			return getRuleContext(Block_instructionsContext.class,0);
		}
		public While_doContext while_do() {
			return getRuleContext(While_doContext.class,0);
		}
		public Do_while_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterDo_while_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitDo_while_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitDo_while_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_ruleContext do_while_rule() throws RecognitionException {
		Do_while_ruleContext _localctx = new Do_while_ruleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_do_while_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(DO);
			setState(367);
			block_instructions();
			setState(368);
			while_do();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_ruleContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(lexAnalysisParser.SWITCH, 0); }
		public TerminalNode LEFT_PAR() { return getToken(lexAnalysisParser.LEFT_PAR, 0); }
		public TerminalNode VAR() { return getToken(lexAnalysisParser.VAR, 0); }
		public TerminalNode RIGHT_PAR() { return getToken(lexAnalysisParser.RIGHT_PAR, 0); }
		public TerminalNode LEFT_BR() { return getToken(lexAnalysisParser.LEFT_BR, 0); }
		public TerminalNode RIGHT_BR() { return getToken(lexAnalysisParser.RIGHT_BR, 0); }
		public Default_caseContext default_case() {
			return getRuleContext(Default_caseContext.class,0);
		}
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public Switch_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterSwitch_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitSwitch_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitSwitch_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_ruleContext switch_rule() throws RecognitionException {
		Switch_ruleContext _localctx = new Switch_ruleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_switch_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(SWITCH);
			setState(371);
			match(LEFT_PAR);
			setState(372);
			match(VAR);
			setState(373);
			match(RIGHT_PAR);
			setState(374);
			match(LEFT_BR);
			{
			setState(376); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(375);
				switch_case();
				}
				}
				setState(378); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			}
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(380);
				default_case();
				}
			}

			setState(383);
			match(RIGHT_BR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(lexAnalysisParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(lexAnalysisParser.COLON, 0); }
		public Block_instructionsContext block_instructions() {
			return getRuleContext(Block_instructionsContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode TEXT_TYPE() { return getToken(lexAnalysisParser.TEXT_TYPE, 0); }
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_switch_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(CASE);
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case TINY:
			case SIGNED_TINY:
			case HUGE:
			case SIGNED_HUGE:
			case DOUBLE:
			case SIGNED_DOUBLE:
			case EXPONENTIAL:
			case SIGNED_EXPONENTIAL:
				{
				setState(386);
				number();
				}
				break;
			case TEXT_TYPE:
				{
				setState(387);
				match(TEXT_TYPE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(390);
			match(COLON);
			setState(391);
			block_instructions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_caseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(lexAnalysisParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(lexAnalysisParser.COLON, 0); }
		public Block_instructionsContext block_instructions() {
			return getRuleContext(Block_instructionsContext.class,0);
		}
		public Default_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterDefault_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitDefault_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitDefault_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_caseContext default_case() throws RecognitionException {
		Default_caseContext _localctx = new Default_caseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_default_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(DEFAULT);
			setState(394);
			match(COLON);
			setState(395);
			block_instructions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(lexAnalysisParser.WORD, 0); }
		public TerminalNode CHAR() { return getToken(lexAnalysisParser.CHAR, 0); }
		public TerminalNode VAR() { return getToken(lexAnalysisParser.VAR, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << WORD) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_assignContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(lexAnalysisParser.CHAR, 0); }
		public TerminalNode WORD() { return getToken(lexAnalysisParser.WORD, 0); }
		public TerminalNode BOOLEAN() { return getToken(lexAnalysisParser.BOOLEAN, 0); }
		public Operator_expressionContext operator_expression() {
			return getRuleContext(Operator_expressionContext.class,0);
		}
		public TerminalNode TEXT_TYPE() { return getToken(lexAnalysisParser.TEXT_TYPE, 0); }
		public Id_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).enterId_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lexAnalysisListener ) ((lexAnalysisListener)listener).exitId_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lexAnalysisVisitor ) return ((lexAnalysisVisitor<? extends T>)visitor).visitId_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_assignContext id_assign() throws RecognitionException {
		Id_assignContext _localctx = new Id_assignContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_id_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(399);
				number();
				}
				break;
			case 2:
				{
				setState(400);
				match(CHAR);
				}
				break;
			case 3:
				{
				setState(401);
				match(WORD);
				}
				break;
			case 4:
				{
				setState(402);
				match(BOOLEAN);
				}
				break;
			case 5:
				{
				setState(403);
				operator_expression(0);
				}
				break;
			case 6:
				{
				setState(404);
				match(TEXT_TYPE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 16:
			return operator_expression_sempred((Operator_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 14);
		}
		return true;
	}
	private boolean operator_expression_sempred(Operator_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u019a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\5\2I\n\2\7\2K\n\2\f\2\16\2N\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3e\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\5\6\177\n\6\3\6\3\6\3\7\3\7"+
		"\5\7\u0085\n\7\3\7\3\7\5\7\u0089\n\7\3\b\3\b\3\b\5\b\u008e\n\b\3\t\3\t"+
		"\3\t\5\t\u0093\n\t\3\t\3\t\6\t\u0097\n\t\r\t\16\t\u0098\5\t\u009b\n\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u00a3\n\n\3\n\3\n\6\n\u00a7\n\n\r\n\16\n"+
		"\u00a8\5\n\u00ab\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00c0\n\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\5\21\u00c9\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d8\n\22\5\22\u00da\n\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u00e2\n\22\f\22\16\22\u00e5\13\22\3\23\3"+
		"\23\3\23\3\23\5\23\u00eb\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f3"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25"+
		"\u0101\n\25\3\26\3\26\5\26\u0105\n\26\3\26\3\26\3\27\3\27\3\27\5\27\u010c"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0113\n\30\3\30\5\30\u0116\n\30\3"+
		"\30\3\30\3\30\5\30\u011b\n\30\6\30\u011d\n\30\r\30\16\30\u011e\5\30\u0121"+
		"\n\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u012a\n\31\3\31\6\31\u012d"+
		"\n\31\r\31\16\31\u012e\5\31\u0131\n\31\3\31\3\31\3\31\5\31\u0136\n\31"+
		"\3\31\5\31\u0139\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\6\33\u0149\n\33\r\33\16\33\u014a\3\34\3\34\3\34\7"+
		"\34\u0150\n\34\f\34\16\34\u0153\13\34\5\34\u0155\n\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u015e\n\35\3\35\5\35\u0161\n\35\3\35\3\35\3\35"+
		"\5\35\u0166\n\35\6\35\u0168\n\35\r\35\16\35\u0169\5\35\u016c\n\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\6\37\u017b"+
		"\n\37\r\37\16\37\u017c\3\37\5\37\u0180\n\37\3\37\3\37\3 \3 \3 \5 \u0187"+
		"\n \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u0198\n#\3#\2\4"+
		"\4\"$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BD\2\b\4\2\35\36\"\"\3\2CF\3\2/\60\3\2;@\4\288::\4\2\3\3\5\f\2\u01d7"+
		"\2L\3\2\2\2\4d\3\2\2\2\6t\3\2\2\2\bx\3\2\2\2\n{\3\2\2\2\f\u0088\3\2\2"+
		"\2\16\u008d\3\2\2\2\20\u008f\3\2\2\2\22\u009f\3\2\2\2\24\u00af\3\2\2\2"+
		"\26\u00b2\3\2\2\2\30\u00b5\3\2\2\2\32\u00b8\3\2\2\2\34\u00bf\3\2\2\2\36"+
		"\u00c1\3\2\2\2 \u00c4\3\2\2\2\"\u00d9\3\2\2\2$\u00ea\3\2\2\2&\u00f4\3"+
		"\2\2\2(\u0100\3\2\2\2*\u0104\3\2\2\2,\u010b\3\2\2\2.\u010d\3\2\2\2\60"+
		"\u0125\3\2\2\2\62\u013a\3\2\2\2\64\u0148\3\2\2\2\66\u014c\3\2\2\28\u0158"+
		"\3\2\2\2:\u0170\3\2\2\2<\u0174\3\2\2\2>\u0183\3\2\2\2@\u018b\3\2\2\2B"+
		"\u018f\3\2\2\2D\u0197\3\2\2\2FH\5\4\3\2GI\7\'\2\2HG\3\2\2\2HI\3\2\2\2"+
		"IK\3\2\2\2JF\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\3\3\2\2\2NL\3\2\2"+
		"\2OP\b\3\1\2Pe\5\62\32\2QR\7\62\2\2RS\5\4\3\2ST\7\63\2\2Te\3\2\2\2UV\7"+
		"\62\2\2Ve\5\4\3\23We\7 \2\2Xe\7\37\2\2Ye\7(\2\2Ze\7\'\2\2[e\7\"\2\2\\"+
		"e\7\36\2\2]e\7\30\2\2^e\5\20\t\2_e\5\64\33\2`e\7\35\2\2ae\7)\2\2be\7\4"+
		"\2\2ce\5\6\4\2dO\3\2\2\2dQ\3\2\2\2dU\3\2\2\2dW\3\2\2\2dX\3\2\2\2dY\3\2"+
		"\2\2dZ\3\2\2\2d[\3\2\2\2d\\\3\2\2\2d]\3\2\2\2d^\3\2\2\2d_\3\2\2\2d`\3"+
		"\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2eq\3\2\2\2fg\f\21\2\2gh\7(\2\2hp\5"+
		"\4\3\22ij\f\25\2\2jp\7-\2\2kl\f\22\2\2lp\7\63\2\2mn\f\20\2\2np\7\'\2\2"+
		"of\3\2\2\2oi\3\2\2\2ok\3\2\2\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2"+
		"r\5\3\2\2\2sq\3\2\2\2tu\5B\"\2uv\7\66\2\2vw\5D#\2w\7\3\2\2\2xy\5\6\4\2"+
		"yz\7-\2\2z\t\3\2\2\2{~\7\34\2\2|\177\7\35\2\2}\177\5\6\4\2~|\3\2\2\2~"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7-\2\2\u0081\13\3\2\2\2\u0082"+
		"\u0084\7\34\2\2\u0083\u0085\79\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0089\t\2\2\2\u0087\u0089\5\16\b\2\u0088"+
		"\u0082\3\2\2\2\u0088\u0087\3\2\2\2\u0089\r\3\2\2\2\u008a\u008e\7\4\2\2"+
		"\u008b\u008e\5\62\32\2\u008c\u008e\7\35\2\2\u008d\u008a\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\17\3\2\2\2\u008f\u0090\7\33\2"+
		"\2\u0090\u0092\7\62\2\2\u0091\u0093\5\f\7\2\u0092\u0091\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u009a\3\2\2\2\u0094\u0095\7,\2\2\u0095\u0097\5\f"+
		"\7\2\u0096\u0094\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\63\2\2\u009d\u009e\5\66\34\2\u009e"+
		"\21\3\2\2\2\u009f\u00a0\7\33\2\2\u00a0\u00a2\7\62\2\2\u00a1\u00a3\5\16"+
		"\b\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00aa\3\2\2\2\u00a4"+
		"\u00a5\7,\2\2\u00a5\u00a7\5\16\b\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a6\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\63"+
		"\2\2\u00ad\u00ae\7-\2\2\u00ae\23\3\2\2\2\u00af\u00b0\7A\2\2\u00b0\u00b1"+
		"\5B\"\2\u00b1\25\3\2\2\2\u00b2\u00b3\7B\2\2\u00b3\u00b4\5B\"\2\u00b4\27"+
		"\3\2\2\2\u00b5\u00b6\5B\"\2\u00b6\u00b7\7A\2\2\u00b7\31\3\2\2\2\u00b8"+
		"\u00b9\5B\"\2\u00b9\u00ba\7B\2\2\u00ba\33\3\2\2\2\u00bb\u00c0\5\24\13"+
		"\2\u00bc\u00c0\5\26\f\2\u00bd\u00c0\5\30\r\2\u00be\u00c0\5\32\16\2\u00bf"+
		"\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\35\3\2\2\2\u00c1\u00c2\5\34\17\2\u00c2\u00c3\7-\2\2\u00c3\37"+
		"\3\2\2\2\u00c4\u00c5\5B\"\2\u00c5\u00c8\t\3\2\2\u00c6\u00c9\5B\"\2\u00c7"+
		"\u00c9\5\62\32\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9!\3\2\2"+
		"\2\u00ca\u00cb\b\22\1\2\u00cb\u00cc\7\35\2\2\u00cc\u00cd\7\66\2\2\u00cd"+
		"\u00da\5\"\22\6\u00ce\u00cf\7\62\2\2\u00cf\u00d0\5\"\22\2\u00d0\u00d1"+
		"\7\63\2\2\u00d1\u00da\3\2\2\2\u00d2\u00da\5 \21\2\u00d3\u00d8\7\36\2\2"+
		"\u00d4\u00d8\7\"\2\2\u00d5\u00d8\5\62\32\2\u00d6\u00d8\7\35\2\2\u00d7"+
		"\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2"+
		"\2\2\u00d8\u00da\3\2\2\2\u00d9\u00ca\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9"+
		"\u00d2\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00e3\3\2\2\2\u00db\u00dc\f\b"+
		"\2\2\u00dc\u00dd\t\4\2\2\u00dd\u00e2\5\"\22\t\u00de\u00df\f\7\2\2\u00df"+
		"\u00e0\7!\2\2\u00e0\u00e2\5\"\22\b\u00e1\u00db\3\2\2\2\u00e1\u00de\3\2"+
		"\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"#\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00eb\5B\"\2\u00e7\u00eb\5\62\32\2"+
		"\u00e8\u00eb\5\"\22\2\u00e9\u00eb\5\34\17\2\u00ea\u00e6\3\2\2\2\u00ea"+
		"\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00f2\t\5\2\2\u00ed\u00f3\5\62\32\2\u00ee\u00f3\5B\"\2\u00ef"+
		"\u00f3\5\"\22\2\u00f0\u00f3\7\30\2\2\u00f1\u00f3\5\34\17\2\u00f2\u00ed"+
		"\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3%\3\2\2\2\u00f4\u00f5\7\21\2\2\u00f5\u00f6\7\62\2"+
		"\2\u00f6\u00f7\5(\25\2\u00f7\u00f8\5*\26\2\u00f8\u00f9\5,\27\2\u00f9\u00fa"+
		"\7\63\2\2\u00fa\u00fb\5\66\34\2\u00fb\'\3\2\2\2\u00fc\u0101\5\n\6\2\u00fd"+
		"\u00fe\5\6\4\2\u00fe\u00ff\7-\2\2\u00ff\u0101\3\2\2\2\u0100\u00fc\3\2"+
		"\2\2\u0100\u00fd\3\2\2\2\u0101)\3\2\2\2\u0102\u0105\5\6\4\2\u0103\u0105"+
		"\5$\23\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\7-\2\2\u0107+\3\2\2\2\u0108\u010c\5\6\4\2\u0109\u010c\5\34\17\2"+
		"\u010a\u010c\5 \21\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a"+
		"\3\2\2\2\u010c-\3\2\2\2\u010d\u010e\7\16\2\2\u010e\u0112\7\62\2\2\u010f"+
		"\u0113\5$\23\2\u0110\u0113\7\30\2\2\u0111\u0113\5\62\32\2\u0112\u010f"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0120\3\2\2\2\u0114"+
		"\u0116\t\6\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011a\3\2"+
		"\2\2\u0117\u011b\5$\23\2\u0118\u011b\7\30\2\2\u0119\u011b\5\62\32\2\u011a"+
		"\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011d\3\2"+
		"\2\2\u011c\u0115\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7\63\2\2\u0123\u0124\5\66\34\2\u0124"+
		"/\3\2\2\2\u0125\u0126\7\17\2\2\u0126\u0127\7\62\2\2\u0127\u0130\5$\23"+
		"\2\u0128\u012a\t\6\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012d\5$\23\2\u012c\u0129\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012c\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\63\2\2\u0133"+
		"\u0135\5\66\34\2\u0134\u0136\7\20\2\2\u0135\u0134\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\5\66\34\2\u0138\u0137\3\2\2\2"+
		"\u0138\u0139\3\2\2\2\u0139\61\3\2\2\2\u013a\u013b\t\7\2\2\u013b\63\3\2"+
		"\2\2\u013c\u0149\5\n\6\2\u013d\u0149\5\b\5\2\u013e\u0149\5\60\31\2\u013f"+
		"\u0149\5&\24\2\u0140\u0149\5:\36\2\u0141\u0149\5.\30\2\u0142\u0149\5 "+
		"\21\2\u0143\u0149\5\"\22\2\u0144\u0149\5\36\20\2\u0145\u0149\5\22\n\2"+
		"\u0146\u0149\5<\37\2\u0147\u0149\7\r\2\2\u0148\u013c\3\2\2\2\u0148\u013d"+
		"\3\2\2\2\u0148\u013e\3\2\2\2\u0148\u013f\3\2\2\2\u0148\u0140\3\2\2\2\u0148"+
		"\u0141\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0143\3\2\2\2\u0148\u0144\3\2"+
		"\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\65\3\2\2"+
		"\2\u014c\u0154\7\64\2\2\u014d\u0155\5\64\33\2\u014e\u0150\7\'\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u014d\3\2\2\2\u0154"+
		"\u0151\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7\65\2\2\u0157\67\3\2\2"+
		"\2\u0158\u0159\7\16\2\2\u0159\u015d\7\62\2\2\u015a\u015e\5$\23\2\u015b"+
		"\u015e\7\30\2\2\u015c\u015e\5\62\32\2\u015d\u015a\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015c\3\2\2\2\u015e\u016b\3\2\2\2\u015f\u0161\t\6\2\2\u0160"+
		"\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0165\3\2\2\2\u0162\u0166\5$"+
		"\23\2\u0163\u0166\7\30\2\2\u0164\u0166\5\62\32\2\u0165\u0162\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0160\3\2"+
		"\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016c\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u016e\7\63\2\2\u016e\u016f\7-\2\2\u016f9\3\2\2\2\u0170\u0171"+
		"\7\25\2\2\u0171\u0172\5\66\34\2\u0172\u0173\58\35\2\u0173;\3\2\2\2\u0174"+
		"\u0175\7\22\2\2\u0175\u0176\7\62\2\2\u0176\u0177\7\35\2\2\u0177\u0178"+
		"\7\63\2\2\u0178\u017a\7\64\2\2\u0179\u017b\5> \2\u017a\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2"+
		"\2\2\u017e\u0180\5@!\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181\u0182\7\65\2\2\u0182=\3\2\2\2\u0183\u0186\7\23\2\2\u0184"+
		"\u0187\5\62\32\2\u0185\u0187\7\4\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3"+
		"\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\7.\2\2\u0189\u018a\5\66\34\2\u018a"+
		"?\3\2\2\2\u018b\u018c\7\24\2\2\u018c\u018d\7.\2\2\u018d\u018e\5\66\34"+
		"\2\u018eA\3\2\2\2\u018f\u0190\t\2\2\2\u0190C\3\2\2\2\u0191\u0198\5\62"+
		"\32\2\u0192\u0198\7\"\2\2\u0193\u0198\7\36\2\2\u0194\u0198\7\30\2\2\u0195"+
		"\u0198\5\"\22\2\u0196\u0198\7\4\2\2\u0197\u0191\3\2\2\2\u0197\u0192\3"+
		"\2\2\2\u0197\u0193\3\2\2\2\u0197\u0194\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0196\3\2\2\2\u0198E\3\2\2\2\63HLdoq~\u0084\u0088\u008d\u0092\u0098\u009a"+
		"\u00a2\u00a8\u00aa\u00bf\u00c8\u00d7\u00d9\u00e1\u00e3\u00ea\u00f2\u0100"+
		"\u0104\u010b\u0112\u0115\u011a\u011e\u0120\u0129\u012e\u0130\u0135\u0138"+
		"\u0148\u014a\u0151\u0154\u015d\u0160\u0165\u0169\u016b\u017c\u017f\u0186"+
		"\u0197";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}