package VinylRecordStore;

/**
 * Adapter class that adapts the RecordPlayer interface to work with ModernMediaPlayer.
 */
public class RecordPlayerAdapter implements ModernMediaPlayer {
    private final RecordPlayer recordPlayer;

    /**
     * Constructor for RecordPlayerAdapter.
     *
     * @param recordPlayer The RecordPlayer instance to adapt.
     */
    public RecordPlayerAdapter(RecordPlayer recordPlayer) {
        this.recordPlayer = recordPlayer;
    }

    @Override
    public void play() {
        recordPlayer.play(); // Calls the play method of RecordPlayer
    }

    @Override
    public void pause() {
        recordPlayer.stop(); // Stops the record instead of pausing
        System.out.println("Pausing the record player (stopping the record).");
    }
}
