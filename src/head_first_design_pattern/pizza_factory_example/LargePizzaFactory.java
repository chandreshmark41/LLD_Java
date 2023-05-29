package head_first_design_pattern.pizza_factory_example;

import head_first_design_pattern.pizza_factory_example.ingredients.capsicum.Capsicum;
import head_first_design_pattern.pizza_factory_example.ingredients.capsicum.LargeCapsicum;
import head_first_design_pattern.pizza_factory_example.ingredients.capsicum.MediumCapsicum;
import head_first_design_pattern.pizza_factory_example.ingredients.crust.Crust;
import head_first_design_pattern.pizza_factory_example.ingredients.crust.LargeCrust;
import head_first_design_pattern.pizza_factory_example.ingredients.crust.MediumCrust;
import head_first_design_pattern.pizza_factory_example.ingredients.paneer.LargePaneer;
import head_first_design_pattern.pizza_factory_example.ingredients.paneer.MediumPaneer;
import head_first_design_pattern.pizza_factory_example.ingredients.paneer.Paneer;
import head_first_design_pattern.pizza_factory_example.ingredients.tomato.LargeTomato;
import head_first_design_pattern.pizza_factory_example.ingredients.tomato.MediumTomato;
import head_first_design_pattern.pizza_factory_example.ingredients.tomato.Tomato;

public class LargePizzaFactory implements PizzaFactory{

    @Override
    public Crust createCrust() {

        return new LargeCrust();

    }

    @Override
    public Tomato createTomato() {
        return new LargeTomato();

    }

    @Override
    public Paneer createPaneer() {
        return new LargePaneer();

    }

    @Override
    public Capsicum createCapsicum() {
        return new LargeCapsicum();

    }
}
