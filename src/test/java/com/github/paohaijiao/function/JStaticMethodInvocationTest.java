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

import static org.junit.Assert.*;

/**
 * packageName PACKAGE_NAME
 *
 * @author Martin
 * @version 1.0.0
 * @className Junit
 * @date 2025/6/16
 * @description
 */
public class JStaticMethodInvocationTest {

    public JContext setUp() {
        JService testInstance = new JService();
        JContext jContext = new JContext();
        jContext.put("testObj", testInstance);
        List<Integer> listVar = new ArrayList<Integer>() {
        };
        listVar.addAll(Arrays.asList(1, 8, 3));
        jContext.put("listVar", Arrays.asList(1, 8, 3));
//        jContext.put("listVar", listVar);
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        return jContext;
    }

    @Test
    public void testSimpleStaticMethodCall() {
        String rule = "java.lang.Math::max(5, 10);";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object result = tv.visit(tree);
        System.out.println(result);
    }

    @Test
    public void testStaticMethodWithPrimitiveArguments() {
        String rule = "java.lang.Math::pow(2d, 3d);";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object result = tv.visit(tree);
        System.out.println(result);
    }

    @Test
    public void testStaticMethodWithStringArgument() {
        String rule = "java.lang.String::valueOf(123);";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object result = tv.visit(tree);
        System.out.println(result);
    }

    @Test
    public void testStaticMethodWithCollectionArgument() {
        java.util.Collections collections=null;
        String rule = "java.util.Collections::sort(listVar);";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object result = tv.visit(tree);
        System.out.println(result);
    }

    @Test
    public void testStaticMethodWithNullArgument() {
        String rule = "java.util.Objects::toString(null);";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object result = tv.visit(tree);
        System.out.println(result);
    }

    @Test
    public void testStaticMethodWithMixedArguments() {
        java.lang.String str=null;
        String rule = "java.lang.String::format(\"Number: %d, String: %s\", 42, \"test\");";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object result = tv.visit(tree);
        assertEquals("Number: 42, String: test", result);
    }

    @Test
    public void testStaticMethodWithNoArguments() {
        String rule = "java.lang.System::currentTimeMillis();";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object result = tv.visit(tree);
        System.out.println(result);
    }

    @Test
    public void testStaticMethodWithVarArgs() {
        //java.lang.String.join()xxx
        String rule = "java.lang.String::join(\",\", \"a\", \"b\", \"c\");";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object result = tv.visit(tree);
        System.out.println(result);
    }

    @Test
    public void testStaticMethodReturningVoid() {
        String rule = "java.lang.System::gc();";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object result = tv.visit(tree);
        System.out.println(result);
    }

    @Test
    public void testStaticMethodFromCustomClass() {
        String rule = "com.github.paohaijiao.service.JService::sum(1,2);";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params = setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params,lexer,tokens,parser);
        Object result = tv.visit(tree);
        System.out.println(result);
    }

}
