package interviewQuestions.staticblock;

public class staticBlock {

    static  String msg="msg from parent class";

    static {

        System.out.println("hello from static block one");
    }

    static {
        System.out.println("hello from static block two");
    }

    public static void main(String[] args) {

        staticBlock object=new staticBlock();

        System.out.println(object);
    }
}
