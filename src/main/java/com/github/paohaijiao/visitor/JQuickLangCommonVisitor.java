package com.github.paohaijiao.visitor;

import com.github.paohaijiao.model.JReturnValueModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangParser;

public class JQuickLangCommonVisitor extends JQuickLangStatementVisitor {

    public JQuickLangCommonVisitor(JContext context) {
        this.context = context;
    }

    public JQuickLangCommonVisitor() {
        this.context = new JContext();
    }

    @Override
    public Object visitProgram(JQuickLangParser.ProgramContext ctx) {
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
