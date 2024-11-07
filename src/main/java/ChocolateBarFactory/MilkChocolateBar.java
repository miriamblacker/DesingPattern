package ChocolateBarFactory;

/**
 * MilkChocolateBar class implementing the ChocolateBar interface.
 */
public class MilkChocolateBar implements ChocolateBar {
    @Override
    public void produce() {
        System.out.println("Producing Milk Chocolate Bar");
    }

    @Override
    public void packageBar() {
        System.out.println("Packaging Milk Chocolate Bar");
    }
}
