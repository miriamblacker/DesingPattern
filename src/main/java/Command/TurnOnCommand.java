package Command;

/**
 * Concrete command to turn the television on.
 * This command binds the Television receiver with the action to turn on.
 */
public class TurnOnCommand implements Command {
    private Television television;

    public TurnOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}
