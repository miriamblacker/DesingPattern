package Proxy;

/**
 * A concrete class representing a real artwork in the gallery.
 * Implements the Artwork interface and provides actual implementations of viewing and purchasing the artwork.
 */
public class RealArtwork implements Artwork {
    private String title;

    /**
     * Constructs a new RealArtwork with the specified title.
     *
     * @param title The title of the artwork.
     */
    public RealArtwork(String title) {
        this.title = title;
    }

    @Override
    public void view() {
        System.out.println("Displaying the artwork: " + title);
    }

    @Override
    public void purchase() {
        System.out.println("Purchasing the artwork: " + title);
    }
}
