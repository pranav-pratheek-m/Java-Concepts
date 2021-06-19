import blueprint.Fruit;


class Apple extends Fruit{
	
	public void giveFruitName(){
		
		System.out.println("This is apple fruit!! \n");
		super.giveFruitName();
	}
}

class Orange extends Fruit{
	
	public void giveFruitName(){
		
		System.out.println("This is orange fruit!! \n");
		
	}
}

class Sapota extends Fruit{
	
	public void giveFruitName(){
		
		System.out.println("This is sapota fruit!!\n");
		 
	}
}

public class ConcreteFruit{
	/*public static void main(String[] args){
		
		Apple app=new Apple();
		Orange oran=new Orange();
		Sapota sap=new Sapota();
		
		app.giveFruitName();
		oran.giveFruitName();
		sap.giveFruitName();
	 }*/
	 public ConcreteFruit(){
		Apple apple=new Apple();
		Orange oran=new Orange();
		Sapota sap=new Sapota();
		
		apple.giveFruitName();
		oran.giveFruitName();
		sap.giveFruitName();
	 }	 
	}