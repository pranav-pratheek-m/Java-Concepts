import java.util.*;

class SumRecursion {

    public int getSum(int[] arr, int index) {

        if (index == 0) {
            return arr[0];
        }

        return arr[index] + getSum(arr, index - 1);
    }
}

public class SumRecursionMain {
    public static void main(String[] args) {
        SumRecursion sr = new SumRecursion();

        int[] arr = new int[] { 21, 34, 55, 72, 91 };
        int sum = sr.getSum(arr, arr.length - 1);

        System.out.println("The sum of " + Arrays.toString(arr) + " is " + sum);
    }
}