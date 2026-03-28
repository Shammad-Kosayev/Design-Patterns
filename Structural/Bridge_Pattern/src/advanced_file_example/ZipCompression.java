package advanced_file_example;

public class ZipCompression implements Compression {
    public String compress(String fileName) {
        return fileName + ".zip";
    }
}
