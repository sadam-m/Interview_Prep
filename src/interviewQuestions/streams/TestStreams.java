package interviewQuestions.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TestStreams {

//    Filtering high scores above 75 which are odd numbers
    public static void main(String[] args) {

//        Integer[] arr={1,2,3,4,5};

        List<Integer> scores = Arrays.asList(55, 76, 89, 90, 77, 45, 88, 93, 70);

//        how method is referenced in stream call as System.out::println

        scores.stream()
                .filter(no->no>75)
                .filter(no->no%2==1)
                .forEach(System.out::println);


    }
}
