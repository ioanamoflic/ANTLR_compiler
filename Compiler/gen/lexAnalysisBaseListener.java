import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import Utils.DefineVar;
import Utils.Method;

/**
 * This class provides an empty implementation of {@link lexAnalysisListener},
 * which can be extended to create a listener which only needs to handle a
 * subset of the available methods.
 */
public class lexAnalysisBaseListener implements lexAnalysisListener {

	public ArrayList<DefineVar> definedVars = new ArrayList<>();
	public ArrayList<Method> definedMethods = new ArrayList<>();

	@Override
	public void enterStart(lexAnalysisParser.StartContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitStart(lexAnalysisParser.StartContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterExpr(lexAnalysisParser.ExprContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitExpr(lexAnalysisParser.ExprContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterDefine_var(lexAnalysisParser.Define_varContext ctx) {
		if (ctx.DATATYPE() != null && (ctx.VAR() != null || ctx.assignment().ASSIGN() != null)
				&& ctx.SEMI_COLON() != null) {
			String type = ctx.DATATYPE().getText();
			String name;
			if (ctx.VAR() != null) {
				name = ctx.VAR().getText();
			} else {
				name = ctx.assignment().id().VAR().getText();
			}
			for (int index = 0; index < definedVars.size(); index++) {
				if (definedVars.get(index).name.equals(name)) {
					System.out.println("ReferenceError: " + name + " is already defined");
					return;
				}
			}
			if (ctx.DATATYPE().getText().equals("const")) {
				if (ctx.VAR() != null) {
					System.out.println("A const variable should be initialized");
				}
			}

			DefineVar var = new DefineVar(type, name);
			definedVars.add(var);
		}
	}

	@Override
	public void enterAssignment(lexAnalysisParser.AssignmentContext ctx) {
		if (ctx.id().VAR() != null && ctx.ASSIGN() != null) {
			boolean varExists = false;
			for (int index = 0; index < definedVars.size(); index++) {
				if (definedVars.get(index).name.equals(ctx.id().VAR().getText())) {
					varExists = true;
					if (definedVars.get(index).type.equals("const") && definedVars.get(index).isConst == 1) {
						System.out.println("A const variable can't be reinitialized;");
						return;
					}
					if (ctx.id_assign().BOOLEAN() != null) {
						if (definedVars.get(index).varType != null) {
							if (!definedVars.get(index).varType.equals("boolean"))
								System.out.println("Variable " + ctx.id().VAR().getText() + " has type: "
										+ definedVars.get(index).varType + " and it is an invalid conversion");
							return;
						}
						definedVars.get(index).varType = "boolean";
						definedVars.get(index).isConst = 1;
						break;
					} else if (ctx.id_assign().TEXT_TYPE() != null) {
						if (definedVars.get(index).varType != null) {
							if (!definedVars.get(index).varType.equals("text"))
								System.out.println("Variable " + ctx.id().VAR().getText() + " has type: "
										+ definedVars.get(index).varType + " and it is an invalid conversion");
							return;
						}
						definedVars.get(index).varType = "text";
						definedVars.get(index).isConst = 1;
						break;
					}
					if (ctx.id_assign().number().TINY() != null || ctx.id_assign().number().SIGNED_TINY() != null) {
						if (definedVars.get(index).varType != null) {
							if (!definedVars.get(index).varType.equals("tiny"))
								System.out.println("Variable " + ctx.id().VAR().getText() + " has type: "
										+ definedVars.get(index).varType + " and it is an invalid conversion");
							return;
						}
						definedVars.get(index).varType = "tiny";
						definedVars.get(index).isConst = 1;
						break;
					} else if (ctx.id_assign().number().HUGE() != null
							|| ctx.id_assign().number().SIGNED_HUGE() != null) {
						if (definedVars.get(index).varType != null) {
							if (!definedVars.get(index).varType.equals("huge"))
								System.out.println("Variable " + ctx.id().VAR().getText() + " has type: "
										+ definedVars.get(index).varType + " and it is an invalid conversion");
							return;
						}
						definedVars.get(index).varType = "huge";
						definedVars.get(index).isConst = 1;
						break;
					} else if (ctx.id_assign().number().DOUBLE() != null
							|| ctx.id_assign().number().SIGNED_DOUBLE() != null) {
						if (definedVars.get(index).varType != null) {
							if (!definedVars.get(index).varType.equals("double"))
								System.out.println("Variable " + ctx.id().VAR().getText() + " has type: "
										+ definedVars.get(index).varType + " and it is an invalid conversion");
							return;
						}
						definedVars.get(index).varType = "double";
						definedVars.get(index).isConst = 1;
						break;
					} else if (ctx.id_assign().number().EXPONENTIAL() != null
							|| ctx.id_assign().number().SIGNED_EXPONENTIAL() != null) {
						if (definedVars.get(index).varType != null) {
							if (!definedVars.get(index).varType.equals("exponential"))
								System.out.println("Variable " + ctx.id().VAR().getText() + " has type: "
										+ definedVars.get(index).varType + " and it is an invalid conversion");
							return;
						}
						definedVars.get(index).varType = "exponential";
						definedVars.get(index).isConst = 1;
						break;
					}
				}

			}
			if (varExists == false) {
				System.out.println("ReferenceError: " + ctx.id().VAR().getText() + " is not defined");
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitAssignment(lexAnalysisParser.AssignmentContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterAssignment_expr(lexAnalysisParser.Assignment_exprContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitAssignment_expr(lexAnalysisParser.Assignment_exprContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitDefine_var(lexAnalysisParser.Define_varContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterParameter_method(lexAnalysisParser.Parameter_methodContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitParameter_method(lexAnalysisParser.Parameter_methodContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterParameter_call_function(lexAnalysisParser.Parameter_call_functionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitParameter_call_function(lexAnalysisParser.Parameter_call_functionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterMethod(lexAnalysisParser.MethodContext ctx) {
		if (ctx.METHOD_NAME() != null) {
			String methodName = ctx.METHOD_NAME().getText();
			for (int index = 0; index < definedMethods.size(); index++) {
				if (definedMethods.get(index).functionName.equals(methodName)) {
					System.out.println("A function with name " + ctx.METHOD_NAME().getText() + " already exists");
					return;
				}
			}
			// List<lexAnalysisParser.Parameter_methodContext> ctx1 =
			// ctx.parameter_method();
			String[] methodParams = new String[ctx.parameter_method().size()];
			for (int index = 0; index < ctx.parameter_method().size(); index++) {
				methodParams[index] = ctx.parameter_method().get(index).VAR().getText();
			}
			Method method = new Method(methodName, methodParams);
			definedMethods.add(method);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitMethod(lexAnalysisParser.MethodContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterCall_method(lexAnalysisParser.Call_methodContext ctx) {
		int methodParams = 0, callParams = 0;
		if (ctx.METHOD_NAME() != null) {
			boolean methodExists = false;
			for (int index = 0; index < definedMethods.size(); index++) {
				if (definedMethods.get(index).functionName.equals(ctx.METHOD_NAME().getText())) {
					{
						methodExists = true;
						methodParams = definedMethods.get(index).functionParametersType.length;
						for (int index2 = 0; index2 < ctx.parameter_call_function().size(); index2++) {
							callParams++;
							if (ctx.parameter_call_function().get(index2).VAR() != null) {
								boolean varExists = false;
								for (int index3 = 0; index3 < definedVars.size(); index3++) {
									if (definedVars.get(index3).name
											.equals(ctx.parameter_call_function().get(index2).VAR().getText())) {
										varExists = true;

									}
								}

								if (varExists == false) {
									System.out.println("ReferenceError: "
											+ ctx.parameter_call_function().get(index2).VAR().getText()
											+ " is not defined");

								}
							}
						}

						if (methodParams != callParams) {
							System.out.println("Number of parameters should be the same for method "
									+ ctx.METHOD_NAME().getText());
						}
						break;
					}
				}
			}

			if (!methodExists) {
				System.out.println("Method with name " + ctx.METHOD_NAME().getText() + " is not defined.");
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitCall_method(lexAnalysisParser.Call_methodContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterPre_increment(lexAnalysisParser.Pre_incrementContext ctx) {
		boolean varExists = false;
		for (int index = 0; index < definedVars.size(); index++) {
			if (definedVars.get(index).name.equals(ctx.id().VAR().getText())) {
				varExists = true;

			}
		}
		if (varExists == false) {
			if (ctx.id().VAR() != null) {
				System.out.println("ReferenceError: " + ctx.id().VAR().getText() + " is not defined");
			} else {
				System.out.println("A type text is not iterable");
			}
		}

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitPre_increment(lexAnalysisParser.Pre_incrementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterPre_decrement(lexAnalysisParser.Pre_decrementContext ctx) {
		boolean varExists = false;
		for (int index = 0; index < definedVars.size(); index++) {
			if (definedVars.get(index).name.equals(ctx.id().VAR().getText())) {
				varExists = true;

			}
		}
		if (varExists == false) {
			if (ctx.id().VAR() != null) {
				System.out.println("ReferenceError: " + ctx.id().VAR().getText() + " is not defined");
			} else {
				System.out.println("A type text is not iterable");
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitPre_decrement(lexAnalysisParser.Pre_decrementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterPost_increment(lexAnalysisParser.Post_incrementContext ctx) {
		boolean varExists = false;
		for (int index = 0; index < definedVars.size(); index++) {
			if (definedVars.get(index).name.equals(ctx.id().VAR().getText())) {
				varExists = true;

			}
		}
		if (varExists == false) {
			if (ctx.id().VAR() != null) {
				System.out.println("ReferenceError: " + ctx.id().VAR().getText() + " is not defined");
			} else {
				System.out.println("A type text is not iterable");
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitPost_increment(lexAnalysisParser.Post_incrementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterPost_decrement(lexAnalysisParser.Post_decrementContext ctx) {
		boolean varExists = false;
		for (int index = 0; index < definedVars.size(); index++) {
			if (definedVars.get(index).name.equals(ctx.id().VAR().getText())) {
				varExists = true;

			}
		}
		if (varExists == false) {
			if (ctx.id().VAR() != null) {
				System.out.println("ReferenceError: " + ctx.id().VAR().getText() + " is not defined");
			} else {
				System.out.println("A type text is not iterable");
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitPost_decrement(lexAnalysisParser.Post_decrementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterIncr_decr(lexAnalysisParser.Incr_decrContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitIncr_decr(lexAnalysisParser.Incr_decrContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterIncr_decr_expr(lexAnalysisParser.Incr_decr_exprContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitIncr_decr_expr(lexAnalysisParser.Incr_decr_exprContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	private String GetType(lexAnalysisParser.Operator_expressionContext ctx, int index) {
		String type = "";

		if (ctx.operator_expression().get(index).VAR() != null) {
			boolean varExists = false;
			for (int count = 0; count < definedVars.size(); count++) {
				if (definedVars.get(count).name.equals(ctx.operator_expression().get(index).VAR().getText())) {
					varExists = true;
					type = definedVars.get(count).varType;
				}
			}
			return type;
		}

		if (ctx.operator_expression().get(index).number().TINY() != null
				|| ctx.operator_expression().get(index).number().SIGNED_TINY() != null) {
			type = "tiny";
			return type;
		}

		if (ctx.operator_expression().get(index).number().HUGE() != null
				|| ctx.operator_expression().get(index).number().SIGNED_HUGE() != null) {
			type = "huge";
			return type;
		}

		if (ctx.operator_expression().get(index).number().DOUBLE() != null
				|| ctx.operator_expression().get(index).number().SIGNED_DOUBLE() != null) {
			type = "double";
			return type;
		}

		if (ctx.operator_expression().get(index).number().EXPONENTIAL() != null
				|| ctx.operator_expression().get(index).number().SIGNED_EXPONENTIAL() != null) {
			type = "exponential";
			return type;
		}

		return type;
	}

	@Override
	public void enterOperator_expression(lexAnalysisParser.Operator_expressionContext ctx) {
		if (ctx.operator_expression().size() > 0) {
			for (int index = 1; index < ctx.operator_expression().size(); index++) {
				String type = GetType(ctx, 0);
				String type2 = GetType(ctx, index);
				if (!type.equals(type2)) {
					System.out.println("Mathematical operation can't be done between " + type + " and " + type2);
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitOperator_expression(lexAnalysisParser.Operator_expressionContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterMath_by(lexAnalysisParser.Math_byContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitMath_by(lexAnalysisParser.Math_byContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterComparator(lexAnalysisParser.ComparatorContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitComparator(lexAnalysisParser.ComparatorContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterFor_rule(lexAnalysisParser.For_ruleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitFor_rule(lexAnalysisParser.For_ruleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterFirst_statement(lexAnalysisParser.First_statementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitFirst_statement(lexAnalysisParser.First_statementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterSecond_statement(lexAnalysisParser.Second_statementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitSecond_statement(lexAnalysisParser.Second_statementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterThird_statement(lexAnalysisParser.Third_statementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitThird_statement(lexAnalysisParser.Third_statementContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterWhile_rule(lexAnalysisParser.While_ruleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitWhile_rule(lexAnalysisParser.While_ruleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterIf_rule(lexAnalysisParser.If_ruleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitIf_rule(lexAnalysisParser.If_ruleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterNumber(lexAnalysisParser.NumberContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitNumber(lexAnalysisParser.NumberContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterInstructions(lexAnalysisParser.InstructionsContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitInstructions(lexAnalysisParser.InstructionsContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterBlock_instructions(lexAnalysisParser.Block_instructionsContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitBlock_instructions(lexAnalysisParser.Block_instructionsContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterWhile_do(lexAnalysisParser.While_doContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitWhile_do(lexAnalysisParser.While_doContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterDo_while_rule(lexAnalysisParser.Do_while_ruleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitDo_while_rule(lexAnalysisParser.Do_while_ruleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterSwitch_rule(lexAnalysisParser.Switch_ruleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitSwitch_rule(lexAnalysisParser.Switch_ruleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterSwitch_case(lexAnalysisParser.Switch_caseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitSwitch_case(lexAnalysisParser.Switch_caseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterDefault_case(lexAnalysisParser.Default_caseContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitDefault_case(lexAnalysisParser.Default_caseContext ctx) {
	}

	@Override
	public void enterId(lexAnalysisParser.IdContext ctx) {

	}

	@Override
	public void exitId(lexAnalysisParser.IdContext ctx) {

	}

	@Override
	public void enterId_assign(lexAnalysisParser.Id_assignContext ctx) {

	}

	@Override
	public void exitId_assign(lexAnalysisParser.Id_assignContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void visitTerminal(TerminalNode node) {
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation does nothing.
	 * </p>
	 */
	@Override
	public void visitErrorNode(ErrorNode node) {
	}
}