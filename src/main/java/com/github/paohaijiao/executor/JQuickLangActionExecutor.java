/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) [2025-2099] Martin (goudingcheng@gmail.com)
 */
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

public class JQuickLangActionExecutor extends JAbstractAntlrExecutor<String, Object> {

    private  JContext context;

    private JQuickLangLexer lexer;

    private JQuickLangParser parser;

    private TokenStream tokenStream;

    private  Stack<VariableContext> stack = new Stack<>();

    public JQuickLangActionExecutor() {
        this(new JContext(), new Stack<VariableContext>());
    }
    public JQuickLangActionExecutor(JContext context) {
        this(context, new Stack<VariableContext>());
    }
    public JQuickLangActionExecutor(JContext context, Stack<VariableContext> contextStack) {
        initializeContext(context, contextStack);
    }
    private void initializeContext(JContext context, Stack<VariableContext> contextStack) {
        this.context = context;
        this.stack = contextStack;

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
        JQuickLangParser.ActionContext actionContext = actionPaser.action();
        CommonTokenStream commonTokenStream=(CommonTokenStream)tokenStream;
        JQuickLangCommonVisitor visitor = new JQuickLangCommonVisitor(context,this.stack,lexer,commonTokenStream,actionPaser);
        Object object =visitor.visit(actionContext);
        return object;
    }
    public void intExecuteEnv(JContext context, Stack<VariableContext> contextStack) {
        this.initializeContext(context, contextStack);
    }
    public JContext getContext() {
        return this.context;
    }
}
