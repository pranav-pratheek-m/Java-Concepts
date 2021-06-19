import java.io.*;
import java.util.*;

public class SerialisationRead {

    public static void main(String[] args) {

        try {
            ObjectInputStream obj_in = new ObjectInputStream(new FileInputStream("PersonOutput.txt"));

           Object obj;
           while(obj_in.available() > 0){
            Person[] pList = (Person[])(obj_in.readObject());
                //System.out.println(obj);                
           }
            //System.out.print(obj_in.readObject().getClass());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}