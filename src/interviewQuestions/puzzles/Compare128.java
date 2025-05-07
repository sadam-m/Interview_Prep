package interviewQuestions.puzzles;

public class Compare128 {

    public static void main(String[] args) {

        Integer a=127;

        System.out.println(System.identityHashCode(a));

        Integer b=127;

        System.out.println(System.identityHashCode(b));

        System.out.println(a==b);

        int c=2;

        int d=2;

        System.out.println(System.identityHashCode(c));

        System.out.println(System.identityHashCode(d));


    }
}
