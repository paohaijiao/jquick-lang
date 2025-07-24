package com.github.paohaijiao.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JSchool {

    public void processStringList(List<String> stringList,Map<String, Object> map) {
        System.out.println("Processing String list:");
        for (String str : stringList) {
            System.out.println(str.toUpperCase());
        }
    }
    public void processIntegerSet(Set<Integer> integerSet) {
        System.out.println("Processing Integer set:");
        int sum = 0;
        for (Integer num : integerSet) {
            sum += num;
            System.out.println(num);
        }
        System.out.println("Sum: " + sum);
    }

    public void processStringToObjectMap(Map<String, Object> map) {
        System.out.println("Processing String to Object map:");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue() +
                    " (type: " + entry.getValue().getClass().getSimpleName() + ")");
        }
    }

    public void processNestedList(List<List<String>> nestedList) {
        System.out.println("Processing nested list:");
        for (List<String> innerList : nestedList) {
            System.out.println("Inner list: " + String.join(", ", innerList));
        }
    }

    public void processPersonList(List<JStudent> personList) {
        System.out.println("Processing Person list:");
        for (JStudent person : personList) {
            System.out.println(person.getName() + ", " + person.getValue());
        }
    }

}
