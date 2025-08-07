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
import com.github.paohaijiao.model.JLiteralModel;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.support.JTypeReference;

public class JQuickLangAssignVisitor extends JQuickLangValueVisitor {

    @Override
    public Object visitVariableDecl(JQuickLangParser.VariableDeclContext ctx) {
        JAssert.notNull(ctx.IDENTIFIER(),"identifier required not null");
        JAssert.notNull(ctx.expression(),"expression required not null");
        String varName = ctx.IDENTIFIER().getText();
        if(ctx.paramType() != null){
            JTypeReference<?>  typeRef=visitParamType(ctx.paramType());
            String express=ctx.expression().getText();
            Object value=mergeDataWithTypeReference(express,typeRef);
            currentContext().addVariable(varName, value, typeRef);
            return value;
        }else{
            Object value = ctx.expression() != null ? visit(ctx.expression()) : null;
            if(value instanceof JLiteralModel){
                JLiteralModel literalModel=(JLiteralModel)value;
                currentContext().addVariable(varName, value, literalModel.getType().getTypeReference());
            }else{
                JLiteralModel literalModel=convert(value,ctx.getText());
                currentContext().addVariable(varName, value, literalModel.getType().getTypeReference());
            }
            return value;
        }
    }

}
