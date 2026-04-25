package advanced_file_example.good_code;

public class CloudStorage implements StorageProvider{

    public void store(String filename) {
        System.out.println("Storing to cloud: " + filename);
        // api call to upload file
    }
}
