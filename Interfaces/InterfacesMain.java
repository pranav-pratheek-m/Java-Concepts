
interface Implementable{

	default void defaultMethod(){
		System.out.println("\nThis is a default method..");
	}
	
	static void staticMethod(){
		System.out.println("\nThis is a static method..");
	}
	
	void normalMethod();
}

public class InterfacesMain implements Implementable{
	
	@Override
	public void normalMethod(){
		System.out.println("\nThis is a normal method..");
	}
	
	public static void main(String[] args){
		InterfacesMain im = new InterfacesMain();
		im.normalMethod();
		im.defaultMethod();
		Implementable.staticMethod();
		
	}
} 

