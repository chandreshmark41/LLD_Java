package head_first_design_pattern.duck_example.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm Flying with Wings!");
    }
}
