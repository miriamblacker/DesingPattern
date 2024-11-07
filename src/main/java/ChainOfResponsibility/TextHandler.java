package ChainOfResponsibility;

/**
 * Concrete handler for handling Text documents.
 */
public class TextHandler implements DocumentHandler {
    private DocumentHandler nextHandler;

    @Override
    public void setNextHandler(DocumentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleDocument(String fileName) {
        if (fileName.endsWith(".txt")) {
            System.out.println("Opening Text document: " + fileName);
        } else if (nextHandler != null) {
            nextHandler.handleDocument(fileName);
        }
    }
}
