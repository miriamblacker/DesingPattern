package Visitor;

/**
 * A concrete element representing a section of text in a document.
 */
public class TextSection implements DocumentElement {
    private String text;

    public TextSection(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
