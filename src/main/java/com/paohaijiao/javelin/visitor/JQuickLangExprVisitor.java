package com.paohaijiao.javelin.visitor;


import com.paohaijiao.javelin.exception.JAssert;
import com.paohaijiao.javelin.parser.JQuickLangParser;

import java.util.ArrayList;
import java.util.List;


public class JQuickLangExprVisitor extends JQuickLangValueVisitor {
    @Override
    public Object visitExpr(JQuickLangParser.ExprContext ctx) {
        if(ctx.variables() != null) {
            String key= visitVariables(ctx.variables());
            Object value=this.context.get(key);
            JAssert.notNull(value,"Variable "+key+" is not initialized");
        }else if(ctx.string() != null) {
            String str=visitString(ctx.string());
            return str;
        }else if(ctx.number() != null) {
            return visitNumber(ctx.number());
        }else if (ctx.getText().equals("true")) {
            return Boolean.TRUE;
        }else if (ctx.getText().equals("false")) {
            return Boolean.FALSE;
        }else if (ctx.getText().equals("null")) {
            return null;
        }
        JAssert.throwNewException("invalid expression");
        return null;
    }
    @Override
    public List<Object> visitExprList(JQuickLangParser.ExprListContext ctx) {
        List<Object> list = new ArrayList<Object>();
        for (JQuickLangParser.ExprContext expr : ctx.expr()) {
            Object obj=visitExpr(expr);
            list.add(obj);
        }
        return list;
    }



}
