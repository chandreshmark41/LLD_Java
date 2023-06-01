package head_first_design_pattern.remote_command_example.example2.receivers;

public class Stereo {

    private String stereoName;

    public Stereo(String stereoName) {
        this.stereoName = stereoName;
    }

    public void on() {
        System.out.println(stereoName + " " +  "Stereo turned On");
    }

    public void off() {
        System.out.println(stereoName + " " +"Stereo turned Off");
    }

    public void setCd() {
        System.out.println(stereoName + " " +"Stereo set CD");
    }

    public void setDvd() {
        System.out.println(stereoName + " " +"Stereo set DVD");
    }

    public void setRadio() {
        System.out.println(stereoName + " " +"Stereo set Radio");
    }

    public void setVolume(int volume){
        System.out.println(stereoName + " " +"Volume has been set to "+ volume);
    }

}
