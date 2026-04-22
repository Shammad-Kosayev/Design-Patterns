package good_code;

public class Folder implements FileSystemItem {

    @Override
    public void accept(FileVisitor fileVisitor) {
        fileVisitor.visit(this);
    }
}
