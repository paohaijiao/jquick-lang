package com.github.paohaijiao.visitor;

import com.github.paohaijiao.model.JReturnValueModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import org.antlr.v4.runtime.CommonTokenStream;

public class JQuickLangCommonVisitor extends JQuickLangStatementVisitor {

    public JQuickLangCommonVisitor(JContext context, JQuickLangLexer lexer, CommonTokenStream tokenStream,JQuickLangParser parser) {
        this.context = context;
        this.lexer = lexer;
        this.tokenStream = tokenStream;
        this.parser = parser;
    }

    public JQuickLangCommonVisitor(JQuickLangLexer lexer, CommonTokenStream tokenStream,JQuickLangParser parser) {
        this.context = new JContext();
        this.lexer = lexer;
        this.tokenStream = tokenStream;
        this.parser = parser;
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
