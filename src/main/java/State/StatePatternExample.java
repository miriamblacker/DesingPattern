package State;

/**
 * StatePatternExample class to demonstrate the Vending Machine state changes.
 */
public class StatePatternExample {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin(); // Insert a coin
        vendingMachine.selectProduct(); // Select a product
        vendingMachine.dispense(); // Dispense the product

        vendingMachine.dispense(); // Try to dispense again
    }
}
