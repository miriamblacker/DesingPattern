package Visitor;

/**
 * A concrete element representing a table section in a document.
 */
public class TableSection implements DocumentElement {
    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
