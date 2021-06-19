import java.util.Scanner;

public class ScopeTest {

    int var = 10;

    public static void main(String[] args) {

        // int choice;
        // String fruit;

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * System.out.println("Enter a number"); choice = sc.nextInt();
         * 
         * if(choice == 5){ fruit="Apple"; }
         */

        // System.out.println("Fruit is " + fruit);
        for (int var = 0; var < 12; var++) {

            if (var == 5) {
                continue;
                // System.out.println("Finally out..");
            }

            if (var == 5) {
                break;
            }

            System.out.println("loop var: " + var);
            System.out.println("Static var: " + new ScopeTest().var);
        }

    }
}
