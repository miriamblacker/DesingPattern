package Visitor;

/**
 * A concrete element representing an image section in a document.
 */
public class ImageSection implements DocumentElement {
    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
