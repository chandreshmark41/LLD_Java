package head_first_design_pattern.pizza_decorator_example.pizza;

public class Veg extends Pizza{

    @Override
    public int getCost() {
        System.out.println("Veg : 100");
        System.out.println("-------Toppings--------");
        return 150;
    }
}
