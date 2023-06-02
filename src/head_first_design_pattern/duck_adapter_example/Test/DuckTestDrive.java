package head_first_design_pattern.duck_adapter_example.Test;

import head_first_design_pattern.duck_adapter_example.adapter.DuckAdapter;
import head_first_design_pattern.duck_adapter_example.adapter.TurkeyAdapter;
import head_first_design_pattern.duck_adapter_example.duck.Duck;
import head_first_design_pattern.duck_adapter_example.duck.MallardDuck;
import head_first_design_pattern.duck_adapter_example.turkey.Turkey;
import head_first_design_pattern.duck_adapter_example.turkey.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The Turkey says ..");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n The Duck says .. ");
        testDuck(duck);

        System.out.println("\n The TurkeyAdapter says ... ");
        testDuck(turkeyAdapter);

        System.out.println("\n The DuckAdapter says .. ");
        testTurkey(duckAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
