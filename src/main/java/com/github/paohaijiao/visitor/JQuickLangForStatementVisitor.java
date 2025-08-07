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

import com.github.paohaijiao.exception.JAntlrExecutionException;
import com.github.paohaijiao.exception.JBreakException;
import com.github.paohaijiao.exception.JContinueException;
import com.github.paohaijiao.parser.JQuickLangParser;

public class JQuickLangForStatementVisitor  extends JQuickLangWhileStatementVisitor {

    @Override
    public Object visitForStatement(JQuickLangParser.ForStatementContext ctx) {
        enterScope();
        Object result = null;
        try{
            if (ctx.variableDecl() != null) {
                visit(ctx.variableDecl());
            } else if (ctx.initExpression() != null) {
                visitInitExpression(ctx.initExpression());
            }

            while (ctx.conExpression() == null || toBoolean(visitConExpression(ctx.conExpression()))) {
                try {
                    result = visitAction(ctx.action());

                } catch (JAntlrExecutionException e) {
                    if (e instanceof JContinueException) {
                        if (ctx.stopExpression() != null) {
                            visit(ctx.stopExpression());
                        }
                        continue;
                    }else if (e instanceof JBreakException) {
                        break;
                    }else{
                        e.printStackTrace();
                    }
                }
                if (ctx.stopExpression() != null) {
                    visitStopExpression(ctx.stopExpression());
                }
            }
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            exitScope();
        }
        return result;
    }
    @Override
    public Object visitInitExpression(JQuickLangParser.InitExpressionContext ctx) {
        if(null!=ctx.expression()){
            return visitExpression( ctx.expression());
        }
        return null;
    }
    @Override
    public Object visitConExpression(JQuickLangParser.ConExpressionContext ctx) {
        if(null!=ctx.expression()){
            return visitExpression( ctx.expression());
        }
        return null;
    }
    @Override
    public Object visitStopExpression(JQuickLangParser.StopExpressionContext ctx) {
        if(null!=ctx.expression()){
            return visitExpression( ctx.expression());
        }
        return null;
    }


}
