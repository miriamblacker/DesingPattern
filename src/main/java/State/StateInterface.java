package State;

/**
 * Interface representing the state of the Vending Machine.
 */
public interface StateInterface {
    void insertCoin(); // Method to insert a coin
    void selectProduct(); // Method to select a product
    void dispense(); // Method to dispense the product
}
