package head_first_design_pattern.pizza_decorator_example.test;

import head_first_design_pattern.pizza_decorator_example.pizza.Paneer;
import head_first_design_pattern.pizza_decorator_example.pizza.Pizza;
import head_first_design_pattern.pizza_decorator_example.toppings.Capsicum;
import head_first_design_pattern.pizza_decorator_example.toppings.Cheese;
import head_first_design_pattern.pizza_decorator_example.toppings.Tomato;

public class Test {

    public static void main(String[] args) {

        Pizza myPizza = new Tomato(new Capsicum( new Cheese( new Paneer() ) ) );
        int TotalCost = myPizza.getCost();
        System.out.println("-------------------");

        System.out.println("Total Cost : " + TotalCost);
    }
}
