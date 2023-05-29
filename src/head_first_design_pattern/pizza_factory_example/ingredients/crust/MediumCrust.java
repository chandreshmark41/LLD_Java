package head_first_design_pattern.pizza_factory_example.ingredients.crust;

public class MediumCrust implements Crust {
    @Override
    public void add() {
        System.out.println("Medium Crust Added : 70 Rupees");
    }
}
