package head_first_design_pattern.machine_state_example;

import head_first_design_pattern.machine_state_example.states.HasQuarterState;
import head_first_design_pattern.machine_state_example.states.NoQuarterState;
import head_first_design_pattern.machine_state_example.states.SoldOutState;
import head_first_design_pattern.machine_state_example.states.SoldState;

public class GumballMachine {



    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    public State getWinnerState() {
        return winnerState;
    }

    State winnerState;

    int count = 0;

    State state = soldOutState;


    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;

        if(numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void setState(State state){
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ...");
        if(count != 0) {
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }
}
