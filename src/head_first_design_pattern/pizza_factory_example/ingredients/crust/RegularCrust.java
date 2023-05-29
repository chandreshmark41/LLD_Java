package head_first_design_pattern.pizza_factory_example.ingredients.crust;

public class RegularCrust implements Crust {

    @Override
    public void add() {
        System.out.println("Regular Crust Added : 35 Rupees");
    }
}
