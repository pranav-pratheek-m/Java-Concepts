import java.util.HashMap;
import java.util.Map;

class Factorial {
    int num;
    static HashMap<Integer, Integer> factorial_map = new HashMap<>();

    Factorial(int num) {
        this.num = num;

        if (!Factorial.factorial_map.containsKey(num) || Factorial.factorial_map.isEmpty())
            this.insertToMap();
    }

    void insertToMap() {
        Factorial.factorial_map.put(this.num, this.getFactorial(this.num));
    }

    int getFactorial(int val) {
        if (val == 0) {
            return 1;
        } else {
            return val * getFactorial(val - 1);
        }
    }

    @Override
    public String toString() {
        return "The value of " + this.num + " factorial is " + Factorial.factorial_map.get(this.num) + "\n";
    }
}

public class FactorialRecursion {
    public static void main(String[] args) {
        Factorial fact1 = new Factorial(4);
        Factorial fact2 = new Factorial(5);
        Factorial fact3 = new Factorial(10);
        Factorial fact4 = new Factorial(5);

        System.out.print(fact1);
        System.out.print(fact2);
        System.out.print(fact3);
        System.out.println(fact4);

        for (Map.Entry<Integer, Integer> pair : Factorial.factorial_map.entrySet()) {
            System.out.println("Key : " + pair.getKey() + " Value : " + pair.getValue());

        }
    }
}