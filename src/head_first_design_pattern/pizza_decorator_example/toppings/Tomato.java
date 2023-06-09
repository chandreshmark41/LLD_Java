package head_first_design_pattern.pizza_decorator_example.toppings;


import head_first_design_pattern.pizza_decorator_example.pizza.Pizza;

public class Tomato extends ToppingsDecorator{

    Pizza basePizza;

    public Tomato(Pizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + toppingCost();
    }

    @Override
    public int toppingCost() {
        System.out.println("Tomato : 35");
        return 35;
    }
}
