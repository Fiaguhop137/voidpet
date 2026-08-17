package p096f5;

import V4.i;
import V4.k;
import V4.n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f41758a;

    private class a extends p096f5.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f41759h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c f41760i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private c f41761j = null;

        /* JADX INFO: renamed from: f5.f$a$a, reason: collision with other inner class name */
        private class C0477a implements e {
            private C0477a() {
            }

            /* synthetic */ C0477a(a aVar, g gVar) {
                this();
            }

            @Override // p096f5.e
            public void a(c cVar) {
            }

            @Override // p096f5.e
            public void b(c cVar) {
                a.this.E(cVar);
            }

            @Override // p096f5.e
            public void c(c cVar) {
                if (cVar.c()) {
                    a.this.F(cVar);
                } else if (cVar.a()) {
                    a.this.E(cVar);
                }
            }

            @Override // p096f5.e
            public void d(c cVar) {
                a.this.s(Math.max(a.this.e(), cVar.e()));
            }
        }

        public a() {
            if (H()) {
                return;
            }
            p(new RuntimeException("No data source supplier or supplier returned null."));
        }

        private void A(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private synchronized c B() {
            return this.f41761j;
        }

        private synchronized n C() {
            if (k() || this.f41759h >= f.this.f41758a.size()) {
                return null;
            }
            List list = f.this.f41758a;
            int i10 = this.f41759h;
            this.f41759h = i10 + 1;
            return (n) list.get(i10);
        }

        private void D(c cVar, boolean z10) {
            c cVar2;
            synchronized (this) {
                if (cVar == this.f41760i && cVar != (cVar2 = this.f41761j)) {
                    if (cVar2 == null || z10) {
                        this.f41761j = cVar;
                    } else {
                        cVar2 = null;
                    }
                    A(cVar2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(c cVar) {
            if (z(cVar)) {
                if (cVar != B()) {
                    A(cVar);
                }
                if (H()) {
                    return;
                }
                q(cVar.d(), cVar.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F(c cVar) {
            D(cVar, cVar.a());
            if (cVar == B()) {
                u(null, cVar.a(), cVar.getExtras());
            }
        }

        private synchronized boolean G(c cVar) {
            if (k()) {
                return false;
            }
            this.f41760i = cVar;
            return true;
        }

        private boolean H() {
            n nVarC = C();
            c cVar = nVarC != null ? (c) nVarC.get() : null;
            if (!G(cVar) || cVar == null) {
                A(cVar);
                return false;
            }
            cVar.g(new C0477a(this, null), T4.a.a());
            return true;
        }

        private synchronized boolean z(c cVar) {
            if (!k() && cVar == this.f41760i) {
                this.f41760i = null;
                return true;
            }
            return false;
        }

        @Override // p096f5.a, p096f5.c
        public synchronized Object b() {
            c cVarB;
            cVarB = B();
            return cVarB != null ? cVarB.b() : null;
        }

        @Override // p096f5.a, p096f5.c
        public synchronized boolean c() {
            c cVarB;
            cVarB = B();
            return cVarB != null && cVarB.c();
        }

        @Override // p096f5.a, p096f5.c
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    c cVar = this.f41760i;
                    this.f41760i = null;
                    c cVar2 = this.f41761j;
                    this.f41761j = null;
                    A(cVar2);
                    A(cVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private f(List list) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f41758a = list;
    }

    public static f b(List list) {
        return new f(list);
    }

    @Override // V4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return i.a(this.f41758a, ((f) obj).f41758a);
        }
        return false;
    }

    public int hashCode() {
        return this.f41758a.hashCode();
    }

    public String toString() {
        return i.b(this).b("list", this.f41758a).toString();
    }
}
