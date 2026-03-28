package advanced_file_example;

public class VideoFile extends File {

    public VideoFile(StorageProvider storage, Compression compression) {
        super(storage, compression);
    }

    @Override
    public void save(String filename) {
        System.out.println("Saving video file: " + filename);
        String compressed = compression.compress(filename);
        storage.store(compressed);
    }
}
