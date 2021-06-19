
class ParentClass{
	
	 void getClassName(){
		 System.out.println("This is the parent class..");
	 }
	 
	 static void staticMethod(){
		 System.out.println("This is a static method.. ");
	 }
}

class ChildClass extends ParentClass{
	
	void getClassName(){
		System.out.println("This is the child class..");
	}
}

public class StaticInheritMain{
	public static void main(String[] args){
		ParentClass parent =  new ParentClass();
		ParentClass child = new ChildClass();
		
		parent.getClassName();
		parent.staticMethod();
		
		child.getClassName();
		child.staticMethod();
	}
}