package ChocolateBarFactory;

/**
 * WhiteChocolateBarFactory class extending ChocolateBarFactory to create WhiteChocolateBar.
 */
public class WhiteChocolateBarFactory extends ChocolateBarFactory {
    @Override
    public ChocolateBar createChocolateBar() {
        return new WhiteChocolateBar();
    }
}
