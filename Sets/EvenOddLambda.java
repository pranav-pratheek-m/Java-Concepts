import java.util.*;
import java.util.function.Predicate;

public class EvenOddLambda{

    static ArrayList<Integer> evenOddFilter(ArrayList<Integer> numList,Predicate<Integer> expr){
        ArrayList<Integer> result = new ArrayList<Integer>();
         
          numList.forEach(num -> {
              if(expr.test(num)){
                  result.add(num);
              }
          });
          return result;
    }
     
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<Integer>();

        Predicate<Integer> checkEven = num -> (num % 2 == 0);
        Predicate<Integer> checkOdd = num -> (num % 2 != 0);

         for(int i=0;i <= 20;i++){
             numList.add(i);
         }

        System.out.println("List of all nums between 1 and 20: " + numList);
        System.out.println("\n\nList of all even numbers: " + evenOddFilter(numList,checkEven));
        System.out.println("\n\nList of all odd numbers: " + evenOddFilter(numList,checkOdd));

    }
}