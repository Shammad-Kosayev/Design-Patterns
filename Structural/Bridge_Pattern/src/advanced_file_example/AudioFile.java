package advanced_file_example;

public class AudioFile extends File {

    public AudioFile(StorageProvider storage, Compression compression) {
        super(storage, compression);
    }

    @Override
    public void save(String filename) {
        System.out.println("Saving as audio: " + filename);
        String compressed = compression.compress(filename);
        storage.store(compressed);
    }
}
