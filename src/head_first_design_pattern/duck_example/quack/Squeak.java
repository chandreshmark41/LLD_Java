package head_first_design_pattern.duck_example.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
