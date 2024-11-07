package Command;

/**
 * Invoker class that holds a command and executes it.
 * This class represents a RemoteControl that can trigger commands.
 */
public class RemoteControl {
    private Command command;

    /**
     * Sets the command to be executed.
     * @param command the command to set
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * Executes the current command.
     */
    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command set.");
        }
    }
}
