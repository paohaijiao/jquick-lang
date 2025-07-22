package com.github.paohaijiao.visitor;

import com.github.paohaijiao.factory.JFunctionRegistry;
import com.github.paohaijiao.model.JFunctionDefinitionModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangBaseVisitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JQuickLangCoreVisitor extends JQuickLangBaseVisitor {

    protected JContext context;

    JFunctionRegistry registry= JFunctionRegistry.getInstance();


}
