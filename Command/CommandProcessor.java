package Command;

import java.util.Stack;

public class CommandProcessor {
    private Stack<Command> executed = new Stack<Command>();
    private Stack<Command> undone = new Stack<Command>();

    public void executeCommand(Command pCommand){
        assert pCommand != null;
        pCommand.execute();
        executed.push(pCommand);
    }

    public void undoLastCommand(){
        assert !executed.isEmpty();
        Command command = executed.pop();
        command.undo();
        undone.push(command);
    }

    public void redoCommand(){
        assert !undone.isEmpty();
        Command command = undone.pop();
        this.executeCommand(command);
    }
}
