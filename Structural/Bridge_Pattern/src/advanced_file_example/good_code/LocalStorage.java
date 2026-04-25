package advanced_file_example.good_code;

public class LocalStorage implements StorageProvider{

    public void store(String filename) {
        System.out.println("Storing to local: " + filename);
        // save file using OS
    }
}
