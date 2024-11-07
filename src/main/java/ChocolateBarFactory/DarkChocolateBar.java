package ChocolateBarFactory;

/**
 * DarkChocolateBar class implementing the ChocolateBar interface.
 */
public class DarkChocolateBar implements ChocolateBar {
    @Override
    public void produce() {
        System.out.println("Producing Dark Chocolate Bar");
    }

    @Override
    public void packageBar() {
        System.out.println("Packaging Dark Chocolate Bar");
    }
}
