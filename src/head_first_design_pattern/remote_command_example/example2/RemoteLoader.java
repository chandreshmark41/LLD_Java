package head_first_design_pattern.remote_command_example.example2;

import head_first_design_pattern.remote_command_example.example2.commands.*;
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

        StereoOnWithCDCommand livingRoomStereoOn = new StereoOnWithCDCommand(livingRoomStereo);
        StereoOffCommand livingRoomStereoOff = new StereoOffCommand(livingRoomStereo);

        StereoOnWithCDCommand kitchenStereoOn = new StereoOnWithCDCommand(kitchenStereo);
        StereoOffCommand kitchenStereoOff = new StereoOffCommand(kitchenStereo);

        Command[] partyOn = {livingRoomLightOn, livingRoomStereoOn, kitchenLightOn, kitchenStereoOn};
        Command[] partyOff = {livingRoomLightOff, livingRoomStereoOff, kitchenLightOff, kitchenStereoOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOfMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(2, partyOnMacro, partyOfMacro);


//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.undoButtonWasPushed();
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();



    }
}
