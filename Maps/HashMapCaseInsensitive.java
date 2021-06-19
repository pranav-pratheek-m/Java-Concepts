
import java.util.*;

class Person {
    private String name;
    private int age;

    Person(){}

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

    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }else{
            Person person = (Person)obj;

            if(this.name.equalsIgnoreCase(person.name)){
               return true;
            }else{
               return false;
            }
        }
    }

    @Override
    public int hashCode(){
        int code = (this.age + this.name.hashCode())*1000;
       System.out.println("Hash code calculated is :" + code);
        return 100;
    }
}

class HashMapCaseInsensitive extends HashMap<String,Integer>{
   
   private static String capitalize(Object key){
       String str = key.toString();
       return (str.substring(0,1).toUpperCase() + str.substring(1));
   }

   private static void nameCompare(Person p1,Person p2){
       if(p1.equals(p2)){
           System.out.println("Both these people are namesakes with the same name: " + p1.getName() + "\n");
       }else{
           System.out.println("Both these people have different names: " + p1.getName() + " and " + p2.getName() + "\n");
       }
   }

    public static void main(String[] args){
        Person p1 = new Person("Rakesh",25);
        Person p2 = new Person("Gaurav",21);
        Person p3 = new Person("Mukesh",30);
        Person p4 = new Person("MUKESH",28);
        Person p5 = new Person("RAKESH",22);
        Person p6 = p2;

        Map<String,Integer> personMap =  new HashMapCaseInsensitive();
        HashMap<Person,Person> testMap =  new HashMap<Person,Person>();
        testMap.put(p1,p1);
        testMap.put(p2,p2);
        testMap.put(p5,p5);
        testMap.put(p6,p6);

        Person[] persons = {p1,p2,p3,p4,p5};

        for(Person p : persons){
            personMap.put(p.getName(),p.getAge());
        }

        System.out.println("\nIteration using enhanced for loop ");
        for(Map.Entry person : personMap.entrySet()){
            System.out.println("Name : " + capitalize(person.getKey()) + " \t Person : " + person.getValue());
        }
  
        System.out.println("\nIteration using Iterator class ");
        Set personSet = personMap.entrySet();
        Iterator iterator = personSet.iterator();

        while(iterator.hasNext()){
            Map.Entry person = (Map.Entry)(iterator.next());
            System.out.println("Name : " + capitalize(person.getKey()) + " \t Person : " + person.getValue());
        }

       System.out.println("\n");

        System.out.print("p1 equality p5 :");
        nameCompare(p1,p5);
        System.out.print("p3 equality p4 :");
        nameCompare(p3,p4);
        System.out.print("p2 equality p3 :");
        nameCompare(p2,p3);
        System.out.print("p2 equality p6 :");
        nameCompare(p2,p6);

    }
}