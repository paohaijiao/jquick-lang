package com.github.paohaijiao.scope;

import com.github.paohaijiao.executor.JQuickLangExecutor;
import org.junit.Test;

import java.io.IOException;

public class JScopeLanguageTest {

    @Test
    public void scope() throws IOException {
            String rule=
                    "function a(int:a,float:b){\n" +
                            "}" +
                            "int c=1;" +
                            "int d=8.1f;" ;
            System.out.println(rule);
            JQuickLangExecutor executor = new JQuickLangExecutor();
            Object result=executor.execute(rule);
            System.out.println(result);

    }
}
