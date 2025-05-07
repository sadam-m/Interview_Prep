package interviewQuestions.hashmaps;

import javafx.beans.property.adapter.ReadOnlyJavaBeanBooleanProperty;

import java.util.HashMap;
import java.util.Objects;

public class TestEmployeeHashMap {

    public static void main(String[] args) {

        Employee emp1=new Employee("sam",1);
        Employee emp2=new Employee("sam",1);

        HashMap<Employee,String> hashMap=new HashMap<>();

//        crucial behaviour of hashmap when .equals() is not overriden in the customer class of the key
//        it won't able to  compare (equals check) the upcoming key with the existing key and the
//        duplicate keys will be added into the bucket of the hashMap;
        hashMap.put(emp1,"sde");
        hashMap.put(emp2,"sde");

//
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(emp2));
    }
}

class Employee{

    String name;
    int id;

    Employee(String name,int id){
        this.id=id;
        this.name=name;
    }

//    @Override
//    public int hashCode(){
//        return Objects.hash(id,name);
//    }
//
//    @Override
//    public boolean equals(Object o){
//
//        if (this==o) return  true;
//        if (o==null || getClass()!=o.getClass()) return  false;
//        Employee object=(Employee) o;
//
//        return  object.id==this.id && Objects.equals(this.name,object.name);
//    }
}