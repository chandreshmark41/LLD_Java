package design_patterns.creational.factory;

public class Sea implements InternationalTravelModes{

    @Override
    public void book_ticket() {
        System.out.println("Sea ticket Booked");
    }
}
