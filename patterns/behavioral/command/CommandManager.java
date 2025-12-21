package behavioral.command;

import java.util.Stack;

public class CommandManager {
    private final Stack<ICommand> history = new Stack<>();

    public void execute(ICommand command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            history.pop().undo();
        }
    }
}
