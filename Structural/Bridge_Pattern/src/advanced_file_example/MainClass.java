package advanced_file_example;

public class MainClass {
    public static void main(String[] args) {
        File audioFile = new AudioFile(
                new LocalStorage(),
                new NoCompression()
        );

        audioFile.save("Rick Astley");

        System.out.println();
        System.out.println();
        System.out.println();

        File videoFile = new VideoFile(
                new CloudStorage(),
                new ZipCompression()
        );

        videoFile.save("Youtube Rewind");
    }
}
