package Decorator;

/**
 * The Cake interface represents a basic cake with methods to describe and price it.
 */
public interface Cake {
    /**
     * Provides a description of the cake.
     *
     * @return description of the cake as a String.
     */
    String getDescription();

    /**
     * Provides the price of the cake.
     *
     * @return price of the cake as a double.
     */
    double getPrice();
}
