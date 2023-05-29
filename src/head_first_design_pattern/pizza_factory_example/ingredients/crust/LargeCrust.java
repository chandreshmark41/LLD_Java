package head_first_design_pattern.pizza_factory_example.ingredients.crust;

public class LargeCrust implements Crust {
    @Override
    public void add() {
        System.out.println("Large Crust Added : 105 Rupees");
    }
}
