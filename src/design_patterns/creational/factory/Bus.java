package design_patterns.creational.factory;

public class Bus implements DomesticTravelModes{

    @Override
    public void book_ticket() {
        System.out.println("Bus ticket Booked");
    }
}
