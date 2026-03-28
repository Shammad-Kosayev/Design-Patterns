package logger_example;

public class InfoLogger extends Logger {

    public InfoLogger(OutputPlace outputPlace) {
        super(outputPlace);
    }

    @Override
    public void log(String message) {
        outputPlace.write(message);
    }
}
