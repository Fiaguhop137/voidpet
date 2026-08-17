package p312r6;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f52420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f52421b;

    static {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        f52420a = timeUnit.convert(20L, TimeUnit.MILLISECONDS);
        f52421b = timeUnit.convert(3L, TimeUnit.SECONDS);
    }
}
