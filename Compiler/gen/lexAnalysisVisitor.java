// Generated from /Users/ioanamoflic/compilerrepo/Compiler/src/lexAnalysis.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lexAnalysisParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lexAnalysisVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(lexAnalysisParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(lexAnalysisParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(lexAnalysisParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#assignment_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expr(lexAnalysisParser.Assignment_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#define_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_var(lexAnalysisParser.Define_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#parameter_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_method(lexAnalysisParser.Parameter_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#parameter_call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_call_function(lexAnalysisParser.Parameter_call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(lexAnalysisParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#call_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_method(lexAnalysisParser.Call_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#pre_increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_increment(lexAnalysisParser.Pre_incrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#pre_decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_decrement(lexAnalysisParser.Pre_decrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#post_increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_increment(lexAnalysisParser.Post_incrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#post_decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_decrement(lexAnalysisParser.Post_decrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#incr_decr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncr_decr(lexAnalysisParser.Incr_decrContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#incr_decr_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncr_decr_expr(lexAnalysisParser.Incr_decr_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#math_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_by(lexAnalysisParser.Math_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#operator_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_expression(lexAnalysisParser.Operator_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(lexAnalysisParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#for_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_rule(lexAnalysisParser.For_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#first_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_statement(lexAnalysisParser.First_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#second_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_statement(lexAnalysisParser.Second_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#third_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThird_statement(lexAnalysisParser.Third_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#while_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_rule(lexAnalysisParser.While_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#if_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_rule(lexAnalysisParser.If_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(lexAnalysisParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(lexAnalysisParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#block_instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_instructions(lexAnalysisParser.Block_instructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#while_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_do(lexAnalysisParser.While_doContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#do_while_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_rule(lexAnalysisParser.Do_while_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#switch_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_rule(lexAnalysisParser.Switch_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(lexAnalysisParser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#default_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_case(lexAnalysisParser.Default_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(lexAnalysisParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link lexAnalysisParser#id_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_assign(lexAnalysisParser.Id_assignContext ctx);
}