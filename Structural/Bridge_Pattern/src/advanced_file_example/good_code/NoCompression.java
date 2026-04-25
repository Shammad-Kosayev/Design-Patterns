package advanced_file_example.good_code;

public class NoCompression implements Compression {
    public String compress(String fileName) {
        return fileName;
    }
}
