package com.paohaijiao.javelin.visitor;


import com.paohaijiao.javelin.date.JDateCompareUtil;
import com.paohaijiao.javelin.exception.JAssert;
import com.paohaijiao.javelin.parser.JQuickLangParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Date;

public class JQuickLangBoolConditionVisitor extends JQuickLangExprVisitor {

    @Override
    public Boolean visitDateBool(JQuickLangParser.DateBoolContext ctx) {
        Date leftDate = visitDate(ctx.date(0));
        Date rightDate = visitDate(ctx.date(1));
        String op=null;
        if(null!=ctx.GT()){
             op=ctx.GT().getText();
        } else if (null!=ctx.GE()) {
            op=ctx.GE().getText();
        } else if (null!=ctx.LT()) {
            op=ctx.LT().getText();
        } else if (null!=ctx.LE()) {
            op=ctx.LE().getText();
        } else if (null!=ctx.EQ()) {
            op=ctx.EQ().getText();
        } else if (null!=ctx.NE()) {
            op=ctx.NE().getText();
        }
        Boolean bool=JDateCompareUtil.compare(leftDate, rightDate, op);
        return bool;
    }
    @Override
    public Boolean visitStringBool(JQuickLangParser.StringBoolContext ctx) {
        String left = removeQuotes(ctx.string(0).getText());
        String right = removeQuotes(ctx.string(1).getText());
        if (null!=ctx.CONTAIN()) {
            return left.contains(right);
        }
        if (null!=ctx.NOTCONTAIN()) {
            return !left.contains(right);
        }
        if (null!=ctx.START()) {
            return left.startsWith(right);
        }
        if (null!=ctx.NOTSTART()) {
            return !left.startsWith(right);
        }
        if (null!=ctx.END()) {
            return left.endsWith(right);
        }
        if (null!=ctx.NOTEND()) {
            return !left.endsWith(right);
        }
        throw new IllegalArgumentException("Unknown string operator");
    }

    @Override
    public Boolean visitNumberBool(JQuickLangParser.NumberBoolContext ctx) {
        // 实现数字比较逻辑
        double left = Double.parseDouble(ctx.number(0).getText());
        double right = Double.parseDouble(ctx.number(1).getText());
        if (null!=ctx.EQ()) {
            return left == right;
        }
        if (null!=ctx.GT()) {
            return left > right;
        }
        if (null!=ctx.GE()) {
            return left >= right;
        }
        if (null!=ctx.LT()) {
            return left < right;
        }
        if (null!=ctx.LE()) {
            return left <= right;
        }
        if (null!=ctx.NE()) {
            return left != right;
        }
        throw new IllegalArgumentException("Unknown comparison operator");
    }
    @Override
    public Boolean visitSinggelBool(JQuickLangParser.SinggelBoolContext ctx) {
        if (ctx.bool() != null) {
            return visitBool(ctx.bool());
        } else if (ctx.numberBool() != null) {
            return visitNumberBool(ctx.numberBool());
        } else if (ctx.stringBool() != null) {
            return visitStringBool(ctx.stringBool());
        } else if (ctx.dateBool() != null) {
            return visitDateBool(ctx.dateBool());
        }
        throw new IllegalArgumentException("Unknown boolean expression type");
    }
    @Override
    public Boolean visitBooleanExpr(JQuickLangParser.BooleanExprContext ctx) {
        Boolean result = (Boolean) visit(ctx.singgelBool(0));
        for (int i = 1; i < ctx.singgelBool().size(); i++) {
           JQuickLangParser.SinggelBoolContext singleBoolean= ctx.singgelBool(i);
            Boolean nextValue = (Boolean) visit(singleBoolean);
            ParseTree operatorNode = ctx.getChild(i * 2 - 1);
            int operatorType = ((TerminalNode) operatorNode).getSymbol().getType();
            if (operatorType== JQuickLangParser.AND) {
                result = result && nextValue;
            } else if (operatorType == JQuickLangParser.OR) {
                result = result || nextValue;
            }
        }

        return result;
    }
    @Override
    public Boolean visitComposeBoolean(JQuickLangParser.ComposeBooleanContext ctx) {
        if(null!=ctx.booleanExpr()){
            return visitBooleanExpr(ctx.booleanExpr());
        }
        JAssert.throwNewException("invalid compose");
        return null;
    }


}
