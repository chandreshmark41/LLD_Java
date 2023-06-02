package head_first_design_pattern.duck_adapter_example.duck;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Duck is quacking");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
