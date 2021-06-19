
import java.util.*;

class Person2{
Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}

public class HashMapCI<V> extends HashMap<String,V>{
    public static void main(String[] args){
        HashMapCI<Person> hci = new HashMapCI<>();
    }

    @Override
    public V put(String key,V value){
        return super.put(key.toUpperCase(),value);
    }

    @Override
    public V get(Object key){
        return super.get(key.toString().toUpperCase());
    }

}