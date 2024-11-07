package ChocolateBarFactory;

/**
 * DarkChocolateBarFactory class extending ChocolateBarFactory to create DarkChocolateBar.
 */
public class DarkChocolateBarFactory extends ChocolateBarFactory {
    @Override
    public ChocolateBar createChocolateBar() {
        return new DarkChocolateBar();
    }
}