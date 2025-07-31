//package com.github.paohaijiao.ifStatement;
//
//import com.github.paohaijiao.executor.JQuickLangIfExecutor;
//import org.junit.Test;
//
//import java.io.IOException;
//
//public class JIFTest {
//    @Test
//    public void if1() throws IOException {
//        String rule="if(true){" +
//                "console.log(1)" +
//                "}";
//        System.out.println(rule);
//        JQuickLangIfExecutor executor = new JQuickLangIfExecutor();
//        Object result=executor.execute(rule);
//    }
//    @Test
//    public void if2() throws IOException {
//        String rule="  if(false){\n" +
//                "            console.log(1);\n" +
//                "        }else if(true){\n" +
//                "            console.log(2);\n" +
//                "        }";
//        System.out.println(rule);
//        JQuickLangIfExecutor executor = new JQuickLangIfExecutor();
//        Object result=executor.execute(rule);
//    }
//    @Test
//    public void if3() throws IOException {
//        String rule="        if(false){\n" +
//                "            console.log(1);\n" +
//                "        }else if(false){\n" +
//                "            console.log(2);\n" +
//                "        }else if(true){\n" +
//                "            console.log(3);\n" +
//                "        }";
//        System.out.println(rule);
//        JQuickLangIfExecutor executor = new JQuickLangIfExecutor();
//        Object result=executor.execute(rule);
//    }
//    @Test
//    public void if4() throws IOException {
//        String rule="     if(false){\n" +
//                "            console.log(1);\n" +
//                "        }else if(false){\n" +
//                "            console.log(2);\n" +
//                "        }else if(true){\n" +
//                "            console.log(3);\n" +
//                "        }else{\n" +
//                "            console.log(4);\n" +
//                "        }";
//        System.out.println(rule);
//        JQuickLangIfExecutor executor = new JQuickLangIfExecutor();
//        Object result=executor.execute(rule);
//    }
//    @Test
//    public void if5() throws IOException {
//        String rule="     if(false){\n" +
//                "            console.log(1);\n" +
//                "        }else if(false){\n" +
//                "            console.log(2);\n" +
//                "        }else if(false){\n" +
//                "            console.log(3);\n" +
//                "        }else{\n" +
//                "            console.log(4);\n" +
//                "        }";
//        System.out.println(rule);
//        JQuickLangIfExecutor executor = new JQuickLangIfExecutor();
//        Object result=executor.execute(rule);
//    }
//    @Test
//    public void if6() throws IOException {
//        String rule="    if(true){\n" +
//                "            break;\n" +
//                "        }";
//        System.out.println(rule);
//        JQuickLangIfExecutor executor = new JQuickLangIfExecutor();
//        Object result=executor.execute(rule);
//    }
//    @Test
//    public void if7() throws IOException {
//        String rule="    if(true){\n" +
//                "            continue;\n" +
//                "        }";
//        System.out.println(rule);
//        JQuickLangIfExecutor executor = new JQuickLangIfExecutor();
//        Object result=executor.execute(rule);
//    }
//}
