package head_first_design_pattern.duck_adapter_example.adapter;

import head_first_design_pattern.duck_adapter_example.duck.Duck;
import head_first_design_pattern.duck_adapter_example.turkey.Turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i<5; i++) { // Turkey flies short distance so it would need to call fly five times
            turkey.fly();
        }
    }
}
