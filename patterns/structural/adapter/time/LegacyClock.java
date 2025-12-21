package structural.adapter.time;

import java.util.Date;

public class LegacyClock {
    public Date getCurrentTime() {
        return new Date();
    }
}
