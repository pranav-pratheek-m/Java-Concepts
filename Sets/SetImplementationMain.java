import java.util.*;

class SetImplementation implements Set<String>{

   ArrayList<String> setImpl;

    SetImplementation(){
      setImpl = new ArrayList<String>();
    } 

    SetImplementation(SetImplementation set){
      setImpl = new ArrayList<String>(set.setImpl);
    }

    @Override
    public int hashCode(){
      return setImpl.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        
        if(this == obj){
          return true;
         }else{
           SetImplementation set = (SetImplementation)obj;
           return this.setImpl.equals(set.setImpl);
         }
    }

    @Override
    public void clear(){
      setImpl.clear();
    }
     
    @Override
    public boolean removeAll(Collection<?> arr){
    return setImpl.removeAll(arr);  
     }

    @Override
    public boolean retainAll(Collection<?> arr){
      return setImpl.retainAll(arr);  
     }    

    @Override
    public boolean addAll(Collection<? extends String > arr){
      if(arr.isEmpty()){
         return false;
      }else{
          ArrayList<String> diff = new ArrayList<String>(arr);
          diff.removeAll(this.setImpl);
          this.setImpl.addAll(diff);
          return true;
      }
     }

     @Override
     public boolean containsAll(Collection<?> arr){
       return setImpl.containsAll(arr);
     }

     @Override
     public <T> T[]  toArray(T[] arr){
       return setImpl.toArray(arr);
     }

     @Override
     public Object[] toArray(){
        return setImpl.toArray();
     }

     @Override
     public Iterator<String> iterator(){
        return setImpl.iterator();
     }

  @Override 
  public boolean add(String str){
      if(setImpl.contains(str)){
        return false;
      }else{
          setImpl.add(str);
        return true;
      }
  }

  @Override 
  public boolean remove(Object obj){
      if(setImpl.contains(obj.toString())){
         setImpl.remove(obj.toString());
         return true;
      }else{
         return false;
      }
  }

  @Override
  public boolean contains(Object obj){
    return setImpl.contains(obj.toString());
  }

  @Override
  public boolean isEmpty(){
    return setImpl.isEmpty();
  }

  @Override
  public int size(){
    return setImpl.size();
  }

  @Override
  public String toString(){
    return this.setImpl.isEmpty() ? "Empty" : this.setImpl.toString();
  }
}

public class SetImplementationMain{
    public static void main(String[] args){
       SetImplementation set1 = new SetImplementation();
       set1.add("A");
       set1.add("B");
       set1.add("C");
       set1.add("B");
       set1.add("G");
       set1.add("A");

       SetImplementation set2 = new SetImplementation();
       set2.add("A");
       set2.add("B");
       set2.add("C");
       set2.add("B");
       set2.add("E");
       set2.add("H");
       set2.add("K");
       set2.add("P");

       SetImplementation set4 = new SetImplementation();
       set4.add("A");
       set4.add("B");
       set4.add("E");

       SetImplementation set3 = set2;

      System.out.print("Set 1 : " + set1);

      System.out.print("\n\nSet 2 : " + set2);

      System.out.print("\n\nSet 3 : " + set3);

      System.out.print("\n\nSet 4 : " + set4);

      System.out.println("\n\nSet 1 size " + set1.size());
      System.out.println("Set 2 size " + set2.size());

       System.out.println("\n\nhash code for the set1 is " + set1.hashCode());
       System.out.println("hash code for the set2 is " + set2.hashCode());
       System.out.println("hash code for the set3 is " + set3.hashCode());

       System.out.println("\n\nIs set1 equal to set2 i.e. set1.equals(set2) :" + set1.equals(set2));
       System.out.println("Is set2 equal to set3 i.e. set2 == set3 :" + (set2 == set3));
       System.out.println("does set 1 contain F? " + set1.contains("F"));
       
       SetImplementation union = new SetImplementation(set1);
       union.addAll(set2);
       System.out.print("\nUnion of set1 and set2: " + union);

       SetImplementation intersection = new SetImplementation(set1);
       intersection.retainAll(set2);
       System.out.print("\n\nIntersection of set1 and set2: " + intersection );

       SetImplementation difference = new SetImplementation(set2);
       difference.removeAll(set1);
       System.out.print("\n\n Difference of set2 and set1: " + difference);

       set1.clear();
       System.out.print("\n\nSet 1 contents after clearing: " + set1);

       set2.remove("P");
       System.out.print("\nSet 2 contents after removing P :" + set2);
  
       set2.add("P");
       System.out.println("\nP added again");

       System.out.print("\nSet 2 after converting to array: ");
       Object[] set2_arr = set2.toArray();
         for(Object obj : set2_arr){
           System.out.print(obj.toString() + " ");
         }

       System.out.println("\n\nIs set 4 a subset of set 2: " + set2.containsAll(set4));
    }
}