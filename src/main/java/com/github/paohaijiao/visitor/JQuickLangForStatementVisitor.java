package com.github.paohaijiao.visitor;
import com.github.paohaijiao.exception.JBreakException;
import com.github.paohaijiao.exception.JContinueException;
import com.github.paohaijiao.parser.JQuickLangParser;

public class JQuickLangForStatementVisitor  extends JQuickLangWhileStatementVisitor {

    @Override
    public Object visitForStatement(JQuickLangParser.ForStatementContext ctx) {
        if (ctx.variableDecl() != null) {
            visit(ctx.variableDecl());
        } else if (ctx.initExpression() != null) {
            visitInitExpression(ctx.initExpression());
        }
        Object result = null;
        while (ctx.conExpression() == null || toBoolean(visitConExpression(ctx.conExpression()))) {
            try {
                result = visit(ctx.action());
            } catch (JBreakException e) {
                break;
            } catch (JContinueException e) {
                if (ctx.stopExpression() != null) {
                    visit(ctx.stopExpression());
                }
                continue;
            }
            if (ctx.stopExpression() != null) {
                visitStopExpression(ctx.stopExpression());
            }
        }

        return result;
    }
    @Override
    public Object visitInitExpression(JQuickLangParser.InitExpressionContext ctx) {
        if(null!=ctx.expression()){
            return visitExpression( ctx.expression());
        }
        return null;
    }
    @Override
    public Object visitConExpression(JQuickLangParser.ConExpressionContext ctx) {
        if(null!=ctx.expression()){
            return visitExpression( ctx.expression());
        }
        return null;
    }
    @Override
    public Object visitStopExpression(JQuickLangParser.StopExpressionContext ctx) {
        if(null!=ctx.expression()){
            return visitExpression( ctx.expression());
        }
        return null;
    }


}
