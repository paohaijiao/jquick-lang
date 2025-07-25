/*
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
package com.github.paohaijiao;

import com.github.paohaijiao.executor.JQuickLangActionExecutor;
import com.github.paohaijiao.factory.JFunctionRegistry;
import com.github.paohaijiao.model.JVariableContainerModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.io.IOException;

/**
 * packageName com.github.paohaijiao
 *
 * @author Martin
 * @version 1.0.0
 * @since 2025/7/24
 */
public class JActionTest {
    @Test
    public void mutiple() throws IOException {
        JContext context = new JContext();
        context.addConstant("PI", 3.14);
        JVariableContainerModel variables = new JVariableContainerModel();
        variables.put("radius", 5.0);
        JQuickLangActionExecutor executor = new JQuickLangActionExecutor(context, variables);
        String actionCode = "{ var area = PI * radius * radius; return area; }";
        Object result = executor.execute(actionCode);
        System.out.println("Area: " + result);
        System.out.println("Variables: " + executor.getContext());
    }
    @Test
    public void sample1() throws IOException {
        JContext context = new JContext();
        context.addConstant("charArray", new char[]{'W', 'o', 'r', 'l', 'd'});
        JQuickLangActionExecutor executor = new JQuickLangActionExecutor(context, new JVariableContainerModel());
        String constructorExample =
                "{" +
                        "  var str1 = new String(\"Hello\");" +
                        "  var str2 = new String(charArray);" +
                        "  var joinedStr = String.join(\"-\", \"Java\", \"Quick\", \"Lang\");" +
                        "  var upperStr = str1.toUpperCase();" +
                        "  var subStr = str2.substring(1, 3);" +
                        "  var result = new java.util.HashMap();" +
                        "  result.put(\"constructed1\", str1);" +
                        "  result.put(\"constructed2\", str2);" +
                        "  result.put(\"joined\", joinedStr);" +
                        "  result.put(\"uppercased\", upperStr);" +
                        "  result.put(\"substring\", subStr);" +
                        "  return result;" +
                        "}";
        System.out.println(constructorExample);
        Object result1 = executor.execute(constructorExample);
        System.out.println("result: " + result1);
    }
}
