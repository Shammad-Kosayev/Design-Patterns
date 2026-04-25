package advanced_file_example.good_code;

public class AudioFileSaver extends FileSaver {

    public AudioFileSaver(StorageProvider storage, Compression compression) {
        super(storage, compression);
    }

    @Override
    public void save(String filename) {
        if (!isFileAudio(filename)) {
            throw new IllegalArgumentException("The filename '" + filename + "' is not an audio file");
        }

        System.out.println("Saving as audio: " + filename);
        String compressed = compression.compress(filename);
        storage.store(compressed);
    }

    private boolean isFileAudio(String filename) {
        return filename.toLowerCase().endsWith(".mp3");
    }
}
