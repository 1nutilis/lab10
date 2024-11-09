package Composite;

public class FileSystemMain {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        File file1 = new File("File1.txt", 100);
        File file2 = new File("File2.txt", 200);

        Directory subDir = new Directory("SubDirectory");
        File subFile1 = new File("SubFile1.txt", 50);

        root.add(file1);
        root.add(file2);
        subDir.add(subFile1);
        root.add(subDir);

        root.display(1);
        System.out.println("Total size: " + root.getSize() + "KB");
    }
}
