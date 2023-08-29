package head_first_design_pattern.car_decorator_example.accessories;

import head_first_design_pattern.car_decorator_example.cars.Car;

public class InteriorPack implements  AccessoriesDecorator{

    Car car;

    public  InteriorPack(Car car){
        this.car = car;
    }


    @Override
    public int getAccessoryCost() {
        System.out.println("Interior Pack's cost is : 15000");
        return 15000;
    }

    @Override
    public int getPrice() {
        return this.getAccessoryCost() + car.getPrice();
    }
}
