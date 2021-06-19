
public class Hash{
	private String str;
	
	Hash(String str){
		this.str = str;
	}
	
	@Override
	public int hashCode(){
		return this.str.hashCode();
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Hash))
			return false;
		
		Hash tmp = (Hash)obj;
	    
		return this.str.equals(tmp.str);
	}
	
	public static void main(String[] args){
		Hash h1  = new Hash("Pranav");
		Hash h2  = new Hash("Pranav");
		
		System.out.println("== " + (h1 == h2));
		
		System.out.println("h1 hash code = " + h1.hashCode() + "h2 hash code = " + h2.hashCode());
		System.out.println(".equals " + (h1.equals(h2)));
		
		
	}
}