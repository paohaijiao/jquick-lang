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

import com.paohaijiao.javelin.common.JQuickLangCommonVisitor;
import com.paohaijiao.javelin.param.JContext;
import com.paohaijiao.javelin.parser.JQuickLangLexer;
import com.paohaijiao.javelin.parser.JQuickLangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.io.IOException;

/**
 * packageName PACKAGE_NAME
 *
 * @author Martin
 * @version 1.0.0
 * @className Junit
 * @date 2025/6/16
 * @description
 */
public class JBooleanTest {

    @Test
    public void testBool01() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("2025-06-07 12:00:01!=2025-06-07 12:00:02"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.DateBoolContext tree = parser.dateBool();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void testBool02() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("'hello word' NOTEND 'hello'"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.StringBoolContext tree = parser.stringBool();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }

    @Test
    public void testBool03() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("1!=2"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.NumberBoolContext tree = parser.numberBool();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void testBool04() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("2025-06-07 12:00:01!=2025-06-07 12:00:02"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.SinggelBoolContext tree = parser.singgelBool();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void testBool05() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("true || true"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.BooleanExprContext tree = parser.booleanExpr();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }


}
