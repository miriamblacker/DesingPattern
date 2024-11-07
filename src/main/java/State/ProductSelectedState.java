package State;

/**
 * State representing the condition when a product has been selected.
 */
public class ProductSelectedState implements StateInterface {
    private VendingMachine vendingMachine;

    public ProductSelectedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You have already selected a product.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product already selected.");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensing product...");
        vendingMachine.setCurrentState(vendingMachine.getSoldState());
    }
}
