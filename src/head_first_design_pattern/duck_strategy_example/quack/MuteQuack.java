package head_first_design_pattern.duck_strategy_example.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
