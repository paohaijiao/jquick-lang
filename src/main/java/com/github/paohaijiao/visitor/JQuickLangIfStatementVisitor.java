package com.github.paohaijiao.visitor;
import com.github.paohaijiao.parser.JQuickLangParser;
public class JQuickLangIfStatementVisitor  extends JQuickLangForStatementVisitor{
    @Override
    public Object visitIfStatement(JQuickLangParser.IfStatementContext ctx) {
        if (toBoolean(visitConExpression(ctx.conExpression()))) {
            return visitAction(ctx.action());
        }
        for (int i = 0; i < ctx.elseIfConExpression().size(); i++) {
            if (toBoolean(visitElseIfConExpression(ctx.elseIfConExpression(i)))) {
                return visitElseIfAction(ctx.elseIfAction(i));
            }
        }
        if (null!=ctx.elseAction()) {
            return visitElseAction(ctx.elseAction());
        }
        return null;
    }
    @Override
    public Object visitElseIfAction(JQuickLangParser.ElseIfActionContext ctx) {
         if(ctx.action()!=null) {
             visitAction(ctx.action());
         }
         return null;
    }

    @Override
    public Object visitElseIfConExpression(JQuickLangParser.ElseIfConExpressionContext ctx) {
        if(ctx.expression()!=null) {
            return visitExpression(ctx.expression());
        }
        return null;
    }

    @Override
    public Object visitElseAction(JQuickLangParser.ElseActionContext ctx) {
        if(null!=ctx.action()) {
            visitAction(ctx.action());
        }
        return null;
    }
}
