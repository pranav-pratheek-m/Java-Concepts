import java.util.*;

public class forEachMain{
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(2);numList.add(4);numList.add(6);numList.add(8);numList.add(10);

        //numList.forEach(num -> System.out.print(num + " "));
        numList.forEach(System.out::print);
        
        System.out.println("\n");
        numList.forEach(num -> System.out.print((num *100) + " "));
    }
}