package Iterator;

import java.util.List;

/**
 * Represents a concrete iterator for iterating over a collection of books.
 */
public class BookIterator implements IteratorInterface {
    private List<Book> books;
    private int position = 0;

    /**
     * Constructor to initialize the book iterator with a collection of books.
     * @param books the collection of books to iterate over
     */
    public BookIterator(List<Book> books) {
        this.books = books;
    }

    /**
     * Checks if there is another book in the collection.
     * @return true if there is another book, false otherwise
     */
    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    /**
     * Returns the next book in the collection.
     * @return the next book
     */
    @Override
    public Book next() {
        if (hasNext()) {
            return books.get(position++);
        }
        return null;
    }
}
