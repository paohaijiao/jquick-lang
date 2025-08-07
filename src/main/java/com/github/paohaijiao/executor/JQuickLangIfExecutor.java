package com.github.paohaijiao.executor;

import com.github.paohaijiao.antlr.impl.JAbstractAntlrExecutor;
import com.github.paohaijiao.exception.JAntlrExecutionException;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.scope.VariableContext;
import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.util.Stack;

public class JQuickLangIfExecutor extends JAbstractAntlrExecutor<String, Object> {

    private  JContext context;

    private JQuickLangLexer lexer;

    private JQuickLangParser parser;

    private TokenStream tokenStream;

    private Stack<VariableContext> contextStack;

    public JQuickLangIfExecutor() {
        this(new JContext(), new Stack<>());
    }

    public JQuickLangIfExecutor(JContext context , Stack<VariableContext> contextStack) {
        initializeContext(context, contextStack);
    }
    private void initializeContext(JContext context,  Stack<VariableContext> contextStack) {
        this.context = context;
        this.contextStack = contextStack;
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
        JQuickLangParser.IfStatementContext actionContext = actionPaser.ifStatement();
        CommonTokenStream commonTokenStream=(CommonTokenStream)tokenStream;
        JQuickLangCommonVisitor visitor = new JQuickLangCommonVisitor(context,this.contextStack,lexer,commonTokenStream,actionPaser);
        return visitor.visit(actionContext);
    }
    public void intExecuteEnv(JContext context, Stack<VariableContext> stack) {
        this.initializeContext(context, stack);
    }
    public JContext getContext() {
        return this.context;
    }
}
