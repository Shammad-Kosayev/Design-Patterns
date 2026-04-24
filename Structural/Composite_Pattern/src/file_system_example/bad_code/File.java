package file_system_example.bad_code;

public class File {
    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    public void delete() {
        // delete logic
        System.out.println("Deleted file: " + name);
    }
}
