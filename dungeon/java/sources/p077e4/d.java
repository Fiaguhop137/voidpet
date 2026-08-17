package p077e4;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f40362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f40363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f40364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f40366e = null;

    public d(float f10, float f11, float f12, int i10) {
        this.f40362a = f10;
        this.f40363b = f11;
        this.f40364c = f12;
        this.f40365d = i10;
    }

    public d(d dVar) {
        this.f40362a = 0.0f;
        this.f40363b = 0.0f;
        this.f40364c = 0.0f;
        this.f40365d = 0;
        this.f40362a = dVar.f40362a;
        this.f40363b = dVar.f40363b;
        this.f40364c = dVar.f40364c;
        this.f40365d = dVar.f40365d;
    }

    public void a(Paint paint) {
        if (Color.alpha(this.f40365d) > 0) {
            paint.setShadowLayer(Math.max(this.f40362a, Float.MIN_VALUE), this.f40363b, this.f40364c, this.f40365d);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void b(p.b bVar) {
        if (Color.alpha(this.f40365d) > 0) {
            bVar.f40423d = this;
        } else {
            bVar.f40423d = null;
        }
    }

    public void c(int i10, Paint paint) {
        int iL = r.l(Color.alpha(this.f40365d), l.c(i10, 0, 255));
        if (iL <= 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(Math.max(this.f40362a, Float.MIN_VALUE), this.f40363b, this.f40364c, Color.argb(iL, Color.red(this.f40365d), Color.green(this.f40365d), Color.blue(this.f40365d)));
        }
    }

    public void d(int i10, p.b bVar) {
        d dVar = new d(this);
        bVar.f40423d = dVar;
        dVar.i(i10);
    }

    public int e() {
        return this.f40365d;
    }

    public float f() {
        return this.f40363b;
    }

    public float g() {
        return this.f40364c;
    }

    public float h() {
        return this.f40362a;
    }

    public void i(int i10) {
        this.f40365d = Color.argb(Math.round((Color.alpha(this.f40365d) * l.c(i10, 0, 255)) / 255.0f), Color.red(this.f40365d), Color.green(this.f40365d), Color.blue(this.f40365d));
    }

    public boolean j(d dVar) {
        return this.f40362a == dVar.f40362a && this.f40363b == dVar.f40363b && this.f40364c == dVar.f40364c && this.f40365d == dVar.f40365d;
    }

    public void k(Matrix matrix) {
        if (this.f40366e == null) {
            this.f40366e = new float[2];
        }
        float[] fArr = this.f40366e;
        fArr[0] = this.f40363b;
        fArr[1] = this.f40364c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f40366e;
        this.f40363b = fArr2[0];
        this.f40364c = fArr2[1];
        this.f40362a = matrix.mapRadius(this.f40362a);
    }
}
