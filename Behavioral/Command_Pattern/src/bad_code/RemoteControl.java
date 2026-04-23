package bad_code;

public class RemoteControl {

    public void press(String button) {

        if (button.equals("LIGHT_ON")) {
            System.out.println("Turning on light");

        } else if (button.equals("FAN_ON")) {
            System.out.println("Turning on fan");

        } else if (button.equals("TV_ON")) {
            System.out.println("Turning on TV");
        }
    }
}
