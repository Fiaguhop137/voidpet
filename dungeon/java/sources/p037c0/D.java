package p037c0;

import android.graphics.Canvas;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class D implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Canvas f26660a = E.f26662a;

    @Override // p037c0.S
    public void a(float f10, float f11, float f12, float f13, int i10) {
        this.f26660a.clipRect(f10, f11, f12, f13, r(i10));
    }

    @Override // p037c0.S
    public void b(o0 o0Var, int i10) {
        Canvas canvas = this.f26660a;
        if (!(o0Var instanceof L)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((L) o0Var).h(), r(i10));
    }

    @Override // p037c0.S
    public void c(long j10, float f10, m0 m0Var) {
        this.f26660a.drawCircle(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f10, m0Var.z());
    }

    @Override // p037c0.S
    public void d(float f10, float f11, float f12, float f13, float f14, float f15, m0 m0Var) {
        this.f26660a.drawRoundRect(f10, f11, f12, f13, f14, f15, m0Var.z());
    }

    @Override // p037c0.S
    public void e(float f10, float f11) {
        this.f26660a.translate(f10, f11);
    }

    @Override // p037c0.S
    public void f() {
        this.f26660a.restore();
    }

    @Override // p037c0.S
    public void g() {
        U.f26688a.a(this.f26660a, true);
    }

    @Override // p037c0.S
    public void i(float f10, float f11, float f12, float f13, m0 m0Var) {
        this.f26660a.drawRect(f10, f11, f12, f13, m0Var.z());
    }

    @Override // p037c0.S
    public void j() {
        this.f26660a.save();
    }

    @Override // p037c0.S
    public void l() {
        U.f26688a.a(this.f26660a, false);
    }

    @Override // p037c0.S
    public void n(o0 o0Var, m0 m0Var) {
        Canvas canvas = this.f26660a;
        if (!(o0Var instanceof L)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((L) o0Var).h(), m0Var.z());
    }

    public final Canvas p() {
        return this.f26660a;
    }

    public final void q(Canvas canvas) {
        this.f26660a = canvas;
    }

    public final Region.Op r(int i10) {
        return Y.d(i10, Y.f26693a.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }
}
