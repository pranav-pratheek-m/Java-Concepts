
class Person{
	
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj){
		Person person = (Person)obj;
		
		return (this.name == person.name 
		       && this.age == person.age);
	}
	
	void printDetails(){
		System.out.println("\nName : " + this.name + "\nAge : " + this.age);
	}
}

class ObjectEqualityMain{
	public static void main(String[] args){
		Person p1 = new Person("Alex Hales",24);
		//final Person p2 = p1;
	    Person p2 = new Person("Virat Kohli",26);
		
		p1.printDetails();
		p2.printDetails();
		
		//p2.age = p1.age;
		p2.name = "Raghav";
		p2 = p1;
		
		p1.printDetails();
		p2.printDetails();
		
		if(p1 == p2){
			System.out.println("Both the objects are equal.. ");
		}else{
			System.out.println("Both the objects are not equal.. ");
		}
		
		if(p1.equals(p2)){
			System.out.println("Both the objects have equal values");
		}else{
			System.out.println("Both the objects have unequal values");
		} 
		
		p1.printDetails();
		p2.printDetails();
	}
}