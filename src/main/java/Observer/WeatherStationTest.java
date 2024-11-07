package Observer;

public class WeatherStationTest {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        // Register displays to the weather station
        station.registerDisplay(currentDisplay);
        station.registerDisplay(statisticsDisplay);
        station.registerDisplay(forecastDisplay);

        // Simulate temperature updates
        station.setTemperature(25.3f);
        station.setTemperature(26.7f);
        station.setTemperature(24.1f);
    }
}
