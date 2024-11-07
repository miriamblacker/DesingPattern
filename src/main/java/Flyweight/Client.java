package Flyweight;

/**
 * Represents a client/customer of the travel agency.
 * Contains methods for booking vacation packages to different destinations.
 */
public class Client {
    private final String name;
    private final DestinationFlyweightFactory factory;

    /**
     * Constructs a Client with the specified name and destination factory.
     *
     * @param name Name of the client.
     * @param factory The flyweight factory for creating and sharing destinations.
     */
    public Client(String name, DestinationFlyweightFactory factory) {
        this.name = name;
        this.factory = factory;
    }

    /**
     * Books a vacation package to a specific destination.
     *
     * @param cityName Name of the city.
     * @param flightDetails Flight details for the destination.
     * @param hotelDetails Hotel details for the destination.
     */
    public void bookVacationPackage(String cityName, String flightDetails, String hotelDetails) {
        Destination destination = factory.getDestination(cityName, flightDetails, hotelDetails);
        destination.bookFlight(name);
        destination.bookAccommodation(name);
    }
}
