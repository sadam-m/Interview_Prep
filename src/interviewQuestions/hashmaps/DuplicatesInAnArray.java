package interviewQuestions.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DuplicatesInAnArray {

    public static void main(String[] args) {

        int[] nums={4,3,2,7,8,2,3,1};

        List<Integer> result=new ArrayList<>();

        HashSet<Integer> hashSet=new HashSet<>();

        for (int ind=0;ind<nums.length;ind++){

            int element=nums[ind];
            if (hashSet.contains(element)){
                result.add(element);
            }
            else{
                hashSet.add(element);
            }
        }

        System.out.println(result);
    }
}
