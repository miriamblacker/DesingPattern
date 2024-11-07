package Facade;

/**
 * Handles hotel booking services.
 */
public class HotelBookingSystem implements Booking {
    /**
     * Books a hotel for the traveler.
     */
    @Override
    public void book() {
        System.out.println("Hotel booked successfully.");
    }
}
