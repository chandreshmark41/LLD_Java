package head_first_design_pattern.pizza_decorator_example.pizza;

public class Paneer extends Pizza{

    @Override
    public int getCost() {
        System.out.println("Paneer : 150");
        System.out.println("-------Toppings--------");
        return 150;
    }
}
