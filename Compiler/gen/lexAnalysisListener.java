// Generated from /Users/ioanamoflic/compilerrepo/Compiler/src/lexAnalysis.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lexAnalysisParser}.
 */
public interface lexAnalysisListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(lexAnalysisParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(lexAnalysisParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(lexAnalysisParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(lexAnalysisParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(lexAnalysisParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(lexAnalysisParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expr(lexAnalysisParser.Assignment_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expr(lexAnalysisParser.Assignment_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#define_var}.
	 * @param ctx the parse tree
	 */
	void enterDefine_var(lexAnalysisParser.Define_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#define_var}.
	 * @param ctx the parse tree
	 */
	void exitDefine_var(lexAnalysisParser.Define_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#parameter_method}.
	 * @param ctx the parse tree
	 */
	void enterParameter_method(lexAnalysisParser.Parameter_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#parameter_method}.
	 * @param ctx the parse tree
	 */
	void exitParameter_method(lexAnalysisParser.Parameter_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#parameter_call_function}.
	 * @param ctx the parse tree
	 */
	void enterParameter_call_function(lexAnalysisParser.Parameter_call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#parameter_call_function}.
	 * @param ctx the parse tree
	 */
	void exitParameter_call_function(lexAnalysisParser.Parameter_call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(lexAnalysisParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(lexAnalysisParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#call_method}.
	 * @param ctx the parse tree
	 */
	void enterCall_method(lexAnalysisParser.Call_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#call_method}.
	 * @param ctx the parse tree
	 */
	void exitCall_method(lexAnalysisParser.Call_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#pre_increment}.
	 * @param ctx the parse tree
	 */
	void enterPre_increment(lexAnalysisParser.Pre_incrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#pre_increment}.
	 * @param ctx the parse tree
	 */
	void exitPre_increment(lexAnalysisParser.Pre_incrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#pre_decrement}.
	 * @param ctx the parse tree
	 */
	void enterPre_decrement(lexAnalysisParser.Pre_decrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#pre_decrement}.
	 * @param ctx the parse tree
	 */
	void exitPre_decrement(lexAnalysisParser.Pre_decrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#post_increment}.
	 * @param ctx the parse tree
	 */
	void enterPost_increment(lexAnalysisParser.Post_incrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#post_increment}.
	 * @param ctx the parse tree
	 */
	void exitPost_increment(lexAnalysisParser.Post_incrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#post_decrement}.
	 * @param ctx the parse tree
	 */
	void enterPost_decrement(lexAnalysisParser.Post_decrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#post_decrement}.
	 * @param ctx the parse tree
	 */
	void exitPost_decrement(lexAnalysisParser.Post_decrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#incr_decr}.
	 * @param ctx the parse tree
	 */
	void enterIncr_decr(lexAnalysisParser.Incr_decrContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#incr_decr}.
	 * @param ctx the parse tree
	 */
	void exitIncr_decr(lexAnalysisParser.Incr_decrContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#incr_decr_expr}.
	 * @param ctx the parse tree
	 */
	void enterIncr_decr_expr(lexAnalysisParser.Incr_decr_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#incr_decr_expr}.
	 * @param ctx the parse tree
	 */
	void exitIncr_decr_expr(lexAnalysisParser.Incr_decr_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#math_by}.
	 * @param ctx the parse tree
	 */
	void enterMath_by(lexAnalysisParser.Math_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#math_by}.
	 * @param ctx the parse tree
	 */
	void exitMath_by(lexAnalysisParser.Math_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#operator_expression}.
	 * @param ctx the parse tree
	 */
	void enterOperator_expression(lexAnalysisParser.Operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#operator_expression}.
	 * @param ctx the parse tree
	 */
	void exitOperator_expression(lexAnalysisParser.Operator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(lexAnalysisParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(lexAnalysisParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#for_rule}.
	 * @param ctx the parse tree
	 */
	void enterFor_rule(lexAnalysisParser.For_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#for_rule}.
	 * @param ctx the parse tree
	 */
	void exitFor_rule(lexAnalysisParser.For_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#first_statement}.
	 * @param ctx the parse tree
	 */
	void enterFirst_statement(lexAnalysisParser.First_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#first_statement}.
	 * @param ctx the parse tree
	 */
	void exitFirst_statement(lexAnalysisParser.First_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#second_statement}.
	 * @param ctx the parse tree
	 */
	void enterSecond_statement(lexAnalysisParser.Second_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#second_statement}.
	 * @param ctx the parse tree
	 */
	void exitSecond_statement(lexAnalysisParser.Second_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#third_statement}.
	 * @param ctx the parse tree
	 */
	void enterThird_statement(lexAnalysisParser.Third_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#third_statement}.
	 * @param ctx the parse tree
	 */
	void exitThird_statement(lexAnalysisParser.Third_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#while_rule}.
	 * @param ctx the parse tree
	 */
	void enterWhile_rule(lexAnalysisParser.While_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#while_rule}.
	 * @param ctx the parse tree
	 */
	void exitWhile_rule(lexAnalysisParser.While_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void enterIf_rule(lexAnalysisParser.If_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void exitIf_rule(lexAnalysisParser.If_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(lexAnalysisParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(lexAnalysisParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(lexAnalysisParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(lexAnalysisParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#block_instructions}.
	 * @param ctx the parse tree
	 */
	void enterBlock_instructions(lexAnalysisParser.Block_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#block_instructions}.
	 * @param ctx the parse tree
	 */
	void exitBlock_instructions(lexAnalysisParser.Block_instructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#while_do}.
	 * @param ctx the parse tree
	 */
	void enterWhile_do(lexAnalysisParser.While_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#while_do}.
	 * @param ctx the parse tree
	 */
	void exitWhile_do(lexAnalysisParser.While_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#do_while_rule}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_rule(lexAnalysisParser.Do_while_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#do_while_rule}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_rule(lexAnalysisParser.Do_while_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#switch_rule}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_rule(lexAnalysisParser.Switch_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#switch_rule}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_rule(lexAnalysisParser.Switch_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(lexAnalysisParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(lexAnalysisParser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#default_case}.
	 * @param ctx the parse tree
	 */
	void enterDefault_case(lexAnalysisParser.Default_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#default_case}.
	 * @param ctx the parse tree
	 */
	void exitDefault_case(lexAnalysisParser.Default_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(lexAnalysisParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(lexAnalysisParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link lexAnalysisParser#id_assign}.
	 * @param ctx the parse tree
	 */
	void enterId_assign(lexAnalysisParser.Id_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link lexAnalysisParser#id_assign}.
	 * @param ctx the parse tree
	 */
	void exitId_assign(lexAnalysisParser.Id_assignContext ctx);
}