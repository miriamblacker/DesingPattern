package Facade;

/**
 * Demonstrates the use of the Facade design pattern with a travel booking facade.
 */
public class TravelBooking {
    public static void main(String[] args) {
        // Create a facade instance
        TravelBookingFacade travelBooking = new TravelBookingFacade();

        // Use the facade to book a complete travel package
        travelBooking.bookCompleteTravelPackage();
    }
}
