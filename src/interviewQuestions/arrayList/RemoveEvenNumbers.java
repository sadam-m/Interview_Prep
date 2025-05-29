package interviewQuestions.arrayList;

import java.sql.SQLOutput;
import java.util.*;

public class RemoveEvenNumbers {

    public static void main(String[] args) {

//        case 1

//        List<Integer> arrayList=Arrays.asList(1,2,3,4,5,6);
        List<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        Iterator itr=arrayList.iterator();

        while (itr.hasNext()){

            int current= (Integer) itr.next();

            if(current%2==0){
                itr.remove();
            }
//            System.out.println(current);
        }

        System.out.println(arrayList);


    }
}
