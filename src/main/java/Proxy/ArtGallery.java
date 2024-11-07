package Proxy;

public class ArtGallery {
    public static void main(String[] args) {
        Artwork artwork1 = new ArtworkProxy("The Starry Night", true);
        artwork1.view();        // Should allow access and log the viewing
        artwork1.purchase();    // Should allow access and log the purchasing

        Artwork artwork2 = new ArtworkProxy("Mona Lisa", false);
        artwork2.view();        // Should deny access
        artwork2.purchase();    // Should deny access
    }
}
