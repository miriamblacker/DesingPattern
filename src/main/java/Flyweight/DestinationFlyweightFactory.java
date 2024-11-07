package Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory class responsible for creating and managing flyweight objects representing destinations.
 * Ensures that flyweight objects are shared and reused efficiently.
 */
public class DestinationFlyweightFactory {
    private final Map<String, Destination> destinations = new HashMap<>();

    /**
     * Returns a flyweight destination object for the given city.
     *
     * @param cityName Name of the city.
     * @param flightDetails Flight details for the city.
     * @param hotelDetails Hotel details for the city.
     * @return Destination object for the specified city.
     */
    public Destination getDestination(String cityName, String flightDetails, String hotelDetails) {
        if (!destinations.containsKey(cityName)) {
            destinations.put(cityName, new ConcreteDestination(cityName, flightDetails, hotelDetails));
        }
        return destinations.get(cityName);
    }
}
