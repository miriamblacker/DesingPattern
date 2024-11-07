package Iterator;

/**
 * Represents an interface for an iterator.
 */
public interface IteratorInterface {
    /**
     * Checks if there is another element in the collection.
     * @return true if there is another element, false otherwise
     */
    boolean hasNext();

    /**
     * Returns the next element in the collection.
     * @return the next element
     */
    Book next();
}
