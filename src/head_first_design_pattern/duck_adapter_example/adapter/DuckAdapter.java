package head_first_design_pattern.duck_adapter_example.adapter;

import head_first_design_pattern.duck_adapter_example.duck.Duck;
import head_first_design_pattern.duck_adapter_example.turkey.Turkey;

public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
