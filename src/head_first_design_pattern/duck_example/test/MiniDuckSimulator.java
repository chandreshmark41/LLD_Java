package head_first_design_pattern.duck_example.test;

import head_first_design_pattern.duck_example.Duck;
import head_first_design_pattern.duck_example.MallardDuck;

public class MiniDuckSimulator {
        public static void main(String[] args){
            Duck mallard = new MallardDuck();
            mallard.performQuack();
            mallard.performFly();
        }

}
