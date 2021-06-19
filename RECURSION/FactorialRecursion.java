import java.util.HashMap;
import java.util.Map;

class Factorial {
    private int no_of_hits;
    static HashMap<Integer, Integer> factorial_map = new HashMap<>();

    private int calculate(int num) {

        if (Factorial.factorial_map.containsKey(num)) {

            Integer result = (Integer) (Factorial.factorial_map.get(num));
            return result.intValue();

        } else {
            ++no_of_hits;

            if (num == 0) {

                return 1;

            } else {

                return num * calculate(num - 1);

            }
        }

        // if (no_of_hits == 0) { This becomes unreachable code in this method which
        // leads to compile
        // time error
        // System.out.println("Factorial retrieved from HashMap without computing");
        // } else {
        // System.out.println("Hit the computing method " + no_of_hits + " times");
        // }
    }

    public int getFactorial(int val) {

        this.no_of_hits = 0;
        if (!Factorial.factorial_map.containsKey(val)) {
            insertToMap(val);
        }

        if (no_of_hits == 0) {
            System.out.println("Factorial retrieved from HashMap without computing");
        } else {
            System.out.println("Hit the computing method " + no_of_hits + " times");
        }

        Integer result = (Integer) (Factorial.factorial_map.get(val));
        return result.intValue();
    }

    private void insertToMap(int val) {
        Factorial.factorial_map.put(val, this.calculate(val));
    }
}

public class FactorialRecursion {
    public static void main(String[] args) {

        Factorial fact = new Factorial();

        System.out.println("Factorial of 4: " + fact.getFactorial(4) + "\n");
        System.out.println("Factorial of 5: " + fact.getFactorial(5) + "\n");
        System.out.println("Factorial of 6: " + fact.getFactorial(6) + "\n");
        System.out.println("Factorial of 5: " + fact.getFactorial(5) + "\n");
        System.out.println("Factorial of 10: " + fact.getFactorial(10) + "\n");

        Factorial obj = new Factorial();

        System.out.println(
                "\n-------------------------------------------------------------------------------------------\n");

        for (int i = 0; i <= 10; i++) {
            System.out.println("Factorial of " + i + ": " + obj.getFactorial(i) + "\n");
        }

        for (Map.Entry<Integer, Integer> pair : Factorial.factorial_map.entrySet()) {
            System.out.println("Key : " + pair.getKey() + " Value : " + pair.getValue());
        }
    }
}