package com.github.paohaijiao.visitor;

import com.github.paohaijiao.factory.JFunctionRegistry;
import com.github.paohaijiao.model.JImportContainerModel;
import com.github.paohaijiao.model.JVariableContainerModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangBaseVisitor;


public class JQuickLangCoreVisitor extends JQuickLangBaseVisitor {

    protected JContext context;

    protected JImportContainerModel importContainer=new JImportContainerModel();


    JFunctionRegistry registry= JFunctionRegistry.getInstance();

    protected boolean toBoolean(Object value) {
        if (value instanceof Boolean) {
            return (Boolean) value;
        } else if (value instanceof String) {
            return Boolean.parseBoolean((String) value);
        }
        throw new RuntimeException("cannot convert value to boolean: " + value);
    }


    public JFunctionRegistry getRegistry() {
        return registry;
    }

    public JImportContainerModel getImportContainer() {
        return importContainer;
    }
    public JContext getContext() {
        return context;
    }
    public void setContext(JContext context) {
        this.context = context;
    }
    public void setImportContainer(JImportContainerModel importContainer) {
        this.importContainer = importContainer;
    }



}
