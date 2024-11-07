package Proxy;

/**
 * An interface representing an artwork in the art gallery.
 * Provides methods for viewing and purchasing the artwork.
 */
public interface Artwork {
    /**
     * Views the artwork, displaying it to the viewer.
     */
    void view();

    /**
     * Purchases the artwork, completing the sale process.
     */
    void purchase();
}
