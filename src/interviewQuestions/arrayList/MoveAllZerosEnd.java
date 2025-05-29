package interviewQuestions.arrayList;

import java.util.ArrayList;
import java.util.*;

public class MoveAllZerosEnd {

    public static void main(String[] args) {

        List<Integer> arrayList=new ArrayList<>(Arrays.asList(0,1,0,3,12));

        int first=0;
        int second=1;

        while (second< arrayList.size()){

            int n1=arrayList.get(first);
            int n2=arrayList.get(second);

            if (n2>0){
                arrayList.set(first,n2);
                arrayList.set(second,n1);
                first++;
            }
            second++;
        }

        System.out.println(arrayList);
    }
}
