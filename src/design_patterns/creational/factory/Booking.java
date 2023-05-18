package design_patterns.creational.factory;

public class Booking {

    public static void main(String a[]){
//        DomesticTravelFactory domesticTravelFactory = new DomesticTravelFactory();
//        domesticTravelFactory.select_travel_mode("Bus").book_ticket();
        AbstractFactory abstractFactory = new AbstractFactory();
        abstractFactory.select_travel_type("Int").select_travel_mode("Flight").book_ticket();
    }
}
