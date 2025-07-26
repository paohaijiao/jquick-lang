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

import java.io.IOException;
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
public class JInstanceMethodInvocationTest {

    public JContext setUp() {
        JService testInstance = new JService();
        JContext jContext=new JContext();
        jContext.put("testObj", testInstance);
        List<Integer> listVar = new ArrayList<Integer>() {}; // 匿名内部类保留类型信息
        listVar.addAll(Arrays.asList(1, 2, 3));
        jContext.put("listVar", Arrays.asList(1, 2, 3));
//        jContext.put("listVar", listVar);
        Map<String,String> map=new HashMap<>();
        map.put("key", "value");
        return jContext;
    }
    @Test
    public void testSimpleInstanceMethodCall() {
        String rule = "com.github.paohaijiao.service.JService::sum(5, 3);";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params =setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void testBooleanReturn() {
        String rule = "testObj.isEven(4);";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params =setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void testVoidReturn() {
        String rule = "testObj.noReturn();";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params =setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void testCollectionArgument() {
        String rule = "testObj.addToList(listVar, 4);";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params =setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
         Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public  void testMixedArgumentTypes() {
        String code = "testObj.methodWithMixedArgs(\"Test\", 42, true);";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params =setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void testVarArgsMethod() {
        String code = "testObj.methodWithVarArgs(\"a\", \"b\", \"c\");";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.MethodInvocationContext tree = parser.methodInvocation();
        JContext params =setUp();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }







    @Test
    public void varArgumentList() throws IOException {
//        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("a,b"));
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        JQuickLangParser parser = new JQuickLangParser(tokens);
//        JQuickLangParser.VarArgumentListContext tree = parser.varArgumentList();
//        JContext params = new JContext();
//        params.put("a","1");
//        params.put("b",Arrays.asList("a","b"));
//        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
//        Object object = tv.visit(tree);
//        System.out.println(object);
    }
    @Test
    public void argumentList() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("1,2"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ArgumentListContext tree = parser.argumentList();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void instanceName() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("i"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.InstanceNameContext tree = parser.instanceName();
        JContext params = new JContext();
        params.put("i","1");
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        System.out.println(object);
    }


}
