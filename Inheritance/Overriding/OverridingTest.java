
class Parent {
    String role = "Parent";
}

class Child extends Parent {
    String role = "Child";
}

public class OverridingTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();
        System.out.println("Parent role = " + parent.role);
        System.out.println("Child role = " +  child.role);
    }
}
