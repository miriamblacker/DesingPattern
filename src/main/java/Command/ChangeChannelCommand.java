package Command;

/**
 * Concrete command to change the channel on the television.
 * This command binds the Television receiver with the action to change the channel.
 */
public class ChangeChannelCommand implements Command {
    private Television television;
    private int channel;

    public ChangeChannelCommand(Television television, int channel) {
        this.television = television;
        this.channel = channel;
    }

    @Override
    public void execute() {
        television.changeChannel(channel);
    }
}
