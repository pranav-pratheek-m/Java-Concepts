import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Fibonacci {
    private int no_of_hits;
    static HashMap<Integer, Integer> fibmap = new HashMap<>();

    static {
        fibmap.put(1, 0);
        fibmap.put(2, 1);
    }

    public int getFibonacciNum(int index) {
        no_of_hits = 0;

        if (!Fibonacci.fibmap.containsKey(index)) {
            int number = calculate(index);
            Fibonacci.fibmap.put(index, number);
        }

        if (no_of_hits == 0) {
            System.out.println("Retrieved from hash map..");
        } else {
            System.out.println("Hit the calculate function " + no_of_hits + " times..");
        }

        int number = (Integer) (Fibonacci.fibmap.get(index));
        return number;
    }

    private int calculate(int index) {

        if (Fibonacci.fibmap.containsKey(index))
            return (Integer) (Fibonacci.fibmap.get(index));

        no_of_hits++; // for the no of times the calculate function is called

        if (index == 1) {
            return 0;
        }

        if (index == 2) {
            return 1;
        }

        int number = calculate(index - 1) + calculate(index - 2);
        Fibonacci.fibmap.put(index, number);
        return number;
    }
}

public class FibonacciSequence {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the limit: ");
        // int limit = sc.nextInt();
        // sc.close();

        // display(limit);
        display(4);
        display(5);
        display(11);
        display(8);
        display(5);
        display(14);
        display(12);
        display(15);

        for (Map.Entry<Integer, Integer> entry : Fibonacci.fibmap.entrySet()) {
            System.out.println("Index: " + entry.getKey() + " Number: " + entry.getValue());
        }
    }

    private static void display(int index) {
        System.out.println("The number at index " + index + " in the Fibonacci sequence is "
                + new Fibonacci().getFibonacciNum(index) + "\n");
    }
}