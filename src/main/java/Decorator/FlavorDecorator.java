package Decorator;

/**
 * FlavorDecorator is a concrete decorator that adds a specific flavor to the cake.
 * It extends the CakeDecorator class.
 */
public class FlavorDecorator extends CakeDecorator {
    private String flavor;
    private double flavorPrice;

    /**
     * Constructor to add a specific flavor to the cake.
     *
     * @param cake the Cake object to be decorated.
     * @param flavor the flavor to add.
     * @param flavorPrice the cost of the added flavor.
     */
    public FlavorDecorator(Cake cake, String flavor, double flavorPrice) {
        super(cake);
        this.flavor = flavor;
        this.flavorPrice = flavorPrice;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", " + flavor;
    }

    @Override
    public double getPrice() {
        return cake.getPrice() + flavorPrice;
    }
}
