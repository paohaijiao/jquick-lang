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

    private  JContext context;

    public JQuickLangActionExecutor() {
        this(new JContext(), new JVariableContainerModel());
    }

    public JQuickLangActionExecutor(JContext context, JVariableContainerModel variableContainer) {
        initializeContext(context, variableContainer);
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
                this.context.put(key, variableContainerModel.get(key));
            }
        }
    }

    @Override
    protected JQuickLangLexer createLexer(CharStream input) {
        return new JQuickLangLexer(input);
    }

    @Override
    protected JQuickLangParser createParser(TokenStream tokens) {
        return new JQuickLangParser(tokens);
    }

    @Override
    protected Object parse(Parser parser) throws JAntlrExecutionException {
        JQuickLangParser actionPaser = (JQuickLangParser) parser;
        JQuickLangParser.ActionContext actionContext = actionPaser.action();
        JQuickLangCommonVisitor visitor = new JQuickLangCommonVisitor(context);
        visitor.setVariableContainer(variableContainer);
        return visitor.visit(actionContext);
    }

    public JVariableContainerModel getVariableContainer() {
        return this.variableContainer;
    }
    public JContext getContext() {
        return this.context;
    }
}
