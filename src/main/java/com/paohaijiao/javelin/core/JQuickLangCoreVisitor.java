package com.paohaijiao.javelin.core;

import com.paohaijiao.javelin.param.JContext;
import com.paohaijiao.javelin.parser.JQuickLangBaseVisitor;

public class JQuickLangCoreVisitor extends JQuickLangBaseVisitor {
    protected JContext context;

    protected String removeQuotes(String quotedString) {
        return quotedString.substring(1, quotedString.length() - 1);
    }



}
