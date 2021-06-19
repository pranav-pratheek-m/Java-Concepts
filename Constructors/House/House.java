
class Building{
	
	Building(){
		System.out.println("build");
	}
	
	Building(String name){
		this();
		System.out.println("build : " + name);
	}
}

class House extends Building{
	
	House(){
		//this("mansion");
		System.out.println("house");
	}
	
	House(String name){
		this();
		System.out.println("house : " + name);
	}
	
	public static void main(String args[]){
		new House();
	}
}