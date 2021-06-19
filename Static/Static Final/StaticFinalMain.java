
class StaticFinal{
	static final int cost;
	
	static{
		cost = 100;
	}
	
	/*StaticFinal(int cost){
		this.cost = cost;
	}*/
	
}

public class StaticFinalMain{
	public static void main(String[] args){
		StaticFinal sf = new StaticFinal();
		//sf.cost = 500;  //the value of final variable cannot be changed
		System.out.println(sf.cost);
	}
}