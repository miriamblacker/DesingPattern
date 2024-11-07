package Composite;

/**
 * Represents an element in the park, such as a tree or a flower bed.
 * Provides methods to add and remove child elements.
 */
public interface ParkElement {
    /**
     * Adds a child element to this park element.
     *
     * @param element the child element to add
     */
    void addElement(ParkElement element);

    /**
     * Removes a child element from this park element.
     *
     * @param element the child element to remove
     */
    void removeElement(ParkElement element);

    /**
     * Displays the details of this park element.
     */
    void display();
}
