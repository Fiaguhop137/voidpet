package p297q9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f51714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f51715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f51716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f51717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f51718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f51719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f51720g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f51721h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f51722i;

    class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f51723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f51724d;

        a(List list, Matrix matrix) {
            this.f51723c = list;
            this.f51724d = matrix;
        }

        @Override // q9.m.g
        public void a(Matrix matrix, p279p9.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f51723c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f51724d, aVar, i10, canvas);
            }
        }
    }

    static class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f51726c;

        public b(d dVar) {
            this.f51726c = dVar;
        }

        @Override // q9.m.g
        public void a(Matrix matrix, p279p9.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f51726c.k(), this.f51726c.o(), this.f51726c.l(), this.f51726c.j()), i10, this.f51726c.m(), this.f51726c.n());
        }
    }

    static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f51727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f51728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f51729e;

        public c(e eVar, float f10, float f11) {
            this.f51727c = eVar;
            this.f51728d = f10;
            this.f51729e = f11;
        }

        @Override // q9.m.g
        public void a(Matrix matrix, p279p9.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f51727c.f51738c - this.f51729e, this.f51727c.f51737b - this.f51728d), 0.0f);
            this.f51741a.set(matrix);
            this.f51741a.preTranslate(this.f51728d, this.f51729e);
            this.f51741a.preRotate(c());
            aVar.b(canvas, this.f51741a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f51727c.f51738c - this.f51729e) / (this.f51727c.f51737b - this.f51728d)));
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RectF f51730h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f51731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f51732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f51733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f51734e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f51735f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f51736g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f51734e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f51731b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f51733d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f51735f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f51736g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f51732c;
        }

        private void p(float f10) {
            this.f51734e = f10;
        }

        private void q(float f10) {
            this.f51731b = f10;
        }

        private void r(float f10) {
            this.f51733d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f51735f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f51736g = f10;
        }

        private void u(float f10) {
            this.f51732c = f10;
        }

        @Override // q9.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f51739a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f51730h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f51737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f51738c;

        @Override // q9.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f51739a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f51737b, this.f51738c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f51739a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Matrix f51740b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f51741a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, p279p9.a aVar, int i10, Canvas canvas);

        public final void b(p279p9.a aVar, int i10, Canvas canvas) {
            a(f51740b, aVar, i10, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() == f10) {
            return;
        }
        float fG = ((f10 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f51721h.add(new b(dVar));
        p(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f51721h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f51718e;
    }

    private float h() {
        return this.f51719f;
    }

    private void p(float f10) {
        this.f51718e = f10;
    }

    private void q(float f10) {
        this.f51719f = f10;
    }

    private void r(float f10) {
        this.f51716c = f10;
    }

    private void s(float f10) {
        this.f51717d = f10;
    }

    private void t(float f10) {
        this.f51714a = f10;
    }

    private void u(float f10) {
        this.f51715b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f51720g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f51720g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f51720g.get(i10)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f51722i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f51721h), new Matrix(matrix));
    }

    float i() {
        return this.f51716c;
    }

    float j() {
        return this.f51717d;
    }

    float k() {
        return this.f51714a;
    }

    float l() {
        return this.f51715b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f51737b = f10;
        eVar.f51738c = f11;
        this.f51720g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f51720g.clear();
        this.f51721h.clear();
        this.f51722i = false;
    }
}
