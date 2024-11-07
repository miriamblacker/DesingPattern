package State;

/**
 * State representing the condition when a coin has been inserted.
 */
public class HasCoinState implements StateInterface {
    private VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You can't insert another coin.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product selected.");
        vendingMachine.setCurrentState(vendingMachine.getProductSelectedState());
    }

    @Override
    public void dispense() {
        System.out.println("You need to select a product first.");
    }
}
