package structural.adapter.time;

public class ReportClient {
    private final ITimeProvider timeProvider;

    public ReportClient(ITimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public void generate() {
        System.out.println("Generated at: " + timeProvider.now());
    }
}
