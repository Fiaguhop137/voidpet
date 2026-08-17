package p347t5;

import V4.k;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import p151i6.b;
import p329s5.C4166f;
import p329s5.InterfaceC4163c;
import p329s5.g;
import p329s5.o;
import p329s5.q;
import p383v5.c;

/* JADX INFO: loaded from: classes2.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f54473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f54474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f54475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f54476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4166f f54477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f54478f;

    a(b bVar) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f54473a = colorDrawable;
        if (b.d()) {
            b.a("GenericDraweeHierarchy()");
        }
        this.f54474b = bVar.o();
        this.f54475c = bVar.r();
        g gVar = new g(colorDrawable);
        this.f54478f = gVar;
        int i10 = 1;
        int size = bVar.i() != null ? bVar.i().size() : 1;
        int i11 = (size == 0 ? 1 : size) + (bVar.l() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i11 + 6];
        drawableArr[0] = h(bVar.e(), null);
        drawableArr[1] = h(bVar.j(), bVar.k());
        drawableArr[2] = g(gVar, bVar.d(), bVar.c(), bVar.b());
        drawableArr[3] = h(bVar.m(), bVar.n());
        drawableArr[4] = h(bVar.p(), bVar.q());
        drawableArr[5] = h(bVar.g(), bVar.h());
        if (i11 > 0) {
            if (bVar.i() != null) {
                Iterator it = bVar.i().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    drawableArr[i10 + 6] = h((Drawable) it.next(), null);
                    i10++;
                }
            }
            if (bVar.l() != null) {
                drawableArr[i10 + 6] = h(bVar.l(), null);
            }
        }
        C4166f c4166f = new C4166f(drawableArr, false, 2);
        this.f54477e = c4166f;
        c4166f.u(bVar.f());
        c cVar = new c(e.e(c4166f, this.f54475c));
        this.f54476d = cVar;
        cVar.mutate();
        s();
        if (b.d()) {
            b.b();
        }
    }

    private Drawable g(Drawable drawable, q qVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return e.g(drawable, qVar, pointF);
    }

    private Drawable h(Drawable drawable, q qVar) {
        return e.f(e.d(drawable, this.f54475c, this.f54474b), qVar);
    }

    private void i(int i10) {
        if (i10 >= 0) {
            this.f54477e.l(i10);
        }
    }

    private void j() {
        k(1);
        k(2);
        k(3);
        k(4);
        k(5);
    }

    private void k(int i10) {
        if (i10 >= 0) {
            this.f54477e.m(i10);
        }
    }

    private InterfaceC4163c n(int i10) {
        InterfaceC4163c interfaceC4163cC = this.f54477e.c(i10);
        interfaceC4163cC.s();
        return interfaceC4163cC.s() instanceof o ? (o) interfaceC4163cC.s() : interfaceC4163cC;
    }

    private o p(int i10) {
        InterfaceC4163c interfaceC4163cN = n(i10);
        return interfaceC4163cN instanceof o ? (o) interfaceC4163cN : e.k(interfaceC4163cN, q.f53426a);
    }

    private boolean q(int i10) {
        return n(i10) instanceof o;
    }

    private void r() {
        this.f54478f.g(this.f54473a);
    }

    private void s() {
        C4166f c4166f = this.f54477e;
        if (c4166f != null) {
            c4166f.g();
            this.f54477e.k();
            j();
            i(1);
            this.f54477e.n();
            this.f54477e.j();
        }
    }

    private void u(int i10, Drawable drawable) {
        if (drawable == null) {
            this.f54477e.f(i10, null);
        } else {
            n(i10).g(e.d(drawable, this.f54475c, this.f54474b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x(float f10) {
        Drawable drawableB = this.f54477e.b(3);
        if (drawableB == 0) {
            return;
        }
        if (f10 >= 0.999f) {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).stop();
            }
            k(3);
        } else {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).start();
            }
            i(3);
        }
        drawableB.setLevel(Math.round(f10 * 10000.0f));
    }

    @Override // p383v5.c
    public void a(Throwable th) {
        this.f54477e.g();
        j();
        if (this.f54477e.b(4) != null) {
            i(4);
        } else {
            i(1);
        }
        this.f54477e.j();
    }

    @Override // p383v5.c
    public void b(Throwable th) {
        this.f54477e.g();
        j();
        if (this.f54477e.b(5) != null) {
            i(5);
        } else {
            i(1);
        }
        this.f54477e.j();
    }

    @Override // p383v5.c
    public void c(float f10, boolean z10) {
        if (this.f54477e.b(3) == null) {
            return;
        }
        this.f54477e.g();
        x(f10);
        if (z10) {
            this.f54477e.n();
        }
        this.f54477e.j();
    }

    @Override // p383v5.b
    public Drawable d() {
        return this.f54476d;
    }

    @Override // p383v5.c
    public void e(Drawable drawable, float f10, boolean z10) {
        Drawable drawableD = e.d(drawable, this.f54475c, this.f54474b);
        drawableD.mutate();
        this.f54478f.g(drawableD);
        this.f54477e.g();
        j();
        i(2);
        x(f10);
        if (z10) {
            this.f54477e.n();
        }
        this.f54477e.j();
    }

    @Override // p383v5.c
    public void f(Drawable drawable) {
        this.f54476d.x(drawable);
    }

    @Override // p383v5.b
    public Rect getBounds() {
        return this.f54476d.getBounds();
    }

    public PointF l() {
        if (q(2)) {
            return p(2).z();
        }
        return null;
    }

    public q m() {
        if (q(2)) {
            return p(2).A();
        }
        return null;
    }

    public d o() {
        return this.f54475c;
    }

    @Override // p383v5.c
    public void reset() {
        r();
        s();
    }

    public void t(q qVar) {
        k.g(qVar);
        p(2).C(qVar);
    }

    public void v(int i10) {
        this.f54477e.u(i10);
    }

    public void w(Drawable drawable, q qVar) {
        u(1, drawable);
        p(1).C(qVar);
    }

    public void y(Drawable drawable) {
        u(3, drawable);
    }

    public void z(d dVar) {
        this.f54475c = dVar;
        e.j(this.f54476d, dVar);
        for (int i10 = 0; i10 < this.f54477e.e(); i10++) {
            e.i(n(i10), this.f54475c, this.f54474b);
        }
    }
}
