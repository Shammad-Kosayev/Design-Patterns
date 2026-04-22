package good_code;

public class Main {
    public static void main(String[] args) {
        FileVisitor sizeCalculator = new SizeCalculator();
        File file = new File();
        file.accept(sizeCalculator);
    }
}
