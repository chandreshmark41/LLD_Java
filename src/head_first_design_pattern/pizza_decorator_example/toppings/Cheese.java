package head_first_design_pattern.pizza_decorator_example.toppings;

import head_first_design_pattern.pizza_decorator_example.pizza.Pizza;

public class Cheese extends ToppingsDecorator{

    Pizza basePizza;

    public Cheese(Pizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + toppingCost();
    }

    @Override
    public int toppingCost() {
        System.out.println("Extra Cheese : 35");
        return 35;
    }
}
