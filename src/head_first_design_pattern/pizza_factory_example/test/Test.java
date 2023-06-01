package head_first_design_pattern.pizza_factory_example.test;

import head_first_design_pattern.pizza_factory_example.factories.PizzaFactory;
import head_first_design_pattern.pizza_factory_example.factories.RegularPizzaFactory;
import head_first_design_pattern.pizza_factory_example.pizza.PaneerCapsicumPizza;
import head_first_design_pattern.pizza_factory_example.pizza.Pizza;

public class Test {

    public static void main(String[] args){

        PizzaFactory pizzaFactory = new RegularPizzaFactory();
        Pizza pizza =  new PaneerCapsicumPizza(pizzaFactory);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }
}
