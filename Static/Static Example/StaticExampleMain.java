
class StaticExample{
	
	private int a;
	private static int b;
	
	StaticExample(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	static int sum(int num1,int num2){
		return num1 + num2;
	}
	
	int getA(){
		return a;
	}
	
	static int getB(){
		return b;
	}
}

public class StaticExampleMain{
	public static void main(String[] args){
		StaticExample se = new StaticExample(100,200);
		
		int num1 = se.getA();
		int num2 = StaticExample.getB();
		
		System.out.println("The sum of "+ num1 + " and " + num2 + " is : " + StaticExample.sum(num1,num2));
	}
}