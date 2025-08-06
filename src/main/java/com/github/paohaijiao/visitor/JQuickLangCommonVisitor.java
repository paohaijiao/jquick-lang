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
package com.github.paohaijiao.visitor;

import com.github.paohaijiao.model.JReturnValueModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import org.antlr.v4.runtime.CommonTokenStream;

public class JQuickLangCommonVisitor extends JQuickLangStatementVisitor {

    public JQuickLangCommonVisitor(JContext context, JQuickLangLexer lexer, CommonTokenStream tokenStream,JQuickLangParser parser) {
        this.context = context;
        this.lexer = lexer;
        this.tokenStream = tokenStream;
        this.parser = parser;
    }

    public JQuickLangCommonVisitor(JQuickLangLexer lexer, CommonTokenStream tokenStream,JQuickLangParser parser) {
        this.context = new JContext();
        this.lexer = lexer;
        this.tokenStream = tokenStream;
        this.parser = parser;
    }

    @Override
    public Object visitProgram(JQuickLangParser.ProgramContext ctx) {
//        ctx.scope.get();
        for (JQuickLangParser.ImportDeclarationContext importCtx : ctx.importDeclaration()) {
            visit(importCtx);
        }
        Object result = null;
        for (JQuickLangParser.StatementContext stmt : ctx.statement()) {
            result = visit(stmt);
            if (result instanceof JReturnValueModel) {
                return ((JReturnValueModel) result).getValue();
            }
        }
        return result;
    }


}
