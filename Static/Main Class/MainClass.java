
class MainClass {
	static{
		System.out.println("Static block executed!!");
	}
	
	{
		System.out.println("Init block executed!");
	}
	
	MainClass(){
		System.out.println("constructor executed!!");
	}
	
	public static void main(String[] args){
		System.out.println("Main method executed!!");
		MainClass mc = new MainClass();
	}
}