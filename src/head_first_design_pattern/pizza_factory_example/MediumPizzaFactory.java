package head_first_design_pattern.pizza_factory_example;

import head_first_design_pattern.pizza_factory_example.ingredients.capsicum.Capsicum;
import head_first_design_pattern.pizza_factory_example.ingredients.capsicum.MediumCapsicum;
import head_first_design_pattern.pizza_factory_example.ingredients.capsicum.RegularCapsicum;
import head_first_design_pattern.pizza_factory_example.ingredients.crust.Crust;
import head_first_design_pattern.pizza_factory_example.ingredients.crust.MediumCrust;
import head_first_design_pattern.pizza_factory_example.ingredients.crust.RegularCrust;
import head_first_design_pattern.pizza_factory_example.ingredients.paneer.MediumPaneer;
import head_first_design_pattern.pizza_factory_example.ingredients.paneer.Paneer;
import head_first_design_pattern.pizza_factory_example.ingredients.paneer.RegularPaneer;
import head_first_design_pattern.pizza_factory_example.ingredients.tomato.MediumTomato;
import head_first_design_pattern.pizza_factory_example.ingredients.tomato.RegularTomato;
import head_first_design_pattern.pizza_factory_example.ingredients.tomato.Tomato;

public class MediumPizzaFactory implements PizzaFactory{

    @Override
    public Crust createCrust() {

        return new MediumCrust();

    }

    @Override
    public Tomato createTomato() {
        return new MediumTomato();

    }

    @Override
    public Paneer createPaneer() {
        return new MediumPaneer();

    }

    @Override
    public Capsicum createCapsicum() {
        return new MediumCapsicum();

    }
}
