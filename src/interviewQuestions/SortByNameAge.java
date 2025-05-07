package interviewQuestions;

import java.util.List;
import java.util.Arrays;

public class SortByNameAge {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Aarav", 30, 101, "Software Engineer"),
                new Employee("Vihaan", 28, 102, "Product Manager"),
                new Employee("Aarav", 25, 103, "Data Analyst"),
                new Employee("Ishita", 29, 104, "UI Designer"),
                new Employee("Ananya", 30, 105, "HR Manager")
        );
    }
}

class  Employee{

    String name;
    int age;
    int empId;
    String role;

    Employee(String name,int age,int empId,String role){
        this.name=name;
        this.age=age;
        this.empId=empId;
        this.role=role;
    }

}
