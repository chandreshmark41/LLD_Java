package head_first_design_pattern.weather_station_observer_example.subject;

import head_first_design_pattern.weather_station_observer_example.Observer;

public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
