package interviewQuestions.interfaces;

public class Third implements First,Second{

    public void show(){

//  How this syntax works?......

       First.super.show();
    }

    public static void main(String[] args) {

        Third object=new Third();

        object.show();
    }
}
