package interviewQuestions.arrayList;

import  java.util.*;

public class RemoveDuplicatesOrderPreserve {

    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(1, 2, 3, 2, 4, 1, 5);

        List<Integer> result=new ArrayList<>();
        HashSet<Integer> hashSet=new HashSet<>();

        for (Integer no:input){
            if (!hashSet.contains(no)){
                result.add(no);
            }
            hashSet.add(no);

        }

        System.out.println(result);
    }
}
