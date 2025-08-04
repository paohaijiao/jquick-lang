package com.github.paohaijiao.function;

import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.util.ArrayList;

public class JArgumentListTest {

    @Test
    public void testConstructorWithNoArguments() {
        String rule = "1,2";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ArgumentListContext tree = parser.argumentList();
        JContext context=new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(context,lexer,tokens,parser);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
}
