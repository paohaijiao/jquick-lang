//package com.github.paohaijiao.fortest;
//
//import com.github.paohaijiao.executor.JQuickLangForExecutor;
//import org.junit.Test;
//
//import java.io.IOException;
//
//public class JForTest {
//
//    @Test
//    public void for1() throws IOException {
//        String rule=" " +
//                "for (var i = 0; i < 10; i = i + 1) {\n" +
//                "            if(i==2){\n" +
//                "                break;\n" +
//                "            }else{\n" +
//                "                console.log(i);\n" +
//                "            }\n" +
//                "   };";
//        System.out.println(rule);
//        JQuickLangForExecutor executor = new JQuickLangForExecutor();
//        executor.execute(rule);
//    }
//    @Test
//    public void for2() throws IOException {
//        String rule=" " +
//                "for (var i = 0; i < 10; i = i + 1) {\n" +
//                "            if(i==2){\n" +
//                "                continue;\n" +
//                "            }else{\n" +
//                "                console.log(i);\n" +
//                "            }\n" +
//                "   };";
//        System.out.println(rule);
//        JQuickLangForExecutor executor = new JQuickLangForExecutor();
//        executor.execute(rule);
//    }
//    @Test
//    public void for3() throws IOException {
//        String rule="        for (var i = 0; i < 10; i = i + 1) {\n" +
//                "            for (var j = 0; j < 10; j = j + 1){\n" +
//                "                if(j==2){\n" +
//                "                    continue;\n" +
//                "                }else{\n" +
//                "                    console.log(i+\",\"+j);" +
//                "                }\n" +
//                "            }\n" +
//                "        };";
//        System.out.println(rule);
//        JQuickLangForExecutor executor = new JQuickLangForExecutor();
//        executor.execute(rule);
//    }
//}
