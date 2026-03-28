package logger_example;

public abstract class Logger {

    protected OutputPlace outputPlace;

    public Logger(OutputPlace outputPlace) {
        this.outputPlace = outputPlace;
    }

    public abstract void log(String message);
}
