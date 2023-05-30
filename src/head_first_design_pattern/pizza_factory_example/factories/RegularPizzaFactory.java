package head_first_design_pattern.pizza_factory_example.factories;

import head_first_design_pattern.pizza_factory_example.ingredients.capsicum.Capsicum;
import head_first_design_pattern.pizza_factory_example.ingredients.capsicum.RegularCapsicum;
import head_first_design_pattern.pizza_factory_example.ingredients.crust.Crust;
import head_first_design_pattern.pizza_factory_example.ingredients.crust.RegularCrust;
import head_first_design_pattern.pizza_factory_example.ingredients.paneer.Paneer;
import head_first_design_pattern.pizza_factory_example.ingredients.paneer.RegularPaneer;
import head_first_design_pattern.pizza_factory_example.ingredients.tomato.RegularTomato;
import head_first_design_pattern.pizza_factory_example.ingredients.tomato.Tomato;

public class RegularPizzaFactory implements PizzaFactory{
    @Override
    public Crust createCrust() {

        return new RegularCrust();

    }

    @Override
    public Tomato createTomato() {
        return new RegularTomato();

    }

    @Override
    public Paneer createPaneer() {
        return new RegularPaneer();

    }

    @Override
    public Capsicum createCapsicum() {
        return new RegularCapsicum();

    }
}
