package advanced_file_example.bad_code;

public class AudioCloudZipCompression {

    public void save(String filename) {
        validateAudio(filename);

        String compressed = compress(filename);

        System.out.println("Uploading audio to cloud: " + compressed);

        storeCloud(compressed);
    }

    private void validateAudio(String filename) {
        if (!filename.endsWith(".mp3")) {
            throw new IllegalArgumentException("Not an audio file");
        }
    }

    private String compress(String filename) {
        return filename + ".zip";
    }

    private void storeCloud(String filename) {
        System.out.println("Stored in cloud: " + filename);
    }
}