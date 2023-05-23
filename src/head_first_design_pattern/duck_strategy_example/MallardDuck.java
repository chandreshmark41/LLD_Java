package head_first_design_pattern.duck_strategy_example;

import head_first_design_pattern.duck_strategy_example.fly.FlyWithWings;
import head_first_design_pattern.duck_strategy_example.quack.Quack;

public class MallardDuck extends  Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck");
    }
}
