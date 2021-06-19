import java.util.*;
import java.util.stream.*;

class Dog{
    private String name;
    private int weight;
    private int age;

    Dog(String name,int weight,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName(){ return this.name; }

    public int getWeight(){ return this.weight;}

    public int getAge(){ return this.age; }

    @Override
    public String toString(){ 
        return "Name: " + this.name + "  " +
               "Age: " + this.age + " years  " +
               "Weight: " + this.weight + " pounds\n";} 
}

public class TestDogs{
    public static void main(String[] args){
        List<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog("boi",30,6));
        dogs.add(new Dog("tyri",40,12));
        dogs.add(new Dog("charis",120,7));
        dogs.add(new Dog("aiko",50,10));
        dogs.add(new Dog("clover",35,12));
        dogs.add(new Dog("mia",15,4));
        dogs.add(new Dog("zooey",45,8));

        System.out.println("All dogs: \n" + dogs);

        List<Dog> ageFilter = dogs.stream()
                                  .filter(dog -> (dog.getAge() >= 7))  //having a minimum age of 7
                                  .collect(Collectors.toList());

        List<Dog> weightFilter = dogs.stream()
                                    .filter(dog -> (dog.getWeight() <= 40)) //having a maximum weight of 40
                                    .collect(Collectors.toList());

        List<Dog> nameFilter = dogs.stream()
                                    .filter(dog -> (dog.getName().startsWith("c"))) //having a maximum weight of 40
                                    .collect(Collectors.toList());


        System.out.println("\nDogs having minimum Age 7: \n" + ageFilter);
        System.out.println("\nDogs having maximum weight 40: \n" + weightFilter);
        System.out.println("\nDogs having names with c : \n" + nameFilter);                                                      
    }
}