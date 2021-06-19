
import java.lang.Runtime;

public class GarbageCollection{
	public static void main(String[] args){
		Runtime runtime = Runtime.getRuntime();
		
		System.out.println("Total memory in JVM: " + runtime.totalMemory());
		System.out.println("Memory before allocation: " + runtime.freeMemory());
		
		int[] array =new int[10_48_576]; //1GB=1024 MB = 1024 *1024 = 10,48,576 bytes
		
		for(int i : array){
			i=10;
		}
		
		System.out.println("Memory after allocation: " + runtime.freeMemory());
		
		runtime.gc(); //perform the garbage collection
		
		System.out.println("Memory after cleaning: " + runtime.freeMemory());
		
	}
}