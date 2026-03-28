package advanced_file_example;

public abstract class File {

    protected StorageProvider storage;
    protected Compression compression;

    public File(StorageProvider storage, Compression compression) {
        this.storage = storage;
        this.compression = compression;
    }

    public abstract void save(String filename);
}
