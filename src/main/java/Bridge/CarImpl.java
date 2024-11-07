package Bridge;

/**
 * Concrete implementation of the Car interface representing a specific model.
 * Defines the movement and turning capabilities of the car.
 */
public class CarImpl implements Car, CarModel {
    private String color;
    private int speed;

    /**
     * Constructor to initialize a CarImpl with specific color and speed.
     *
     * @param color the color of the car
     * @param speed the speed of the car
     */
    public CarImpl(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    @Override
    public void driveForward() {
        System.out.println("Car is driving forward at speed: " + speed);
    }

    @Override
    public void driveBackward() {
        System.out.println("Car is driving backward at speed: " + speed);
    }

    @Override
    public void turnLeft() {
        System.out.println("Car is turning left.");
    }

    @Override
    public void turnRight() {
        System.out.println("Car is turning right.");
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
