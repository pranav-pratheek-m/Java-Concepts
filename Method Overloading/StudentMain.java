
import java.lang.*;

class RandomStudent{
	
	public static int age = 10;
    static{
		System.out.println("I am in static" + age);
	}

	public void study(){
		System.out.println("I study randomly...");
	}
}

class FocussedStudent extends RandomStudent{
	public int age = 20;

    /*FocussedStudent(int age){
		this.age = age;
	}*/

	public void study(int time){
		System.out.println("I study with focus for " + time + " hours ");
	}
}

public class StudentMain{
	public static void main(String[] args){
		/*
		RandomStudent rs = new RandomStudent();      //working
        FocussedStudent fs = new FocussedStudent();
		
		rs.study();
		fs.study(4);
          */
		
		/*new RandomStudent().study();
		new FocussedStudent().study(5);
		 */ 
		  
		
		/*RandomStudent rs = new FocussedStudent();  //implicit upcasting
        FocussedStudent fs = new FocussedStudent(); 

        rs.study();
		fs.study(4);		
		*/
		
		/*FocussedStudent obj = new FocussedStudent();  // with single object
		obj.study();
		obj.study(6);
		*/
		
		/*new FocussedStudent().study();     //direct object instatiation without reference 
		new FocussedStudent().study(6);
		*/
		
		/*RandomStudent rs = new RandomStudent();      
        RandomStudent fs = new FocussedStudent();
		
		rs.study();
		fs.study(5);	//compile time error arg mismatch
		*/
		
		/*RandomStudent rs = new RandomStudent();      
       if(rs instanceof RandomStudent){
          rs.study();
	   }else{
		FocussedStudent fs = (FocussedStudent)rs;
		fs.study(5);  //classcastexception 
	   }*/
		
		/*RandomStudent rs = new FocussedStudent();      
       
		rs.study();
		if(rs instanceof FocussedStudent)
		FocussedStudent fs = (FocussedStudent)rs;
		fs.study(5);    //works now
		*/
		
		FocussedStudent fs = new FocussedStudent();
		fs.study(10);
		RandomStudent rs=fs;
		rs.study();    //implicit super casting
		System.out.println(rs.age);
		
	}
}