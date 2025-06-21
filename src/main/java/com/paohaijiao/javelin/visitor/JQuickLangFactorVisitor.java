package com.paohaijiao.javelin.visitor;


import com.paohaijiao.javelin.exception.JAssert;
import com.paohaijiao.javelin.math.JMathUtil;
import com.paohaijiao.javelin.parser.JQuickLangParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JQuickLangFactorVisitor extends JQuickLangBoolConditionVisitor {

    @Override
    public Object visitValue(JQuickLangParser.ValueContext ctx) {
        Object result = (Object) visit(ctx.term(0));
        for (int i = 1; i < ctx.term().size(); i++) {
            JQuickLangParser.TermContext termContext= ctx.term(i);
            Object nextValue = (Object) visit(termContext);
            ParseTree operatorNode = ctx.getChild(i * 2 - 1);
            int operatorType = ((TerminalNode) operatorNode).getSymbol().getType();
            if (operatorType== JQuickLangParser.ADD) {
                result = JMathUtil.op(result, nextValue,"+");
            } else if (operatorType == JQuickLangParser.MINUS) {
                result = JMathUtil.op(result, nextValue,"-");
            }
        }

        return result;
    }
    @Override
    public Object visitTerm(JQuickLangParser.TermContext ctx) {
        Object result = (Object) visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            JQuickLangParser.FactorContext termContext= ctx.factor(i);
            Object nextValue = (Object) visit(termContext);
            ParseTree operatorNode = ctx.getChild(i * 2 - 1);
            int operatorType = ((TerminalNode) operatorNode).getSymbol().getType();
            if (operatorType== JQuickLangParser.MUL) {
                result = JMathUtil.op(result, nextValue,"*");
            } else if (operatorType == JQuickLangParser.DIV) {
                result = JMathUtil.op(result, nextValue,"/");
            }
        }
        return result;
    }
    @Override
    public Object  visitFactor(JQuickLangParser.FactorContext ctx) {
        if(ctx.value() != null) {
            return visitValue(ctx.value());
        } else if (ctx.expr() != null) {
            return visitExpr(ctx.expr());
        }
        JAssert.throwNewException("invalid expression");
        return null;
    }
    @Override
    public Object visitReturnStatement(JQuickLangParser.ReturnStatementContext ctx) {
        if(ctx.value()!= null) {
            return visitValue(ctx.value());
        }
        JAssert.throwNewException("invalid return statement");
        return null;
    }




}
