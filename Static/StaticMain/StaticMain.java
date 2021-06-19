import java.lang.*;

class Employee{
	
int id;
String name;
static int employeeCount = 0;

public Employee(int id,String name){
	this.id=id;
	this.name=name;
	++employeeCount;
 }	
 
}

public class StaticMain{
	public static void main(String args[]){
		Employee emp1 = new Employee(100,"Andy");
		Employee emp2 = new Employee(200,"Murray");
		Employee emp3 = new Employee(300,"Novak");
		Employee emp4 = new Employee(400,"Djokovic");
		
		System.out.println("The no of employees are : " + Employee.employeeCount);
	}
}

