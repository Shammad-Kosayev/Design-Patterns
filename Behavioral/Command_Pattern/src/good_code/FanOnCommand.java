package good_code;

public class FanOnCommand {

    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.turnOn();
    }
}
