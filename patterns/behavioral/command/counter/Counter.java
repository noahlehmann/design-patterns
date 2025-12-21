package behavioral.command.counter;

public class Counter {
    private int value = 0;

    public void increment() { value++; }
    public void decrement() { value--; }

    public int getValue() { return value; }
}
