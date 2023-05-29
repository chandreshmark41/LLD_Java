package head_first_design_pattern.pizza_factory_example.ingredients.paneer;

public class RegularPaneer implements Paneer {

    @Override
    public void add() {
        System.out.println("Regular Paneer Added : 35 Rupees");
    }
}
