package Command;

/**
 * Receiver class representing a Television.
 * This class performs the actual actions such as turning on, turning off, and changing channels.
 */
public class Television {

    public void turnOn() {
        System.out.println("The television is now ON.");
    }

    public void turnOff() {
        System.out.println("The television is now OFF.");
    }

    public void changeChannel(int channel) {
        System.out.println("Changing to channel " + channel);
    }
}
