package interviewQuestions.streams;

import java.util.ArrayList;
import java.util.Arrays;

public class TestEven {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30, 35, 40));

        numbers.stream().filter(n->n%2==0).map(n->n*2).limit(2);
    }
}
