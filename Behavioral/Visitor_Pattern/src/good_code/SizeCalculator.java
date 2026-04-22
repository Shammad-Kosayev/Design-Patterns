package good_code;

public class SizeCalculator implements FileVisitor{

    @Override
    public void visit(File file) {
        System.out.println("Calculating file size");
    }

    @Override
    public void visit(Folder folder) {
        System.out.println("Calculating folder size");
    }
}
