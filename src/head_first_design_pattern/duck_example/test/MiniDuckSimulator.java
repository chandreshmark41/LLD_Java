package head_first_design_pattern.duck_example.test;

import head_first_design_pattern.duck_example.Duck;
import head_first_design_pattern.duck_example.MallardDuck;
import head_first_design_pattern.duck_example.ModelDuck;
import head_first_design_pattern.duck_example.fly.FlyNoWay;
import head_first_design_pattern.duck_example.fly.FlyWithWings;

public class MiniDuckSimulator {
        public static void main(String[] args){
//            Duck mallard = new MallardDuck();
//            mallard.performQuack();
//            mallard.performFly();

            Duck model = new ModelDuck();
            model.performFly();
            model.setFlyBehavior(new FlyWithWings());
            model.performFly();
            model.setFlyBehavior(new FlyNoWay());
            model.performFly();
        }

}
