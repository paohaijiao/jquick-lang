package com.github.paohaijiao.function;/*
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

import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.service.JService;
import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.util.*;

/**
 * packageName PACKAGE_NAME
 *
 * @author Martin
 * @version 1.0.0
 * @className Junit
 * @date 2025/6/16
 * @description
 */
public class JConstructorMethodInvocationTest {

    public JContext setUp() {
        JService testInstance = new JService();
        JContext jContext = new JContext();
        jContext.put("testObj", testInstance);
        List<Integer> listVar = new ArrayList<Integer>() {
        };
        listVar.addAll(Arrays.asList(1, 2, 3));
        jContext.put("listVar", Arrays.asList(1, 2, 3));
//        jContext.put("listVar", listVar);
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        return jContext;
    }

    @Test
    public void testSimpleConstructorCall() {
        String rule = "new com.github.paohaijiao.service.JService();";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object object = tv.visit(tree);
        System.out.println(object);
    }

    @Test
    public void testConstructorWithPrimitiveArguments() {
        String rule = "new com.github.paohaijiao.model.JStudent(int:42, float:3.14, boolean:true);";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object object = tv.visit(tree);
        System.out.println(object);
    }

    @Test
    public void testConstructorWithStringArgument() {
        String rule = "new com.github.paohaijiao.model.JStudent(java.lang.String:\"test string\");";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object object = tv.visit(tree);
        System.out.println(object);
    }

    @Test
    public void testConstructorWithCollectionArgument() {
        String rule = "new com.github.paohaijiao.model.JStudent(List<java.lang.Integer>:listVar);";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object object = tv.visit(tree);
        System.out.println(object);
    }




    @Test
    public void testConstructorWithMixedArguments() {
        String rule = "new com.github.paohaijiao.model.JStudent<java.lang.String,java.lang.Integer,java.lang.Boolean,List<java.lang.Integer>>(\"test\", 123, true, listVar);";
        System.out.println(rule);
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object object = tv.visit(tree);
        System.out.println(object);
    }

    @Test
    public void testConstructorWithNoArguments() {
        String rule = "new java.util.ArrayList();";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object object = tv.visit(tree);
        System.out.println(object);
        assert (object instanceof ArrayList);
    }

    @Test
    public void testConstructorWithVarArgs() {
        String rule = "new com.github.paohaijiao.model.JStudent(\"a\", \"b\", \"c\");";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object object = tv.visit(tree);
        System.out.println(object);
    }


}
