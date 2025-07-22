package com.github.paohaijiao.common;

import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.visitor.JQuickLangAssignVisitor;

public class JQuickLangCommonVisitor extends JQuickLangAssignVisitor {
    public JQuickLangCommonVisitor(JContext context) {
        this.context = context;
    }

    public JQuickLangCommonVisitor() {
        this.context = new JContext();
    }



}
