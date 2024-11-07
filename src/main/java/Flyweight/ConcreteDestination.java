package Flyweight;

/**
 * Concrete class representing a specific destination for vacation packages.
 * Implements the Destination interface and contains unique data for each destination.
 */
public class ConcreteDestination implements Destination {
    private final String cityName;
    private final String flightDetails;
    private final String hotelDetails;

    /**
     * Constructs a ConcreteDestination with specific details.
     *
     * @param cityName Name of the city.
     * @param flightDetails Details of the flight.
     * @param hotelDetails Details of the hotel.
     */
    public ConcreteDestination(String cityName, String flightDetails, String hotelDetails) {
        this.cityName = cityName;
        this.flightDetails = flightDetails;
        this.hotelDetails = hotelDetails;
    }

    @Override
    public void bookFlight(String customerName) {
        System.out.println("Flight booked to " + cityName + " for " + customerName + ". Details: " + flightDetails);
    }

    @Override
    public void bookAccommodation(String customerName) {
        System.out.println("Accommodation booked in " + cityName + " for " + customerName + ". Details: " + hotelDetails);
    }
}
