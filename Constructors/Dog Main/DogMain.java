
class Dog{

  Dog(){
	  this("qoute");
	  System.out.println("Dog is a 4 legged animal");
  }
  
  Dog(String qoute){
	  System.out.println("Dog is a very faithful animal");
  }

}

class GermanShepherd extends Dog{
	
	GermanShepherd(){
		System.out.println("German Shepherd is a breed of dog");
	}
}

public class DogMain{
	public static void main(String args[]){
		GermanShepherd gs = new GermanShepherd();
	}
}