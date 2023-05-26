package head_first_design_pattern.pizza_decorator_example.pizza;

public class Margerita extends Pizza{

    @Override
    public int getCost() {
        System.out.println("Margarita : 100");
        System.out.println("-------Toppings--------");
        return 100;
    }
}
