
class GenericStudent{
	 void getDetail(){
		System.out.println("I am a generic student..");
	}
}

class SchoolStudent extends GenericStudent{
	
	@Override
	void getDetail(){
		System.out.println("\nI am a school student..");
	}
}

class CollegeStudent extends GenericStudent{
	
	@Override
	void getDetail(){
		System.out.println("\nI am a college student..");
	}
}

class UniversityStudent extends GenericStudent{
	
	@Override
	void getDetail(){
		System.out.println("\nI am a university student..");
	}
}

class PhdStudent extends GenericStudent{
	
	@Override
	void getDetail(){
		System.out.println("\nI am a Phd student..");
	}
}

public class StudentMain{
	public static void main(String[] args){
		GenericStudent student;
		
		student = new GenericStudent();
		student.getDetail();
		
		student = new SchoolStudent();
		student.getDetail();
		
		student = new CollegeStudent();
		student.getDetail();
		
		student = new UniversityStudent();
		student.getDetail();
		
		student = new PhdStudent();
		student.getDetail();
	}
}