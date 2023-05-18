package design_patterns.creational.prototype;

public class Car extends Vehicle{

    private boolean automatic;
    private boolean isDiesel;

    public Car(String engine, String model, int price, boolean automatic, boolean isDiesel){
        super(engine,model,price);
        this.automatic = automatic;
        this.isDiesel = isDiesel;
    }

    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
