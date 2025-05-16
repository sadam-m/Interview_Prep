package interviewQuestions.hashSet;
import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        String[] langs = {"Java", "Python", "C++", "Java", "Go"};

        for (String lang : langs) {
            hashSet.add(lang);
            linkedHashSet.add(lang);
            treeSet.add(lang);
        }

        System.out.println("HashSet (Unordered): " + hashSet);
        System.out.println("LinkedHashSet (Insertion Order): " + linkedHashSet);
        System.out.println("TreeSet (Sorted Order): " + treeSet);

        hashSet.remove("Java");

        System.out.println(hashSet.contains("Java"));

        List<String> withDuplicates=new ArrayList<>();

        withDuplicates.add("Apple");
        withDuplicates.add("apple");
        withDuplicates.add("Apple");
        withDuplicates.add("banana");
        withDuplicates.add("orange");

        Set<String> hashSet1=new HashSet<>();

        for (String element:withDuplicates){
            hashSet1.add(element);
        }

        System.out.println(hashSet1);

    }
}
