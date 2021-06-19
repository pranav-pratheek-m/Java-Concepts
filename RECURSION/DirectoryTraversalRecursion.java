import java.io.*;

class DirectoryTraversal {
    public void listOfFiles(String path, int level) {
        File file_obj = new File(path);
        File[] topFiles = file_obj.listFiles();

        if (topFiles != null && topFiles.length > 0) {
            for (File file : topFiles) {

                for (int i = 0; i < level; i++) {
                    System.out.print("\t");
                }

                if (file.isDirectory()) {
                    System.out.println("[ Directory " + file.getName() + " ]");
                    listOfFiles(file.getAbsolutePath(), level + 1);
                } else {
                    System.out.println(file.getName());
                }
            }
        } else {
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println("EMPTY....\n");
        }
    }
}

public class DirectoryTraversalRecursion {
    public static void main(String[] args) {
        DirectoryTraversal dt = new DirectoryTraversal();
        String filePath = "C:/Java/RECURSION/DirectoryTraversalRecursion.java";
        dt.listOfFiles(filePath, 0);
        System.out.println("\n\n-------------------------------------");
        System.out.print("FILE TRAVERSAL COMPLETED..");
    }
}