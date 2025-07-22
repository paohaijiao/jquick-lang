package com.github.paohaijiao.visitor;


import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.parser.JQuickLangParser;

public class JQuickLangPrimaryVisitor extends JQuickLangAssignVisitor {

    @Override
    public Object visitPrimary(JQuickLangParser.PrimaryContext ctx) {
        if(ctx.literal() != null) {
            return visitLiteral(ctx.literal());
        } else if (ctx.IDENTIFIER() != null) {
            String identifier=ctx.IDENTIFIER().getText();
            JAssert.isTrue(super.variableContainer.exists(identifier),"variable "+identifier+" not found");;
            return super.variableContainer.get(identifier);
        } else if (ctx.functionCall()!=null) {
            return null;
        }else if (ctx.expression()!=null) {
            return visitExpression(ctx.expression());
        } else if (ctx.variableDecl()!=null) {
            return visitVariableDecl(ctx.variableDecl());
        }
        return null;
    }


}
