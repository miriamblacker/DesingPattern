package Iterator;

/**
 * Represents an aggregate that provides an iterator for its collection.
 */
public interface BookCollectionInterface {
    /**
     * Creates an iterator for the book collection.
     * @return an iterator for the collection
     */
    BookIterator createIterator();
}
