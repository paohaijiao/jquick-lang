package com.paohaijiao.javelin.visitor;


import com.paohaijiao.javelin.parser.JQuickLangParser;

public class JQuickLangAssignVisitor extends  JQuickLangFactorVisitor{

    @Override
    public Object visitAction(JQuickLangParser.ActionContext ctx) {
        String var = "";
        if(ctx.variables() != null) {
            var=visitVariables(ctx.variables());
        }
        Object result=null;
        if(ctx.value() != null) {
            result=visitValue(ctx.value());
        }
        this.context.put(var,result);
        return result;
    }
    @Override
    public Boolean visitElseIfStatment(JQuickLangParser.ElseIfStatmentContext ctx) {
        Boolean existsleseIfTrue=false;//handle the else whether execute
        for (int i = 0; i < ctx.ELSEIF().size(); i++) {
            boolean condition = (boolean) visit(ctx.composeBoolean(i));
            if (condition) {//
                existsleseIfTrue=true;
                visit(ctx.action(i));
            }

        }
        return existsleseIfTrue;
    }

    @Override
    public Object visitElseAction(JQuickLangParser.ElseActionContext ctx) {
        return visitAction(ctx.action());
    }
    @Override
    public Object visitAssignment(JQuickLangParser.AssignmentContext ctx) {
        boolean condition=false;
        Object result=null;
        if(ctx.composeBoolean() != null) {
            condition= (boolean)visit(ctx.composeBoolean());
        }
        if(condition) {
            return visit(ctx.action());
        }
        boolean existsleseIfTrue=false;
        if(ctx.elseIfStatment() != null) {
            existsleseIfTrue= visitElseIfStatment(ctx.elseIfStatment());
        }
        if(ctx.elseAction() != null) {
            if(!existsleseIfTrue) {//revoke the else block
                 visit(ctx.elseAction());
            }
        }
        return null;
    }
}
