package p324s0;

import androidx.compose.ui.graphics.f;
import androidx.compose.ui.graphics.i;

/* JADX INFO: loaded from: classes.dex */
final class B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f52797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f52798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f52799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f52800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f52801g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f52795a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f52796b = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f52802h = 8.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f52803i = i.f21529a.a();

    public final void a(f fVar) {
        this.f52795a = fVar.u();
        this.f52796b = fVar.H();
        this.f52797c = fVar.E();
        this.f52798d = fVar.B();
        this.f52799e = fVar.F();
        this.f52800f = fVar.h();
        this.f52801g = fVar.j();
        this.f52802h = fVar.m();
        this.f52803i = fVar.p0();
    }

    public final void b(B b10) {
        this.f52795a = b10.f52795a;
        this.f52796b = b10.f52796b;
        this.f52797c = b10.f52797c;
        this.f52798d = b10.f52798d;
        this.f52799e = b10.f52799e;
        this.f52800f = b10.f52800f;
        this.f52801g = b10.f52801g;
        this.f52802h = b10.f52802h;
        this.f52803i = b10.f52803i;
    }

    public final boolean c(B b10) {
        return this.f52795a == b10.f52795a && this.f52796b == b10.f52796b && this.f52797c == b10.f52797c && this.f52798d == b10.f52798d && this.f52799e == b10.f52799e && this.f52800f == b10.f52800f && this.f52801g == b10.f52801g && this.f52802h == b10.f52802h && i.c(this.f52803i, b10.f52803i);
    }
}
