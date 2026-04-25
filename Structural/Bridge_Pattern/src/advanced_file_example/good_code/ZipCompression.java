package advanced_file_example.good_code;

public class ZipCompression implements Compression {
    public String compress(String fileName) {
        // compression logic
        return fileName + ".zip";
    }
}
