package structural.adapter.time;

import java.time.Instant;

public class LegacyClockAdapter implements ITimeProvider {
    private final LegacyClock clock;

    public LegacyClockAdapter(LegacyClock clock) {
        this.clock = clock;
    }

    @Override
    public Instant now() {
        return clock.getCurrentTime().toInstant();
    }
}
