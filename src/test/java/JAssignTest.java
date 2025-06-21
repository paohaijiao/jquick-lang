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
public class JAssignTest {

    @Test
    public void tesstAction() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("{ ${id}=3+(5*10)}"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ActionContext tree = parser.action();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void elseAction() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("ELSE { ${id}=3+(5*10)}"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ElseActionContext tree = parser.elseAction();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void elseIfStatment() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("ELSEIF(false) THEN{ ${id}=3+(5*10)}"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ElseIfStatmentContext tree = parser.elseIfStatment();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void mutipleElseIfStatment() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("ELSEIF(false) THEN{ ${id}=3+(5*10)} ELSEIF(true) THEN{ ${id}=3+(12*10)}"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.ElseIfStatmentContext tree = parser.elseIfStatment();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void assignment01() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("IF(true) THEN{ ${id}=3 } ELSEIF(false) THEN{ ${id}=3+(5*10)} ELSEIF(true) THEN{ ${id}=3+(12*10)}"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.AssignmentContext tree = parser.assignment();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void assignment02() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("IF(false) THEN{ ${id}=3 } ELSEIF(true) THEN{ ${id}=3+(5*10)} ELSEIF(false) THEN{ ${id}=3+(12*10)} ELSE{${id}=3+(12*8) }"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.AssignmentContext tree = parser.assignment();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void assignment03() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("IF(false) THEN{ ${id}=3 } ELSEIF(false) THEN{ ${id}=3+(5*10)} ELSEIF(true) THEN{ ${id}=3+(12*10)} ELSE{${id}=3+(12*8) }"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.AssignmentContext tree = parser.assignment();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }
    @Test
    public void assignment04() throws IOException {
        JQuickLangLexer lexer = new JQuickLangLexer(CharStreams.fromString("IF(false) THEN{ ${id}=3 } ELSEIF(false) THEN{ ${id}=3+(5*10)} ELSEIF(false) THEN{ ${id}=3+(12*10)} ELSE{${id}=3+(12*8) }"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JQuickLangParser parser = new JQuickLangParser(tokens);
        JQuickLangParser.AssignmentContext tree = parser.assignment();
        JContext params = new JContext();
        JQuickLangCommonVisitor tv = new JQuickLangCommonVisitor(params);
        Object object= tv.visit(tree);
        System.out.println(object);
    }



}
