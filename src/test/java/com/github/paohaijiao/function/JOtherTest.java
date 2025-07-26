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
    public void paramType() throws IOException {
        String rule = "short";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ParamTypeContext tree = parser.paramType();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void int1() throws IOException {
        String rule = "int";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ParamTypeContext tree = parser.paramType();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void  float1() throws IOException {
        String rule = "float";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ParamTypeContext tree = parser.paramType();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void  double1() throws IOException {
        String rule = "double";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ParamTypeContext tree = parser.paramType();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void  long1() throws IOException {
        String rule = "long";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ParamTypeContext tree = parser.paramType();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void  boolean1() throws IOException {
        String rule = "boolean";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ParamTypeContext tree = parser.paramType();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void  qualifiedName() throws IOException {
        String rule = "java.lang.String";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ParamTypeContext tree = parser.paramType();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void  functionVar() throws IOException {
        String rule = "a";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.FunctionVarContext tree = parser.functionVar();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void  param() throws IOException {
        String rule = "int:a";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ParamContext tree = parser.param();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void  parameterList() throws IOException {
        String rule = "int:a,float:b";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ParameterListContext tree = parser.parameterList();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void  functionDefinition() throws IOException {
        String rule = "function name(int:a,float:b){var a=1;}";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.FunctionDefinitionContext tree = parser.functionDefinition();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }

}
