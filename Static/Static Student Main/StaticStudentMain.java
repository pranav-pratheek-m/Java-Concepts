import java.util.Scanner;

class Student{
	
  int rollNo;
  String name;
  static String principalName; 
  static int noOfStudents=0;
    
  public Student(int rollNo,String name){
	  this.rollNo=rollNo;
	  this.name=name;
	  ++noOfStudents;	  
  }	
  
  static int getStudentCount(){
	  return noOfStudents;
  }
  
  static void setPrincipalName(String name){
	  principalName = name;
  }
  
  static String getPrincipalName(){
	  return principalName;
  }
  
}

public class StaticStudentMain{
	public static void main(String args[]){
		Student st1 = new Student(200,"Bill Gates");
		Student st2 = new Student(300,"Mark Zuckerberg");
		Student st3 = new Student(400,"Steve Jobs");
		Student st4 = new Student(500,"Jeff Bezos");
		
		System.out.println("The number of students enrolled is " + Student.getStudentCount());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the name of the principal: ");
		Student.setPrincipalName(sc.nextLine());
		
		System.out.println("\nThe name of the principal is " + Student.getPrincipalName());
	}
}