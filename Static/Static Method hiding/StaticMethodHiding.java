
import java.lang.Integer;

class Athlete{

    static void getProfession(){
        System.out.println("I am an athlete (called by static method)");
    }
	
	int getAim(int x){
		System.out.println("I am in int");
		return  x;
	}
	
	short getAim(short x){
		System.out.println("I am in short");
		return  (short)(x + 1);
	}
	
	long getAim(long x){
		System.out.println("I am in long");
		return x;
	}
	
    Integer getAim(Integer x){
		Integer i = Integer.valueOf(x.intValue() + 100);
		return i;
	}
}


class Coach extends Athlete{

    static void getProfession(){
        System.out.println("I am an a coach (called by static method)");
    }
}

public class StaticMethodHiding{
    public static void main(String[] args){
		Athlete athlete = new Athlete();
        Coach.getProfession();
		System.out.println("Short: " + athlete.getAim(10L));
		System.out.println("int: " + athlete.getAim(1000));
		System.out.println("long: "+ athlete.getAim(100000L));
		Integer val = Integer.valueOf(30);
		System.out.println("Integer: "+ (athlete.getAim(val)));
    }
}