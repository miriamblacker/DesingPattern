package TemplateMethod;

/**
 * Concrete class representing a Soccer game.
 * It provides specific implementations for the game steps.
 */
public class Soccer extends Game {

    @Override
    protected void initializeGame() {
        System.out.println("Initializing Soccer game.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Starting Soccer game.");
        // Logic for playing Soccer can be added here
    }
}
