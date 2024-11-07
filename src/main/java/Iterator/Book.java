package Iterator;

/**
 * Represents a book with a title and author.
 */
public class Book {
    private String title;
    private String author;

    /**
     * Constructor to initialize a book with a title and author.
     * @param title the title of the book
     * @param author the author of the book
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Returns the book details as a formatted string.
     * @return the book details
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}
