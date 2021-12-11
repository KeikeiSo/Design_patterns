package Command.Function_style;

public class Command {
    private final Runnable aCommand;

    public Command(Runnable pCommand){
        aCommand = pCommand;
    }

    public void execute(){
        aCommand.run();
    }
}
