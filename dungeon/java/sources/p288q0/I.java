package p288q0;

import I.A0;
import I.InterfaceC1087x0;
import I.InterfaceC1093z0;
import I.L1;
import I.U0;
import I.X1;
import androidx.compose.ui.layout.r;
import androidx.compose.ui.layout.t;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f51166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r f51167g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0 f51161a = X1.d(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A0 f51162b = X1.d(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1087x0 f51163c = U0.a(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1093z0 f51164d = L1.a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC1087x0 f51165e = U0.a(1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f51168h = H.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f51169i = H.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f51170j = H.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f51171k = H.a();

    public I(String str) {
        this.f51166f = t.a(str + " source");
        this.f51167g = t.a(str + " target");
    }

    public final long a() {
        return this.f51168h;
    }

    public final long b() {
        return this.f51169i;
    }

    public r c() {
        return this.f51166f;
    }

    public final long d() {
        return this.f51170j;
    }

    public r e() {
        return this.f51167g;
    }

    public final long f() {
        return this.f51171k;
    }

    public boolean g() {
        return ((Boolean) this.f51162b.getValue()).booleanValue();
    }

    public void h(float f10) {
        this.f51165e.u(f10);
    }

    public void i(boolean z10) {
        this.f51162b.setValue(Boolean.valueOf(z10));
    }

    public final void j(long j10) {
        this.f51168h = j10;
    }

    public void k(long j10) {
        this.f51164d.y(j10);
    }

    public void l(float f10) {
        this.f51163c.u(f10);
    }

    public final void m(long j10) {
        this.f51169i = j10;
    }

    public final void n(long j10) {
        this.f51170j = j10;
    }

    public final void o(long j10) {
        this.f51171k = j10;
    }

    public void p(boolean z10) {
        this.f51161a.setValue(Boolean.valueOf(z10));
    }
}
