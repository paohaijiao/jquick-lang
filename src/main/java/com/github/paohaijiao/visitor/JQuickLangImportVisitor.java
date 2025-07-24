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
        JAssert.isTrue(!this.importContainer.existsIdentify(var),"var ["+var+"] has been  exist can't be assign");
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
