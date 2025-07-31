package com.github.paohaijiao.executor;

import com.github.paohaijiao.antlr.impl.JAbstractAntlrExecutor;
import com.github.paohaijiao.exception.JAntlrExecutionException;
import com.github.paohaijiao.model.JVariableContainerModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
import org.antlr.v4.runtime.*;

import java.io.IOException;

public class JQuickLangActionExecutor extends JAbstractAntlrExecutor<String, Object> {

    private  JContext context;

    private JQuickLangLexer lexer;

    private JQuickLangParser parser;

    private TokenStream tokenStream;

    public JQuickLangActionExecutor() {
        this(new JContext(), new JVariableContainerModel());
    }

    public JQuickLangActionExecutor(JContext context, JVariableContainerModel variableContainer) {
        initializeContext(context, variableContainer);
    }
    private void initializeContext(JContext context, JVariableContainerModel variableContainerModel) {
        this.context = context;
        if (context != null) {
            for (String key : context.keySet()) {
                this.context.put(key, context.get(key));
            }
        }
        if (variableContainerModel != null) {
            for (String key : variableContainerModel.keySet()) {
                this.context.put(key, variableContainerModel.get(key));
            }
        }
    }

    @Override
    protected Lexer createLexer(CharStream input) {
        this.lexer= new JQuickLangLexer(input);
        return lexer;
    }

    @Override
    protected Parser createParser(TokenStream tokens) {
        this.tokenStream=tokens;
        this.parser= new JQuickLangParser(tokens);
        return parser;
    }
    @Override
    public Object execute(String input) throws JAntlrExecutionException {
        try {
            CharStream charStream =null;
            try{
                charStream = this.createCharStream(input);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Lexer lexer = this.createLexer(charStream);
            this.setupLexerErrorHandling(lexer);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Parser parser = this.createParser(tokens);
            this.setupParserErrorHandling(parser);
            return this.parse(parser);
        } catch (JAntlrExecutionException e) {
            throw e;
        }
    }

    @Override
    protected Object parse(Parser parser) throws JAntlrExecutionException {
        JQuickLangParser actionPaser = (JQuickLangParser) parser;
        actionPaser.enterScope("GLOBAL");
        if(null!=this.context){
            this.context.entrySet().forEach(entry->{
                String key=entry.getKey();
                Object value=entry.getValue();
                actionPaser.addVariable(key,value.getClass().getName(),value,false,1);
            });
        }

        JQuickLangParser.ActionContext actionContext = actionPaser.action();
        CommonTokenStream commonTokenStream=(CommonTokenStream)tokenStream;
        JQuickLangCommonVisitor visitor = new JQuickLangCommonVisitor(context,lexer,commonTokenStream,actionPaser);
        Object object =visitor.visit(actionContext);
        actionPaser.exitScope();
        return object;
    }
    public void intExecuteEnv(JContext context, JVariableContainerModel variableContainerModel) {
        this.initializeContext(context, variableContainerModel);
    }
    public JContext getContext() {
        return this.context;
    }
}
