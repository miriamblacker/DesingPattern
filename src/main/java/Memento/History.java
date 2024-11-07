package Memento;

import java.util.Stack;

/**
 * The History class acts as the Caretaker in the Memento design pattern.
 * It keeps track of multiple Mementos, allowing for undo functionality.
 */
public class History {
    private Stack<MementoClass> historyStack = new Stack<>();

    /**
     * Adds a Memento to the history stack.
     * @param memento the Memento to add
     */
    public void save(MementoClass memento) {
        historyStack.push(memento);
    }

    /**
     * Retrieves and removes the last Memento from the history stack.
     * @return the last Memento or null if the history is empty
     */
    public MementoClass undo() {
        if (!historyStack.isEmpty()) {
            return historyStack.pop();
        }
        return null;
    }
}
