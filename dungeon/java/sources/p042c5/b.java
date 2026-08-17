package p042c5;

import V4.d;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    @d
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @d
    long nowNanos();
}
