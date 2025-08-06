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
import com.github.paohaijiao.enums.JNodeType;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.scope.VariableTree;

public class JQuickLangIfStatementVisitor  extends JQuickLangForStatementVisitor{
    @Override
    public Object visitIfStatement(JQuickLangParser.IfStatementContext ctx) {
        VariableTree variableTree = current.createChild("if", JNodeType.IF);
        if (toBoolean(visitConExpression(ctx.conExpression()))) {
            return visitAction(ctx.action());
        }
        for (int i = 0; i < ctx.elseIfConExpression().size(); i++) {
            if (toBoolean(visitElseIfConExpression(ctx.elseIfConExpression(i)))) {
                return visitElseIfAction(ctx.elseIfAction(i));
            }
        }
        if (null!=ctx.elseAction()) {
            return visitElseAction(ctx.elseAction());
        }
        current=getParentVariableTree();
        return null;
    }
    @Override
    public Object visitElseIfAction(JQuickLangParser.ElseIfActionContext ctx) {
         if(ctx.action()!=null) {
             visitAction(ctx.action());
         }
         return null;
    }

    @Override
    public Object visitElseIfConExpression(JQuickLangParser.ElseIfConExpressionContext ctx) {
        if(ctx.expression()!=null) {
            return visitExpression(ctx.expression());
        }
        return null;
    }

    @Override
    public Object visitElseAction(JQuickLangParser.ElseActionContext ctx) {
        if(null!=ctx.action()) {
            visitAction(ctx.action());
        }
        return null;
    }
}
