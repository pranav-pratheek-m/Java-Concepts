import static java.lang.Math.rand;

public class Person {
    final String name;

    Person() {
        this.name = "Ross";
    }

    public static void main(String[] args) {
        System.out.println(new Person().name);
    }

}
