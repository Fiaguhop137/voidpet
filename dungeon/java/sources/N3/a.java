package N3;

import K3.o;
import N4.g;
import android.graphics.RectF;
import p435y3.n;

/* JADX INFO: loaded from: classes.dex */
final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f7302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private N4.f f7303b;

    public a(g gVar) {
        this.f7302a = gVar;
    }

    @Override // N3.b
    public void a(String str) {
        this.f7302a.y(str);
    }

    @Override // N3.b
    public void b(String str) {
        this.f7302a.v(str);
    }

    @Override // N3.b
    public void c(float[] fArr) {
        g gVar = this.f7302a;
        float f10 = fArr[0];
        float f11 = fArr[1];
        gVar.w(f10, f11, fArr[2] - f10, fArr[3] - f11);
    }

    @Override // N3.b
    public void d(o oVar) {
        String strA = M3.b.a(oVar);
        if (strA != null) {
            N4.f fVar = new N4.f();
            fVar.a(strA);
            this.f7303b = fVar;
        }
    }

    @Override // N3.b
    public float[] e() {
        RectF rectFG = this.f7302a.g();
        if (rectFG != null) {
            return new float[]{rectFG.left, rectFG.top, rectFG.right, rectFG.bottom};
        }
        return null;
    }

    @Override // N3.b
    public n f(int i10, int i11) {
        return new M3.e(this.f7302a, this.f7303b, i10, i11);
    }

    @Override // N3.b
    public float getHeight() {
        return this.f7302a.f();
    }

    @Override // N3.b
    public float getWidth() {
        return this.f7302a.h();
    }
}
