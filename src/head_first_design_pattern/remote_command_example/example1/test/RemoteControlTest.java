package head_first_design_pattern.remote_command_example.example1.test;

import head_first_design_pattern.remote_command_example.example1.Light;
import head_first_design_pattern.remote_command_example.example1.LightOnCommand;
import head_first_design_pattern.remote_command_example.example1.SimpleRemoteControl;

public class RemoteControlTest {

    public static void main(String[] args){
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
