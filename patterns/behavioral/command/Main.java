package behavioral.command;

import behavioral.command.counter.Counter;
import behavioral.command.counter.IncrementCommand;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CommandManager manager = new CommandManager();

        manager.execute(new IncrementCommand(counter)); // 1
        manager.execute(new IncrementCommand(counter)); // 2

        manager.undo();

        System.out.println(counter.getValue()); // 1
    }
}
