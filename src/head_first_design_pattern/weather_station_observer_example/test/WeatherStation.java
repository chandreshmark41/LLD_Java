package head_first_design_pattern.weather_station_observer_example.test;

import head_first_design_pattern.weather_station_observer_example.observers.CurrentConditionsDisplay;
import head_first_design_pattern.weather_station_observer_example.subject.WeatherData;

import javax.swing.plaf.ColorUIResource;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(89, 65, 30.4f);
    }
}
