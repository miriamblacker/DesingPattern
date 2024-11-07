package Flyweight;

/**
 * Test class to demonstrate the Flyweight pattern for a travel agency booking system.
 */
public class VacationPackages {
    public static void main(String[] args) {
        DestinationFlyweightFactory factory = new DestinationFlyweightFactory();

        Client client1 = new Client("Alice", factory);
        Client client2 = new Client("Bob", factory);

        client1.bookVacationPackage("Paris", "Flight XY123", "Hotel Luxe Paris");
        client2.bookVacationPackage("Paris", "Flight XY123", "Hotel Luxe Paris");
        client1.bookVacationPackage("London", "Flight AB456", "Hotel Royal London");

        // Demonstrates that Paris destination object is shared between client1 and client2
    }
}
