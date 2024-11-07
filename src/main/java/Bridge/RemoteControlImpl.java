package Bridge;

/**
 * Concrete implementation of the RemoteControl interface.
 * Contains a reference to a Car object and delegates control commands to it.
 */
public class RemoteControlImpl implements RemoteControl {
    private Car car;

    /**
     * Constructor to initialize the RemoteControlImpl with a specific car.
     *
     * @param car the Car to be controlled by this remote
     */
    public RemoteControlImpl(Car car) {
        this.car = car;
    }

    @Override
    public void forward() {
        car.driveForward();
    }

    @Override
    public void backward() {
        car.driveBackward();
    }

    @Override
    public void left() {
        car.turnLeft();
    }

    @Override
    public void right() {
        car.turnRight();
    }
}
