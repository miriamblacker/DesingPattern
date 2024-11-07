package Bridge;

/**
 * RemoteControlCars class to test the Bridge Design Pattern implementation.
 * Creates instances of different Car models and controls them using RemoteControl.
 */
public class RemoteControlCars {
    public static void main(String[] args) {
        // Create a new car model with specific color and speed
        Car carModel1 = new CarImpl("Red", 100);
        Car carModel2 = new CarImpl("Blue", 80);

        // Create remote controls for the cars
        RemoteControl remote1 = new RemoteControlImpl(carModel1);
        RemoteControl remote2 = new RemoteControlImpl(carModel2);

        // Test the remote control for each car model
        System.out.println("Testing remote control for Car Model 1:");
        remote1.forward();
        remote1.left();
        remote1.backward();
        remote1.right();

        System.out.println("\nTesting remote control for Car Model 2:");
        remote2.forward();
        remote2.left();
        remote2.backward();
        remote2.right();
    }
}
