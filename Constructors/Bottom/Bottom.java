
class Top{
	Top(String str){
		this();
		System.out.println("Top " + str);
	}
	
	Top(){
		System.out.println("Top");
	}
}


public class Bottom extends Top{
	Bottom(String str){
		super(str);
		System.out.println("Bottom " + str);
	}
	
	public static void main(String[] args){
		new Bottom("Private executive");
	}
}