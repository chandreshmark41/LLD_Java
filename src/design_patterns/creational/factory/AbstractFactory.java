package design_patterns.creational.factory;

public class AbstractFactory {

    TravelFactory select_travel_type(String typeOfTravel){
        if(typeOfTravel.equals("DOM")){
            return new DomesticTravelFactory();
        }

        return new InternationalTravelFactory();
    }
}
