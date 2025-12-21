package structural.adapter.time;

public class Client {
    private final ITimeProvider timeProvider;

    public Client(ITimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public void generate() {
        System.out.println("Generated at: " + timeProvider.now());
    }
}
