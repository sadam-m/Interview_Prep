package interviewQuestions.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFlatmap {

    public static void main(String[] args) {

//        List<List<String>> names = List.of(
//                List.of("Alice", "Bob"),
//                List.of("Charlie"),
//                List.of("David", "Eve")
//        );

//        names.stream().flatMap(list->list.stream()).forEach(System.out::println);

        List<String> sentences = new ArrayList<>(Arrays.asList(
                "Java is powerful",
                "Streams are powerful and concise",
                "Java Streams rock"
        ));

        sentences.stream().flatMap(s->Arrays.stream(s.split(" ")))
                .map(s->s.toLowerCase())
        .forEach(System.out::println);

    }
}
