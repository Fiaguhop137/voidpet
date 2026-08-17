package E5;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G5.b f2704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f2706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f2707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f2708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f2709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f2710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f2711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f2712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2714k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2715l;

    public c(G5.b frameScheduler) {
        Intrinsics.checkNotNullParameter(frameScheduler, "frameScheduler");
        this.f2704a = frameScheduler;
        this.f2706c = 8L;
        this.f2713j = -1;
        this.f2714k = -1;
    }

    private final long d() {
        return SystemClock.uptimeMillis();
    }

    public final int a() {
        long jD = this.f2705b ? (d() - this.f2709f) + this.f2707d : Math.max(this.f2711h, 0L);
        int iB = this.f2704a.b(jD, this.f2711h);
        this.f2711h = jD;
        return iB;
    }

    public final boolean b() {
        return this.f2705b;
    }

    public final long c() {
        if (!this.f2705b) {
            return -1L;
        }
        long jA = this.f2704a.a(d() - this.f2709f);
        if (jA == -1) {
            this.f2705b = false;
            return -1L;
        }
        long j10 = jA + this.f2706c;
        this.f2710g = this.f2709f + j10;
        return j10;
    }

    public final void e() {
        this.f2715l++;
    }

    public final void f(int i10) {
        this.f2713j = i10;
    }

    public final void g(boolean z10) {
        this.f2705b = z10;
    }

    public final boolean h() {
        return this.f2713j != -1 && d() >= this.f2710g;
    }

    public final void i() {
        if (this.f2705b) {
            return;
        }
        long jD = d();
        long j10 = jD - this.f2708e;
        this.f2709f = j10;
        this.f2710g = j10;
        this.f2711h = jD - this.f2712i;
        this.f2713j = this.f2714k;
        this.f2705b = true;
    }

    public final void j() {
        if (this.f2705b) {
            long jD = d();
            this.f2708e = jD - this.f2709f;
            this.f2712i = jD - this.f2711h;
            this.f2709f = 0L;
            this.f2710g = 0L;
            this.f2711h = -1L;
            this.f2713j = -1;
            this.f2705b = false;
        }
    }
}
