package head_first_design_pattern.car_decorator_example.cars;

public class Baleno implements Car{

    @Override
    public int getPrice() {
        System.out.println("Base price of Baleno is 700000");
        return 800000;
    }
}
