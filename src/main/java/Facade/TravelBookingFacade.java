package Facade;

import java.util.ArrayList;
import java.util.List;

/**
 * A facade class that provides a simplified interface for booking travel services.
 */
public class TravelBookingFacade {
    private List<Booking> bookings;

    /**
     * Initializes the booking systems and adds them to the booking list.
     */
    public TravelBookingFacade() {
        bookings = new ArrayList<>();
        bookings.add(new FlightBookingSystem());
        bookings.add(new HotelBookingSystem());
        bookings.add(new RentalCarBookingSystem());
    }

    /**
     * Books a complete travel package including all available services.
     */
    public void bookCompleteTravelPackage() {
        for (Booking booking : bookings) {
            booking.book();
        }
        System.out.println("Complete travel package booked successfully.");
    }
}
