class IntegerWrapper {

    Integer value;

    public IntegerWrapper(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    static void swap(IntegerWrapper a, IntegerWrapper b) {

        IntegerWrapper temp = new IntegerWrapper(a.value);
        a.value = b.value;
        b.value = temp.value;
    }
}

public class PassByReference {
    public static void main(String[] args) {
        IntegerWrapper num1 = new IntegerWrapper(220);
        IntegerWrapper num2 = new IntegerWrapper(Integer.valueOf("350"));

        System.out.println("Values before swapping: num1= " + num1 + " ,num2= " + num2);
        IntegerWrapper.swap(num1, num2);
        System.out.println("\nValues after swapping: num1= " + num1 + " ,num2= " + num2);
    }
}
