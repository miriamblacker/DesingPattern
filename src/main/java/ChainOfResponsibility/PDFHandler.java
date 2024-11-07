package ChainOfResponsibility;

/**
 * Concrete handler for handling PDF documents.
 */
public class PDFHandler implements DocumentHandler {
    private DocumentHandler nextHandler;

    @Override
    public void setNextHandler(DocumentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleDocument(String fileName) {
        if (fileName.endsWith(".pdf")) {
            System.out.println("Opening PDF document: " + fileName);
        } else if (nextHandler != null) {
            nextHandler.handleDocument(fileName);
        }
    }
}
