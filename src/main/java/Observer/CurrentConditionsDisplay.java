package Observer;

/**
 * CurrentConditionsDisplay class implements the WeatherDisplay interface.
 * It displays the current temperature.
 */
public class CurrentConditionsDisplay implements WeatherDisplay {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    /**
     * Displays the current temperature.
     */
    public void display() {
        System.out.println("Current conditions: " + temperature + " degrees");
    }
}
