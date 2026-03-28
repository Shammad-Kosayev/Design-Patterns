package advanced_file_example;

public class LocalStorage implements StorageProvider{

    public void store(String filename) {
        System.out.println("Storing local file " + filename);
    }
}
