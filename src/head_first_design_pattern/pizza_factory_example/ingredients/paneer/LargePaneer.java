package head_first_design_pattern.pizza_factory_example.ingredients.paneer;

public class LargePaneer implements Paneer {
    @Override
    public void add() {
        System.out.println("Large Paneer Added : 105 Rupees");
    }
}
