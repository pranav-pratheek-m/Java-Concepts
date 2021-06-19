import java.lang.Runtime;
import java.lang.Process;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CommandLineArguements{
	public static void main(String[] args){
		try{
	    String[] command = args; 
		
		Process process = Runtime.getRuntime().exec(command);
		
		BufferedReader reader = new BufferedReader(
		                           new InputStreamReader(
						                process.getInputStream()));
										
		String line;
		
		while((line = reader.readLine()) != null){
			System.out.println(line);
		}
		
		reader.close();
		
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}