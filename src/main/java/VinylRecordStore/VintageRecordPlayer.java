package VinylRecordStore;

/**
 * Concrete class implementing the RecordPlayer interface.
 */
public class VintageRecordPlayer implements RecordPlayer {
    @Override
    public void play() {
        System.out.println("Playing vinyl record...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping vinyl record...");
    }
}
