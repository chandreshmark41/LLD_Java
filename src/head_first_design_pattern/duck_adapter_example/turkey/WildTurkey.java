package head_first_design_pattern.duck_adapter_example.turkey;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Wild Turkey is gobbling");
    }

    @Override
    public void fly() {
        System.out.println("Wild Turkey flying is a short distance");

    }
}
