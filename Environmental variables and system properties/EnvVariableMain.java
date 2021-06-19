import java.util.Map;
import static java.lang.System.out;
import java.util.Properties;

public class EnvVariableMain{
	public static void main(String[] args){
		for(String name : args){
			out.println(name);
		}
		out.println("Read Specific Java environment variable ");
		out.println("JAVA_HOME value: " + System.getenv("JAVA_HOME") + "\n");
		
		Map<String,String> values = System.getenv();
		
		 for(Map.Entry<String,String> entry : values.entrySet()){
			 out.println("Variable : " + entry.getKey() + " \t Value : " + entry.getValue() + "\n");
		 }
		 
		 out.println("\n\n The System properties are: \n ");
		 Properties props = System.getProperties();
		 
		 for(Map.Entry<Object,Object> entry : props.entrySet()){
			 out.println("Property: " + entry.getKey() + " \t Value : " + entry.getValue());
		 }
		 String myValue = System.getProperty("myName");
		 
		 if(myValue.equals("Prod")){
			 out.println("I am in production.");
		 }
		 out.println(System.getProperty("myName"));
	}
}