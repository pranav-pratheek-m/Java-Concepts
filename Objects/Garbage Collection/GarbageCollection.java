
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person() {
    }

    @Override
    public String toString() {
        return "name: " + this.name + "\nage: " + this.age;
    }
}

public class GarbageCollection {
    public static void main(String[] args) {

        Person p1 = new Person("Ravi", 25);
        Person p2 = p1;

        try {
            p1 = null;
            System.out.println("p1= " + p1.toString());
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        } finally {
            System.out.println("p2= " + p2.toString());
        }
    }
}