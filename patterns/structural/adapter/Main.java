package structural.adapter;

import structural.adapter.time.ReportClient;
import structural.adapter.time.ITimeProvider;
import structural.adapter.time.LegacyClock;
import structural.adapter.time.LegacyClockAdapter;

public class Main {
    public static void main(String[] args) {
        ITimeProvider timeProvider = new LegacyClockAdapter(new LegacyClock());

        new ReportClient(timeProvider).generate();
    }
}
