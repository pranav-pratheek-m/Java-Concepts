
public class ScopeMain{
	static String scope = "Instance variable scope";
	public static void main(String[] args){
		String scope  = "local variable scope";
		int i = 10;
		
		System.out.println("The value of i in the main method is " + i);
		methodCall();
		
		for(int j=0;j<10;j++);
		
		System.out.println("The value of j  outside the loop is " + i); //2 identifiers with the same name cannot be defined within the same scope
		System.out.print("|\n"+scope);
		System.out.println("\n" + ScopeMain.scope);
	}
	
	public static void methodCall(){
		int i = 20;
		System.out.println("The local value of i  is " + i);
	}
}