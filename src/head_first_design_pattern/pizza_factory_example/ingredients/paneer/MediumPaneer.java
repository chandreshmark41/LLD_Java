package head_first_design_pattern.pizza_factory_example.ingredients.paneer;

public class MediumPaneer implements Paneer {
    @Override
    public void add() {
        System.out.println("Medium Paneer Added : 70 Rupees");
    }
}
