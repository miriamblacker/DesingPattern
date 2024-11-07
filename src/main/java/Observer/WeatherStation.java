package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The WeatherStation class represents a subject in the Observer design pattern.
 * It holds a list of observers and notifies them of temperature changes.
 */
public class WeatherStation {
    private List<WeatherDisplay> displays = new ArrayList<>();
    private float temperature;

    /**
     * Registers a new display as an observer.
     * @param display the display to register
     */
    public void registerDisplay(WeatherDisplay display) {
        displays.add(display);
    }

    /**
     * Unregisters a display from the observer list.
     * @param display the display to unregister
     */
    public void removeDisplay(WeatherDisplay display) {
        displays.remove(display);
    }

    /**
     * Sets the new temperature and notifies all registered displays.
     * @param temperature the updated temperature
     */
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyDisplays();
    }

    /**
     * Notifies all registered displays of the current temperature.
     */
    private void notifyDisplays() {
        for (WeatherDisplay display : displays) {
            display.update(temperature);
        }
    }
}
