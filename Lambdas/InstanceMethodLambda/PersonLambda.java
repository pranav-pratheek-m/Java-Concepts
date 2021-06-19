
import java.util.*;

class Person{
    String name;
    int age;
    String profession;

    Person(String name,int age,String profession){
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public String toString(){
        return "Name: " + this.name +
               "\nAge: " + this.age + 
               "\nProfession: " + this.profession + "\n";
    }

}

public class PersonLambda{
    public static void main(String[] args){
        List<Person> personList = new ArrayList<Person>();

        personList.add(new Person("Roger Federer",37,"Tennis player"));
        personList.add(new Person("Sachin Tendulkar",47,"Cricketer"));
        personList.add(new Person("David Beckham",45,"Footballer"));


       System.out.println("Iterating using :: \n");
          personList.forEach(System.out::println);
       
       System.out.println("-------------------------------------------------------------");
       System.out.println("\n\nIterating using Lambda \n");
          personList.forEach(p -> System.out.println(p));

       System.out.println("-------------------------------------------------------------");
       System.out.println("\n\nUsing enhanced for loop \n");
          for(Person person : personList){
              System.out.println(person);
          }
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("\n\nUsing normal for loop \n");
         int length = personList.size();
          for(int i =0; i < length; i++){
              System.out.println(personList.get(i));
          }

        System.out.println("-------------------------------------------------------------");
        System.out.println("\n\nUsing iterator \n");
             Iterator person = personList.iterator();

             while(person.hasNext()){
                 System.out.println(person.next());
             }

        System.out.println("-------------------------------------------------------------");
        System.out.println("\n\nUsing Enumeration \n");
             Enumeration enumerate = Collections.enumeration(personList);

             while(enumerate.hasMoreElements()){
                 System.out.println(enumerate.nextElement());
             }          
    }
} 