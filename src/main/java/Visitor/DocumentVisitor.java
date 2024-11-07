package Visitor;

// Visitor Interface
/**
 * Visitor interface defining visit methods for different types of document sections.
 */
public interface DocumentVisitor {
    void visit(TextSection textSection);
    void visit(ImageSection imageSection);
    void visit(TableSection tableSection);
}
