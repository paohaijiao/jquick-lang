package com.github.paohaijiao.visitor;


import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.parser.JQuickLangParser;

public class JQuickLangAssignVisitor extends JQuickLangValueVisitor {

    @Override
    public Object visitVariableDecl(JQuickLangParser.VariableDeclContext ctx) {
        JAssert.notNull(ctx.IDENTIFIER(),"identifier required not null");
//        if(ctx.VAR()!=null&&null !=context.get(ctx.IDENTIFIER().getText())){
//            JAssert.throwNewException("identifier has been defined");
//        }
        Object object=visitExpression(ctx.expression());
        context.put(ctx.IDENTIFIER().getText(),object);
        return object;
    }


}
