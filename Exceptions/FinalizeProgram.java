
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() has been called..");
    }
}

public class FinalizeProgram {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("Roger Federer", 39);
            Person p2 = new Person("Cristiano Ronaldo", 35);
            Person p3 = p2;

            System.gc();
            System.out.println("\nGarbage Collection completed!!");
        } catch (Throwable th) {
            th.printStackTrace();
        }

    }
}