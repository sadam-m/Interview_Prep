package interviewQuestions.Singleton;

//Eager initialization works well for lightweight objects such as logger

//Lazy initialization creates the instance  only when needed

public class Singleton {

    private static Singleton instance=new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {

        Singleton object=new Singleton();

        System.out.println(object);
    }
}
