package logger_example;

public class MainClass {
    public static void main(String[] args) {
        InfoLogger fileInfoLogger = new InfoLogger(new FileOutputPlace());
        InfoLogger consoleInfoLogger = new InfoLogger(new ConsoleOutputPlace());

        consoleInfoLogger.log("XELLO");
    }
}
