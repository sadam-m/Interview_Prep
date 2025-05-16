package interviewQuestions.streams;

import java.util.ArrayList;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        List<String> reviews = new ArrayList<>(
                Arrays.asList("Amazing product with great quality",
                "Really good, but could be better",
                "Worth the price and very durable",
                "Good quality and great value"
        ));

        Map<String,Long> frequencyCounter=reviews.stream().flatMap(sentence->Arrays.stream(sentence.split(" ")))
                .map(word->word.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(frequencyCounter.toString());
    }
}
