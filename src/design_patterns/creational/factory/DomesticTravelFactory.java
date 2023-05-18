package design_patterns.creational.factory;

public class DomesticTravelFactory implements TravelFactory {

    @Override
    public DomesticTravelModes select_travel_mode(String modeOfTravel){
        if(modeOfTravel.equals("Flight")){
            return new Flight();
        }
        if(modeOfTravel.equals("Train")){
            return new Train();
        }
        return new Bus();
    }
}
