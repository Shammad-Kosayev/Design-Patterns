package advanced_file_example.good_code;

public class VideoFileSaver extends FileSaver {

    public VideoFileSaver(StorageProvider storage, Compression compression) {
        super(storage, compression);
    }

    @Override
    public void save(String filename) {
        if (!isFileVideo(filename)) {
            throw new IllegalArgumentException("The filename '" + filename + "' is not a video file");
        }

        System.out.println("Saving video file: " + filename);
        String compressed = compression.compress(filename);
        storage.store(compressed);
    }

    private boolean isFileVideo(String filename) {
        return filename.toLowerCase().endsWith(".mp4");
    }
}
