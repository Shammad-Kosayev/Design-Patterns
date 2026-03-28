package logger_example;

public class ConsoleOutputPlace implements OutputPlace {
    @Override
    public void write(String text) {
        System.out.println("Writing to Console '" + text + "'");
    }
}
