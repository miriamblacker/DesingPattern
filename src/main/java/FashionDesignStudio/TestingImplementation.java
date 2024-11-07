package FashionDesignStudio;

/**
 * The Main class to test the Abstract Factory pattern implementation.
 */
public class TestingImplementation {
    public static void main(String[] args) {
        // Creating a casual outfit
        OutfitFactory casualFactory = new CasualOutfitFactory();
        Top casualTop = casualFactory.createTop();
        Bottom casualBottom = casualFactory.createBottom();

        casualTop.design();   // Output: Designing a casual top.
        casualBottom.design(); // Output: Designing a casual bottom.

        // Creating a formal outfit
        OutfitFactory formalFactory = new FormalOutfitFactory();
        Top formalTop = formalFactory.createTop();
        Bottom formalBottom = formalFactory.createBottom();

        formalTop.design();   // Output: Designing a formal top.
        formalBottom.design(); // Output: Designing a formal bottom.
    }
}
