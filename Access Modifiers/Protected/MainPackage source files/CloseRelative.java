package MainPackage;

class CloseRelative extends Parent {
    @Override
    public void getName() {
        System.out.println("This is Distant Relative class.");
        System.out.println("The value of x in Close Relative class is " + this.x);
    }

    CloseRelative() {
        this.x = 100;
    }
}