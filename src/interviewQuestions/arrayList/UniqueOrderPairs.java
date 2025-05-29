package interviewQuestions.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UniqueOrderPairs {

    public static void main(String[] args) {

        List<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,2,4,3,5,6));

//        O(n) solution
        HashSet<List<Integer>> result=new HashSet<>();

        int target=6;

        int first=0;
        int second=0;

        while(first<arrayList.size()){

            second=first+1;
            int n1=arrayList.get(first);
            int n2=arrayList.get(second);

            second++;
        }

    }
}
