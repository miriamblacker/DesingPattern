package Strategy;

/**
 * Context class that uses different shipping strategies dynamically.
 */
public class ShippingContext {
    private ShippingStrategy strategy;

    /**
     * Constructor to initialize with a specific shipping strategy.
     * @param strategy The shipping strategy to be used.
     */
    public ShippingContext(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Sets a new shipping strategy.
     * @param strategy The shipping strategy to be set.
     */
    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Calculates the shipping cost using the current strategy.
     * @param weight The weight of the package in kilograms.
     * @return The calculated shipping cost.
     */
    public double calculateShippingCost(double weight) {
        return strategy.calculateShippingCost(weight);
    }
}
