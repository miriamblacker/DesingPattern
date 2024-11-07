package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a concrete aggregate that holds a collection of books.
 */
public class BookCollection implements BookCollectionInterface {
    private List<Book> books;

    /**
     * Constructor to initialize the book collection.
     */
    public BookCollection() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the collection.
     * @param book the book to be added
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Creates an iterator for the book collection.
     * @return a new BookIterator for this collection
     */
    @Override
    public BookIterator createIterator() {
        return new BookIterator(this.books);
    }
}
