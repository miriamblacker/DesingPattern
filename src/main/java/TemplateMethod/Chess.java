package TemplateMethod;

/**
 * Concrete class representing a Chess game.
 * It provides specific implementations for the game steps.
 */
public class Chess extends Game {

    @Override
    protected void initializeGame() {
        System.out.println("Initializing Chess game.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Starting Chess game.");
        // Logic for playing Chess can be added here
    }
}
