package p236n2;

import R1.F;
import U1.AbstractC1459a;
import W1.x;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p003a2.D1;
import p075e2.t;

/* JADX INFO: renamed from: n2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4004a implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f49652a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f49653b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L.a f49654c = new L.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t.a f49655d = new t.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f49656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private F f49657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private D1 f49658g;

    protected void A() {
    }

    protected final D1 B() {
        return (D1) AbstractC1459a.i(this.f49658g);
    }

    protected final boolean C() {
        return !this.f49653b.isEmpty();
    }

    protected abstract void D(x xVar);

    protected final void E(F f10) {
        this.f49657f = f10;
        Iterator it = this.f49652a.iterator();
        while (it.hasNext()) {
            ((D.c) it.next()).a(this, f10);
        }
    }

    protected abstract void F();

    @Override // p236n2.D
    public final void a(Handler handler, L l10) {
        AbstractC1459a.e(handler);
        AbstractC1459a.e(l10);
        this.f49654c.h(handler, l10);
    }

    @Override // p236n2.D
    public final void b(D.c cVar, x xVar, D1 d10) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f49656e;
        AbstractC1459a.a(looper == null || looper == looperMyLooper);
        this.f49658g = d10;
        F f10 = this.f49657f;
        this.f49652a.add(cVar);
        if (this.f49656e == null) {
            this.f49656e = looperMyLooper;
            this.f49653b.add(cVar);
            D(xVar);
        } else if (f10 != null) {
            r(cVar);
            cVar.a(this, f10);
        }
    }

    @Override // p236n2.D
    public final void d(t tVar) {
        this.f49655d.n(tVar);
    }

    @Override // p236n2.D
    public final void e(Handler handler, t tVar) {
        AbstractC1459a.e(handler);
        AbstractC1459a.e(tVar);
        this.f49655d.g(handler, tVar);
    }

    @Override // p236n2.D
    public final void h(D.c cVar) {
        boolean zIsEmpty = this.f49653b.isEmpty();
        this.f49653b.remove(cVar);
        if (zIsEmpty || !this.f49653b.isEmpty()) {
            return;
        }
        z();
    }

    @Override // p236n2.D
    public final void p(D.c cVar) {
        this.f49652a.remove(cVar);
        if (!this.f49652a.isEmpty()) {
            h(cVar);
            return;
        }
        this.f49656e = null;
        this.f49657f = null;
        this.f49658g = null;
        this.f49653b.clear();
        F();
    }

    @Override // p236n2.D
    public final void q(L l10) {
        this.f49654c.x(l10);
    }

    @Override // p236n2.D
    public final void r(D.c cVar) {
        AbstractC1459a.e(this.f49656e);
        boolean zIsEmpty = this.f49653b.isEmpty();
        this.f49653b.add(cVar);
        if (zIsEmpty) {
            A();
        }
    }

    protected final t.a v(int i10, D.b bVar) {
        return this.f49655d.o(i10, bVar);
    }

    protected final t.a w(D.b bVar) {
        return this.f49655d.o(0, bVar);
    }

    protected final L.a x(int i10, D.b bVar) {
        return this.f49654c.A(i10, bVar);
    }

    protected final L.a y(D.b bVar) {
        return this.f49654c.A(0, bVar);
    }

    protected void z() {
    }
}
