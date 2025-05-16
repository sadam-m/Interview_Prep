package interviewQuestions.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.TreeMap;
public class TestGrouping {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Anna", "David", "Diana"));

        Map<Character, List<String>> ans=names.stream().collect(Collectors.groupingBy(name->name.charAt(0)));

        System.out.println(ans.toString());

        List<String> words = new ArrayList<>(Arrays.asList("java", "streams", "api", "code", "group", "collectors", "map"));

        Map<Integer,List<String>> res=words.stream().collect(Collectors.groupingBy(word->word.length(),TreeMap::new,Collectors.toList()));

        System.out.println(res.toString());
    }
}
