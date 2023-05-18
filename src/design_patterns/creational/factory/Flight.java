package design_patterns.creational.factory;

public class Flight implements DomesticTravelModes, InternationalTravelModes {

    @Override
    public void book_ticket() {
        System.out.println("Flight ticket has been booked");
    }
}
