package design_patterns.creational.prototype;

public class Bike extends Vehicle{

    private boolean isElectric;

    public Bike(String engine, String model, int price, boolean isElectric){
        super(engine,model,price);
        this.isElectric = isElectric;
    }
}
