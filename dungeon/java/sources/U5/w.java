package U5;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class w implements n, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n.b f13169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final m f13170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final m f13171c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final D f13173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x.a f13174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V4.n f13175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected y f13176h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f13178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f13179k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map f13172d = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f13177i = SystemClock.uptimeMillis();

    class a implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ D f13180a;

        a(D d10) {
            this.f13180a = d10;
        }

        @Override // U5.D
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(n.a aVar) {
            return w.this.f13178j ? aVar.f13159g : this.f13180a.a(aVar.f13154b.m());
        }
    }

    class b implements Z4.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a f13182a;

        b(n.a aVar) {
            this.f13182a = aVar;
        }

        @Override // Z4.h
        public void a(Object obj) {
            w.this.z(this.f13182a);
        }
    }

    public w(D d10, x.a aVar, V4.n nVar, n.b bVar, boolean z10, boolean z11) {
        this.f13173e = d10;
        this.f13170b = new m(B(d10));
        this.f13171c = new m(B(d10));
        this.f13174f = aVar;
        this.f13175g = nVar;
        this.f13176h = (y) V4.k.h((y) nVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f13169a = bVar;
        this.f13178j = z10;
        this.f13179k = z11;
    }

    private synchronized ArrayList A(int i10, int i11) {
        int iMax = Math.max(i10, 0);
        int iMax2 = Math.max(i11, 0);
        if (this.f13170b.c() <= iMax && this.f13170b.f() <= iMax2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.f13170b.c() <= iMax && this.f13170b.f() <= iMax2) {
                break;
            }
            Object objD = this.f13170b.d();
            if (objD == null) {
                if (!this.f13179k) {
                    throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.f13170b.c()), Integer.valueOf(this.f13170b.f())));
                }
                this.f13170b.k();
                break;
            }
            this.f13170b.i(objD);
            arrayList.add((n.a) this.f13171c.i(objD));
        }
        return arrayList;
    }

    private D B(D d10) {
        return new a(d10);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    private synchronized boolean j(int i10) {
        boolean z10;
        if (i10 <= this.f13176h.f13188e) {
            z10 = l() <= this.f13176h.f13185b - 1 && m() <= this.f13176h.f13184a - i10;
        }
        return z10;
    }

    private synchronized void k(n.a aVar) {
        V4.k.g(aVar);
        V4.k.i(aVar.f13155c > 0);
        aVar.f13155c--;
    }

    private synchronized void n(n.a aVar) {
        V4.k.g(aVar);
        V4.k.i(!aVar.f13156d);
        aVar.f13155c++;
    }

    private synchronized void o(n.a aVar) {
        V4.k.g(aVar);
        V4.k.i(!aVar.f13156d);
        aVar.f13156d = true;
    }

    private synchronized void p(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o((n.a) it.next());
            }
        }
    }

    private synchronized boolean q(n.a aVar) {
        if (aVar.f13156d || aVar.f13155c != 0) {
            return false;
        }
        this.f13170b.h(aVar.f13153a, aVar);
        return true;
    }

    private void r(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Z4.a.g(y((n.a) it.next()));
            }
        }
    }

    private static void t(n.a aVar) {
        n.b bVar;
        if (aVar == null || (bVar = aVar.f13157e) == null) {
            return;
        }
        bVar.a(aVar.f13153a, true);
    }

    private static void u(n.a aVar) {
        n.b bVar;
        if (aVar == null || (bVar = aVar.f13157e) == null) {
            return;
        }
        bVar.a(aVar.f13153a, false);
    }

    private void v(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u((n.a) it.next());
            }
        }
    }

    private synchronized void w() {
        if (this.f13177i + this.f13176h.f13189f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f13177i = SystemClock.uptimeMillis();
        this.f13176h = (y) V4.k.h((y) this.f13175g.get(), "mMemoryCacheParamsSupplier returned null");
    }

    private synchronized Z4.a x(n.a aVar) {
        n(aVar);
        return Z4.a.x(aVar.f13154b.m(), new b(aVar));
    }

    private synchronized Z4.a y(n.a aVar) {
        V4.k.g(aVar);
        return (aVar.f13156d && aVar.f13155c == 0) ? aVar.f13154b : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(n.a aVar) {
        boolean zQ;
        Z4.a aVarY;
        V4.k.g(aVar);
        synchronized (this) {
            k(aVar);
            zQ = q(aVar);
            aVarY = y(aVar);
        }
        Z4.a.g(aVarY);
        if (!zQ) {
            aVar = null;
        }
        t(aVar);
        w();
        s();
    }

    @Override // U5.x
    public void b(Object obj) {
        V4.k.g(obj);
        synchronized (this) {
            try {
                n.a aVar = (n.a) this.f13170b.i(obj);
                if (aVar != null) {
                    this.f13170b.h(obj, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // U5.n
    public Z4.a c(Object obj, Z4.a aVar, n.b bVar) {
        n.a aVar2;
        Z4.a aVarX;
        Z4.a aVarY;
        V4.k.g(obj);
        V4.k.g(aVar);
        w();
        synchronized (this) {
            try {
                aVar2 = (n.a) this.f13170b.i(obj);
                n.a aVar3 = (n.a) this.f13171c.i(obj);
                aVarX = null;
                if (aVar3 != null) {
                    o(aVar3);
                    aVarY = y(aVar3);
                } else {
                    aVarY = null;
                }
                int iA = this.f13173e.a(aVar.m());
                if (j(iA)) {
                    n.a aVarA = this.f13178j ? n.a.a(obj, aVar, iA, bVar) : n.a.b(obj, aVar, bVar);
                    this.f13171c.h(obj, aVarA);
                    aVarX = x(aVarA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Z4.a.g(aVarY);
        u(aVar2);
        s();
        return aVarX;
    }

    @Override // U5.x
    public synchronized boolean contains(Object obj) {
        return this.f13171c.a(obj);
    }

    @Override // U5.x
    public synchronized boolean d(V4.l lVar) {
        return !this.f13171c.e(lVar).isEmpty();
    }

    @Override // U5.x
    public int e(V4.l lVar) {
        ArrayList arrayListJ;
        ArrayList arrayListJ2;
        synchronized (this) {
            arrayListJ = this.f13170b.j(lVar);
            arrayListJ2 = this.f13171c.j(lVar);
            p(arrayListJ2);
        }
        r(arrayListJ2);
        v(arrayListJ);
        w();
        s();
        return arrayListJ2.size();
    }

    @Override // U5.n
    public Z4.a f(Object obj) {
        n.a aVar;
        boolean z10;
        Z4.a aVar2;
        V4.k.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f13170b.i(obj);
                z10 = false;
                if (aVar != null) {
                    n.a aVar3 = (n.a) this.f13171c.i(obj);
                    V4.k.g(aVar3);
                    V4.k.i(aVar3.f13155c == 0);
                    aVar2 = aVar3.f13154b;
                    z10 = true;
                } else {
                    aVar2 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            u(aVar);
        }
        return aVar2;
    }

    @Override // U5.x
    public Z4.a g(Object obj, Z4.a aVar) {
        return c(obj, aVar, this.f13169a);
    }

    @Override // U5.x
    public Z4.a get(Object obj) {
        n.a aVar;
        Z4.a aVarX;
        V4.k.g(obj);
        synchronized (this) {
            try {
                aVar = (n.a) this.f13170b.i(obj);
                n.a aVar2 = (n.a) this.f13171c.b(obj);
                aVarX = aVar2 != null ? x(aVar2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        u(aVar);
        w();
        s();
        return aVarX;
    }

    public synchronized int l() {
        return this.f13171c.c() - this.f13170b.c();
    }

    public synchronized int m() {
        return this.f13171c.f() - this.f13170b.f();
    }

    public void s() {
        ArrayList arrayListA;
        synchronized (this) {
            y yVar = this.f13176h;
            int iMin = Math.min(yVar.f13187d, yVar.f13185b - l());
            y yVar2 = this.f13176h;
            arrayListA = A(iMin, Math.min(yVar2.f13186c, yVar2.f13184a - m()));
            p(arrayListA);
        }
        r(arrayListA);
        v(arrayListA);
    }
}
