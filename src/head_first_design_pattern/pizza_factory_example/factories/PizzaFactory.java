package head_first_design_pattern.pizza_factory_example.factories;

import head_first_design_pattern.pizza_factory_example.ingredients.capsicum.Capsicum;
import head_first_design_pattern.pizza_factory_example.ingredients.crust.Crust;
import head_first_design_pattern.pizza_factory_example.ingredients.paneer.Paneer;
import head_first_design_pattern.pizza_factory_example.ingredients.tomato.Tomato;

public interface PizzaFactory {
    Crust createCrust();
    Tomato createTomato();
    Paneer createPaneer();
    Capsicum createCapsicum();

}
