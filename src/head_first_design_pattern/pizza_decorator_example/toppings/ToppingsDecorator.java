package head_first_design_pattern.pizza_decorator_example.toppings;

import head_first_design_pattern.pizza_decorator_example.pizza.Pizza;

public abstract class ToppingsDecorator extends Pizza {

    public abstract int toppingCost();

}
