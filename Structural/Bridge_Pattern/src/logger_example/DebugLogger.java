package logger_example;

public class DebugLogger extends Logger {

    public DebugLogger(OutputPlace outputPlace) {
        super(outputPlace);
    }

    @Override
    public void log(String message) {
        outputPlace.write(message);
    }
}
