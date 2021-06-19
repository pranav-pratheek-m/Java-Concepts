import java.util.Scanner;

class NumberResult{
	int sum_result;
	NumbersAdd sum;
	
	NumberResult(){
	 sum = new NumbersAdd();
	 sum_result = sum.addNumbers();
	}
}

class NumbersAdd{
	private int num1;
	private int num2;
	
	int addNumbers(){
	  Scanner sc = new Scanner(System.in);
	
	   System.out.print("Enter the first number: ");
	   num1 = sc.nextInt();
	   
	   System.out.print("\nEnter the second number: ");
	   num2 = sc.nextInt();
	   
	   return (num1 + num2);
	}
}

public class NumberResultMain{
	public static void main(String[] args){
	   NumberResult result = new NumberResult();
       System.out.println("The sum of the 2 numbers is " + result.sum_result);	   
	}
}