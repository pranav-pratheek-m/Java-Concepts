
import java.util.HashSet;
import java.util.Set;

public class SetTheoryMain{
    public static void main(String[] args){
    Set<String> setString1 = new HashSet<String>();
    Set<String> setString2 = new HashSet<String>();

    setString1.add("Hello");
    setString1.add("World");
    setString1.add("Guys");

    setString2.add("Hello");
    setString2.add("Java");
    setString2.add("World");
    setString2.add("Developers");

    System .out.println("Set1 : "+ setString1 );
    System .out.println("Set2 : "+ setString2 );
  
    Set<String> union = new HashSet<String>(setString1);
    union.addAll(setString2);

    System.out.println("\nUnion of sets 1 and 2: "+ union);

    Set<String> intersection = new HashSet<String>(setString1);
    intersection.retainAll(setString2);

    System.out.println("\nIntersection of sets 1 and 2: "+ intersection);

    Set<String> difference = new HashSet<String>(setString1);
    difference.removeAll(setString2);

    System.out.println("\nDifference of sets 1 and 2: "+ difference);
    }
}