package com.github.paohaijiao.visitor;


import com.github.paohaijiao.exception.JBreakException;
import com.github.paohaijiao.exception.JContinueException;
import com.github.paohaijiao.parser.JQuickLangParser;


public class JQuickLangWhileStatementVisitor extends JQuickLangReturnStatementVisitor {


    @Override
    public Object visitWhileStatement(JQuickLangParser.WhileStatementContext ctx) {
        Object result = null;
        parser.enterScope("LOOP");

        while (toBoolean(visit(ctx.expression()))) {
            try {
                result = visitAction(ctx.action());
            } catch (Exception e) {
                if (e instanceof JContinueException) {
                    continue;
                }else if (e instanceof JBreakException) {
                    break;
                }else{
                    e.printStackTrace();
                }
        }
        }
        parser.exitScope();
        return result;
    }




}
