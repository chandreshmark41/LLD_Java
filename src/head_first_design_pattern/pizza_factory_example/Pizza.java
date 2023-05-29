package head_first_design_pattern.pizza_factory_example;

import head_first_design_pattern.pizza_decorator_example.toppings.Capsicum;
import head_first_design_pattern.pizza_factory_example.ingredients.crust.Crust;
import head_first_design_pattern.pizza_factory_example.ingredients.paneer.Paneer;
import head_first_design_pattern.pizza_factory_example.ingredients.tomato.Tomato;

public abstract class Pizza {

    private Crust crust;
    private Tomato tomato;
    private Paneer paneer;
    private Capsicum capsicum;

}
