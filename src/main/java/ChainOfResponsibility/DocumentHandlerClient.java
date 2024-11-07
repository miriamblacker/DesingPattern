package ChainOfResponsibility;

/**
 * Client class that initiates the document handling request.
 */
public class DocumentHandlerClient {
    public static void main(String[] args) {
        // Setting up the chain of responsibility
        DocumentHandler pdfHandler = new PDFHandler();
        DocumentHandler docHandler = new DocHandler();
        DocumentHandler textHandler = new TextHandler();

        pdfHandler.setNextHandler(docHandler);
        docHandler.setNextHandler(textHandler);

        // Example documents to handle
        String[] documents = {"file.pdf", "file.doc", "file.txt", "unknown.xyz"};

        for (String document : documents) {
            System.out.println("Request to open: " + document);
            pdfHandler.handleDocument(document);
            System.out.println();
        }
    }
}
