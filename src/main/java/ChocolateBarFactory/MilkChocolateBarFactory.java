package ChocolateBarFactory;

/**
 * MilkChocolateBarFactory class extending ChocolateBarFactory to create MilkChocolateBar.
 */
public class MilkChocolateBarFactory extends ChocolateBarFactory {
    @Override
    public ChocolateBar createChocolateBar() {
        return new MilkChocolateBar();
    }
}
