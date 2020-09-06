package SubPackage;

import MainPackage.Parent;

public class Stranger extends Parent {

    @Override
    public void getName() {
        System.out.println("This is Stranger class of Sub Package");
        System.out.println("The value of x is " + this.x);
    }

    public Stranger(int x) {
        this.x = x;
    }
}