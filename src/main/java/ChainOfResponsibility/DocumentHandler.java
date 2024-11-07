package ChainOfResponsibility;

/**
 * Interface for handling requests in the Chain of Responsibility pattern.
 * Each handler should implement this interface and define the handling logic
 * for a specific type of request.
 */
public interface DocumentHandler {
    /**
     * Sets the next handler in the chain.
     *
     * @param nextHandler the next handler to be set in the chain
     */
    void setNextHandler(DocumentHandler nextHandler);

    /**
     * Handles the document if the handler is able to; otherwise, passes it to the next handler.
     *
     * @param fileName the name of the document file to handle
     */
    void handleDocument(String fileName);
}
