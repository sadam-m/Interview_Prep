package interviewQuestions.arrayList;

import java.util.*;

public class PairsWithGivenSum {

    public static void main(String[] args) {

            List<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,2,4,3,5,6));

            int target=6;

    //        1, 2, 3, 2, 4, 3, 5, 6 ->6
    //        [1,5],[2,4],[3,3]
    //        O/p ->[[1,6],[2,5]]

            List<List<Integer>> listOfList=new ArrayList<>();
//
//            for (int ind=0;ind<arrayList.size()-1;ind++){
//
//                int n1=arrayList.get(ind);
//
//                for (int j=ind+1;j<arrayList.size();j++){
//
//                    int n2=arrayList.get(j);
//
//                    if (n1+n2==target){
//                       List<Integer> tempList=new ArrayList<>(Arrays.asList(n1,n2));
//                        if(!listOfList.contains(tempList)){
//                            listOfList.add(tempList);
//                        }
//                    }
//                }
//            }
//            System.out.println(listOfList);

        HashSet<List<Integer>> hashSet=new HashSet<>();

        for(int ind=0;ind<arrayList.size()-1;ind++){
            int n1=arrayList.get(ind);

            for (int j=ind+1;j<arrayList.size();j++){
                int n2=arrayList.get(j);

                if (n1+n2==target){
                    List<Integer> tempList=new ArrayList<>(Arrays.asList(Math.min(n1,n2),Math.max(n1,n2)));
                    hashSet.add(tempList);
                }
            }
        }

        System.out.println(hashSet);
    }
}
