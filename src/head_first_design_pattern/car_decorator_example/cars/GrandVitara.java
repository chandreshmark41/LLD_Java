package head_first_design_pattern.car_decorator_example.cars;

public class GrandVitara implements Car {

    @Override
    public int getPrice() {
        System.out.println("Base price of Grand Vitara is 1000000");
        return 1000000;
    }
}
