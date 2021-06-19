
public class IfCondition {
    public static void main(String[] args) {
        boolean bool = false;

        if (bool == false) {
            System.out.println("bool == false :" + (bool == false));
        }

        if (bool = true) {
            System.out.println("Bool is assigned to true..");
        }

        if (bool = false) {
            System.out.println("Bool is assigned to false..");
        }
    }
}