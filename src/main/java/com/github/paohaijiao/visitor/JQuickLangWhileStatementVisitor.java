package com.github.paohaijiao.visitor;


import com.github.paohaijiao.exception.JBreakException;
import com.github.paohaijiao.exception.JContinueException;
import com.github.paohaijiao.parser.JQuickLangParser;


public class JQuickLangWhileStatementVisitor extends JQuickLangReturnStatementVisitor {


    @Override
    public Object visitWhileStatement(JQuickLangParser.WhileStatementContext ctx) {
        Object result = null;
        while (toBoolean(visit(ctx.expression()))) {
            try {
                result = visitAction(ctx.action());
            } catch (JBreakException e) {
                break;
            } catch (JContinueException e) {
                continue;
            }
        }
        return result;
    }




}
