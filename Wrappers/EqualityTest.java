public class EqualityTest {
    public static void main(String[] args) {
        Integer i1 = 12;
        int i2 = 12;

        if (i1 == i2) {
            System.out.println("i1 and i2 are equal");
        } else {
            System.out.println("i1 and i2 are not equal");
        }

        i2 = 13;

        if (i1 == i2) {
            System.out.println("i1 and i2 are equal");
        } else {
            System.out.println("i1 and i2 are not equal");
        }

        Integer num1 = 120;
        Integer num2 = 120;

        System.out.println("\nnum1 == num2 " + (num1 == num2));
        System.out.println("num1 != num2 " + (num1 != num2));
        System.out.println("num1.equals(num2) " + (num1.equals(num2)));

        Integer num3 = 120;
        Integer num4 = 220;
        Integer num5 = num4;

        System.out.println("\nnum3 == num4 " + (num3 == num4));
        System.out.println("num3 != num4 " + (num3 != num4));
        System.out.println("num3.equals(num4) " + (num3.equals(num4)));

        System.out.println("\nnum4 == num5 " + (num4 == num5));

    }
}