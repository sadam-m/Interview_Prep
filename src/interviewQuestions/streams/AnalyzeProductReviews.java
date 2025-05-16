package interviewQuestions.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnalyzeProductReviews {

    public static void main(String[] args) {

        List<String> reviews = new ArrayList<>(Arrays.asList(
                "Amazing product with great quality",
                "Really good, but could be better",
                "Worth the price and very durable",
                "Good quality and great value"
        ));

       /*
       Extract all words from the reviews.

       Filter out all words that are less than 4 characters.

       Convert the remaining words to lowercase.

       Remove duplicates.

       Sort them in alphabetical order.

       Collect the result into a List<String> and print it
        */

        List<String> ans=reviews.stream()
        .flatMap((sentence->Arrays.stream(sentence.split(" "))))
                .filter(word->word.length()>4)
                .map(word->word.toUpperCase())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(ans.toString());
    }
}
