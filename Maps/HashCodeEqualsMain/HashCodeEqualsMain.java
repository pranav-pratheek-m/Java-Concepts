
import java.util.*;

class Student{
    String id;
    String name;
    int age;
    int marks;

    Student(String id,String name,int age,int marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override 
    public boolean equals(Object o){

        if(this == obj)
          return true;
        Student student = (Student) o;
         
         return (this.id == student.id &&
                 this.name == student.name &&
                  this.age == student.age &&
                  this.marks == student.marks); 
    }

    @Override
    public int hashCode(){

    }
}