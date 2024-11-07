package Strategy;

/**
 * Implements a same-day shipping strategy with a premium rate and additional fee.
 */
public class SameDayShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 20 + 50; // Premium rate per kilogram with additional fee for speed
    }
}
