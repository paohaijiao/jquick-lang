package com.github.paohaijiao.visitor;

import com.github.paohaijiao.constants.JConstants;
import com.github.paohaijiao.date.JDateUtil;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.util.JStringUtils;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class JQuickLangImportVisitor extends JQuickLangCoreVisitor {
    @Override
    public String visitImportDeclaration(JQuickLangParser.ImportDeclarationContext ctx) {
         if(ctx.qualifiedName() != null) {
           String qualifiedName=visitQualifiedName(ctx.qualifiedName());
             if(!importContainer.hasImport(qualifiedName)){
                 importContainer.addImport(qualifiedName);
             }
             return qualifiedName;
         }
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
