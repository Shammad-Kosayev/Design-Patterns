package file_system_example.bad_code;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String name;
    private List<File> files;
    private List<Directory> directories;

    public Directory(String name, List<File> files, List<Directory> directories) {
        this.name = name;
        this.files = files;
        this.directories = directories;
    }

    public long getSize() {
        long total = 0;

        for (File file : files) {
            total += file.getSize();
        }

        for (Directory dir : directories) {
            total += dir.getSize();
        }

        return total;
    }

    public void delete() {
        for (File file : files) {
            file.delete();
        }

        for (Directory dir : directories) {
            dir.delete();
        }

        System.out.println("Deleting directory: " + name);
    }
}
