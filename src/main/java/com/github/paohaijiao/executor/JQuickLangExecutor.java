package com.github.paohaijiao.executor;

import com.github.paohaijiao.antlr.impl.JAbstractAntlrExecutor;
import com.github.paohaijiao.exception.JAntlrExecutionException;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import org.antlr.v4.runtime.*;

public class JQuickLangExecutor extends JAbstractAntlrExecutor<String, Object> {

    private JQuickLangLexer lexer;

    private JQuickLangParser parser;

    private TokenStream tokenStream;

    private JContext context;

    public JQuickLangExecutor(){
        context=new JContext();
    }
    public JQuickLangExecutor(JContext context){
        context=context;
    }

    @Override
    protected Lexer createLexer(CharStream input) {
        this.lexer= new JQuickLangLexer(input);
        return lexer;
    }

    @Override
    protected Parser createParser(TokenStream tokens) {
        this.tokenStream=tokens;
        this.parser= new JQuickLangParser(tokens);
        return parser;
    }

    @Override
    protected Object parse(Parser parser) throws JAntlrExecutionException {
        JQuickLangParser calcParser = (JQuickLangParser) parser;
        JQuickLangParser.ProgramContext tree = calcParser.program();
        CommonTokenStream commonTokenStream=(CommonTokenStream)tokenStream;
        JQuickLangCommonVisitor visitor = new JQuickLangCommonVisitor(context,lexer,commonTokenStream,calcParser);
        return visitor.visit(tree);
    }
}
