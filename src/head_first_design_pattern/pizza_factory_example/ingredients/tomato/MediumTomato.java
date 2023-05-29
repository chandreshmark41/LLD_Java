package head_first_design_pattern.pizza_factory_example.ingredients.tomato;

public class MediumTomato implements Tomato{
    @Override
    public void add() {
        System.out.println("Medium Tomato Added : 70 Rupees");
    }
}
