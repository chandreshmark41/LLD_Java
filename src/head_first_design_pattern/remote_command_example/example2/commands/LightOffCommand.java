package head_first_design_pattern.remote_command_example.example2.commands;

import head_first_design_pattern.remote_command_example.example2.receivers.Light;

public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
