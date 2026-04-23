package good_code;

public class Main {
    public static void main(String[] args) {

        Command lightCommand = new LightOnCommand(new Light());

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightCommand);

        remote.pressButton();
    }
}
