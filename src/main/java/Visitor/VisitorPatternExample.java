package Visitor;

/**
 * Main class to demonstrate the Visitor pattern.
 */
public class VisitorPatternExample {
    public static void main(String[] args) {
        // Creating a document with different types of elements
        Document document = new Document();
        document.addElement(new TextSection("This is a sample text with some words."));
        document.addElement(new ImageSection());
        document.addElement(new TableSection());
        document.addElement(new TextSection("Another text section with additional words."));
        document.addElement(new ImageSection());

        // Creating the visitor and collecting statistics
        DocumentStatisticsVisitor statisticsVisitor = new DocumentStatisticsVisitor();
        document.accept(statisticsVisitor);

        // Printing the results
        System.out.println("Total Word Count: " + statisticsVisitor.getWordCount());
        System.out.println("Total Image Count: " + statisticsVisitor.getImageCount());
        System.out.println("Total Table Count: " + statisticsVisitor.getTableCount());
    }
}
