package head_first_design_pattern.remote_command_example.example2.receivers;

public class Light {

    private String lightName;

    public Light(String lightName) {
        this.lightName = lightName;
    }


    public void on(){
        System.out.println(lightName + " Light turned On");
    }

    public void off(){
        System.out.println( lightName + " Light turned Off");
    }
}
