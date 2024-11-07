package State;

/**
 * State representing the condition when a product has been sold.
 */
public class SoldState implements StateInterface {
    private VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, we're already dispensing a product.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Please wait, we're already dispensing a product.");
    }

    @Override
    public void dispense() {
        System.out.println("Product has been dispensed.");
        vendingMachine.setCurrentState(vendingMachine.getNoCoinState());
    }
}
