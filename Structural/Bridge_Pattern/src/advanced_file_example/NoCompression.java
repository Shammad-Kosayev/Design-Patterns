package advanced_file_example;

public class NoCompression implements Compression {
    public String compress(String fileName) {
        return fileName;
    }
}
