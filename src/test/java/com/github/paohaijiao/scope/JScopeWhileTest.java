package com.github.paohaijiao.scope;

import com.github.paohaijiao.executor.JQuickLangExecutor;
import org.junit.Test;

import java.io.IOException;

public class JScopeWhileTest {

    @Test
    public void scopefunc() throws IOException {
        String rule=
                "function a(int:a,float:b){\n" +
                        "  while (a<10) {\n" +
                        "         console.log(\"before:\"+a)\n" +
                        "          a=a+1;\n" +
                        "         console.log(a)\n" +
                        "         if(a==2){\n" +
                        "            break;\n" +
                        "          } else{\n" +
                        "             console.log(a)\n" +
                        "        }\n" +
                        "     }\n" +
                        "     }\n" +
                        "int c=0;\n" +
                        "float d=8.1;\n" +
                        "this.a(int:c,float:d);" ;
        System.out.println(rule);
        JQuickLangExecutor executor = new JQuickLangExecutor();
        Object result=executor.execute(rule);
        System.out.println(result);
    }



}
