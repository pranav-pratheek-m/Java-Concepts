
public class StringEquality{
	public static void main(String[] args){
		String s3 = new String("Pranav");
		String s4 = new String("Pranav");
		String s1 = "Pranav";
		String s2 = "Pranav";
		String s5 = new String("s5");
		String s6 = new String("s5");
		
		s5 = s5 + "Hello";
		s6 = s6 + "Hello";
		
		if(s1 == s2){
			System.out.println("s1 and s2 are the same object.." + s1.concat("Malleboyina"));
		}else{
			System.out.println("s1 and s2 are different objects..");
		}
		
		if(s3 == s4){
			System.out.println("s3 and s4 are the same object..");
		}else{
			System.out.println("s3 and s4 are different objects..");
		}
		
		if(s2 == s3){
			System.out.println("s2 and s3 are the same object..");
		}else{
			System.out.println("s2 and s3 are different objects..");
		}
		
		System.out.println("s3 and s4 hash : " + s3.hashCode() + " : : " + s4.hashCode());
		System.out.println("s5 and s6 hash : " + s5.hashCode() + " : : " + s6.hashCode());
		
		s5.intern();
		s6.intern();
		
		if(s5 == s6){
			System.out.println("s5 and s6 are the same object..");
		}else{
			System.out.println("s5 and s6 are different objects..");
		}
		
	}
}