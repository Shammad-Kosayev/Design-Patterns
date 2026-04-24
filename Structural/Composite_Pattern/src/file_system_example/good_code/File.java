package file_system_example.good_code;

public class File implements FileSystemItem {

    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void delete() {
        // delete logic
        System.out.println("Deleted file: " + name);
    }
}
