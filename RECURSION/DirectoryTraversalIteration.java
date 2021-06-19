
import java.io.*;
import java.util.*;

class DirectoryTraversal {

    public void traverseDirectories(String filePath) {

        String parenthPath = filePath;
        String tabSpace = "";

        Queue<File> queue = new LinkedList<>();
        queue.add(new File(filePath));

        System.out.println(new File(filePath).getAbsolutePath());

        while (!queue.isEmpty()) {

            File current = queue.poll();

            File[] list = current.listFiles();

            System.out.println("\nCURRENT DIRECTORY: " + current.getAbsolutePath());

            // if (parenthPath != current.getAbsolutePath()) {
            // tabSpace += "\t";
            // } else {
            // tabSpace = "";
            // }

            for (File fd : list) {
                if (fd.isDirectory()) {
                    System.out.println(tabSpace + fd.getName() + "(Directory)");
                    queue.add(fd);
                } else {
                    System.out.println(tabSpace + fd.getName());
                }
            }
        }
        System.out.println("TRAVERSAL COMPLETED!!");
    }
}

public class DirectoryTraversalIteration {
    public static void main(String[] args) {
        DirectoryTraversal dt = new DirectoryTraversal();
        String filePath = "C:/Java";
        dt.traverseDirectories(filePath);
    }
}