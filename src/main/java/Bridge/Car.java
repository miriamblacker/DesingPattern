package Bridge;

/**
 * Interface representing a remote-controlled car.
 * Defines basic movements that the car can perform.
 */
public interface Car {
    void driveForward();
    void driveBackward();
    void turnLeft();
    void turnRight();
}
