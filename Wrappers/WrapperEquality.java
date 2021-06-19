public class WrapperEquality {
    public static void main(String[] args) {

        Integer num1 = 10;
        Integer num2 = 10;

        Integer num3 = 1056;
        Integer num4 = 1056;

        int num5 = 10;
        int num6 = 1056;

        System.out.println("is num1 == num2 ? " + checkObjectEquality(num1, num2));
        System.out.println("is num3 == num4 ? " + checkObjectEquality(num3, num4)); // only values from -128 to 127 are
                                                                                    // equal for ==

        System.out.println("\nis num3 == num4 ? " + checkContentEquality(num3, num4));
        System.out.println("Is num1 == num5 ? " + (num1 == num5));
        System.out.println("Is num1 == num6 ? " + (num1 == num6));
        System.out.println("Is num4 == num6 ? " + (num4 == num6));

        System.out.println("\nIs num1 != num5 ? " + (num1 != num5));
        System.out.println("Is num4 != num6 ? " + (num4 != num6));
    }

    static boolean checkObjectEquality(Integer a, Integer b) {
        return (a == b);
    }

    static boolean checkContentEquality(Integer a, Integer b) {
        return a.equals(b);
    }

}