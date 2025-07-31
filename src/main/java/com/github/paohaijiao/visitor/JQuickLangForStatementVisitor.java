package com.github.paohaijiao.visitor;
import com.github.paohaijiao.exception.JAntlrExecutionException;
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
        parser.enterScope("LOOP");
        Object result = null;
        while (ctx.conExpression() == null || toBoolean(visitConExpression(ctx.conExpression()))) {
            try {
                result = visitAction(ctx.action());
            } catch (JAntlrExecutionException e) {
                if (e instanceof JContinueException) {
                    if (ctx.stopExpression() != null) {
                        visit(ctx.stopExpression());
                    }
                    continue;
                }else if (e instanceof JBreakException) {
                    break;
                }else{
                    e.printStackTrace();
                }
            }
            if (ctx.stopExpression() != null) {
                visitStopExpression(ctx.stopExpression());
            }
        }
        parser.exitScope();
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
