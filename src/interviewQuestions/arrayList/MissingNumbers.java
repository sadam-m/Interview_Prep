package interviewQuestions.arrayList;

import java.util.ArrayList;
import java.util.*;

public class MissingNumbers {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(2,2));

        List<Integer> presence=new ArrayList<>(Collections.nCopies(list.size()+1,0));

        for (int ind=0;ind<list.size();ind++){

            int no=list.get(ind);
            presence.set(no,1);
        }

        List<Integer> result=new ArrayList<>();

        for(int j=1;j<presence.size();j++){

            if (presence.get(j)==0){
                result.add(j);
            }
        }

        System.out.println(result);
    }
}
