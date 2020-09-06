package MainPackage;

//import SubPackage.Stranger;

public class ProtectedTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        child.getName();
        child.x = 12;
        System.out.println("The value of x in child class is : " + child.x);
        System.out.println("The value of x in parent class is : " + parent.x);
        new MainPackage.Stranger();
        parent = new SubPackage.Stranger(1000);
        parent.getName();
    }
}