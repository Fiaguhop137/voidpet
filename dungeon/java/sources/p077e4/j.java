package p077e4;

import R3.AbstractC1358e;
import R3.C1364k;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public class j extends c implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C1364k f40385l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f40377d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40378e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f40379f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f40380g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f40381h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f40382i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f40383j = -2.1474836E9f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f40384k = 2.1474836E9f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f40386m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f40387n = false;

    private void K() {
        if (this.f40385l == null) {
            return;
        }
        float f10 = this.f40381h;
        if (f10 < this.f40383j || f10 > this.f40384k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f40383j), Float.valueOf(this.f40384k), Float.valueOf(this.f40381h)));
        }
    }

    private void j(float f10) {
        if (this.f40387n && this.f40380g == f10) {
            return;
        }
        h();
    }

    private float p() {
        C1364k c1364k = this.f40385l;
        if (c1364k == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c1364k.i()) / Math.abs(this.f40377d);
    }

    private boolean u() {
        return s() < 0.0f;
    }

    public void A() {
        this.f40386m = true;
        x();
        this.f40379f = 0L;
        if (u() && o() == r()) {
            D(q());
        } else if (!u() && o() == q()) {
            D(r());
        }
        f();
    }

    public void B() {
        I(-s());
    }

    public void C(C1364k c1364k) {
        boolean z10 = this.f40385l == null;
        this.f40385l = c1364k;
        if (z10) {
            F(Math.max(this.f40383j, c1364k.p()), Math.min(this.f40384k, c1364k.f()));
        } else {
            F((int) c1364k.p(), (int) c1364k.f());
        }
        float f10 = this.f40381h;
        this.f40381h = 0.0f;
        this.f40380g = 0.0f;
        D((int) f10);
        h();
    }

    public void D(float f10) {
        if (this.f40380g == f10) {
            return;
        }
        float fB = l.b(f10, r(), q());
        this.f40380g = fB;
        if (this.f40387n) {
            fB = (float) Math.floor(fB);
        }
        this.f40381h = fB;
        this.f40379f = 0L;
        h();
    }

    public void E(float f10) {
        F(this.f40383j, f10);
    }

    public void F(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        C1364k c1364k = this.f40385l;
        float fP = c1364k == null ? -3.4028235E38f : c1364k.p();
        C1364k c1364k2 = this.f40385l;
        float f12 = c1364k2 == null ? Float.MAX_VALUE : c1364k2.f();
        float fB = l.b(f10, fP, f12);
        float fB2 = l.b(f11, fP, f12);
        if (fB == this.f40383j && fB2 == this.f40384k) {
            return;
        }
        this.f40383j = fB;
        this.f40384k = fB2;
        D((int) l.b(this.f40381h, fB, fB2));
    }

    public void H(int i10) {
        F(i10, (int) this.f40384k);
    }

    public void I(float f10) {
        this.f40377d = f10;
    }

    public void J(boolean z10) {
        this.f40387n = z10;
    }

    @Override // p077e4.c
    void b() {
        super.b();
        c(u());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        b();
        y();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        x();
        if (this.f40385l == null || !isRunning()) {
            return;
        }
        if (AbstractC1358e.h()) {
            AbstractC1358e.b("LottieValueAnimator#doFrame");
        }
        long j11 = this.f40379f;
        float fP = (j11 != 0 ? j10 - j11 : 0L) / p();
        float f10 = this.f40380g;
        if (u()) {
            fP = -fP;
        }
        float f11 = f10 + fP;
        boolean zD = l.d(f11, r(), q());
        float f12 = this.f40380g;
        float fB = l.b(f11, r(), q());
        this.f40380g = fB;
        if (this.f40387n) {
            fB = (float) Math.floor(fB);
        }
        this.f40381h = fB;
        this.f40379f = j10;
        if (zD) {
            j(f12);
        } else if (getRepeatCount() == -1 || this.f40382i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f40378e = !this.f40378e;
                B();
            } else {
                float fQ = u() ? q() : r();
                this.f40380g = fQ;
                this.f40381h = fQ;
            }
            this.f40379f = j10;
            j(f12);
            e();
            this.f40382i++;
        } else {
            float fR = this.f40377d < 0.0f ? r() : q();
            this.f40380g = fR;
            this.f40381h = fR;
            y();
            j(f12);
            c(u());
        }
        K();
        if (AbstractC1358e.h()) {
            AbstractC1358e.c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fR;
        float fQ;
        float fR2;
        if (this.f40385l == null) {
            return 0.0f;
        }
        if (u()) {
            fR = q() - this.f40381h;
            fQ = q();
            fR2 = r();
        } else {
            fR = this.f40381h - r();
            fQ = q();
            fR2 = r();
        }
        return fR / (fQ - fR2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(n());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C1364k c1364k = this.f40385l;
        if (c1364k == null) {
            return 0L;
        }
        return (long) c1364k.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f40386m;
    }

    public void l() {
        this.f40385l = null;
        this.f40383j = -2.1474836E9f;
        this.f40384k = 2.1474836E9f;
    }

    public void m() {
        y();
        c(u());
    }

    public float n() {
        C1364k c1364k = this.f40385l;
        if (c1364k == null) {
            return 0.0f;
        }
        return (this.f40381h - c1364k.p()) / (this.f40385l.f() - this.f40385l.p());
    }

    public float o() {
        return this.f40381h;
    }

    public float q() {
        C1364k c1364k = this.f40385l;
        if (c1364k == null) {
            return 0.0f;
        }
        float f10 = this.f40384k;
        return f10 == 2.1474836E9f ? c1364k.f() : f10;
    }

    public float r() {
        C1364k c1364k = this.f40385l;
        if (c1364k == null) {
            return 0.0f;
        }
        float f10 = this.f40383j;
        return f10 == -2.1474836E9f ? c1364k.p() : f10;
    }

    public float s() {
        return this.f40377d;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f40378e) {
            return;
        }
        this.f40378e = false;
        B();
    }

    public void v() {
        y();
        d();
    }

    public void w() {
        this.f40386m = true;
        g(u());
        D((int) (u() ? q() : r()));
        this.f40379f = 0L;
        this.f40382i = 0;
        x();
    }

    protected void x() {
        if (isRunning()) {
            z(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void y() {
        z(true);
    }

    protected void z(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f40386m = false;
        }
    }
}
