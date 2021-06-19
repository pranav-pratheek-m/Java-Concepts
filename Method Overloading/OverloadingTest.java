
class Overloading {

    int getSum(int a, int b) {
        System.out.println("\nint called");
        return a + b;
    }

    public short getSum(short a, short b) {
        System.out.println("\nshort called");
        return (short) (a + b);
    }

    byte getSum(byte a, byte b) {
        System.out.println("\nbyte called");
        return (byte) (a + b);
    }

    public Integer getSum(Integer a, Integer b) {
        System.out.println("\nInteger called");
        return a.intValue() + b.intValue();
    }

    public int getSum(String a, String b) {
        System.out.println("\nString called");
        return a.length() + b.length();
    }
}

public class OverloadingTest {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.println(obj.getSum((byte) 20, (byte) 20));
        System.out.println(obj.getSum((short) 120, (short) 120));
        System.out.println(obj.getSum(20_000, 20_000));
        System.out.println(obj.getSum("Hello", "World"));
        System.out.println(obj.getSum(Integer.valueOf(25), Integer.valueOf(36)));

    }
}