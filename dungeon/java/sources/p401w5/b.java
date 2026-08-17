package p401w5;

import V4.i;
import V4.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import p257o5.c;
import p329s5.E;
import p329s5.F;
import p383v5.a;

/* JADX INFO: loaded from: classes2.dex */
public class b implements F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p383v5.b f56620d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f56617a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f56618b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f56619c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f56621e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f56622f = c.a();

    public b(p383v5.b bVar) {
        if (bVar != null) {
            p(bVar);
        }
    }

    private void a() {
        if (this.f56617a) {
            return;
        }
        this.f56622f.b(c.a.ON_ATTACH_CONTROLLER);
        this.f56617a = true;
        a aVar = this.f56621e;
        if (aVar == null || aVar.e() == null) {
            return;
        }
        this.f56621e.c();
    }

    private void b() {
        if (this.f56618b && this.f56619c) {
            a();
        } else {
            d();
        }
    }

    public static b c(p383v5.b bVar, Context context) {
        b bVar2 = new b(bVar);
        bVar2.m(context);
        return bVar2;
    }

    private void d() {
        if (this.f56617a) {
            this.f56622f.b(c.a.ON_DETACH_CONTROLLER);
            this.f56617a = false;
            if (i()) {
                this.f56621e.d();
            }
        }
    }

    private void q(F f10) {
        Object objH = h();
        if (objH instanceof E) {
            ((E) objH).o(f10);
        }
    }

    public a e() {
        return this.f56621e;
    }

    @Override // p329s5.F
    public void f(boolean z10) {
        if (this.f56619c == z10) {
            return;
        }
        this.f56622f.b(z10 ? c.a.ON_DRAWABLE_SHOW : c.a.ON_DRAWABLE_HIDE);
        this.f56619c = z10;
        b();
    }

    public p383v5.b g() {
        return (p383v5.b) k.g(this.f56620d);
    }

    public Drawable h() {
        p383v5.b bVar = this.f56620d;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public boolean i() {
        a aVar = this.f56621e;
        return aVar != null && aVar.e() == this.f56620d;
    }

    public void j() {
        this.f56622f.b(c.a.ON_HOLDER_ATTACH);
        this.f56618b = true;
        b();
    }

    public void k() {
        this.f56622f.b(c.a.ON_HOLDER_DETACH);
        this.f56618b = false;
        b();
    }

    public boolean l(MotionEvent motionEvent) {
        if (i()) {
            return this.f56621e.a(motionEvent);
        }
        return false;
    }

    public void m(Context context) {
    }

    public void n() {
        o(null);
    }

    public void o(a aVar) {
        boolean z10 = this.f56617a;
        if (z10) {
            d();
        }
        if (i()) {
            this.f56622f.b(c.a.ON_CLEAR_OLD_CONTROLLER);
            this.f56621e.f(null);
        }
        this.f56621e = aVar;
        if (aVar != null) {
            this.f56622f.b(c.a.ON_SET_CONTROLLER);
            this.f56621e.f(this.f56620d);
        } else {
            this.f56622f.b(c.a.ON_CLEAR_CONTROLLER);
        }
        if (z10) {
            a();
        }
    }

    @Override // p329s5.F
    public void onDraw() {
        if (this.f56617a) {
            return;
        }
        W4.a.G(c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f56621e)), toString());
        this.f56618b = true;
        this.f56619c = true;
        b();
    }

    public void p(p383v5.b bVar) {
        this.f56622f.b(c.a.ON_SET_HIERARCHY);
        boolean zI = i();
        q(null);
        p383v5.b bVar2 = (p383v5.b) k.g(bVar);
        this.f56620d = bVar2;
        Drawable drawableD = bVar2.d();
        f(drawableD == null || drawableD.isVisible());
        q(this);
        if (zI) {
            this.f56621e.f(bVar);
        }
    }

    public String toString() {
        return i.b(this).c("controllerAttached", this.f56617a).c("holderAttached", this.f56618b).c("drawableVisible", this.f56619c).b("events", this.f56622f.toString()).toString();
    }
}
