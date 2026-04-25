package advanced_file_example.bad_code;

public class FileSaveService {

    // Imagine writing ALL classes :(
    private final AudioLocalNoCompression audioLocalNoCompression;
    private final AudioLocalZipCompression audioLocalZipCompression;
    private final AudioCloudNoCompression audioCloudNoCompression;
    private final AudioCloudZipCompression audioCloudZipCompression;

    private final VideoLocalNoCompression videoLocalNoCompression;
    private final VideoLocalZipCompression videoLocalZipCompression;
    private final VideoCloudNoCompression videoCloudNoCompression;
    private final VideoCloudZipCompression videoCloudZipCompression;

    public FileSaveService(
            AudioLocalNoCompression audioLocalNoCompression,
            AudioLocalZipCompression audioLocalZipCompression,
            AudioCloudNoCompression audioCloudNoCompression,
            AudioCloudZipCompression audioCloudZipCompression,
            VideoLocalNoCompression videoLocalNoCompression,
            VideoLocalZipCompression videoLocalZipCompression,
            VideoCloudNoCompression videoCloudNoCompression,
            VideoCloudZipCompression videoCloudZipCompression
    ) {
        this.audioLocalNoCompression = audioLocalNoCompression;
        this.audioLocalZipCompression = audioLocalZipCompression;
        this.audioCloudNoCompression = audioCloudNoCompression;
        this.audioCloudZipCompression = audioCloudZipCompression;
        this.videoLocalNoCompression = videoLocalNoCompression;
        this.videoLocalZipCompression = videoLocalZipCompression;
        this.videoCloudNoCompression = videoCloudNoCompression;
        this.videoCloudZipCompression = videoCloudZipCompression;
    }

    public void save(String type, String storage, String compression, String filename) {

        if (type.equals("AUDIO") && storage.equals("LOCAL") && compression.equals("NONE")) {
            audioLocalNoCompression.save(filename);

        } else if (type.equals("AUDIO") && storage.equals("LOCAL") && compression.equals("ZIP")) {
            audioLocalZipCompression.save(filename);

        } else if (type.equals("AUDIO") && storage.equals("CLOUD") && compression.equals("NONE")) {
            audioCloudNoCompression.save(filename);

        } else if (type.equals("AUDIO") && storage.equals("CLOUD") && compression.equals("ZIP")) {
            audioCloudZipCompression.save(filename);

        } else if (type.equals("VIDEO") && storage.equals("LOCAL") && compression.equals("NONE")) {
            videoLocalNoCompression.save(filename);

        } else if (type.equals("VIDEO") && storage.equals("LOCAL") && compression.equals("ZIP")) {
            videoLocalZipCompression.save(filename);

        } else if (type.equals("VIDEO") && storage.equals("CLOUD") && compression.equals("NONE")) {
            videoCloudNoCompression.save(filename);

        } else if (type.equals("VIDEO") && storage.equals("CLOUD") && compression.equals("ZIP")) {
            videoCloudZipCompression.save(filename);
        }
    }
}