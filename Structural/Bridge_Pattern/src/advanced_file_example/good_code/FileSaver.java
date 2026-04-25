package advanced_file_example.good_code;

public abstract class FileSaver {

    protected StorageProvider storage;
    protected Compression compression;

    public FileSaver(StorageProvider storage, Compression compression) {
        this.storage = storage;
        this.compression = compression;
    }

    public abstract void save(String filename);
}
