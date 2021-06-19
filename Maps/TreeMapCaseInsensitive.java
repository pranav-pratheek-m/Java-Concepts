
import java.util.*;

class Person{
    private String name;
    private int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}

class TreeMapCaseInsensitive{
    public static void main(String[] args){
        Person p1 = new Person("Rakesh",25);
        Person p2 = new Person("Gaurav",21);
        Person p3 = new Person("Mukesh",30);
        Person p4 = new Person("MUKESH",28);

        Map<String,Integer> personMap =  new TreeMap<String,Integer>(String.CASE_INSENSITIVE_ORDER);

        personMap.put(p1.getName(),p1.getAge());
        personMap.put(p2.getName(),p2.getAge());
        personMap.put(p3.getName(),p3.getAge());
        personMap.put(p4.getName(),p4.getAge());

        System.out.println("\nIteration using enhanced for loop ");
        for(Map.Entry person : personMap.entrySet()){
            System.out.println("Name : " + person.getKey() + " \t Person : " + person.getValue());
        }

        System.out.println("\nIteration using Iterator class ");
        Set personSet = personMap.entrySet();
        Iterator iterator = personSet.iterator();

        while(iterator.hasNext()){
            Map.Entry person = (Map.Entry)(iterator.next());
            System.out.println("Name : " + person.getKey() + " \t Person : " + person.getValue());
        }
    }
}