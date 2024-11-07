package Observer;

/**
 * WeatherDisplay interface represents the observer in the Observer pattern.
 * It defines the update method, which is called by the subject to notify displays.
 */
public interface WeatherDisplay {
    /**
     * Updates the display with the latest temperature.
     * @param temperature the updated temperature
     */
    void update(float temperature);
}
