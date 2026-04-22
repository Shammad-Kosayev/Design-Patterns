package good_code;

public class File implements FileSystemItem {

    @Override
    public void accept(FileVisitor fileVisitor) {
        fileVisitor.visit(this);
    }
}
