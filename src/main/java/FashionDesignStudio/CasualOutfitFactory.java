package FashionDesignStudio;

/**
 * The CasualOutfitFactory creates casual outfit components.
 */
public class CasualOutfitFactory implements OutfitFactory {

    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Bottom createBottom() {
        return new CasualBottom();
    }
}
