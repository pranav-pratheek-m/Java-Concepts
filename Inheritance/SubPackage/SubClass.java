public class SubClass extends BaseClass {
    int c;
    String status = "I am the subordinate";

    @Override
    void myMethod() {
        System.out.println("This is sub class..");
    }

   public static void main(String[] args) {
        BaseClass sub = new SubClass();
        BaseClass base = new BaseClass();
        int x = ((SubClass) sub).b = 23;
        int y = ((SubClass) sub).a = 19;
        // sub.c = 16;
        System.out.println("a=" + x + " b=" + y);
        base.myMethod();
        sub.myMethod();
        System.out.println("BaseClass status= " + base.status + "\nSubClass status= " + sub.status);
    }

}