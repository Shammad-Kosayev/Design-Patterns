package advanced_file_example.good_code;

public class ExampleUsage {
    public static void main(String[] args) {
        System.out.println("Example usage:");

        System.out.println("Audio file save to local with no compression:");
        FileSaver audioFileSaver = new AudioFileSaver(
                new LocalStorage(),
                new NoCompression()
        );
        audioFileSaver.save("Rick Astley - Never Gonna Give You Up.mp3");

        System.out.println();

        System.out.println("video file save to cloud with compression:");
        FileSaver videoFileSaver = new VideoFileSaver(
                new CloudStorage(),
                new ZipCompression()
        );
        videoFileSaver.save("Youtube Rewind.mp4");
    }
}
