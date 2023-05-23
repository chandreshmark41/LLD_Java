package head_first_design_pattern.weather_station_observer_example;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
