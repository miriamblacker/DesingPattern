package Decorator;

/**
 * BasicCake is a simple concrete implementation of the Cake interface.
 * It represents a plain cake without any additional decorations.
 */
public class BasicCake implements Cake {

    @Override
    public String getDescription() {
        return "Basic Cake";
    }

    @Override
    public double getPrice() {
        return 50.0; // Base price of the cake
    }
}
