package Command;

/**
 * Concrete command to turn the television off.
 * This command binds the Television receiver with the action to turn off.
 */
public class TurnOffCommand implements Command {
    private Television television;

    public TurnOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}
