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
public class JFactoryTest {

    @Test
    public void testBool01() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("3+4-5"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ValueContext tree = parser.value();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void testBool02() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("3*4/2"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ValueContext tree = parser.value();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void testBool03() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("return (3+(2*8))"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ReturnStatementContext tree = parser.returnStatement();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }

}
