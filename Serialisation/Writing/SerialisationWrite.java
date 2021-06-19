import java.io.Serializable;
import java.io.*;
import java.util.*;

class Person implements Serializable {

    enum Gender {
        MALE, FEMALE, OTHER
    };

    int age;
    String name;
    Gender gender;
    transient int PIN;

    Person(String name, int age, Gender gender,int PIN) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.PIN = PIN;
    }

    @Override
    public String toString() {
        return "Person's name: " + this.name + "\nAge: " + this.age + "\nGender: " + this.gender + "\nPIN: " + this.PIN + "\n\n";
    }
}

class SerialisationWrite {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("Ryan Giggs", 40, Person.Gender.MALE,1122);
            Person p2 = new Person("Smriti Mandhana", 23, Person.Gender.FEMALE,1425);
            Person p3 = new Person("Shanti Swaroop", 26, Person.Gender.OTHER,1867);

            List<Person> pList = new ArrayList<>();

            pList.add(p1); 
            pList.add(p2);
            pList.add(p3);          

            FileOutputStream fout = new FileOutputStream("PersonOutput.txt");
            ObjectOutputStream obj_out = new ObjectOutputStream(fout);

            obj_out.writeObject(pList.toArray());

            obj_out.flush();
            obj_out.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}