enum DoughnutType{
	PLAIN,CREAMY,GLAZED;

    // @Override
    // public final boolean equals(Object obj){
	// 	return this == obj;
	// }

	// @Override
	// public String toString(){
	// 	return this.toString();
	// }

}

class Doughnut{
	//enum DoughnutType{PLAIN,CREAMY,GLAZED}
	DoughnutType type;
}

public class DoughnutMain{
	public static void main(String[] args){
		Doughnut order1 = new Doughnut();
		order1.type = DoughnutType.CREAMY;
		DoughnutType order2 = order1.type;

        System.out.println("Are orders 1 and 2 the same? " + order1.type.equals(order2));
		System.out.println("Is enum typen child of Object? " + order1.type  instanceof String);
		System.out.println((true != false) + "Is 10 > 5? ");
		System.out.println("Hash Code-- " + order1.type.hashCode());
		
		System.out.println("I have ordered a " + order1.type + " doughnut..");
	}
}