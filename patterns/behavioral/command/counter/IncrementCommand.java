package behavioral.command.counter;

import behavioral.command.ICommand;

public class IncrementCommand implements ICommand {
    private final Counter counter;

    public IncrementCommand(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void execute() {
        counter.increment();
    }

    @Override
    public void undo() {
        counter.decrement();
    }
}
