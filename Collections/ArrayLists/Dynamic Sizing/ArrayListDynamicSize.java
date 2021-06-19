import java.util.*;

public class ArrayListDynamicSize {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(2);

        strList.add("Java");
        strList.add("Language");
        strList.add("Certification ");
        strList.add("Exam");
        strList.add("Tutorials");

        String[] strArray = new String[3];

        strArray = strList.toArray(strArray);

        for (String string : strArray) {
            System.out.print(string + "-->");
        }
    }
}