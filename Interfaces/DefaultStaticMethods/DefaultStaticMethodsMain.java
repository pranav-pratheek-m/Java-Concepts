
interface Implementable {
	/* public static final */ int num = 10;

	default void defaultMethod() {
		System.out.println("This is a default method..\n");
	}

	static void staticMethod() {
		System.out.println("This is a static method..\n");
	}
}

public class DefaultStaticMethodsMain implements Implementable {
	public static void main(String[] args) {
		Implementable i = new DefaultStaticMethodsMain();
		i.defaultMethod();
		// DefaultStaticMethodsMain.staticMethod();
		Implementable.staticMethod();
		System.out.println(Implementable.num);
		System.out.println(i instanceof Implementable);
	}
}
