package ChainOfResponsibility;

/**
 * Concrete handler for handling DOC documents.
 */
public class DocHandler implements DocumentHandler {
    private DocumentHandler nextHandler;

    @Override
    public void setNextHandler(DocumentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleDocument(String fileName) {
        if (fileName.endsWith(".doc")) {
            System.out.println("Opening DOC document: " + fileName);
        } else if (nextHandler != null) {
            nextHandler.handleDocument(fileName);
        }
    }
}
