package interviewQuestions.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergerTwoLists {

    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2=new ArrayList<>(Arrays.asList(3,4,5,6));

        for (Integer element:list2){

            if (list1.contains(element)==false){
                list1.add(element);
            }
        }

        System.out.println(list1);
    }
}
