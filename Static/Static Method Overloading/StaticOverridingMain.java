import static java.lang.System.*;

class ParentClass{
	
	static void getClassName(){
		out.println("This is the parent class..");
	}
	
	int count = 10;
}

class ChildClass extends ParentClass{
	
	static void getClassName(){
		out.println("\nThis is the child class..");
	}
	
	//int count = 20;
}

public class StaticOverridingMain{
	
	public static void main(String args[]){
		ParentClass pc = new ParentClass();
		ParentClass cc = new ChildClass();  //method overriding does not apply to static methods
		
		pc.getClassName();
		cc.getClassName();
		//pc = cc;
		//out.println("Parent count : " + ((ChildClass)pc).count);
		
	}
}