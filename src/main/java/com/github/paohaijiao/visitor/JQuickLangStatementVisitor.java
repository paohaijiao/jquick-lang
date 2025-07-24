package com.github.paohaijiao.visitor;
import com.github.paohaijiao.model.JReturnValueModel;
import com.github.paohaijiao.parser.JQuickLangParser;

import java.util.List;

public class JQuickLangStatementVisitor extends JQuickLangIfStatementVisitor{
    @Override
    public Object visitControlStatement(JQuickLangParser.ControlStatementContext ctx) {
        if (ctx.ifStatement() != null) {
            return visit(ctx.ifStatement());
        } else if (ctx.forStatement() != null) {
            return visit(ctx.forStatement());
        } else if (ctx.whileStatement() != null) {
            return visit(ctx.whileStatement());
        } else if (ctx.returnStatement() != null) {
            return visit(ctx.returnStatement());
        } else if (ctx.expressionStatement() != null) {
            return visit(ctx.expressionStatement());
        }
        throw new RuntimeException("Unknown control statement");
    }
    @Override
    public Object visitStatement(JQuickLangParser.StatementContext ctx) {
        if(ctx.expression() != null) {
            return visit(ctx.expression());
        } else if (null!=ctx.rule_()) {
            return visitRule(ctx.rule_());
        } else if (null!=ctx.controlStatement()) {
            return visitControlStatement(ctx.controlStatement());
        }
        throw new RuntimeException("Unknown  statement");
    }
    @Override
    public Object visitRule(JQuickLangParser.RuleContext ctx) {
         if (ctx.functionDefinition() != null) {
            return visit(ctx.functionDefinition());
        }
        throw new RuntimeException("Unknown rule type");
    }
    @Override
    public Object visitAction(JQuickLangParser.ActionContext ctx) {
        Object result = null;
        List<JQuickLangParser.StatementContext> statements = ctx.statement();
        List<JQuickLangParser.ControlStatementContext> controlStatements = ctx.controlStatement();
        for (JQuickLangParser.StatementContext stmt : statements) {
            result = visit(stmt);
        }
        for (JQuickLangParser.ControlStatementContext ctrlStmt : controlStatements) {
            result = visit(ctrlStmt);
            if (result instanceof JReturnValueModel) {
                return result;
            }
        }
        return result;
    }
}
