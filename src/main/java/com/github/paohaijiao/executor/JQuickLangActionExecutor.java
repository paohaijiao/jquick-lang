package com.github.paohaijiao.executor;

import com.github.paohaijiao.antlr.impl.JAbstractAntlrExecutor;
import com.github.paohaijiao.exception.JAntlrExecutionException;
import com.github.paohaijiao.model.JVariableContainerModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

public class JQuickLangActionExecutor extends JAbstractAntlrExecutor<String, Object> {

    protected JContext context;

    protected JVariableContainerModel variableContainer=new JVariableContainerModel();


    public JQuickLangActionExecutor(JContext context,JVariableContainerModel jVariableContainerModel){
        JContext jContext=new JContext();
        for (String key:context.keySet()){
            jContext.addConstant(key,context.get(key));
        }
        for (String key:jVariableContainerModel.keySet()){
            variableContainer.put(key,jVariableContainerModel.get(key));
        }
        this.context=jContext;

    }
    @Override
    protected Lexer createLexer(CharStream input) {
        return new JQuickLangLexer(input);
    }

    @Override
    protected Parser createParser(TokenStream tokens) {
        return new JQuickLangParser(tokens);
    }

    @Override
    protected Object parse(Parser parser) throws JAntlrExecutionException {
        JQuickLangParser calcParser = (JQuickLangParser) parser;
        JQuickLangParser.ActionContext tree = calcParser.action();
        JQuickLangCommonVisitor visitor = new JQuickLangCommonVisitor(context);
        visitor.setVariableContainer(variableContainer);
        return visitor.visit(tree);
    }
}
