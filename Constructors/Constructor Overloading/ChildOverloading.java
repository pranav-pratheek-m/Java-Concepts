
class GrandFather {
    GrandFather() {
        this("I am in grandfather --> args constructor..");
        System.out.println("I am in grandfather --> no args constructor..");
    }

    GrandFather(String str) {
        System.out.println(str);
    }
}

class Father extends GrandFather {
    Father() {
        this("I am in father --> args constructor..");
        System.out.println("I am in father --> no args constructor..");
    }

    Father(String str) {
        super();
        System.out.println(str);
    }
}

class Child extends Father {
    Child() {
        super();
        System.out.println("I am in child --> no args constructor..");
    }

    Child(String str) {
        this();
        System.out.println(str);
    }
}

public class ChildOverloading {

    public static void main(String[] args) {
        new Child("I am in child --> args constructor..");
    }
}