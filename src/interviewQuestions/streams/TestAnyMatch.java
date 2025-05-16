package interviewQuestions.streams;

import java.util.ArrayList;
import java.util.*;

public class TestAnyMatch {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(11, 13, 18, 21, 23, 24));

        numbers.stream().anyMatch(n->{
            if (n%6==0) {
                System.out.println(n);
                return true;
            }
            return false;
        });


    }
}
