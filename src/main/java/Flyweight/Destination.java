package Flyweight;

/**
 * Represents a destination for vacation packages.
 * Defines methods for booking flights and accommodations.
 */
public interface Destination {
    /**
     * Books a flight for the destination.
     *
     * @param customerName Name of the customer booking the flight.
     */
    void bookFlight(String customerName);

    /**
     * Books accommodation for the destination.
     *
     * @param customerName Name of the customer booking the accommodation.
     */
    void bookAccommodation(String customerName);
}
