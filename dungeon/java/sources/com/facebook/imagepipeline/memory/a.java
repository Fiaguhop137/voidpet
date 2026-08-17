package com.facebook.imagepipeline.memory;

import V4.k;
import V4.m;
import V4.p;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Set;
import p079e6.E;
import p079e6.F;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements Y4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f28922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Y4.d f28923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final E f28924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final SparseArray f28925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Set f28926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f28927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final C0366a f28928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final C0366a f28929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final F f28930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f28931j;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.memory.a$a, reason: collision with other inner class name */
    static class C0366a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f28933b;

        C0366a() {
        }

        public void a(int i10) {
            int i11;
            int i12 = this.f28933b;
            if (i12 < i10 || (i11 = this.f28932a) <= 0) {
                W4.a.N("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i10), Integer.valueOf(this.f28933b), Integer.valueOf(this.f28932a));
            } else {
                this.f28932a = i11 - 1;
                this.f28933b = i12 - i10;
            }
        }

        public void b(int i10) {
            this.f28932a++;
            this.f28933b += i10;
        }
    }

    public static class b extends RuntimeException {
        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class c extends RuntimeException {
        public c(int i10, int i11, int i12, int i13) {
            super("Pool hard cap violation? Hard cap = " + i10 + " Used size = " + i11 + " Free size = " + i12 + " Request size = " + i13);
        }
    }

    public a(Y4.d dVar, E e10, F f10) {
        this.f28922a = getClass();
        this.f28923b = (Y4.d) k.g(dVar);
        E e11 = (E) k.g(e10);
        this.f28924c = e11;
        this.f28930i = (F) k.g(f10);
        this.f28925d = new SparseArray();
        if (e11.f40484f) {
            s();
        } else {
            w(new SparseIntArray(0));
        }
        this.f28926e = m.b();
        this.f28929h = new C0366a();
        this.f28928g = new C0366a();
    }

    public a(Y4.d dVar, E e10, F f10, boolean z10) {
        this(dVar, e10, f10);
        this.f28931j = z10;
    }

    private synchronized void j() {
        try {
            k.i(!u() || this.f28929h.f28933b == 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void k(SparseIntArray sparseIntArray) {
        this.f28925d.clear();
        for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
            int iKeyAt = sparseIntArray.keyAt(i10);
            this.f28925d.put(iKeyAt, new com.facebook.imagepipeline.memory.b(q(iKeyAt), sparseIntArray.valueAt(i10), 0, this.f28924c.f40484f));
        }
    }

    private synchronized com.facebook.imagepipeline.memory.b n(int i10) {
        return (com.facebook.imagepipeline.memory.b) this.f28925d.get(i10);
    }

    private synchronized void s() {
        try {
            SparseIntArray sparseIntArray = this.f28924c.f40481c;
            if (sparseIntArray != null) {
                k(sparseIntArray);
                this.f28927f = false;
            } else {
                this.f28927f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void w(SparseIntArray sparseIntArray) {
        try {
            k.g(sparseIntArray);
            this.f28925d.clear();
            SparseIntArray sparseIntArray2 = this.f28924c.f40481c;
            if (sparseIntArray2 != null) {
                for (int i10 = 0; i10 < sparseIntArray2.size(); i10++) {
                    int iKeyAt = sparseIntArray2.keyAt(i10);
                    this.f28925d.put(iKeyAt, new com.facebook.imagepipeline.memory.b(q(iKeyAt), sparseIntArray2.valueAt(i10), sparseIntArray.get(iKeyAt, 0), this.f28924c.f40484f));
                }
                this.f28927f = false;
            } else {
                this.f28927f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void x() {
        if (W4.a.w(2)) {
            W4.a.B(this.f28922a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f28928g.f28932a), Integer.valueOf(this.f28928g.f28933b), Integer.valueOf(this.f28929h.f28932a), Integer.valueOf(this.f28929h.f28933b));
        }
    }

    synchronized void A() {
        if (u()) {
            z(this.f28924c.f40480b);
        }
    }

    @Override // Y4.f, Z4.h
    public void a(Object obj) {
        k.g(obj);
        int iP = p(obj);
        int iQ = q(iP);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b bVarN = n(iP);
                if (!this.f28926e.remove(obj)) {
                    W4.a.k(this.f28922a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iP));
                    l(obj);
                    this.f28930i.b(iQ);
                } else if (bVarN == null || bVarN.f() || u() || !v(obj)) {
                    if (bVarN != null) {
                        bVarN.b();
                    }
                    if (W4.a.w(2)) {
                        W4.a.z(this.f28922a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iP));
                    }
                    l(obj);
                    this.f28928g.a(iQ);
                    this.f28930i.b(iQ);
                } else {
                    bVarN.h(obj);
                    this.f28929h.b(iQ);
                    this.f28928g.a(iQ);
                    this.f28930i.c(iQ);
                    if (W4.a.w(2)) {
                        W4.a.z(this.f28922a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iP));
                    }
                }
                x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Y4.f
    public Object get(int i10) throws Throwable {
        Object objH;
        Object objR;
        j();
        int iO = o(i10);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b bVarM = m(iO);
                if (bVarM != null && (objR = r(bVarM)) != null) {
                    k.i(this.f28926e.add(objR));
                    int iP = p(objR);
                    int iQ = q(iP);
                    this.f28928g.b(iQ);
                    this.f28929h.a(iQ);
                    this.f28930i.e(iQ);
                    x();
                    if (W4.a.w(2)) {
                        W4.a.z(this.f28922a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objR)), Integer.valueOf(iP));
                    }
                    return objR;
                }
                int iQ2 = q(iO);
                if (!i(iQ2)) {
                    throw new c(this.f28924c.f40479a, this.f28928g.f28933b, this.f28929h.f28933b, iQ2);
                }
                this.f28928g.b(iQ2);
                if (bVarM != null) {
                    bVarM.e();
                }
                try {
                    objH = h(iO);
                } catch (Throwable th) {
                    synchronized (this) {
                        try {
                            this.f28928g.a(iQ2);
                            com.facebook.imagepipeline.memory.b bVarM2 = m(iO);
                            if (bVarM2 != null) {
                                bVarM2.b();
                            }
                            p.c(th);
                            objH = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    try {
                        k.i(this.f28926e.add(objH));
                        A();
                        this.f28930i.d(iQ2);
                        x();
                        if (W4.a.w(2)) {
                            W4.a.z(this.f28922a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objH)), Integer.valueOf(iO));
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return objH;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    protected abstract Object h(int i10);

    synchronized boolean i(int i10) {
        if (this.f28931j) {
            return true;
        }
        E e10 = this.f28924c;
        int i11 = e10.f40479a;
        int i12 = this.f28928g.f28933b;
        if (i10 > i11 - i12) {
            this.f28930i.g();
            return false;
        }
        int i13 = e10.f40480b;
        if (i10 > i13 - (i12 + this.f28929h.f28933b)) {
            z(i13 - i10);
        }
        if (i10 <= i11 - (this.f28928g.f28933b + this.f28929h.f28933b)) {
            return true;
        }
        this.f28930i.g();
        return false;
    }

    protected abstract void l(Object obj);

    synchronized com.facebook.imagepipeline.memory.b m(int i10) {
        try {
            com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) this.f28925d.get(i10);
            if (bVar == null && this.f28927f) {
                if (W4.a.w(2)) {
                    W4.a.y(this.f28922a, "creating new bucket %s", Integer.valueOf(i10));
                }
                com.facebook.imagepipeline.memory.b bVarY = y(i10);
                this.f28925d.put(i10, bVarY);
                return bVarY;
            }
            return bVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    protected abstract int o(int i10);

    protected abstract int p(Object obj);

    protected abstract int q(int i10);

    protected synchronized Object r(com.facebook.imagepipeline.memory.b bVar) {
        return bVar.c();
    }

    protected void t() {
        this.f28923b.a(this);
        this.f28930i.f(this);
    }

    synchronized boolean u() {
        boolean z10;
        z10 = this.f28928g.f28933b + this.f28929h.f28933b > this.f28924c.f40480b;
        if (z10) {
            this.f28930i.a();
        }
        return z10;
    }

    protected boolean v(Object obj) {
        k.g(obj);
        return true;
    }

    com.facebook.imagepipeline.memory.b y(int i10) {
        return new com.facebook.imagepipeline.memory.b(q(i10), Integer.MAX_VALUE, 0, this.f28924c.f40484f);
    }

    synchronized void z(int i10) {
        try {
            int i11 = this.f28928g.f28933b;
            int i12 = this.f28929h.f28933b;
            int iMin = Math.min((i11 + i12) - i10, i12);
            if (iMin <= 0) {
                return;
            }
            if (W4.a.w(2)) {
                W4.a.A(this.f28922a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i10), Integer.valueOf(this.f28928g.f28933b + this.f28929h.f28933b), Integer.valueOf(iMin));
            }
            x();
            for (int i13 = 0; i13 < this.f28925d.size() && iMin > 0; i13++) {
                com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) k.g((com.facebook.imagepipeline.memory.b) this.f28925d.valueAt(i13));
                while (iMin > 0) {
                    Object objG = bVar.g();
                    if (objG == null) {
                        break;
                    }
                    l(objG);
                    int i14 = bVar.f28934a;
                    iMin -= i14;
                    this.f28929h.a(i14);
                }
            }
            x();
            if (W4.a.w(2)) {
                W4.a.z(this.f28922a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i10), Integer.valueOf(this.f28928g.f28933b + this.f28929h.f28933b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
