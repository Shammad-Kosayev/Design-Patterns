package advanced_file_example.bad_code;

public class VideoLocalZipCompression {

    public void save(String filename) {
        validateVideo(filename);

        String compressed = compress(filename);

        System.out.println("Saving video locally: " + compressed);

        storeLocal(compressed);
    }

    private void validateVideo(String filename) {
        if (!filename.endsWith(".mp4")) {
            throw new IllegalArgumentException("Not a video file");
        }
    }

    private String compress(String filename) {
        return filename + ".zip";
    }

    private void storeLocal(String filename) {
        System.out.println("Stored locally: " + filename);
    }
}