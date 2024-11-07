package Iterator;

/**
 * The main class to test the implementation of the Iterator pattern.
 */
public class IteratorPatternExample {
    public static void main(String[] args) {
        // Create a book collection and add books
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("The Catcher in the Rye", "J.D. Salinger"));
        bookCollection.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        bookCollection.addBook(new Book("1984", "George Orwell"));
        bookCollection.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        // Create an iterator for the book collection
        IteratorInterface iterator = bookCollection.createIterator();

        // Iterate through the book collection and print each book
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
