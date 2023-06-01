package head_first_design_pattern.remote_command_example.example2;

import head_first_design_pattern.remote_command_example.example2.LightOffCommand;
import head_first_design_pattern.remote_command_example.example2.receivers.Light;
import head_first_design_pattern.remote_command_example.example2.receivers.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo livingRoomStereo = new Stereo("Living Room");
        Stereo kitchenStereo = new Stereo("Kitchen");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);

        System.out.println(remoteControl);


        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        //System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(1);
        //System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

    }
}
