package design_patterns.creational.prototype;

public abstract class Vehicle implements Cloneable {

    private String engine;
    private String model;

    private int price;


    public Vehicle(String engine, String model, int price){
        this.engine = engine;
        this.model = model;
        this.price = price;
    }

    protected Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle) super.clone();
    }


    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
