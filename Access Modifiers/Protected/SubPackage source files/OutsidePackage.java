package SubPackage;
// Classes which do not subclass Stranger cannot access the protected member

// variable

// class Unrelated {
// Unrelated() {
// // Parent obj = new Parent();
// Stranger obj = new Stranger(3407);
// // obj.x = 3407;
// System.out.println("The value of x in Unrelated class is : " + obj.x);
// }
// }

public class OutsidePackage {
    public static void main(String[] args) {
        Stranger str = new Stranger(250);
        str.getName();
    }
}