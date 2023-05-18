package design_patterns.creational.factory;

public class InternationalTravelFactory implements TravelFactory {

    @Override
    public InternationalTravelModes select_travel_mode(String modeOfTravel){
        if(modeOfTravel.equals("Flight")){
            return new Flight();
        }
        return new Sea();
    }
}
