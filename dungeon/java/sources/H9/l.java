package H9;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {
    public static l a(long j10, long j11, long j12) {
        return new a(j10, j11, j12);
    }

    public static l e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
