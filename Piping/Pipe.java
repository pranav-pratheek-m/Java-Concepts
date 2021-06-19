
import java.io.Console;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Pipe{
	
	void more(){
		int count = 0;
		try{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Console con = System.console();
		con.printf("%s","more");
		
		String line;
		while((line = reader.readLine()) != null){
			System.out.println(line);
			++count;
			if(count % 10 == 0 ){
				con.printf("%s","more");
				con.readLine();
			}
		  }
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args){
		Pipe pipe = new Pipe();
		pipe.more();
		System.out.println("Ended..");
	}
}