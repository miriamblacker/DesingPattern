package Strategy;

/**
 * Interface representing a shipping strategy with a method to calculate the shipping cost.
 */
public interface ShippingStrategy {
    /**
     * Calculates the shipping cost based on specific strategy.
     * @param weight The weight of the package in kilograms.
     * @return The calculated shipping cost.
     */
    double calculateShippingCost(double weight);
}
