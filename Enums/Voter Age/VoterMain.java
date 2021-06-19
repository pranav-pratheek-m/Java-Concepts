
class Voter{
	enum VoterAge {MINOR,MAJOR};
	VoterAge age;
}

public class VoterMain{
	public static void main(String[] args){
		Voter voter = new Voter();
		voter.age = Voter.VoterAge.MAJOR;
		
		System.out.println("I can vote since I am a " + voter.age);
	}
} 