
class GrandFather {
    GrandFather() {
        this("I am in GrandFather --> args constructor..");
        System.out.println("I am in GrandFather --> no args constructor..");
    }

    GrandFather(String str) {
        System.out.println(str);
    }
}

class Father extends GrandFather {
    Father() {
        this("I am in Father --> args constructor..");
        System.out.println("I am in Father --> no args constructor..");
    }

    Father(String str) {
        super();
        System.out.println(str);
    }
}

class Child extends Father {
    Child() {
        this("I am in Child --> args constructor..");
        System.out.println("I am in Child --> no args constructor..");
    }

    Child(String str) {
        super();
        System.out.println(str);
    }
}

public class ChildOverloadingOrdered {

    public static void main(String[] args) {
        new Child();
    }
}