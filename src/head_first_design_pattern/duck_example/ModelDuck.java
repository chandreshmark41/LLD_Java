package head_first_design_pattern.duck_example;

import head_first_design_pattern.duck_example.fly.FlyRocketPowered;
import head_first_design_pattern.duck_example.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyRocketPowered();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("This is Model Duck");
    }


}
