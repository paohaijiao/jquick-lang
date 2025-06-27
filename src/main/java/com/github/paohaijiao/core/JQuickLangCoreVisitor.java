package com.github.paohaijiao.core;

import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangBaseVisitor;
import com.github.paohaijiao.util.JStringUtils;

public class JQuickLangCoreVisitor extends JQuickLangBaseVisitor {
    protected JContext context;

    protected String removeQuotes(String quotedString) {
        return JStringUtils.trim(quotedString);
    }


}
