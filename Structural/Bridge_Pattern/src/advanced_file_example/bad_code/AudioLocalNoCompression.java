package advanced_file_example.bad_code;

public class AudioLocalNoCompression {

    public void save(String filename) {
        validateAudio(filename);

        System.out.println("Saving audio locally: " + filename);

        // no compression
        storeLocal(filename);
    }

    private void validateAudio(String filename) {
        if (!filename.endsWith(".mp3")) {
            throw new IllegalArgumentException("Not an audio file");
        }
    }

    private void storeLocal(String filename) {
        System.out.println("Stored locally: " + filename);
    }
}