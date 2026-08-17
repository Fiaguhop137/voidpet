package p088ef;

import p195kf.D;

/* JADX INFO: renamed from: ef.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3302o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D f40857a = new D("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final D f40858b = new D("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j10 * 1000000;
    }
}
