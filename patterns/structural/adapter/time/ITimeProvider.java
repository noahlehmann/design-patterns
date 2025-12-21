package structural.adapter.time;

import java.time.Instant;

public interface ITimeProvider {
    Instant now();
}
