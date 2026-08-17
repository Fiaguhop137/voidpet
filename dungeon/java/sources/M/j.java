package M;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a implements ListIterator, Nd.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f6657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m f6659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6660f;

    public j(h hVar, int i10) {
        super(i10, hVar.size());
        this.f6657c = hVar;
        this.f6658d = hVar.i();
        this.f6660f = -1;
        m();
    }

    private final void h() {
        if (this.f6658d != this.f6657c.i()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (this.f6660f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void k() {
        g(this.f6657c.size());
        this.f6658d = this.f6657c.i();
        this.f6660f = -1;
        m();
    }

    private final void m() {
        Object[] objArrK = this.f6657c.k();
        if (objArrK == null) {
            this.f6659e = null;
            return;
        }
        int iD = n.d(this.f6657c.size());
        int i10 = kotlin.ranges.e.i(c(), iD);
        int iN = (this.f6657c.n() / 5) + 1;
        m mVar = this.f6659e;
        if (mVar == null) {
            this.f6659e = new m(objArrK, i10, iD, iN);
        } else {
            Intrinsics.c(mVar);
            mVar.m(objArrK, i10, iD, iN);
        }
    }

    @Override // M.a, java.util.ListIterator
    public void add(Object obj) {
        h();
        this.f6657c.add(c(), obj);
        f(c() + 1);
        k();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        h();
        a();
        this.f6660f = c();
        m mVar = this.f6659e;
        if (mVar == null) {
            Object[] objArrP = this.f6657c.p();
            int iC = c();
            f(iC + 1);
            return objArrP[iC];
        }
        if (mVar.hasNext()) {
            f(c() + 1);
            return mVar.next();
        }
        Object[] objArrP2 = this.f6657c.p();
        int iC2 = c();
        f(iC2 + 1);
        return objArrP2[iC2 - mVar.d()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        h();
        b();
        this.f6660f = c() - 1;
        m mVar = this.f6659e;
        if (mVar == null) {
            Object[] objArrP = this.f6657c.p();
            f(c() - 1);
            return objArrP[c()];
        }
        if (c() <= mVar.d()) {
            f(c() - 1);
            return mVar.previous();
        }
        Object[] objArrP2 = this.f6657c.p();
        f(c() - 1);
        return objArrP2[c() - mVar.d()];
    }

    @Override // M.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        h();
        i();
        this.f6657c.remove(this.f6660f);
        if (this.f6660f < c()) {
            f(this.f6660f);
        }
        k();
    }

    @Override // M.a, java.util.ListIterator
    public void set(Object obj) {
        h();
        i();
        this.f6657c.set(this.f6660f, obj);
        this.f6658d = this.f6657c.i();
        m();
    }
}
