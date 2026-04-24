package file_system_example.good_code;

import java.util.List;

// Treat Uniformly
public class UsageExample2 {
    public static void main(String[] args) {
        List<FileSystemItem> items = List.of(
                new File("a.txt", 50),
                new Directory("empty")
        );

        for (FileSystemItem item : items) {
            item.delete(); // no type checking
        }
    }
}
