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


}
