package Observer;

/**
 * ForecastDisplay class implements the WeatherDisplay interface.
 * It provides a forecast based on the latest temperature.
 */
public class ForecastDisplay implements WeatherDisplay {
    private float lastTemperature;

    @Override
    public void update(float temperature) {
        lastTemperature = temperature;
        display();
    }

    /**
     * Displays a simple forecast based on the last recorded temperature.
     */
    public void display() {
        System.out.println("Forecast: Temperature likely to stay around " + lastTemperature + " degrees.");
    }
}
