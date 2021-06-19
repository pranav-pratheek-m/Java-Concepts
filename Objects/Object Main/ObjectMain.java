

class Book{
	String name;
	int cost;
	
	Book(String name,int cost){
		this.name = name;
		this.cost = cost;
	}
	
	void printBookDetails(){
		System.out.println(name + "  " + cost + "\n");
	}
}

class ObjectMain{
	public static void main(String[] args){
		Book book1 = new Book("Harry Potter and Sorcerer's Stone",400);
		System.out.println("Before Referencing: " + book1.name + "  " + book1.cost);
		Book book2 = book1;
		book2.cost = 300;
		
		book1.printBookDetails();
		book2.printBookDetails();
	}
}