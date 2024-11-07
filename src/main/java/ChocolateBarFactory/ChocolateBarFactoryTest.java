package ChocolateBarFactory;

/**
 * Main class to test the Factory Method implementation.
 */
public class ChocolateBarFactoryTest {
    public static void main(String[] args) {
        ChocolateBarFactory darkFactory = new DarkChocolateBarFactory();
        ChocolateBar darkChocolate = darkFactory.createChocolateBar();
        darkChocolate.produce();
        darkChocolate.packageBar();

        ChocolateBarFactory milkFactory = new MilkChocolateBarFactory();
        ChocolateBar milkChocolate = milkFactory.createChocolateBar();
        milkChocolate.produce();
        milkChocolate.packageBar();

        ChocolateBarFactory whiteFactory = new WhiteChocolateBarFactory();
        ChocolateBar whiteChocolate = whiteFactory.createChocolateBar();
        whiteChocolate.produce();
        whiteChocolate.packageBar();
    }
}
