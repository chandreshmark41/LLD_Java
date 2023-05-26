package head_first_design_pattern.pizza_decorator_example.toppings;

import head_first_design_pattern.pizza_decorator_example.pizza.Pizza;

public class Capsicum extends ToppingsDecorator{

    Pizza basePizza;

    public Capsicum(Pizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost() + toppingCost();
    }

    @Override
    public int toppingCost() {
        return 35;
    }
}
