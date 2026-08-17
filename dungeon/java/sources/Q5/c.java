package Q5;

import U5.n;
import V4.i;
import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P4.d f9479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f9480b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f9482d = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n.b f9481c = new a();

    class a implements n.b {
        a() {
        }

        @Override // U5.n.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(P4.d dVar, boolean z10) {
            c.this.f(dVar, z10);
        }
    }

    static class b implements P4.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final P4.d f9484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9485b;

        public b(P4.d dVar, int i10) {
            this.f9484a = dVar;
            this.f9485b = i10;
        }

        @Override // P4.d
        public String a() {
            return null;
        }

        @Override // P4.d
        public boolean b(Uri uri) {
            return this.f9484a.b(uri);
        }

        @Override // P4.d
        public boolean c() {
            return false;
        }

        @Override // P4.d
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f9485b == bVar.f9485b && this.f9484a.equals(bVar.f9484a)) {
                    return true;
                }
            }
            return false;
        }

        @Override // P4.d
        public int hashCode() {
            return (this.f9484a.hashCode() * 1013) + this.f9485b;
        }

        public String toString() {
            return i.b(this).b("imageCacheKey", this.f9484a).a("frameIndex", this.f9485b).toString();
        }
    }

    public c(P4.d dVar, n nVar) {
        this.f9479a = dVar;
        this.f9480b = nVar;
    }

    private b e(int i10) {
        return new b(this.f9479a, i10);
    }

    private synchronized P4.d g() {
        P4.d dVar;
        Iterator it = this.f9482d.iterator();
        if (it.hasNext()) {
            dVar = (P4.d) it.next();
            it.remove();
        } else {
            dVar = null;
        }
        return dVar;
    }

    public Z4.a a(int i10, Z4.a aVar) {
        return this.f9480b.c(e(i10), aVar, this.f9481c);
    }

    public boolean b(int i10) {
        return this.f9480b.contains(e(i10));
    }

    public Z4.a c(int i10) {
        return this.f9480b.get(e(i10));
    }

    public Z4.a d() {
        Z4.a aVarF;
        do {
            P4.d dVarG = g();
            if (dVarG == null) {
                return null;
            }
            aVarF = this.f9480b.f(dVarG);
        } while (aVarF == null);
        return aVarF;
    }

    public synchronized void f(P4.d dVar, boolean z10) {
        try {
            if (z10) {
                this.f9482d.add(dVar);
            } else {
                this.f9482d.remove(dVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
