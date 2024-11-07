package VinylRecordStore;

/**
 * Main class to test the adapter implementation.
 */
public class VinylRecordStore {
    public static void main(String[] args) {
        RecordPlayer vintageRecordPlayer = new VintageRecordPlayer();
        ModernMediaPlayer adaptedPlayer = new RecordPlayerAdapter(vintageRecordPlayer);

        // Testing the adapter
        adaptedPlayer.play();   // Should play the vinyl record
        adaptedPlayer.pause();  // Should stop the record and indicate it's paused
    }
}
