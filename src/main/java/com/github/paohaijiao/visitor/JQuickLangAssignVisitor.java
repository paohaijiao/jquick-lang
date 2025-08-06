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
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.model.JLiteralModel;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.scope.VariableTree;
import com.github.paohaijiao.support.JTypeReference;

public class JQuickLangAssignVisitor extends JQuickLangValueVisitor {

    @Override
    public Object visitVariableDecl(JQuickLangParser.VariableDeclContext ctx) {
        JAssert.notNull(ctx.IDENTIFIER(),"identifier required not null");
        JAssert.notNull(ctx.expression(),"expression required not null");
        String varName = ctx.IDENTIFIER().getText();
        VariableTree variableTree = current.createChild(varName, JNodeType.GLOBAL);
        Object value = ctx.expression() != null ? visit(ctx.expression()) : null;
        JTypeReference<?> type=null;
        if(ctx.paramType() != null){
            type=visitParamType(ctx.paramType());
        }else{
            if(value instanceof JLiteralModel){
                JLiteralModel literalModel=(JLiteralModel)value;
                variableTree.addVariable(varName,literalModel.getValue(),literalModel.getType().getTypeReference());
            }else{
                JLiteralModel literalModel=convert(value,ctx.getText());
                variableTree.addVariable(varName,literalModel.getValue(),literalModel.getType().getTypeReference());
            }
        }
        current=getParentVariableTree();
        return value;
    }

}
