package interviewQuestions.staticblock;

public class SubClass extends  staticBlock{

    static  String msg="msg from subclass";

    static {
        System.out.println("subclass message");
    }

    public static void main(String[] args) {

        SubClass obj=new SubClass();

        System.out.println(SubClass.msg);

        System.out.println(staticBlock.msg);
    }
}
