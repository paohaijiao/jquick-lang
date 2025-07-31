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


import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.parser.JQuickLangParser;

public class JQuickLangAssignVisitor extends JQuickLangValueVisitor {

    @Override
    public Object visitVariableDecl(JQuickLangParser.VariableDeclContext ctx) {
        String str=ctx.getText();
        JAssert.notNull(ctx.IDENTIFIER(),"identifier required not null");
        JAssert.notNull(ctx.expression(),"expression required not null");
        String varName = ctx.IDENTIFIER().getText();
        boolean isVar = ctx.VAR() != null;
        Object value = ctx.expression() != null ? visit(ctx.expression()) : null;
        String type = isVar ? "var" : inferType(ctx.expression());
        if (!parser.addVariable(varName, type, value, !isVar, ctx.getStart().getLine())) {
            System.err.println("Error: Variable '" + varName + "' already declared in this scope");
        }
        return value;
    }
    private String inferType(JQuickLangParser.ExpressionContext expr) {
        if (expr == null) return "Object";

        if (expr.arithmetic() != null) {
            return "Number";
        } else if (expr.logical() != null) {
            return "boolean";
        } else if (expr.primary() != null) {
            if (expr.primary().literal() != null) {
                if (expr.primary().literal().string() != null) return "String";
                if (expr.primary().literal().bool() != null) return "boolean";
                if (expr.primary().literal().int_() != null) return "int";
                if (expr.primary().literal().float_() != null) return "float";
                if (expr.primary().literal().double_() != null) return "double";
                if (expr.primary().literal().long_() != null) return "long";
                if (expr.primary().literal().short_() != null) return "short";
            }
        }
        return "Object";
    }

}
