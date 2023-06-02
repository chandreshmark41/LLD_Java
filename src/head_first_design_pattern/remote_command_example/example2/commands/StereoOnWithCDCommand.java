package head_first_design_pattern.remote_command_example.example2.commands;

import head_first_design_pattern.remote_command_example.example2.receivers.Stereo;

public class StereoOnWithCDCommand implements Command{
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);

    }

    @Override
    public void undo() {
        stereo.off();
    }
}
