package Decorator;

/**
 * CakeDecorator is an abstract class implementing the Cake interface and acts as the base
 * class for all cake decorators. It holds a reference to a Cake object.
 */
public abstract class CakeDecorator implements Cake {
    protected Cake cake;

    /**
     * Constructor to initialize the decorator with a Cake object.
     *
     * @param cake the Cake object to be decorated.
     */
    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription();
    }

    @Override
    public double getPrice() {
        return cake.getPrice();
    }
}
