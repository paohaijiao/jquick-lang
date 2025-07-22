package com.github.paohaijiao.visitor;


import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.parser.JQuickLangParser;

public class JQuickLangAssignVisitor extends JQuickLangValueVisitor {

    @Override
    public Void visitVariableDecl(JQuickLangParser.VariableDeclContext ctx) {
        JAssert.notNull(ctx.IDENTIFIER(),"identifier required not null");
        if(variableContainer.exists(ctx.IDENTIFIER().getText())){
            JAssert.throwNewException("identifier has been defined");
        }
        Object object=visitExpression(ctx.expression());
        variableContainer.put(ctx.IDENTIFIER().getText(),object);
        return null;
    }


}
