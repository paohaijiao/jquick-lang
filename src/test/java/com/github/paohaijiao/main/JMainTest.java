package com.github.paohaijiao.main;

import com.github.paohaijiao.executor.JQuickLangExecutor;
import org.junit.Test;

import java.io.IOException;

public class JMainTest {
    @Test
    public void methodDefine() throws IOException {
        String rule="    function getSquare(int:a,int:b){\n" +
                "        return a*b;\n" +
                "    }\n" +
                "    var a=1;\n" +
                "    var b=2;\n" +
                "    var c=this.getSquare(a,b);";
        System.out.println(rule);
        JQuickLangExecutor executor = new JQuickLangExecutor();
        Object result=executor.execute(rule);
        System.out.println(result);
    }
    @Test
    public void methodDefine1() throws IOException {
        String rule="    import java.lang.String as string;\n" +
                "     import java.lang.System as system;\n" +
                "    function getSquare(string:a,int:b){\n" +
                "        system@out.println(a);\n" +
                "        return a+b;\n" +
                "    }\n" +
                "    var a='hello world';\n" +
                "    var b=2;\n" +
                "    var c=this.getSquare(a,b);";
        System.out.println(rule);
        JQuickLangExecutor executor = new JQuickLangExecutor();
        Object result=executor.execute(rule);
        System.out.println(result);
    }


}
