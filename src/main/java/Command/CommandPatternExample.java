package Command;

/**
 * Client class that sets up the RemoteControl and binds it with commands.
 * It demonstrates the Command Pattern in action.
 */
public class CommandPatternExample {
    public static void main(String[] args) {
        Television tv = new Television();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command changeChannel = new ChangeChannelCommand(tv, 5);

        RemoteControl remote = new RemoteControl();

        // Turn on the television
        remote.setCommand(turnOn);
        remote.pressButton();

        // Change the channel
        remote.setCommand(changeChannel);
        remote.pressButton();

        // Turn off the television
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
