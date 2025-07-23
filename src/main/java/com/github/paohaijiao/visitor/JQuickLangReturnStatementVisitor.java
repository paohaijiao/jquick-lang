package com.github.paohaijiao.visitor;


import com.github.paohaijiao.parser.JQuickLangParser;

public class JQuickLangReturnStatementVisitor extends JQuickLangExpressionVisitor {

    @Override
    public Object visitReturnStatement(JQuickLangParser.ReturnStatementContext ctx) {
        if(ctx.expression() != null){
            return visitExpression( ctx.expression() );
        }else{
            return Void.class;
        }
    }



}
