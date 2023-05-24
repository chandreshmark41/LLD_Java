package head_first_design_pattern.weather_station_built_in_observer_example.test;

import head_first_design_pattern.weather_station_built_in_observer_example.observables.WeatherData;
import head_first_design_pattern.weather_station_built_in_observer_example.observers.CurrentConditionsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,70,40);
    }
}
