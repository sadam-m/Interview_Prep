package interviewQuestions.immutable;

import OOPS.modifiers.TestingAccessModifiers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTeam {

    private  final String name;
    private  final List<String> members;

    TestTeam(String name,List<String> members){
        this.name=name;
//        Defensive Copying in the constructor
//        protects the object from modifications to the input list
//        after the object creation.
        this.members=new ArrayList<>(members);
    }

//    public List<String> getMembers(){
//        return members;
//    }
//    Defensive copying  in the getter protects the object from external code
//    modifying the internal list after retrieval
    public  List<String> getMembers(){
        return Collections.unmodifiableList(members);
    }


    public static void main(String[] args) {

        List<String> members=new ArrayList<>();
        members.add("sadam");
        members.add("sam");

        List<String> members2=new ArrayList<>();
        members2.add("john");
        members2.add("wick");

        TestTeam object=new TestTeam("rockers",members);
        TestTeam object2=new TestTeam("sharks",members2);

        System.out.println(object.name);

        object=object2;
//        trying to modify it
        members.add("sha");

        List<String> teamMembers=object.members;

        System.out.println(members.toString());

        System.out.println(object.name+" "+teamMembers.toString());

        List<String> teamMembers2=object.getMembers();

        System.out.println("Team members2 data");
        System.out.println(teamMembers2.toString());

//        modifying the instance of members list
//        violating the rule of modifying the state of the instance variables of an Immutable class.
        teamMembers2.add("john cena");

        System.out.println(teamMembers2.toString());


    }
}
