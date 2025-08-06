//package com.github.paohaijiao.scope;
//
//import com.github.paohaijiao.enums.JNodeType;
//import org.junit.Test;
//
//import java.io.IOException;
//
//public class JScopeTest {
//
//    @Test
//    public void scope() throws IOException {
//        VariableTree globalScope = new VariableTree("global", JNodeType.GLOBAL);
//        globalScope.addVariable("globalVar", 42, "int");
//        VariableTree methodScope = globalScope.createChild("myMethod", JNodeType.METHOD);
//        methodScope.addVariable("methodVar", "hello", "String");
//        VariableTree ifScope = methodScope.createChild("ifCondition", JNodeType.IF);
//        ifScope.addVariable("ifVar", true, "boolean");
//        VariableTree elseScope = methodScope.createChild("elseBlock", JNodeType.ELSE);
//        elseScope.addVariable("elseVar", 3.14, "double");
//        VariableTree whileScope = methodScope.createChild("whileLoop", JNodeType.WHILE);
//        whileScope.addVariable("counter", 0, "int");
//        globalScope.printTree();
// }
//}
