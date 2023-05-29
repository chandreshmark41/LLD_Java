package head_first_design_pattern.pizza_factory_example.ingredients.tomato;

public class LargeTomato implements Tomato{
    @Override
    public void add() {
        System.out.println("Large Tomato Added : 105 Rupees");
    }
}
