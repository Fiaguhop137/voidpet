package p216m0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p019b0.e;

/* JADX INFO: renamed from: m0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3981d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f48857c;

    private C3981d(long j10, long j11) {
        this.f48855a = j10;
        this.f48856b = j11;
        this.f48857c = e.f25805b.c();
    }

    private C3981d(long j10, long j11, long j12) {
        this(j10, j11, (DefaultConstructorMarker) null);
        this.f48857c = j12;
    }

    public /* synthetic */ C3981d(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    public /* synthetic */ C3981d(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public final long a() {
        return this.f48857c;
    }

    public final long b() {
        return this.f48856b;
    }

    public final long c() {
        return this.f48855a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f48855a + ", position=" + ((Object) e.s(this.f48856b)) + ')';
    }
}
