package Strategy;

/**
 * Implements an express shipping strategy with a higher rate and additional fee.
 */
public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 10 + 20; // Higher rate per kilogram with additional fee
    }
}
