package Strategy;

public class ShippingService {
    public static void main(String[] args) {
        double packageWeight = 5.0; // Weight of the package in kilograms

        // Using the Standard Shipping strategy
        ShippingContext context = new ShippingContext(new StandardShipping());
        System.out.println("Standard Shipping Cost: " + context.calculateShippingCost(packageWeight));

        // Changing to Express Shipping strategy
        context.setStrategy(new ExpressShipping());
        System.out.println("Express Shipping Cost: " + context.calculateShippingCost(packageWeight));

        // Changing to Same Day Shipping strategy
        context.setStrategy(new SameDayShipping());
        System.out.println("Same Day Shipping Cost: " + context.calculateShippingCost(packageWeight));
    }
}
