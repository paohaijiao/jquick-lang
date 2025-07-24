package com.github.paohaijiao;/*
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

import com.github.paohaijiao.factory.JFunctionRegistry;
import com.github.paohaijiao.model.JFunctionFieldModel;
import com.github.paohaijiao.model.JFunctionDefinitionModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName PACKAGE_NAME
 *
 * @author Martin
 * @version 1.0.0
 * @className Junit
 * @date 2025/6/16
 * @description
 */
public class JFunctionlTest {
    @Test
    public void functionDefinition() throws IOException {
        String rule="function c(int:a,float:b){\n" +
                "    return a+b;\n" +
                "}";
        System.out.println(rule);
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.FunctionDefinitionContext tree = parser.functionDefinition();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object = tv.visit(tree);
        JFunctionRegistry registry=tv.getRegistry();
        System.out.println(object);
    }
    @Test
    public void invokeFunction() throws IOException {
        String rule="c(1,1.5)";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.FunctionCallContext tree = parser.functionCall();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        JFunctionRegistry registry=tv.getRegistry();
        JFunctionFieldModel modela=new JFunctionFieldModel();
        modela.setIndex(0);
        modela.setFieldName("a");
        modela.setClazz(int.class);
        JFunctionFieldModel modelb=new JFunctionFieldModel();
        modelb.setIndex(1);
        modelb.setFieldName("a");
        modelb.setClazz(float.class);
        JFunctionDefinitionModel functionDefinitionModel=new JFunctionDefinitionModel(
                "c", Arrays.asList(modela,modelb),"{\n" +
                "    return a+b;\n" +
                "}"
        );
        registry.registerFunction(functionDefinitionModel);
        Object object = tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void invokeFunction1() throws IOException {
        String rule="d('a')";
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString(rule));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.FunctionCallContext tree = parser.functionCall();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        JFunctionRegistry registry=tv.getRegistry();
        JFunctionFieldModel modela=new JFunctionFieldModel();
        modela.setIndex(0);
        modela.setFieldName("a");
        modela.setClazz(String.class);
        JFunctionFieldModel modelb=new JFunctionFieldModel();
        modelb.setIndex(0);
        modelb.setFieldName("b");
        modelb.setClazz(String.class);
        JFunctionDefinitionModel functionDefinitionModel=new JFunctionDefinitionModel(
                "d", Arrays.asList(modela,modelb),"{\n" +
                "    return a.contate(b);\n" +
                "}"
        );
        registry.registerFunction(functionDefinitionModel);
        Object object = tv.visit(tree);
        System.out.println(object);
    }


}
