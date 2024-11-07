package Proxy;

/**
 * A proxy class that acts as a placeholder for the real artwork.
 * Controls access to the real artwork by adding extra functionality, such as access control and logging.
 */
public class ArtworkProxy implements Artwork {
    private RealArtwork realArtwork;
    private String title;
    private boolean isAuthenticated;

    /**
     * Constructs a new ArtworkProxy with the specified title.
     * This proxy controls access to the real artwork based on authentication.
     *
     * @param title The title of the artwork.
     * @param isAuthenticated A boolean indicating if the user is authorized to access the artwork.
     */
    public ArtworkProxy(String title, boolean isAuthenticated) {
        this.title = title;
        this.isAuthenticated = isAuthenticated;
    }

    /**
     * Lazy-loads the RealArtwork object only when access is granted.
     */
    private void initializeRealArtwork() {
        if (realArtwork == null) {
            realArtwork = new RealArtwork(title);
        }
    }

    @Override
    public void view() {
        if (isAuthenticated) {
            initializeRealArtwork();
            System.out.println("Logging: Viewing attempt for artwork: " + title);
            realArtwork.view();
        } else {
            System.out.println("Access denied: Unauthorized viewing attempt for artwork: " + title);
        }
    }

    @Override
    public void purchase() {
        if (isAuthenticated) {
            initializeRealArtwork();
            System.out.println("Logging: Purchasing attempt for artwork: " + title);
            realArtwork.purchase();
        } else {
            System.out.println("Access denied: Unauthorized purchasing attempt for artwork: " + title);
        }
    }
}
