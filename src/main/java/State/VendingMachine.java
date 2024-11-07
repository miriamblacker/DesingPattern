package State;

/**
 * Vending Machine class representing the context that uses states.
 */
public class VendingMachine {
    private StateInterface noCoinState;
    private StateInterface hasCoinState;
    private StateInterface productSelectedState;
    private StateInterface soldState;

    private StateInterface currentState;

    public VendingMachine() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        productSelectedState = new ProductSelectedState(this);
        soldState = new SoldState(this);

        currentState = noCoinState; // Initial state
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectProduct() {
        currentState.selectProduct();
    }

    public void dispense() {
        currentState.dispense();
    }

    public void setCurrentState(StateInterface state) {
        this.currentState = state;
    }

    public StateInterface getNoCoinState() {
        return noCoinState;
    }

    public StateInterface getHasCoinState() {
        return hasCoinState;
    }

    public StateInterface getProductSelectedState() {
        return productSelectedState;
    }

    public StateInterface getSoldState() {
        return soldState;
    }
}
