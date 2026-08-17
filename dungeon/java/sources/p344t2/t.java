package p344t2;

import U1.AbstractC1459a;
import U1.InterfaceC1466h;
import U1.S;
import android.content.Context;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f54375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f54376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f54378d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f54381g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f54384j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f54387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f54388n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f54389o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f54379e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f54380f = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f54382h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f54383i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f54385k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC1466h f54386l = InterfaceC1466h.f12906a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f54390a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f54391b = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f54390a = -9223372036854775807L;
            this.f54391b = -9223372036854775807L;
        }

        public long f() {
            return this.f54390a;
        }

        public long g() {
            return this.f54391b;
        }
    }

    public interface b {
        boolean J(long j10, long j11, boolean z10);

        boolean x(long j10, long j11);

        boolean z(long j10, long j11, long j12, boolean z10, boolean z11);
    }

    public t(Context context, b bVar, long j10) {
        this.f54375a = bVar;
        this.f54377c = j10;
        this.f54376b = new w(context);
    }

    private long b(long j10, long j11, long j12) {
        long j13 = (long) ((j12 - j10) / ((double) this.f54385k));
        return this.f54378d ? j13 - (S.M0(this.f54386l.c()) - j11) : j13;
    }

    private void f(int i10) {
        this.f54379e = Math.min(this.f54379e, i10);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[RETURN] */
    private boolean q(long j10, long j11, long j12) {
        if (this.f54383i != -9223372036854775807L && !this.f54384j) {
            return false;
        }
        int i10 = this.f54379e;
        if (i10 == 0) {
            return this.f54378d;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return j10 >= j12;
        }
        if (i10 != 3) {
            throw new IllegalStateException();
        }
        long jM0 = S.M0(this.f54386l.c()) - this.f54381g;
        if (this.f54378d) {
            if (!this.f54389o) {
                long j13 = this.f54380f;
                if (j13 != -9223372036854775807L && j13 != j10) {
                    if (this.f54375a.x(j11, jM0)) {
                        return true;
                    }
                }
            } else if (this.f54375a.x(j11, jM0)) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (this.f54379e == 0) {
            this.f54379e = 1;
        }
    }

    public int c(long j10, long j11, long j12, long j13, boolean z10, boolean z11, a aVar) {
        aVar.h();
        if (this.f54378d && this.f54380f == -9223372036854775807L) {
            this.f54380f = j11;
        }
        if (this.f54382h != j10) {
            this.f54376b.h(j10);
            this.f54382h = j10;
        }
        aVar.f54390a = b(j11, j12, j10);
        if (z10 && !z11) {
            return 3;
        }
        if (!this.f54387m) {
            this.f54388n = true;
            if (this.f54375a.z(aVar.f54390a, j11, j12, z11, true)) {
                return 4;
            }
            return (!this.f54378d || aVar.f54390a >= 30000) ? 5 : 3;
        }
        if (q(j11, aVar.f54390a, j13)) {
            return 0;
        }
        if (!this.f54378d || j11 == this.f54380f) {
            return 5;
        }
        long jB = this.f54386l.b();
        aVar.f54391b = this.f54376b.b((aVar.f54390a * 1000) + jB);
        aVar.f54390a = (aVar.f54391b - jB) / 1000;
        boolean z12 = (this.f54383i == -9223372036854775807L || this.f54384j) ? false : true;
        if (this.f54375a.z(aVar.f54390a, j11, j12, z11, z12)) {
            return 4;
        }
        if (this.f54375a.J(aVar.f54390a, j12, z11)) {
            return z12 ? 3 : 2;
        }
        return aVar.f54390a > 50000 ? 5 : 1;
    }

    public boolean d(boolean z10) {
        if (z10 && (this.f54379e == 3 || (!this.f54387m && this.f54388n))) {
            this.f54383i = -9223372036854775807L;
            return true;
        }
        if (this.f54383i == -9223372036854775807L) {
            return false;
        }
        if (this.f54386l.c() < this.f54383i) {
            return true;
        }
        this.f54383i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z10) {
        this.f54384j = z10;
        this.f54383i = this.f54377c > 0 ? this.f54386l.c() + this.f54377c : -9223372036854775807L;
    }

    public boolean g() {
        boolean z10 = this.f54379e != 3;
        this.f54379e = 3;
        this.f54381g = S.M0(this.f54386l.c());
        return z10;
    }

    public void h() {
        this.f54378d = true;
        this.f54381g = S.M0(this.f54386l.c());
        this.f54376b.k();
    }

    public void i() {
        this.f54378d = false;
        this.f54383i = -9223372036854775807L;
        this.f54376b.l();
    }

    public void j(int i10) {
        if (i10 == 0) {
            this.f54379e = 1;
        } else if (i10 == 1) {
            this.f54379e = 0;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            f(2);
        }
    }

    public void k() {
        this.f54376b.j();
        this.f54382h = -9223372036854775807L;
        this.f54380f = -9223372036854775807L;
        f(1);
        this.f54383i = -9223372036854775807L;
    }

    public void l(int i10) {
        this.f54376b.o(i10);
    }

    public void m(InterfaceC1466h interfaceC1466h) {
        this.f54386l = interfaceC1466h;
    }

    public void n(float f10) {
        this.f54376b.g(f10);
    }

    public void o(Surface surface) {
        this.f54387m = surface != null;
        this.f54388n = false;
        this.f54376b.m(surface);
        f(1);
    }

    public void p(float f10) {
        AbstractC1459a.a(f10 > 0.0f);
        if (f10 == this.f54385k) {
            return;
        }
        this.f54385k = f10;
        this.f54376b.i(f10);
    }
}
