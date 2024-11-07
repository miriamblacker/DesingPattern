package Facade;

/**
 * Handles car rental booking services.
 */
public class RentalCarBookingSystem implements Booking {
    /**
     * Books a rental car for the traveler.
     */
    @Override
    public void book() {
        System.out.println("Rental car booked successfully.");
    }
}
