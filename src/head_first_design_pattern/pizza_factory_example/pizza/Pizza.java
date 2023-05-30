package head_first_design_pattern.pizza_factory_example.pizza;

import head_first_design_pattern.pizza_decorator_example.toppings.Capsicum;
import head_first_design_pattern.pizza_factory_example.ingredients.crust.Crust;
import head_first_design_pattern.pizza_factory_example.ingredients.paneer.Paneer;
import head_first_design_pattern.pizza_factory_example.ingredients.tomato.Tomato;

public abstract class Pizza {

    private Crust crust;
    private Tomato tomato;
    private Paneer paneer;
    private Capsicum capsicum;

    public abstract void prepare();
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
