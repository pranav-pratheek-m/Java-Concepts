
class Person {
    String name;
    int age;
    String profession;

    Person(String name, int age, String profession) {
        // Person(profession);
        this(profession);
        this.name = name;
        this.age = age;
    }

    Person(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "\nage: " + age + "\nprofession: " + this.profession;
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {
        Person person = new Person("Renu", 22, "Architect");
        System.out.println(person);
    }
}
