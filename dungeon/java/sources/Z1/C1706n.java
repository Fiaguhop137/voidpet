package Z1;

import U1.AbstractC1459a;
import U1.InterfaceC1466h;

/* JADX INFO: renamed from: Z1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1706n implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A1 f18373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f18374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t1 f18375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V0 f18376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18377e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18378f;

    /* JADX INFO: renamed from: Z1.n$a */
    public interface a {
        void q(R1.B b10);
    }

    public C1706n(a aVar, InterfaceC1466h interfaceC1466h) {
        this.f18374b = aVar;
        this.f18373a = new A1(interfaceC1466h);
    }

    private boolean f(boolean z10) {
        t1 t1Var = this.f18375c;
        if (t1Var == null || t1Var.b()) {
            return true;
        }
        if (z10 && this.f18375c.getState() != 2) {
            return true;
        }
        if (this.f18375c.f()) {
            return false;
        }
        return z10 || this.f18375c.i();
    }

    private void j(boolean z10) {
        if (f(z10)) {
            this.f18377e = true;
            if (this.f18378f) {
                this.f18373a.b();
                return;
            }
            return;
        }
        V0 v10 = (V0) AbstractC1459a.e(this.f18376d);
        long jH = v10.H();
        if (this.f18377e) {
            if (jH < this.f18373a.H()) {
                this.f18373a.e();
                return;
            } else {
                this.f18377e = false;
                if (this.f18378f) {
                    this.f18373a.b();
                }
            }
        }
        this.f18373a.a(jH);
        R1.B bC = v10.c();
        if (bC.equals(this.f18373a.c())) {
            return;
        }
        this.f18373a.d(bC);
        this.f18374b.q(bC);
    }

    @Override // Z1.V0
    public long H() {
        return this.f18377e ? this.f18373a.H() : ((V0) AbstractC1459a.e(this.f18376d)).H();
    }

    public void a(t1 t1Var) {
        if (t1Var == this.f18375c) {
            this.f18376d = null;
            this.f18375c = null;
            this.f18377e = true;
        }
    }

    public void b(t1 t1Var) throws P {
        V0 v10;
        V0 v0P = t1Var.P();
        if (v0P == null || v0P == (v10 = this.f18376d)) {
            return;
        }
        if (v10 != null) {
            throw P.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f18376d = v0P;
        this.f18375c = t1Var;
        v0P.d(this.f18373a.c());
    }

    @Override // Z1.V0
    public R1.B c() {
        V0 v10 = this.f18376d;
        return v10 != null ? v10.c() : this.f18373a.c();
    }

    @Override // Z1.V0
    public void d(R1.B b10) {
        V0 v10 = this.f18376d;
        if (v10 != null) {
            v10.d(b10);
            b10 = this.f18376d.c();
        }
        this.f18373a.d(b10);
    }

    public void e(long j10) {
        this.f18373a.a(j10);
    }

    public void g() {
        this.f18378f = true;
        this.f18373a.b();
    }

    public void h() {
        this.f18378f = false;
        this.f18373a.e();
    }

    public long i(boolean z10) {
        j(z10);
        return H();
    }

    @Override // Z1.V0
    public boolean t() {
        return this.f18377e ? this.f18373a.t() : ((V0) AbstractC1459a.e(this.f18376d)).t();
    }
}
