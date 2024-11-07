package Decorator;

/**
 * ToppingDecorator is a concrete decorator that adds a specific topping to the cake.
 * It extends the CakeDecorator class.
 */
public class ToppingDecorator extends CakeDecorator {
    private String topping;
    private double toppingPrice;

    /**
     * Constructor to add a specific topping to the cake.
     *
     * @param cake the Cake object to be decorated.
     * @param topping the topping to add.
     * @param toppingPrice the cost of the added topping.
     */
    public ToppingDecorator(Cake cake, String topping, double toppingPrice) {
        super(cake);
        this.topping = topping;
        this.toppingPrice = toppingPrice;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + ", " + topping;
    }

    @Override
    public double getPrice() {
        return cake.getPrice() + toppingPrice;
    }
}
