//package com.github.paohaijiao.scope;
//
//import com.github.paohaijiao.param.JContext;
//import com.github.paohaijiao.parser.JQuickLangLexer;
//import com.github.paohaijiao.parser.JQuickLangParser;
//import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.junit.Test;
//
//import java.io.IOException;
//
//public class JScopeTest {
//
//    @Test
//    public void scope() throws IOException {
//        VariableStorage globalScope = new VariableStorage("global", null);
//        globalScope.addVariable("MAX_SIZE", Integer.class, 100, true, "Maximum size limit");
//        globalScope.addVariable("appName", String.class, "MyApp", false, "Application name");
//        VariableStorage functionScope = globalScope.createChildScope("function1");
//        functionScope.addVariable("counter", Integer.class, 0, false, "Loop counter");
//        functionScope.addVariable("tempResult", Double.class, 3.14, false, "Temporary calculation result");
//        System.out.println("MAX_SIZE: " + functionScope.getVariable("MAX_SIZE").getValue());
//        System.out.println("counter: " + functionScope.getVariable("counter").getValue());
//        functionScope.updateVariable("counter", 5);
//        functionScope.updateVariable("appName", "NewApp");
//        try {//MAX_SIZE is constant
//            functionScope.updateVariable("MAX_SIZE", 200);
//        } catch (IllegalStateException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        System.out.println("\nCurrent scope variables:");
//        functionScope.getCurrentScopeVariables().forEach((name, var) ->
//                System.out.println(name + ": " + var.getValue()));
//        System.out.println("\nAll accessible variables:");
//        functionScope.getAllAccessibleVariables().forEach((name, var) -> System.out.println(name + " (" + var.getScope() + "): " + var.getValue()));
//    }
//}
