package interviewQuestions.hashmaps;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

//        no ordering of elements
        hashMap.put("Java", 8);
        hashMap.put("Python", 3);
        hashMap.put("C++", 14);

//        insertion order is maintained
        linkedHashMap.put("Java", 8);
        linkedHashMap.put("Python", 3);
        linkedHashMap.put("C++", 14);

//        Sorted by Key (natural or compartor )
        treeMap.put("Java", 8);
        treeMap.put("Python", 3);
        treeMap.put("C++", 14);

        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("TreeMap: " + treeMap);

        // Basic operations
        System.out.println("Java version in HashMap: " + hashMap.get("Java"));
        hashMap.remove("Python");
        System.out.println("After removing Python: " + hashMap);

        System.out.println(hashMap.containsKey("Python"));
        System.out.println(linkedHashMap.containsKey("Java"));
        System.out.println(treeMap.containsValue(14));

        Set<Map.Entry<String,Integer>> set=hashMap.entrySet();


    }
}

