package head_first_design_pattern.duck_example.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't Fly");
    }
}
