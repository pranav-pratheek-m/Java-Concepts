import java.util.*;
import java.util.stream.*;

public class EvenOddStream{
    public static void main(String[] args){
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("List of nums from 1 to 10 : " + numList );

        List<Integer> evenList = numList.stream()
                                        .filter(num -> (num % 2 == 0))
                                        .map(num -> (num * 100))
                                        //.map(Integer::valueof * 100)
                                        .collect(Collectors.toList());

        List<Integer> oddList = numList.stream()
                                        .filter(num -> (num % 2 != 0))
                                        .collect(Collectors.toList());
        
        List<Integer> deletedList=  numList.stream()
                                           .filter(num -> (num != 2))
                                           .collect(Collectors.toList());
                                                                          
        System.out.println("List of deleted : " + deletedList );
        System.out.println("List of even nums: " + evenList);
        System.out.println("List of odd nums: " + oddList);

        Integer result = numList.stream()
                                .reduce(0,(total,num) -> (total + num));

        System.out.println("The sum of the numbers is " + result);                                                                                                
    }
}