package com.github.paohaijiao.function;

import com.github.paohaijiao.model.JSchool;
import com.github.paohaijiao.model.JStudent;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.support.JObjectFactory;
import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;

import static com.github.paohaijiao.support.JObjectFactory.*;

public class JOtherTest {
    @Test
    public void variableDecl() throws IOException {
        String rule = "var a=1;";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ParamContext tree = parser.param();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }

}
