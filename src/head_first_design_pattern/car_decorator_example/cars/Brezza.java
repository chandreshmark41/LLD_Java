package head_first_design_pattern.car_decorator_example.cars;

public class Brezza implements  Car{

    @Override
    public int getPrice() {
        System.out.println("Base price of Brezza is 800000");
        return 800000;
    }

}
