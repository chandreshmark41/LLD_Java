package head_first_design_pattern.pizza_factory_example.ingredients.tomato;

public class RegularTomato implements Tomato{

    @Override
    public void add() {
        System.out.println("Regular Tomato Added : 35 Rupees");
    }
}
