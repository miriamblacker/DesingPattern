package Strategy;

// StandardShipping.java
/**
 * Implements a standard shipping strategy with a flat rate per kilogram.
 */
public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 5; // Flat rate per kilogram
    }
}
