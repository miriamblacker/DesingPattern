package ChocolateBarFactory;

/**
 * WhiteChocolateBar class implementing the ChocolateBar interface.
 */
public class WhiteChocolateBar implements ChocolateBar {
    @Override
    public void produce() {
        System.out.println("Producing White Chocolate Bar");
    }

    @Override
    public void packageBar() {
        System.out.println("Packaging White Chocolate Bar");
    }
}
