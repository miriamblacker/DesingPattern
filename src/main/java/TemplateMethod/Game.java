package TemplateMethod;

/**
 * Abstract class representing a game.
 * It defines the template method play() that outlines the steps to play a game.
 */
public abstract class Game {

    /**
     * Template method to play the game.
     * It defines the skeleton of the game algorithm.
     */
    public final void play() {
        initializeGame();
        startPlay();
        endPlay();
    }

    /**
     * Initializes the game.
     * This method should be implemented by subclasses to provide specific initialization logic.
     */
    protected abstract void initializeGame();

    /**
     * Starts the play of the game.
     * This method should be implemented by subclasses to provide specific play logic.
     */
    protected abstract void startPlay();

    /**
     * Ends the play of the game.
     * This is a common step that can be shared by all games.
     */
    protected void endPlay() {
        System.out.println("Game finished!");
    }
}
