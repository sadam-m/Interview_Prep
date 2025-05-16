package interviewQuestions.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;

public class TestIterate {

    public static void main(String[] args) {

        Stream<Integer> squares=Stream.iterate(1,n->n+1)
                .map(n->n*n)
                .limit(10);

//        squares.forEach(System.out::println);

        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 12, 15, 8, 22, 13, 18));

//        priting square of all even integers greater than 10
        nums.stream().filter(n->n>10 && n%2==0).map(n->n*n).forEach(System.out::println);

    }
}
