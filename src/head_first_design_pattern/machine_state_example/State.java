package head_first_design_pattern.machine_state_example;

public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

}
