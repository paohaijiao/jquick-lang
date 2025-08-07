package com.github.paohaijiao.scope;

import com.github.paohaijiao.executor.JQuickLangExecutor;
import org.junit.Test;

import java.io.IOException;

public class JScopeLanguageTest {

    @Test
    public void scope() throws IOException {
            String rule=
                    "function a(int:a,float:b){\n" +
                            "}\n" +
                            "int c=1;\n" +
                            "float d=8.1;" ;
            System.out.println(rule);
            JQuickLangExecutor executor = new JQuickLangExecutor();
            Object result=executor.execute(rule);
            System.out.println(result);
    }

    @Test
    public void scope1() throws IOException {
        String rule=
                "function a(int:a,float:b){\n" +
                        "    if(a==2){\n" +
                        "      int c=3;\n" +
                        "    }else if(a==3){\n" +
                        "      int f=6;\n" +
                        "    }\n" +
                        "   return 18;"+
                        "}\n" +
                        "int c=1;\n" +
                        "float d=8.1;" +
                        "this.a<int,float>(c,d);" ;
        System.out.println(rule);
        JQuickLangExecutor executor = new JQuickLangExecutor();
        Object result=executor.execute(rule);
        System.out.println(result);
    }
}
