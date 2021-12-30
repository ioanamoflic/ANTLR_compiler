import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class x86Generator extends AbstractParseTreeVisitor<Integer> implements lexAnalysisVisitor<Integer> {

    public Map<String, String> memory = new HashMap<>();
    public ArrayList<String> printList = new ArrayList<>();
    public String[] registerList = new String[]{"EDI", "ESI", "ECX", "EDX", "E8", "E9"};

    @Override
    public Integer visitStart(lexAnalysisParser.StartContext ctx) {
        for (int index = 0; index < ctx.children.size(); ++index)
            visit(ctx.children.get(index));
        return 0;
    }

    @Override
    public Integer visitExpr(lexAnalysisParser.ExprContext ctx) {
        for (int index = 0; index < ctx.children.size(); ++index)
            visit(ctx.children.get(index));
        return 0;
    }

    @Override
    public Integer visitAssignment(lexAnalysisParser.AssignmentContext ctx) {
        String id = ctx.id().getChild(0).getText();
        String value = "";
        if (ctx.id_assign().number() != null)
            value = ctx.id_assign().number().getText();
        else if (ctx.id_assign().CHAR() != null)
            value = ctx.id_assign().CHAR().getText();
        else if (ctx.id_assign().BOOLEAN() != null)
            value = ctx.id_assign().BOOLEAN().getText();
        else if (ctx.id_assign().WORD() != null)
            value = ctx.id_assign().WORD().getText();
        else if (ctx.id_assign().TEXT_TYPE() != null)
            value = ctx.id_assign().TEXT_TYPE().getText();
        else if (ctx.id_assign().operator_expression() != null)
            visit(ctx.id_assign().operator_expression());

        memory.put(id, value);
        if (!value.equals(""))
            printList.add("     PUSH " + value);
        printList.add("     POP EAX");
        printList.add("     MOV EAX " + id);
        return 0;
    }

    @Override
    public Integer visitAssignment_expr(lexAnalysisParser.Assignment_exprContext ctx) {
        visit(ctx.assignment());
        return 0;
    }

    @Override
    public Integer visitDefine_var(lexAnalysisParser.Define_varContext ctx) {
        if (ctx.assignment() != null) {
            visit(ctx.assignment());
            return 0;
        }
        if (ctx.VAR() != null)
            printList.add("     PUSH " + ctx.VAR().getText());
        return 0;
    }

    @Override
    public Integer visitParameter_method(lexAnalysisParser.Parameter_methodContext ctx) {
        if (ctx.parameter_call_function() != null)
            visit(ctx.parameter_call_function());

        return 0;
    }

    @Override
    public Integer visitParameter_call_function(lexAnalysisParser.Parameter_call_functionContext ctx) {
        return 0;
    }

    @Override
    public Integer visitMethod(lexAnalysisParser.MethodContext ctx) {

        String method = ctx.METHOD_NAME().getText() + "(";

        for (int index = 0; index < ctx.parameter_method().size() - 1; ++index) {
            if (ctx.parameter_method().get(index).REF() != null)
                method += ctx.parameter_method().get(index).DATATYPE().getText() + ctx.parameter_method().get(index).REF().getText() + ", ";
            else
                method += ctx.parameter_method().get(index).DATATYPE().getText() + ", ";
        }
        if (ctx.parameter_method().get(ctx.parameter_method().size() - 1).REF() != null)
            method += ctx.parameter_method().get(ctx.parameter_method().size() - 1).DATATYPE().getText() + ctx.parameter_method().get(ctx.parameter_method().size() - 1).REF().getText();
        else
            method += ctx.parameter_method().get(ctx.parameter_method().size() - 1).DATATYPE().getText();

        method += ")";

        printList.add(method + " PROC");

        if (ctx.block_instructions() != null)
            visit(ctx.block_instructions());

        printList.add(method + " ENDP");
        return 0;
    }

    @Override
    public Integer visitCall_method(lexAnalysisParser.Call_methodContext ctx) {

        String methodCall = "     CALL " + ctx.METHOD_NAME().getText() + "(";
        if (ctx.parameter_call_function().size() <= registerList.length) {
            for (int index = 0; index < ctx.parameter_call_function().size() - 1; ++index) {
                printList.add("     MOV " + registerList[index] + ", " + ctx.parameter_call_function().get(index).getText());
                methodCall += ctx.parameter_call_function().get(index).VAR().getText();
                methodCall += ", ";
            }
            printList.add("     MOV " + registerList[ctx.parameter_call_function().size() - 1] + ", " + ctx.parameter_call_function().get(ctx.parameter_call_function().size() - 1).getText());
            methodCall += ctx.parameter_call_function().get(ctx.parameter_call_function().size() - 1).VAR().getText();
            methodCall += ")";
            printList.add(methodCall);
        }

        return 0;
    }

    @Override
    public Integer visitPre_increment(lexAnalysisParser.Pre_incrementContext ctx) {
        if (ctx.id() != null) {
            printList.add("     MOV EAX, " + ctx.id().getText());
            printList.add("     ADD EAX, 1");
            printList.add("     MOV ECX, EAX");
        }
        return 0;
    }

    @Override
    public Integer visitPre_decrement(lexAnalysisParser.Pre_decrementContext ctx) {
        if (ctx.id() != null) {
            printList.add("     MOV EAX, " + ctx.id().getText());
            printList.add("     SUB EAX, 1");
            printList.add("     MOV ECX, EAX");
        }
        return 0;
    }

    @Override
    public Integer visitPost_increment(lexAnalysisParser.Post_incrementContext ctx) {
        if (ctx.id() != null) {
            printList.add("     MOV EAX, " + ctx.id().getText());
            printList.add("     INC [EAX]");
            printList.add("     MOV ECX, EAX");
        }
        return 0;
    }

    @Override
    public Integer visitPost_decrement(lexAnalysisParser.Post_decrementContext ctx) {
        if (ctx.id() != null) {
            printList.add("     MOV EAX, " + ctx.id().getText());
            printList.add("     DEC [EAX]");
            printList.add("     MOV ECX, EAX");
        }
        return 0;
    }

    @Override
    public Integer visitIncr_decr(lexAnalysisParser.Incr_decrContext ctx) {
        for (int index = 0; index < ctx.children.size(); ++index)
            visit(ctx.children.get(index));
        return 0;
    }

    @Override
    public Integer visitIncr_decr_expr(lexAnalysisParser.Incr_decr_exprContext ctx) {
        if (ctx.incr_decr() != null)
            visit(ctx.incr_decr());
        return 0;
    }

    @Override
    public Integer visitOperator_expression(lexAnalysisParser.Operator_expressionContext ctx) {
        if (ctx.SIGN() != null) {
            if (ctx.SIGN().getText().equals("+")) {
                printList.add("     MOV EAX, " + ctx.operator_expression(0).getText());
                printList.add("     ADD EAX, " + ctx.operator_expression(1).getText());
                printList.add("     PUSH EAX");
                printList.add("     MOV EDX, 0");
            } else {
                printList.add("     MOV EAX, " + ctx.operator_expression(0).getText());
                printList.add("     SUB EAX, " + ctx.operator_expression(1).getText());
                printList.add("     PUSH EAX");
                printList.add("     MOV EDX, 0");
            }
        } else if (ctx.MULT() != null) {
            String randomLabel = generateRandomLabel(5);
            printList.add("     TEST EAX, EAX");
            printList.add("     JNS " + randomLabel);
            printList.add("     NEG EAX");
            printList.add("     NEG ECX");
            printList.add(randomLabel + ":");
            printList.add("     IMUL ECX");
            printList.add("     PUSH EAX");
            printList.add("     MOV EDX, 0");
            printList.add("END " + randomLabel);
        } else if (ctx.DIV() != null) {
            String randomLabel = generateRandomLabel(5);
            printList.add("     TEST EAX, EAX");
            printList.add("     JNS " + randomLabel);
            printList.add("     NEG EAX");
            printList.add("     NEG ECX");
            printList.add(randomLabel + ":");
            printList.add("     IDIV ECX");
            printList.add("     PUSH EAX");
            printList.add("     MOV EDX, 0");
            printList.add("END " + randomLabel);
        }
        return 0;
    }

    @Override
    public Integer visitMath_by(lexAnalysisParser.Math_byContext ctx) {
        String randomLabel = generateRandomLabel(5);

        if (ctx.ADD_TO() != null) {
            printList.add("     POP ECX");
            printList.add("     POP EAX");
            printList.add("     ADD EAX, ECX");
            printList.add("     PUSH EAX");
            printList.add("     MOV EDX, 0");
        } else if (ctx.SUB_FROM() != null) {
            printList.add("     POP ECX");
            printList.add("     POP EAX");
            printList.add("     SUB EAX, ECX");
            printList.add("     PUSH EAX");
            printList.add("     MOV DX, 0");
        } else if (ctx.MULT_BY() != null) {
            printList.add("     MOV EAX, ECX");
            if (ctx.id(1) != null) {
                for (int index = 0; index < ctx.id().size(); ++index)
                    if (ctx.id(index) != null) {
                        printList.add("     IMUL EAX, ECX, " + ctx.id(index).getText());
                        break;
                    }
            } else
                printList.add("     IMUL EAX, ECX, " + ctx.number().getText());
            printList.add("     MOV ECX, EAX");
        } else {
            printList.add("     MOV EAX, ECX");
            if (ctx.id(1) != null) {
                for (int index = 0; index < ctx.id().size(); ++index)
                    if (ctx.id(index) != null) {
                        printList.add("     IDIV EAX, ECX, " + ctx.id(index).getText());
                        break;
                    }
            } else
                printList.add("     IDIV EAX, ECX, " + ctx.number().getText());
            printList.add("     MOV ECX, EAX");
        }
        return 0;
    }

    @Override
    public Integer visitComparator(lexAnalysisParser.ComparatorContext ctx) {
        if (ctx.id(0) != null) {
            for (int index = 0; index < ctx.id().size(); ++index)
                if (ctx.id().get(index) != null) {
                    printList.add("     MOV EAX, " + ctx.id().get(index).getText());
                    break;
                }
        }
        if (ctx.number(1) != null) {
            for (int index = 0; index < ctx.number().size(); ++index)
                if (ctx.number().get(index) != null) {
                    printList.add("     MOV EAX, " + ctx.number().get(index).getText());
                    break;
                }
        }
        if (ctx.operator_expression(0) != null) {
            visit(ctx.operator_expression(0));
        }
        if (ctx.incr_decr(0) != null) {
            visit(ctx.incr_decr(0));
        }

        if (ctx.id(1) != null) {
            for (int index = 0; index < ctx.id().size(); ++index)
                if (ctx.id().get(index) != null) {
                    printList.add("     CMP EAX, " + ctx.id().get(index).getText());
                    break;
                }
        }
        if (ctx.number(0) != null) {
            for (int index = 0; index < ctx.number().size(); ++index)
                if (ctx.number().get(index) != null) {
                    printList.add("     CMP EAX, " + ctx.number().get(index).getText());
                    break;
                }
        }
        if (ctx.operator_expression(1) != null) {
            visit(ctx.operator_expression(1));
        }
        if (ctx.incr_decr(1) != null) {
            visit(ctx.incr_decr(1));
        }
        return 0;
    }

    @Override
    public Integer visitFor_rule(lexAnalysisParser.For_ruleContext ctx) {

        if (ctx.block_instructions() != null) {
            printList.add(".L_for_loop");
            visit(ctx.block_instructions());
        }
        if (ctx.third_statement() != null)
            visit(ctx.third_statement());
        printList.add(".L_for");
        if (ctx.first_statement() != null)
            visit(ctx.first_statement());
        if (ctx.second_statement() != null) {
            visit(ctx.second_statement());
            printList.add("     JMP .L_for_loop");
        }
        return 0;
    }

    @Override
    public Integer visitFirst_statement(lexAnalysisParser.First_statementContext ctx) {

        if (ctx.assignment() != null)
            visit(ctx.assignment());
        if (ctx.define_var() != null)
            visit(ctx.define_var());

        return 0;
    }

    @Override
    public Integer visitSecond_statement(lexAnalysisParser.Second_statementContext ctx) {

        if (ctx.assignment() != null)
            visit(ctx.assignment());
        if (ctx.comparator() != null)
            visit(ctx.comparator());

        return 0;
    }

    @Override
    public Integer visitThird_statement(lexAnalysisParser.Third_statementContext ctx) {

        if (ctx.assignment() != null)
            visit(ctx.assignment());
        if (ctx.incr_decr() != null)
            visit(ctx.incr_decr());
        if (ctx.math_by() != null)
            visit(ctx.math_by());
        return 0;
    }

    @Override
    public Integer visitWhile_rule(lexAnalysisParser.While_ruleContext ctx) {

        if (ctx.block_instructions() != null) {
            printList.add(".L_while_loop");
            visit(ctx.block_instructions());
        }
        printList.add(".L_while");
        for (int index = 0; index < ctx.number().size(); ++index) {
            visit(ctx.number(index));
        }

        if (ctx.BOOLEAN(0) != null && ctx.BOOLEAN(0).getText().equals("true"))
            printList.add("     JMP .L_while_loop");
        if (ctx.BOOLEAN(1) != null && ctx.BOOLEAN(1).getText().equals("true"))
            printList.add("     JMP .L_while_loop");

        for (int index = 0; index < ctx.comparator().size(); ++index) {
            visit(ctx.comparator(index));
            printList.add("     JMP .L_while_loop");
        }
        return 0;
    }

    @Override
    public Integer visitIf_rule(lexAnalysisParser.If_ruleContext ctx) {
        if (ctx.comparator(0) != null)
            visitComparator(ctx.comparator(0));
        if (ctx.comparator(1) != null)
            visitComparator(ctx.comparator(1));
        if (ctx.block_instructions(0) != null)
            visit(ctx.block_instructions(0));
        if (ctx.block_instructions(1) != null)
            visit(ctx.block_instructions(1));
        return 0;
    }

    @Override
    public Integer visitNumber(lexAnalysisParser.NumberContext ctx) {
        if (ctx.DOUBLE() != null)
            printList.add("     PUSH " + ctx.DOUBLE().getText());
        if (ctx.TINY() != null)
            printList.add("     PUSH " + ctx.TINY().getText());
        if (ctx.EXPONENTIAL() != null)
            printList.add("     PUSH " + ctx.EXPONENTIAL().getText());
        if (ctx.HUGE() != null)
            printList.add("     PUSH " + ctx.HUGE().getText());
        if (ctx.SIGNED_TINY() != null)
            printList.add("     PUSH " + ctx.SIGNED_TINY().getText());
        if (ctx.SIGNED_DOUBLE() != null)
            printList.add("     PUSH " + ctx.SIGNED_DOUBLE().getText());
        if (ctx.SIGNED_HUGE() != null)
            printList.add("     PUSH " + ctx.SIGNED_HUGE().getText());
        return 0;
    }

    @Override
    public Integer visitInstructions(lexAnalysisParser.InstructionsContext ctx) {
        for (int index = 0; index < ctx.children.size(); ++index) {
            visit(ctx.children.get(index));
        }
        return 0;
    }

    @Override
    public Integer visitBlock_instructions(lexAnalysisParser.Block_instructionsContext ctx) {

        if (ctx.instructions() != null)
            visit(ctx.instructions());
        return 0;
    }

    @Override
    public Integer visitWhile_do(lexAnalysisParser.While_doContext ctx) {
        printList.add(".L_do_while");

        for (int index = 0; index < ctx.number().size(); ++index) {
            visit(ctx.number(index));
        }

        if (ctx.BOOLEAN(0) != null && ctx.BOOLEAN(0).getText().equals("true"))
            printList.add("     JMP .L_do_while_loop");
        if (ctx.BOOLEAN(1) != null && ctx.BOOLEAN(1).getText().equals("true"))
            printList.add("     JMP .L_do_while_loop");

        for (int index = 0; index < ctx.comparator().size(); ++index) {
            visit(ctx.comparator(index));
            printList.add("     JMP .L_do_while_loop");
        }
        return 0;
    }

    @Override
    public Integer visitDo_while_rule(lexAnalysisParser.Do_while_ruleContext ctx) {
        if (ctx.block_instructions() != null) {
            printList.add(".L_do_while_loop");
            visit(ctx.block_instructions());
        }

        if (ctx.while_do() != null) {
            visit(ctx.while_do());
        }
        return 0;
    }

    @Override
    public Integer visitSwitch_rule(lexAnalysisParser.Switch_ruleContext ctx) {
        for(int index = 0; index < ctx.switch_case().size(); ++index) {
            if(ctx.switch_case().get(index) != null)
                visit(ctx.switch_case().get(index));
        }
        if(ctx.default_case() != null) {
            visit(ctx.default_case());
        }
        return 0;
    }

    @Override
    public Integer visitSwitch_case(lexAnalysisParser.Switch_caseContext ctx) {
        if(ctx.number() != null) {
            printList.add("     CMP EAX, " + ctx.number().getText());
            printList.add("     je .L_case_instructions" + ctx.number().getText());
            if(ctx.block_instructions() != null) {
                printList.add(".L_case_instructions" + ctx.number().getText());
                visit(ctx.block_instructions());
            }
        }
        else if(ctx.TEXT_TYPE() != null) {
            printList.add("     CMP EAX, " + ctx.TEXT_TYPE().getText());
            printList.add("     je .L_case_instructions_" + ctx.TEXT_TYPE().getText());
            if(ctx.block_instructions() != null) {
                printList.add(".L_case_instructions_" + ctx.TEXT_TYPE().getText());
                visit(ctx.block_instructions());
            }
        }
        return 0;
    }

    @Override
    public Integer visitDefault_case(lexAnalysisParser.Default_caseContext ctx) {
        printList.add("     jmp .L_default");
        printList.add(".L_default");
        if(ctx.block_instructions() != null)
            visit(ctx.block_instructions());
        return 0;
    }

    @Override
    public Integer visitId(lexAnalysisParser.IdContext ctx) {
        if (ctx.VAR() != null)
            printList.add("     PUSH " + ctx.VAR().getText());
        if (ctx.WORD() != null)
            printList.add("     PUSH " + ctx.WORD().getText());
        else
            printList.add("     PUSH " + ctx.CHAR().getText());
        return 0;
    }

    @Override
    public Integer visitId_assign(lexAnalysisParser.Id_assignContext ctx) {
        for (int index = 0; index < ctx.children.size(); ++index)
            visit(ctx.children.get(index));
        return 0;
    }

    public void PrintExit() {
        printList.add("END:");
        printList.add("     int 21h");

    }

    public void PrintBasics() {
        printList.add(".MODEL       small");
        printList.add(".STACK       1000h");
    }

    public void PrintData() {
        printList.add("DATA: ");
        for (int dataIndex = 0; dataIndex < memory.size(); dataIndex++) {
            if (memory.values().toArray()[dataIndex].toString() != null)
                printList.add(memory.keySet().toArray()[dataIndex] + " DW " + memory.values().toArray()[dataIndex]);
            else
                printList.add(memory.keySet().toArray()[dataIndex] + " DW ?");
        }
    }

    public String generateRandomLabel(int count) {
        final String ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int ch = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(ch));
        }
        return builder.toString();
    }
}
