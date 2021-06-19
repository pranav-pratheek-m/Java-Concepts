
class GrandFather {
    // GrandFather() {
    // }

    GrandFather(String str) {
        // this();
        // super(); this is an implicit call to super
        System.out.println(str);
    }
}

class Father extends GrandFather {
    // Father() {
    // } default constructor does not get constructed

    Father(String str) {
        super("I am the grandfather!!");
        System.out.println(str);
    }
}

class Child extends Father {
    // Child() {
    // }

    Child(String str) {
        super("I am the father!!");
        System.out.println(str);
    }
}

public class ChildMain {
    public static void main(String[] args) {
        GrandFather grand = new Child("I am the child!!");

        System.out.println("\ngrand instanceof GrandFather " + (grand instanceof GrandFather));
        System.out.println("grand instanceof Father " + (grand instanceof Father));
        System.out.println("grand instanceof Child " + (grand instanceof Child));
    }
}