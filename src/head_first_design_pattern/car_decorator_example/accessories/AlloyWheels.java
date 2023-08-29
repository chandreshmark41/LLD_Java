package head_first_design_pattern.car_decorator_example.accessories;

import head_first_design_pattern.car_decorator_example.cars.Car;

public class AlloyWheels implements  AccessoriesDecorator{

    Car car;

    public  AlloyWheels(Car car){
        this.car = car;
    }



    @Override
    public int getAccessoryCost() {
        System.out.println("Allow Wheels cost is : 40000");
        return 40000;
    }

    @Override
    public int getPrice() {
        return this.getAccessoryCost() + car.getPrice();
    }
}
