package design_patterns.creational.factory;

public class Train implements DomesticTravelModes{

    @Override
    public void book_ticket() {
        System.out.println("Train ticket booked");
    }
}
