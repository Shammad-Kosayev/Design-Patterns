package good_code;

public interface FileVisitor {
    void visit(File file);
    void visit(Folder folder);
}
