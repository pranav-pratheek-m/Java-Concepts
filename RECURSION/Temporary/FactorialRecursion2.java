import java.util.HashMap;
import java.util.Map;

class FactorialResult {
    int noOfHits;
    int factValue;
}

class Factorial {
    static HashMap<Integer, Integer> factorialMap = new HashMap<>();

    public static void calcFactorial(int num, FactorialResult factResult) {

        factResult.noOfHits++;
        Integer resInt = (Integer) (Factorial.factorialMap.get(num));
        if (resInt != null) {
            factResult.factValue = resInt;
            return;
        }

        if (num == 0) {
            factResult.factValue = 1;
        } else {
            FactorialResult newFr = new FactorialResult();
            calcFactorial(num - 1, newFr);
            factResult.factValue = num * newFr.factValue;
            factResult.noOfHits += newFr.noOfHits;
            Factorial.factorialMap.put(Integer.valueOf(num), Integer.valueOf(factResult.factValue));
        }
    }
}

public class FactorialRecursion2 {
    public static void main(String[] args) {

        // for (int i = 0; i <= 10; i++) {
        // FactorialResult fr = new FactorialResult();
        // Factorial.calcFactorial(i, fr);

        // System.out.println("Factorial of " + i + ": " + fr.factValue + "\n");
        // System.out.println("No of hits: " + fr.noOfHits);
        // }

        FactorialResult fr = new FactorialResult();
        Factorial.calcFactorial(4, fr);

        System.out.println("Factorial of " + 4 + ": " + fr.factValue + "\n");
        System.out.println("No of hits: " + fr.noOfHits);

        fr = new FactorialResult();
        Factorial.calcFactorial(4, fr);

        System.out.println("Factorial of " + 4 + ": " + fr.factValue + "\n");
        System.out.println("No of hits: " + fr.noOfHits);

        for (Map.Entry<Integer, Integer> pair : Factorial.factorialMap.entrySet()) {
            System.out.println("Key : " + pair.getKey() + " Value : " + pair.getValue());
        }
    }
}