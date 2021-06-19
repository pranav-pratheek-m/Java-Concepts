
class Parent{
	public short getNumber(){
		short num = 100;
		return num;
	}
}

class Child extends Parent{
	public int getNumber(){
		int num = 55;
		return num;
	}
}

public class TypeOverloading{
	public static void main(String[] args){
		Parent parent = new Parent();
		Child child = new Child();
		System.out.println("Parent :" + parent.getNumber());
		System.out.println("Child :" + child.getNumber());
	}
}