package Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a document composed of multiple sections.
 */
public class Document {
    private List<DocumentElement> elements = new ArrayList<>();

    /**
     * Adds a document element to the document.
     */
    public void addElement(DocumentElement element) {
        elements.add(element);
    }

    /**
     * Allows a visitor to visit each element in the document.
     */
    public void accept(DocumentVisitor visitor) {
        for (DocumentElement element : elements) {
            element.accept(visitor);
        }
    }
}
