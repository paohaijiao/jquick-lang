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
import com.github.paohaijiao.model.JImportModel;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.support.JTypeReference;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.List;


public class JQuickLangImportVisitor extends JQuickLangRegistryVisitor {
    @Override
    public Void visitImportDeclaration(JQuickLangParser.ImportDeclarationContext ctx) {
        JAssert.notNull(ctx.qualifiedName(),"missing qualified name");
        JAssert.notNull(ctx.importVar(),"missing qualified import variable");
        String qualifiedName=null;
        if(ctx.qualifiedName() != null) {
            qualifiedName=visitQualifiedName(ctx.qualifiedName());
        }
        JAssert.notNull(qualifiedName,"qualifiedName not null");
        String var=null;
        if(ctx.importVar() != null) {
            var=ctx.importVar().getText();
        }
        JAssert.notNull(var,"var not null");
        JAssert.isTrue(!this.importContainer.existsIdentify(var),"var ["+var+"] akready has been  imported, can't be assign again");
        this.importContainer.addImport(var,qualifiedName);
        return null;
    }

    @Override
    public String visitQualifiedName(JQuickLangParser.QualifiedNameContext ctx) {
        List<String> list=new ArrayList<>();
        if(ctx.IDENTIFIER()!=null&&!ctx.IDENTIFIER().isEmpty()){
            for (TerminalNode terminalNode:ctx.IDENTIFIER()){
                list.add(terminalNode.getText());
            }
        }
            return StringUtils.join(list, ".");
        }

    @Override
    public  JTypeReference<?>[] visitTypeArguments(JQuickLangParser.TypeArgumentsContext ctx) {
        JAssert.notNull(ctx.typeArgument(),"typeArgument not null");
        JTypeReference<?>[] typeReference=new JTypeReference<?>[ctx.typeArgument().size()];
        if(ctx.typeArgument()!=null&&!ctx.typeArgument().isEmpty()){
           for (int i = 0; i < ctx.typeArgument().size(); i++) {
            typeReference[i]=visitTypeArgument(ctx.typeArgument().get(i));
           }
       }
        return typeReference;
    }
    @Override
    public JTypeReference<?> visitTypeArgument(JQuickLangParser.TypeArgumentContext ctx) {
        if(ctx.paramType()!=null){
            return visitParamType(ctx.paramType());
        }
        JAssert.throwNewException("unexpected type Reference type");
        return null;

    }
    @Override
    public JTypeReference<?> visitParamType(JQuickLangParser.ParamTypeContext ctx) {
        if(ctx.TYPESHORT()!=null){
            return JTypeReference.of(short.class);
        }else if(ctx.TYPEINT()!=null){
            return JTypeReference.of(int.class);
        } else if (ctx.TYPEFLOAT()!=null) {
            return JTypeReference.of(float.class);
        }else if (ctx.TYPEDOUBLE()!=null){
            return JTypeReference.of(double.class);
        }else if (ctx.TYPELONG()!=null){
            return JTypeReference.of(long.class);
        }else if (ctx.TYPEBOOLEAN()!=null){
            return JTypeReference.of(boolean.class);
        }else if (ctx.paramType()!=null){
            return JTypeReference.of(boolean.class);
        }else if(ctx.qualifiedName()!=null){
            String varType=ctx.qualifiedName().getText();
            boolean exists=this.importContainer.existsIdentify(varType);
            if(exists){
                JImportModel type=(JImportModel)this.importContainer.get(varType);
                Class<?> clazz=type.getClazz();
                return JTypeReference.of(clazz);
            }else{
                Class<?> clazz=loadClass(varType);
                return JTypeReference.of(clazz);
            }
        }
        JAssert.throwNewException("unsupported type argument type");
        return null;
    }

}
