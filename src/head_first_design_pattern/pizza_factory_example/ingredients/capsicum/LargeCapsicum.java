package head_first_design_pattern.pizza_factory_example.ingredients.capsicum;

public class LargeCapsicum implements Capsicum {
    @Override
    public void add() {
        System.out.println("Large Capsicum Added : 105 Rupees");
    }
}
