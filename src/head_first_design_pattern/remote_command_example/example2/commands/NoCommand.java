package head_first_design_pattern.remote_command_example.example2.commands;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Slot is empty");
    }

    @Override
    public void undo() {
        System.out.println("Slot is empty");
    }
}
