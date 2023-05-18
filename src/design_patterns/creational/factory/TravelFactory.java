package design_patterns.creational.factory;

public interface TravelFactory {

    TravelModes select_travel_mode(String modeOfTravel);
}
