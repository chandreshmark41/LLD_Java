package head_first_design_pattern.car_decorator_example;


import head_first_design_pattern.car_decorator_example.accessories.AlloyWheels;
import head_first_design_pattern.car_decorator_example.accessories.InteriorPack;
import head_first_design_pattern.car_decorator_example.cars.Car;
import head_first_design_pattern.car_decorator_example.cars.GrandVitara;

public class Test {

    public static void main(String[] args) {

        Car car =  new InteriorPack( new AlloyWheels( new GrandVitara()) )  ;
        System.out.println(car.getPrice());
    }
}
