package com.github.paohaijiao.executor;

import com.github.paohaijiao.antlr.impl.JAbstractAntlrExecutor;
import com.github.paohaijiao.exception.JAntlrExecutionException;
import com.github.paohaijiao.model.JVariableContainerModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
import org.antlr.v4.runtime.*;

public class JQuickLangActionExecutor extends JAbstractAntlrExecutor<String, Object> {

    protected JContext context;
    protected JVariableContainerModel variableContainer = new JVariableContainerModel();

    public JQuickLangActionExecutor(JContext context, JVariableContainerModel jVariableContainerModel) {
        initializeContext(context, jVariableContainerModel);
    }
    private void initializeContext(JContext context, JVariableContainerModel variableContainerModel) {

        this.context = new JContext();
        if (context != null) {
            for (String key : context.keySet()) {
                this.context.addConstant(key, context.get(key));
            }
        }

        if (variableContainerModel != null) {
            for (String key : variableContainerModel.keySet()) {
                this.variableContainer.put(key, variableContainerModel.get(key));
            }
        }
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
    public JVariableContainerModel getVariables() {
        return variableContainer;
    }
}
