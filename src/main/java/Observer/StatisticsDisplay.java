package Observer;

/**
 * StatisticsDisplay class implements the WeatherDisplay interface.
 * It displays statistics such as the average temperature.
 */
public class StatisticsDisplay implements WeatherDisplay {
    private float totalTemperature;
    private int readings;

    @Override
    public void update(float temperature) {
        totalTemperature += temperature;
        readings++;
        display();
    }

    /**
     * Displays the average temperature based on recorded readings.
     */
    public void display() {
        System.out.println("Average temperature: " + (totalTemperature / readings) + " degrees");
    }
}
