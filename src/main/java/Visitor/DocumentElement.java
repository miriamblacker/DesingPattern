package Visitor;

/**
 * Element interface defining the accept method for visitors.
 */
public interface DocumentElement {
    void accept(DocumentVisitor visitor);
}
