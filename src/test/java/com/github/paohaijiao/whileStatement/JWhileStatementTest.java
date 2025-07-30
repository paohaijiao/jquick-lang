package com.github.paohaijiao.whileStatement;

import com.github.paohaijiao.executor.JQuickLangIfExecutor;
import com.github.paohaijiao.executor.JQuickLangWhileExecutor;
import org.junit.Test;

import java.io.IOException;

public class JWhileStatementTest {
    @Test
    public void while1() throws IOException {
        String rule="    while(true){\n" +
                "            continue;\n" +
                "        }";
        System.out.println(rule);
        JQuickLangWhileExecutor executor = new JQuickLangWhileExecutor();
        Object result=executor.execute(rule);
    }
    @Test
    public void whilebreak() throws IOException {
        String rule="    while(true){\n" +
                "            break;\n" +
                "        }";
        System.out.println(rule);
        JQuickLangWhileExecutor executor = new JQuickLangWhileExecutor();
        Object result=executor.execute(rule);
    }
    @Test
    public void whileif() throws IOException {
        String rule=" while(true){\n" +
                "            for (var a = 0; a<10; a=a+1){\n" +
                "                if(a==2){\n" +
                "                    continue;\n" +
                "                }else{\n" +
                "                    console.log(\"当前的变量a:\"+a);\n" +
                "                }\n" +
                "            }\n" +
                "            break;\n" +
                "        }";
        JQuickLangWhileExecutor executor = new JQuickLangWhileExecutor();
        Object result=executor.execute(rule);
    }
}
