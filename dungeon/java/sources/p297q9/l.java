package p297q9;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m[] f51696a = new m[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f51697b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f51698c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f51699d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f51700e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f51701f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f51702g = new m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f51703h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f51704i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f51705j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f51706k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f51707l = true;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final l f51708a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f51709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f51710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f51711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f51712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f51713e;

        c(k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f51712d = bVar;
            this.f51709a = kVar;
            this.f51713e = f10;
            this.f51711c = rectF;
            this.f51710b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f51696a[i10] = new m();
            this.f51697b[i10] = new Matrix();
            this.f51698c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(c cVar, int i10) {
        this.f51703h[0] = this.f51696a[i10].k();
        this.f51703h[1] = this.f51696a[i10].l();
        this.f51697b[i10].mapPoints(this.f51703h);
        if (i10 == 0) {
            Path path = cVar.f51710b;
            float[] fArr = this.f51703h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f51710b;
            float[] fArr2 = this.f51703h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f51696a[i10].d(this.f51697b[i10], cVar.f51710b);
        b bVar = cVar.f51712d;
        if (bVar != null) {
            bVar.a(this.f51696a[i10], this.f51697b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f51703h[0] = this.f51696a[i10].i();
        this.f51703h[1] = this.f51696a[i10].j();
        this.f51697b[i10].mapPoints(this.f51703h);
        this.f51704i[0] = this.f51696a[i11].k();
        this.f51704i[1] = this.f51696a[i11].l();
        this.f51697b[i11].mapPoints(this.f51704i);
        float[] fArr = this.f51703h;
        float f10 = fArr[0];
        float[] fArr2 = this.f51704i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f51711c, i10);
        this.f51702g.n(0.0f, 0.0f);
        f fVarJ = j(i10, cVar.f51709a);
        fVarJ.b(fMax, fI, cVar.f51713e, this.f51702g);
        this.f51705j.reset();
        this.f51702g.d(this.f51698c[i10], this.f51705j);
        if (this.f51707l && (fVarJ.a() || l(this.f51705j, i10) || l(this.f51705j, i11))) {
            Path path = this.f51705j;
            path.op(path, this.f51701f, Path.Op.DIFFERENCE);
            this.f51703h[0] = this.f51702g.k();
            this.f51703h[1] = this.f51702g.l();
            this.f51698c[i10].mapPoints(this.f51703h);
            Path path2 = this.f51700e;
            float[] fArr3 = this.f51703h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f51702g.d(this.f51698c[i10], this.f51700e);
        } else {
            this.f51702g.d(this.f51698c[i10], cVar.f51710b);
        }
        b bVar = cVar.f51712d;
        if (bVar != null) {
            bVar.b(this.f51702g, this.f51698c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private p297q9.c g(int i10, k kVar) {
        if (i10 == 1) {
            return kVar.l();
        }
        if (i10 != 2) {
            return i10 != 3 ? kVar.t() : kVar.r();
        }
        return kVar.j();
    }

    private d h(int i10, k kVar) {
        if (i10 == 1) {
            return kVar.k();
        }
        if (i10 != 2) {
            return i10 != 3 ? kVar.s() : kVar.q();
        }
        return kVar.i();
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f51703h;
        m mVar = this.f51696a[i10];
        fArr[0] = mVar.f51716c;
        fArr[1] = mVar.f51717d;
        this.f51697b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f51703h[0]) : Math.abs(rectF.centerY() - this.f51703h[1]);
    }

    private f j(int i10, k kVar) {
        if (i10 == 1) {
            return kVar.h();
        }
        if (i10 != 2) {
            return i10 != 3 ? kVar.o() : kVar.p();
        }
        return kVar.n();
    }

    public static l k() {
        return a.f51708a;
    }

    private boolean l(Path path, int i10) {
        this.f51706k.reset();
        this.f51696a[i10].d(this.f51697b[i10], this.f51706k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f51706k.computeBounds(rectF, true);
        path.op(this.f51706k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f51709a).b(this.f51696a[i10], 90.0f, cVar.f51713e, cVar.f51711c, g(i10, cVar.f51709a));
        float fA = a(i10);
        this.f51697b[i10].reset();
        f(i10, cVar.f51711c, this.f51699d);
        Matrix matrix = this.f51697b[i10];
        PointF pointF = this.f51699d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f51697b[i10].preRotate(fA);
    }

    private void n(int i10) {
        this.f51703h[0] = this.f51696a[i10].i();
        this.f51703h[1] = this.f51696a[i10].j();
        this.f51697b[i10].mapPoints(this.f51703h);
        float fA = a(i10);
        this.f51698c[i10].reset();
        Matrix matrix = this.f51698c[i10];
        float[] fArr = this.f51703h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f51698c[i10].preRotate(fA);
    }

    public void d(k kVar, float f10, RectF rectF, Path path) {
        e(kVar, f10, rectF, null, path);
    }

    public void e(k kVar, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f51700e.rewind();
        this.f51701f.rewind();
        this.f51701f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f51700e.close();
        if (this.f51700e.isEmpty()) {
            return;
        }
        path.op(this.f51700e, Path.Op.UNION);
    }
}
