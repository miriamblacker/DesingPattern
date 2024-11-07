package State;

/**
 * State representing the condition when no coin has been inserted.
 */
public class NoCoinState implements StateInterface {
    private VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted.");
        vendingMachine.setCurrentState(vendingMachine.getHasCoinState());
    }

    @Override
    public void selectProduct() {
        System.out.println("You need to insert a coin first.");
    }

    @Override
    public void dispense() {
        System.out.println("No product dispensed.");
    }
}
