package Memento;

/**
 * The Memento class represents a snapshot of the state of the Originator (TextEditor).
 * It is an immutable class that stores the content and allows retrieval without modification.
 */
public class MementoClass {
    private final String content;

    /**
     * Constructs a Memento with the provided content.
     * @param content the content to save in the Memento
     */
    public MementoClass(String content) {
        this.content = content;
    }

    /**
     * Gets the content stored in the Memento.
     * @return the saved content
     */
    public String getContent() {
        return content;
    }
}
