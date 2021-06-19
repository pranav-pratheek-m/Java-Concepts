
class Sibling{
	String name;
	String date_of_birth;
	
	Sibling(String name,String date_of_birth){
		this.name = name;
		this.date_of_birth = date_of_birth;
	}
	
	@Override
	public boolean equals(Object object){
		Sibling sibling = (Sibling)object;
		
		return  this.date_of_birth == sibling.date_of_birth;
	}
	
	void printDetails(){
		System.out.println(this.name + "\n" + this.date_of_birth + "\n");
	}
	
}

public class SiblingMain{
	public static void main(String[] args){
		Sibling sib1 = new Sibling("Steve Waugh","27-03-1973");
		Sibling sib2 = new Sibling("Mark Waugh","27-03-1973");
		
		if(sib1.equals(sib2)){
			System.out.println("They both are twins\n");
		}else{
			System.out.println("They both are not twins\n");
		}
		
		sib1.printDetails();
		sib2.printDetails();
	}
}