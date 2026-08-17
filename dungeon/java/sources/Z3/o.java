package Z3;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f18719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PointF f18720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18721c;

    public o() {
        this.f18719a = new ArrayList();
    }

    public o(PointF pointF, boolean z10, List list) {
        this.f18720b = pointF;
        this.f18721c = z10;
        this.f18719a = new ArrayList(list);
    }

    public List a() {
        return this.f18719a;
    }

    public PointF b() {
        return this.f18720b;
    }

    public void c(o oVar, o oVar2, float f10) {
        if (this.f18720b == null) {
            this.f18720b = new PointF();
        }
        this.f18721c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            p077e4.g.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int iMin = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f18719a.size() < iMin) {
            for (int size = this.f18719a.size(); size < iMin; size++) {
                this.f18719a.add(new X3.a());
            }
        } else if (this.f18719a.size() > iMin) {
            for (int size2 = this.f18719a.size() - 1; size2 >= iMin; size2--) {
                List list = this.f18719a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = oVar.b();
        PointF pointFB2 = oVar2.b();
        f(p077e4.l.i(pointFB.x, pointFB2.x, f10), p077e4.l.i(pointFB.y, pointFB2.y, f10));
        for (int size3 = this.f18719a.size() - 1; size3 >= 0; size3--) {
            X3.a aVar = (X3.a) oVar.a().get(size3);
            X3.a aVar2 = (X3.a) oVar2.a().get(size3);
            PointF pointFA = aVar.a();
            PointF pointFB3 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB4 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            ((X3.a) this.f18719a.get(size3)).d(p077e4.l.i(pointFA.x, pointFA2.x, f10), p077e4.l.i(pointFA.y, pointFA2.y, f10));
            ((X3.a) this.f18719a.get(size3)).e(p077e4.l.i(pointFB3.x, pointFB4.x, f10), p077e4.l.i(pointFB3.y, pointFB4.y, f10));
            ((X3.a) this.f18719a.get(size3)).f(p077e4.l.i(pointFC.x, pointFC2.x, f10), p077e4.l.i(pointFC.y, pointFC2.y, f10));
        }
    }

    public boolean d() {
        return this.f18721c;
    }

    public void e(boolean z10) {
        this.f18721c = z10;
    }

    public void f(float f10, float f11) {
        if (this.f18720b == null) {
            this.f18720b = new PointF();
        }
        this.f18720b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f18719a.size() + "closed=" + this.f18721c + '}';
    }
}
