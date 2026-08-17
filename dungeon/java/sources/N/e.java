package N;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Iterator, Nd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u[] f7130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7132c = true;

    public e(t tVar, u[] uVarArr) {
        this.f7130a = uVarArr;
        uVarArr[0].k(tVar.p(), tVar.m() * 2);
        this.f7131b = 0;
        c();
    }

    private final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void c() {
        if (this.f7130a[this.f7131b].f()) {
            return;
        }
        for (int i10 = this.f7131b; -1 < i10; i10--) {
            int iF = f(i10);
            if (iF == -1 && this.f7130a[i10].g()) {
                this.f7130a[i10].i();
                iF = f(i10);
            }
            if (iF != -1) {
                this.f7131b = iF;
                return;
            }
            if (i10 > 0) {
                this.f7130a[i10 - 1].i();
            }
            this.f7130a[i10].k(t.f7150e.a().p(), 0);
        }
        this.f7132c = false;
    }

    private final int f(int i10) {
        if (this.f7130a[i10].f()) {
            return i10;
        }
        if (!this.f7130a[i10].g()) {
            return -1;
        }
        t tVarB = this.f7130a[i10].b();
        if (i10 == 6) {
            this.f7130a[i10 + 1].k(tVarB.p(), tVarB.p().length);
        } else {
            this.f7130a[i10 + 1].k(tVarB.p(), tVarB.m() * 2);
        }
        return f(i10 + 1);
    }

    protected final Object b() {
        a();
        return this.f7130a[this.f7131b].a();
    }

    protected final u[] d() {
        return this.f7130a;
    }

    protected final void g(int i10) {
        this.f7131b = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7132c;
    }

    @Override // java.util.Iterator
    public Object next() {
        a();
        Object next = this.f7130a[this.f7131b].next();
        c();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
