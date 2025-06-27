package com.github.paohaijiao.common;

import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.visitor.JQuickLangAssignVisitor;

public class JQuickLangCommonVisitor extends JQuickLangAssignVisitor {
    public JQuickLangCommonVisitor(JContext context) {
        this.context = context;
    }

    public JQuickLangCommonVisitor() {
        this.context = new JContext();
    }

    @Override
    public Object visitRule(JQuickLangParser.RuleContext ctx) {
        if (null != ctx.assignment()) {
            visit(ctx.assignment());
            return null;
        } else if (ctx.returnStatement() != null) {
            return visit(ctx.returnStatement());
        }
        JAssert.throwNewException("invalid rule syntax");
        return null;
    }

    @Override
    public Object visitStatement(JQuickLangParser.StatementContext ctx) {
        Object result = null;
        for (JQuickLangParser.RuleContext r : ctx.rule_()) {
            result = visitRule(r);
        }
        return result;
    }

}
