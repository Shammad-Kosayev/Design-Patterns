package file_system_example.good_code;

// general usage
public class UsageExample1 {
    public static void main(String[] args) {
        Directory root = new Directory("root");

        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);

        Directory subDir = new Directory("sub");

        subDir.add(new File("file3.txt", 300));

        root.add(file1);
        root.add(file2);
        root.add(subDir);

        System.out.println(root.getSize()); // 600
    }
}
