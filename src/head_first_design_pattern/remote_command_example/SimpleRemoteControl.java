package head_first_design_pattern.remote_command_example;

public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command){
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
