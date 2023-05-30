package head_first_design_pattern.pizza_factory_example.pizza;

import head_first_design_pattern.pizza_factory_example.PizzaFactory;

public class PaneerCapsicumPizza extends Pizza{

    PizzaFactory pizzaFactory;

    public PaneerCapsicumPizza(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Paneer Capsicum Pizza");
        pizzaFactory.createCrust().add();
        pizzaFactory.createPaneer().add();
        pizzaFactory.createCapsicum().add();
        System.out.println("All Ingredients are Added");
    }
}
