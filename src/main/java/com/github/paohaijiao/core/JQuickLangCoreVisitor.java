package com.github.paohaijiao.core;

import com.paohaijiao.javelin.param.JContext;
import com.github.paohaijiao.parser.JQuickLangBaseVisitor;

public class JQuickLangCoreVisitor extends JQuickLangBaseVisitor {
    protected JContext context;

    protected String removeQuotes(String quotedString) {
        return quotedString.substring(1, quotedString.length() - 1);
    }



}
