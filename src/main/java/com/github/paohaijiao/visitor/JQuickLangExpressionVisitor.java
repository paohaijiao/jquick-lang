package com.github.paohaijiao.visitor;


import com.github.paohaijiao.parser.JQuickLangParser;

public class JQuickLangExpressionVisitor extends JQuickLangBoolVisitor {

    @Override
    public Object visitExpressionStatement(JQuickLangParser.ExpressionStatementContext ctx) {
        if (ctx.expression() != null) {
            return visitExpression(ctx.expression());
        }
        throw new RuntimeException("unexpected expression statement");
    }
    @Override
    public Object visitExpression(JQuickLangParser.ExpressionContext ctx) {
        if(ctx.logical()!=null) {
            return visitLogical(ctx.logical());
        }
        if(ctx.arithmetic()!=null) {
            return visitArithmetic(ctx.arithmetic());
        }
        if(ctx.primary()!=null) {
            return visitPrimary(ctx.primary());
        }
        if(ctx.methodInvocation()!=null) {
            return visit(ctx.methodInvocation());
        }
        throw new RuntimeException("unexpected expression");
    }


}
