import java.util.Arrays;

public class JavaArraySort {
    public static void main(String[] args) {
        int[] arr = { 8, 6, 4, 13, 12, 67, 32, 61, 24 };
        Arrays.sort(arr, 3, 8);
        System.out.println(Arrays.toString(arr));
    }
}