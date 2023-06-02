package head_first_design_pattern.remote_command_example.example2.commands;

import head_first_design_pattern.remote_command_example.example2.receivers.Stereo;

public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);

    }
}
