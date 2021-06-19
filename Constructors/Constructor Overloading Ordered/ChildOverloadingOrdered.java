
class GrandFather {
    GrandFather() {
        System.out.println("I am in grandfather --> no args constructor..");
    }

    GrandFather(String str) {
        this();
        System.out.println(str);
    }
}

class Father extends GrandFather {
    Father() {
        super("I am in grandfather --> args constructor..");
        System.out.println("I am in father --> no args constructor..");
    }

    Father(String str) {
        this();
        System.out.println(str);
    }
}

class Child extends Father {
    Child() {
        super("I am in father --> args constructor..");
        System.out.println("I am in child --> no args constructor..");
    }

    Child(String str) {
        this();
        System.out.println(str);
    }
}

public class ChildOverloadingOrdered {

    public static void main(String[] args) {
        new Child("I am in child --> args constructor..");
    }
}