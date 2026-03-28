package logger_example;

public class FileOutputPlace implements OutputPlace {
    @Override
    public void write(String text) {
        System.out.println("Writing to file '" + text + "'");
    }
}
