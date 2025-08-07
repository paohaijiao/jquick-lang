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
import com.github.paohaijiao.model.JLiteralModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
import org.antlr.v4.runtime.*;

import java.util.Stack;

/**
 * packageName com.github.paohaijiao.executor
 *
 * @author Martin
 * @version 1.0.0
 * @since 2025/8/6
 */
public class JQuickParamTypeExecutor  extends JAbstractAntlrExecutor<String, Object> {

    private JQuickLangLexer lexer;

    private JQuickLangParser parser;

    private TokenStream tokenStream;

    private JContext context;

    public JQuickParamTypeExecutor(){
        context=new JContext();
    }
    public JQuickParamTypeExecutor(JContext context){
        context=context;
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
    protected JLiteralModel parse(Parser parser) throws JAntlrExecutionException {
        JQuickLangParser calcParser = (JQuickLangParser) parser;
        JQuickLangParser.LiteralContext tree = calcParser.literal();
        CommonTokenStream commonTokenStream=(CommonTokenStream)tokenStream;
        JQuickLangCommonVisitor visitor = new JQuickLangCommonVisitor(context,new Stack<>(),lexer,commonTokenStream,calcParser);
        JLiteralModel object=(JLiteralModel)visitor.visit(tree);
        return object;
    }
}
