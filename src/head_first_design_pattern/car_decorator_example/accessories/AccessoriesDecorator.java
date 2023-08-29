package head_first_design_pattern.car_decorator_example.accessories;

import head_first_design_pattern.car_decorator_example.cars.Car;

public interface AccessoriesDecorator extends Car {

    int getAccessoryCost();
}
