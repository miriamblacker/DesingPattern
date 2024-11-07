package Facade;

/**
 * Handles flight booking services.
 */
public class FlightBookingSystem implements Booking {
    /**
     * Books a flight for the traveler.
     */
    @Override
    public void book() {
        System.out.println("Flight booked successfully.");
    }
}
