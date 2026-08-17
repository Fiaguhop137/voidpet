package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import p037c0.AbstractC2071a0;
import p037c0.K;
import p037c0.m0;
import p037c0.p0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f21445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Shader f21447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC2071a0 f21448d;

    public b() {
        this(K.j());
    }

    public b(Paint paint) {
        this.f21445a = paint;
        this.f21446b = c.f21453a.B();
    }

    @Override // p037c0.m0
    public void A(Shader shader) {
        this.f21447c = shader;
        K.q(this.f21445a, shader);
    }

    @Override // p037c0.m0
    public Shader B() {
        return this.f21447c;
    }

    @Override // p037c0.m0
    public void C(float f10) {
        K.t(this.f21445a, f10);
    }

    @Override // p037c0.m0
    public int D() {
        return K.e(this.f21445a);
    }

    @Override // p037c0.m0
    public void E(int i10) {
        K.v(this.f21445a, i10);
    }

    @Override // p037c0.m0
    public void F(float f10) {
        K.u(this.f21445a, f10);
    }

    @Override // p037c0.m0
    public float G() {
        return K.i(this.f21445a);
    }

    @Override // p037c0.m0
    public float a() {
        return K.c(this.f21445a);
    }

    @Override // p037c0.m0
    public void b(int i10) {
        if (c.E(this.f21446b, i10)) {
            return;
        }
        this.f21446b = i10;
        K.l(this.f21445a, i10);
    }

    @Override // p037c0.m0
    public void c(AbstractC2071a0 abstractC2071a0) {
        this.f21448d = abstractC2071a0;
        K.n(this.f21445a, abstractC2071a0);
    }

    @Override // p037c0.m0
    public void d(float f10) {
        K.k(this.f21445a, f10);
    }

    @Override // p037c0.m0
    public long e() {
        return K.d(this.f21445a);
    }

    @Override // p037c0.m0
    public AbstractC2071a0 g() {
        return this.f21448d;
    }

    @Override // p037c0.m0
    public int p() {
        return this.f21446b;
    }

    @Override // p037c0.m0
    public void q(int i10) {
        K.r(this.f21445a, i10);
    }

    @Override // p037c0.m0
    public void r(int i10) {
        K.o(this.f21445a, i10);
    }

    @Override // p037c0.m0
    public int s() {
        return K.f(this.f21445a);
    }

    @Override // p037c0.m0
    public void t(int i10) {
        K.s(this.f21445a, i10);
    }

    @Override // p037c0.m0
    public void u(long j10) {
        K.m(this.f21445a, j10);
    }

    @Override // p037c0.m0
    public p0 v() {
        return null;
    }

    @Override // p037c0.m0
    public void w(p0 p0Var) {
        K.p(this.f21445a, p0Var);
    }

    @Override // p037c0.m0
    public int x() {
        return K.g(this.f21445a);
    }

    @Override // p037c0.m0
    public float y() {
        return K.h(this.f21445a);
    }

    @Override // p037c0.m0
    public Paint z() {
        return this.f21445a;
    }
}
