package MainPackage;

class Stranger {
    Stranger() {
        Parent par = new Parent();
        par.x = 30;
        System.out.println("The value of x in Stranger class is " + par.x);
    }
}