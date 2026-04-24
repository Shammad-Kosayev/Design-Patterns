package file_system_example.good_code;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemItem {

    private String name;
    private List<FileSystemItem> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    public void remove(FileSystemItem item) {
        children.remove(item);
    }

    @Override
    public long getSize() {
        return children.stream()
                .mapToLong(FileSystemItem::getSize)
                .sum();
    }

    @Override
    public void delete() {
        for (FileSystemItem child : children) {
            child.delete();
        }
        System.out.println("Deleted directory: " + name);
    }
}
