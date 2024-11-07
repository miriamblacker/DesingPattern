package Memento;

/**
 * The TextEditor class represents the Originator in the Memento design pattern.
 * It contains methods to create a Memento to save the current state and restore a state
 * from a given Memento.
 */
public class TextEditor {
    private String content;

    /**
     * Sets the content of the TextEditor.
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets the content of the TextEditor.
     * @return the current content
     */
    public String getContent() {
        return content;
    }

    /**
     * Creates a Memento object that captures the current state.
     * @return a new Memento with the current content
     */
    public MementoClass save() {
        return new MementoClass(content);
    }

    /**
     * Restores the TextEditor content from a Memento.
     * @param memento the Memento from which to restore the state
     */
    public void restore(MementoClass memento) {
        this.content = memento.getContent();
    }
}
