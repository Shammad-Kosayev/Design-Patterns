package good_code;

public interface FileSystemItem {

    void accept(FileVisitor fileVisitor);
}
