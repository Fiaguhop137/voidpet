package p096f5;

import V4.i;
import V4.k;
import V4.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f41764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41765b;

    private class a extends p096f5.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ArrayList f41766h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f41767i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f41768j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private AtomicInteger f41769k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Throwable f41770l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Map f41771m;

        /* JADX INFO: renamed from: f5.h$a$a, reason: collision with other inner class name */
        private class C0478a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f41773a;

            public C0478a(int i10) {
                this.f41773a = i10;
            }

            @Override // p096f5.e
            public void a(c cVar) {
            }

            @Override // p096f5.e
            public void b(c cVar) {
                a.this.G(this.f41773a, cVar);
            }

            @Override // p096f5.e
            public void c(c cVar) {
                if (cVar.c()) {
                    a.this.H(this.f41773a, cVar);
                } else if (cVar.a()) {
                    a.this.G(this.f41773a, cVar);
                }
            }

            @Override // p096f5.e
            public void d(c cVar) {
                if (this.f41773a == 0) {
                    a.this.s(cVar.e());
                }
            }
        }

        public a() {
            if (h.this.f41765b) {
                return;
            }
            A();
        }

        private void A() {
            if (this.f41769k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f41769k == null) {
                        this.f41769k = new AtomicInteger(0);
                        int size = h.this.f41764a.size();
                        this.f41768j = size;
                        this.f41767i = size;
                        this.f41766h = new ArrayList(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            c cVar = (c) ((n) h.this.f41764a.get(i10)).get();
                            this.f41766h.add(cVar);
                            cVar.g(new C0478a(i10), T4.a.a());
                            if (cVar.c()) {
                                break;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private synchronized c B(int i10) {
            c cVar;
            ArrayList arrayList = this.f41766h;
            cVar = null;
            if (arrayList != null && i10 < arrayList.size()) {
                cVar = (c) this.f41766h.set(i10, null);
            }
            return cVar;
        }

        private synchronized c C(int i10) {
            ArrayList arrayList;
            arrayList = this.f41766h;
            return (arrayList == null || i10 >= arrayList.size()) ? null : (c) this.f41766h.get(i10);
        }

        private synchronized c D() {
            return C(this.f41767i);
        }

        private void E() {
            Throwable th;
            if (this.f41769k.incrementAndGet() != this.f41768j || (th = this.f41770l) == null) {
                return;
            }
            q(th, this.f41771m);
        }

        private void F(int i10, c cVar, boolean z10) {
            synchronized (this) {
                try {
                    int i11 = this.f41767i;
                    if (cVar == C(i10) && i10 != this.f41767i) {
                        if (D() == null || (z10 && i10 < this.f41767i)) {
                            this.f41767i = i10;
                        } else {
                            i10 = i11;
                        }
                        while (i11 > i10) {
                            z(B(i11));
                            i11--;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G(int i10, c cVar) {
            z(I(i10, cVar));
            if (i10 == 0) {
                this.f41770l = cVar.d();
                this.f41771m = cVar.getExtras();
            }
            E();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H(int i10, c cVar) {
            F(i10, cVar, cVar.a());
            if (cVar == D()) {
                u(null, i10 == 0 && cVar.a(), cVar.getExtras());
            }
            E();
        }

        private synchronized c I(int i10, c cVar) {
            if (cVar == D()) {
                return null;
            }
            if (cVar != C(i10)) {
                return cVar;
            }
            return B(i10);
        }

        private void z(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        @Override // p096f5.a, p096f5.c
        public synchronized Object b() {
            c cVarD;
            try {
                if (h.this.f41765b) {
                    A();
                }
                cVarD = D();
            } catch (Throwable th) {
                throw th;
            }
            return cVarD != null ? cVarD.b() : null;
        }

        @Override // p096f5.a, p096f5.c
        public synchronized boolean c() {
            c cVarD;
            try {
                if (h.this.f41765b) {
                    A();
                }
                cVarD = D();
            } catch (Throwable th) {
                throw th;
            }
            return cVarD != null && cVarD.c();
        }

        @Override // p096f5.a, p096f5.c
        public boolean close() {
            if (h.this.f41765b) {
                A();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList arrayList = this.f41766h;
                    this.f41766h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        z((c) arrayList.get(i10));
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private h(List list, boolean z10) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f41764a = list;
        this.f41765b = z10;
    }

    public static h c(List list, boolean z10) {
        return new h(list, z10);
    }

    @Override // V4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return i.a(this.f41764a, ((h) obj).f41764a);
        }
        return false;
    }

    public int hashCode() {
        return this.f41764a.hashCode();
    }

    public String toString() {
        return i.b(this).b("list", this.f41764a).toString();
    }
}
