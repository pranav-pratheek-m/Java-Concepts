
enum CoffeeSize{
	SMALL,MEDIUM,LARGE
};

class Coffee{
	CoffeeSize size;
}

public class CoffeeMain{
	public static void main(String[] args){
		Coffee order = new Coffee();
		order.size = CoffeeSize.MEDIUM;
		System.out.println("Order size is " + order.size);
	}
}