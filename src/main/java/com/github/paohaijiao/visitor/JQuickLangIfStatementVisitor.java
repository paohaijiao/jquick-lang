package com.github.paohaijiao.visitor;

import com.github.paohaijiao.parser.JQuickLangParser;

public class JQuickLangIfStatementVisitor  extends JQuickLangForStatementVisitor{
    @Override
    public Object visitIfStatement(JQuickLangParser.IfStatementContext ctx) {
        if (toBoolean(visit(ctx.expression(0)))) {
            return visit(ctx.action(0));
        }
        for (int i = 1; i < ctx.expression().size(); i++) {
            if (toBoolean(visit(ctx.expression(i)))) {
                return visit(ctx.action(i));
            }
        }
        if (ctx.action().size() > ctx.expression().size()) {
            return visit(ctx.action(ctx.action().size() - 1));
        }
        return null;
    }
}
