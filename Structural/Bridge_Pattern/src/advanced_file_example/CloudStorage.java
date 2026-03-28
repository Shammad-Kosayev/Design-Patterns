package advanced_file_example;

public class CloudStorage implements StorageProvider{

    public void store(String filename) {
        System.out.println("Storing to cloud: " + filename);
    }
}
