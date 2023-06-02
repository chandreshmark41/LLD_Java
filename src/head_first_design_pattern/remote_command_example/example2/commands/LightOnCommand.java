package head_first_design_pattern.remote_command_example.example2.commands;

import head_first_design_pattern.remote_command_example.example2.receivers.Light;

public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
