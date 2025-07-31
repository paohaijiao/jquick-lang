package com.github.paohaijiao.fortest;

import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.io.IOException;

public class JForTest {

    @Test
    public void for1() throws IOException {
        String rule=" " +
                "for (var i = 0; i < 10; i = i + 1) {\n" +
                "            if(i==2){\n" +
                "                break;\n" +
                "            }else{\n" +
                "                console.log(i);\n" +
                "            }\n" +
                "   };";
        System.out.println(rule);
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        parser.enterScope("GLOBAL");
        JQuickLangParser.ForStatementContext tree = parser.forStatement();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        parser.exitScope();
        tv.visit(tree);
    }
    @Test
    public void for2() throws IOException {
        String rule=" " +
                "for (var i = 0; i < 10; i = i + 1) {\n" +
                "            if(i==2){\n" +
                "                continue;\n" +
                "            }else{\n" +
                "                console.log(i);\n" +
                "            }\n" +
                "   };";
        System.out.println(rule);
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ForStatementContext tree = parser.forStatement();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        tv.visit(tree);
    }
    @Test
    public void for3() throws IOException {
        String rule="        for (var i = 0; i < 10; i = i + 1) {\n" +
                "            for (var j = 0; j < 10; j = j + 1){\n" +
                "                if(j==2){\n" +
                "                    continue;\n" +
                "                }else{\n" +
                "                    console.log(i+\",\"+j);" +
                "                }\n" +
                "            }\n" +
                "        };";
        System.out.println(rule);
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ForStatementContext tree = parser.forStatement();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        tv.visit(tree);
    }
}
