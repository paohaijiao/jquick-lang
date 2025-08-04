package com.github.paohaijiao;

import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.support.JTypeReference;
import com.github.paohaijiao.visitor.JQuickLangCommonVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JTypeReferenceTest {
    @Test
    public void Long() throws IOException {
        JTypeReference<String> stringType = new JTypeReference<String>() {};
        JTypeReference<Integer> integerType = JTypeReference.of(Integer.class);
        JTypeReference<JTypeReference<String>> stringListType = new JTypeReference<JTypeReference<String>>() {};
        JTypeReference<List<Integer>> integerListType = JTypeReference.listOf(Integer.class);
        JTypeReference<Set<Long>> longSetType = JTypeReference.setOf(Long.class);
        JTypeReference<Map<String, Integer>> mapType = new JTypeReference<Map<String, Integer>>() {};
        JTypeReference<Map<Long, Double>> mapType2 = JTypeReference.mapOf(Long.class, Double.class);
        JTypeReference<String[]> stringArrayType = JTypeReference.varargsOf(String.class);
        JTypeReference<Runnable> runnableType = JTypeReference.interfaceOf(Runnable.class);
        JTypeReference<Map<String, List<Set<Integer>>>> complexType = new JTypeReference<Map<String, List<Set<Integer>>>>() {};

        JTypeReference type=JTypeReference.of(String.class);
        System.out.println(type);
    }
}
