package Z1;

import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.InterfaceC1474p;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p003a2.InterfaceC1732a;
import p236n2.C4027y;
import p236n2.C4028z;

/* JADX INFO: loaded from: classes.dex */
final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p003a2.D1 f18396a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f18400e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1732a f18403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC1474p f18404i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private W1.x f18407l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p236n2.e0 f18405j = new n2.e0.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f18398c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f18399d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f18397b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f18401f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f18402g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements p236n2.L, p075e2.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f18408a;

        public a(c cVar) {
            this.f18408a = cVar;
        }

        private Pair J(int i10, n2.D.b bVar) {
            n2.D.b bVar2 = null;
            if (bVar != null) {
                n2.D.b bVarN = o1.n(this.f18408a, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(o1.s(this.f18408a, i10)), bVar2);
        }

        @Override // p075e2.t
        public void F(int i10, n2.D.b bVar) {
            Pair pairJ = J(i10, bVar);
            if (pairJ != null) {
                o1.this.f18404i.h(new RunnableC1681e1(this, pairJ));
            }
        }

        @Override // p075e2.t
        public void H(int i10, n2.D.b bVar) {
            Pair pairJ = J(i10, bVar);
            if (pairJ != null) {
                o1.this.f18404i.h(new RunnableC1693i1(this, pairJ));
            }
        }

        @Override // p236n2.L
        public void L(int i10, n2.D.b bVar, C4027y c4027y, p236n2.B b10) {
            Pair pairJ = J(i10, bVar);
            if (pairJ != null) {
                o1.this.f18404i.h(new RunnableC1696j1(this, pairJ, c4027y, b10));
            }
        }

        @Override // p236n2.L
        public void N(int i10, n2.D.b bVar, p236n2.B b10) {
            Pair pairJ = J(i10, bVar);
            if (pairJ != null) {
                o1.this.f18404i.h(new RunnableC1690h1(this, pairJ, b10));
            }
        }

        @Override // p236n2.L
        public void R(int i10, n2.D.b bVar, C4027y c4027y, p236n2.B b10, IOException iOException, boolean z10) {
            Pair pairJ = J(i10, bVar);
            if (pairJ != null) {
                o1.this.f18404i.h(new RunnableC1705m1(this, pairJ, c4027y, b10, iOException, z10));
            }
        }

        @Override // p075e2.t
        public void V(int i10, n2.D.b bVar) {
            Pair pairJ = J(i10, bVar);
            if (pairJ != null) {
                o1.this.f18404i.h(new RunnableC1708n1(this, pairJ));
            }
        }

        @Override // p075e2.t
        public void c0(int i10, n2.D.b bVar) {
            Pair pairJ = J(i10, bVar);
            if (pairJ != null) {
                o1.this.f18404i.h(new RunnableC1678d1(this, pairJ));
            }
        }

        @Override // p236n2.L
        public void f0(int i10, n2.D.b bVar, p236n2.B b10) {
            Pair pairJ = J(i10, bVar);
            if (pairJ != null) {
                o1.this.f18404i.h(new RunnableC1675c1(this, pairJ, b10));
            }
        }

        @Override // p236n2.L
        public void h0(int i10, n2.D.b bVar, C4027y c4027y, p236n2.B b10, int i11) {
            Pair pairJ = J(i10, bVar);
            if (pairJ != null) {
                o1.this.f18404i.h(new RunnableC1702l1(this, pairJ, c4027y, b10, i11));
            }
        }

        @Override // p236n2.L
        public void j0(int i10, n2.D.b bVar, C4027y c4027y, p236n2.B b10) {
            Pair pairJ = J(i10, bVar);
            if (pairJ != null) {
                o1.this.f18404i.h(new RunnableC1684f1(this, pairJ, c4027y, b10));
            }
        }

        @Override // p075e2.t
        public void l0(int i10, n2.D.b bVar, int i11) {
            Pair pairJ = J(i10, bVar);
            if (pairJ != null) {
                o1.this.f18404i.h(new RunnableC1699k1(this, pairJ, i11));
            }
        }

        @Override // p075e2.t
        public void o0(int i10, n2.D.b bVar, Exception exc) {
            Pair pairJ = J(i10, bVar);
            if (pairJ != null) {
                o1.this.f18404i.h(new RunnableC1687g1(this, pairJ, exc));
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p236n2.D f18410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n2.D.c f18411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f18412c;

        public b(p236n2.D d10, n2.D.c cVar, a aVar) {
            this.f18410a = d10;
            this.f18411b = cVar;
            this.f18412c = aVar;
        }
    }

    static final class c implements InterfaceC1669a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p236n2.A f18413a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18416d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f18417e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f18415c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f18414b = new Object();

        public c(p236n2.D d10, boolean z10) {
            this.f18413a = new p236n2.A(d10, z10);
        }

        @Override // Z1.InterfaceC1669a1
        public Object a() {
            return this.f18414b;
        }

        @Override // Z1.InterfaceC1669a1
        public R1.F b() {
            return this.f18413a.Z();
        }

        public void c(int i10) {
            this.f18416d = i10;
            this.f18417e = false;
            this.f18415c.clear();
        }
    }

    public interface d {
        void d();
    }

    public o1(d dVar, InterfaceC1732a interfaceC1732a, InterfaceC1474p interfaceC1474p, p003a2.D1 d10) {
        this.f18396a = d10;
        this.f18400e = dVar;
        this.f18403h = interfaceC1732a;
        this.f18404i = interfaceC1474p;
    }

    private void A(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVar = (c) this.f18397b.remove(i12);
            this.f18399d.remove(cVar.f18414b);
            g(i12, -cVar.f18413a.Z().p());
            cVar.f18417e = true;
            if (this.f18406k) {
                u(cVar);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f18397b.size()) {
            ((c) this.f18397b.get(i10)).f18416d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = (b) this.f18401f.get(cVar);
        if (bVar != null) {
            bVar.f18410a.h(bVar.f18411b);
        }
    }

    private void k() {
        Iterator it = this.f18402g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f18415c.isEmpty()) {
                j(cVar);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f18402g.add(cVar);
        b bVar = (b) this.f18401f.get(cVar);
        if (bVar != null) {
            bVar.f18410a.r(bVar.f18411b);
        }
    }

    private static Object m(Object obj) {
        return AbstractC1667a.v(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n2.D.b n(c cVar, n2.D.b bVar) {
        for (int i10 = 0; i10 < cVar.f18415c.size(); i10++) {
            if (((n2.D.b) cVar.f18415c.get(i10)).f49485d == bVar.f49485d) {
                return bVar.a(p(cVar, bVar.f49482a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return AbstractC1667a.w(obj);
    }

    private static Object p(c cVar, Object obj) {
        return AbstractC1667a.y(cVar.f18414b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i10) {
        return i10 + cVar.f18416d;
    }

    private void u(c cVar) {
        if (cVar.f18417e && cVar.f18415c.isEmpty()) {
            b bVar = (b) AbstractC1459a.e((b) this.f18401f.remove(cVar));
            bVar.f18410a.p(bVar.f18411b);
            bVar.f18410a.q(bVar.f18412c);
            bVar.f18410a.d(bVar.f18412c);
            this.f18402g.remove(cVar);
        }
    }

    private void w(c cVar) {
        p236n2.A a10 = cVar.f18413a;
        C1672b1 c1672b1 = new C1672b1(this);
        a aVar = new a(cVar);
        this.f18401f.put(cVar, new b(a10, c1672b1, aVar));
        a10.a(U1.S.B(), aVar);
        a10.e(U1.S.B(), aVar);
        a10.b(c1672b1, this.f18407l, this.f18396a);
    }

    public R1.F B(List list, p236n2.e0 e0Var) {
        A(0, this.f18397b.size());
        return f(this.f18397b.size(), list, e0Var);
    }

    public R1.F C(p236n2.e0 e0Var) {
        int iR = r();
        if (e0Var.getLength() != iR) {
            e0Var = e0Var.e().g(0, iR);
        }
        this.f18405j = e0Var;
        return i();
    }

    public R1.F D(int i10, int i11, List list) {
        AbstractC1459a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        AbstractC1459a.a(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((c) this.f18397b.get(i12)).f18413a.f((R1.u) list.get(i12 - i10));
        }
        return i();
    }

    public R1.F f(int i10, List list, p236n2.e0 e0Var) {
        if (!list.isEmpty()) {
            this.f18405j = e0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = (c) list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = (c) this.f18397b.get(i11 - 1);
                    cVar.c(cVar2.f18416d + cVar2.f18413a.Z().p());
                } else {
                    cVar.c(0);
                }
                g(i11, cVar.f18413a.Z().p());
                this.f18397b.add(i11, cVar);
                this.f18399d.put(cVar.f18414b, cVar);
                if (this.f18406k) {
                    w(cVar);
                    if (this.f18398c.isEmpty()) {
                        this.f18402g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public p236n2.C h(n2.D.b bVar, p308r2.b bVar2, long j10) {
        Object objO = o(bVar.f49482a);
        n2.D.b bVarA = bVar.a(m(bVar.f49482a));
        c cVar = (c) AbstractC1459a.e((c) this.f18399d.get(objO));
        l(cVar);
        cVar.f18415c.add(bVarA);
        C4028z c4028zO = cVar.f18413a.o(bVarA, bVar2, j10);
        this.f18398c.put(c4028zO, cVar);
        k();
        return c4028zO;
    }

    public R1.F i() {
        if (this.f18397b.isEmpty()) {
            return R1.F.f9913a;
        }
        int iP = 0;
        for (int i10 = 0; i10 < this.f18397b.size(); i10++) {
            c cVar = (c) this.f18397b.get(i10);
            cVar.f18416d = iP;
            iP += cVar.f18413a.Z().p();
        }
        return new s1(this.f18397b, this.f18405j);
    }

    public p236n2.e0 q() {
        return this.f18405j;
    }

    public int r() {
        return this.f18397b.size();
    }

    public boolean t() {
        return this.f18406k;
    }

    public void v(W1.x xVar) {
        AbstractC1459a.g(!this.f18406k);
        this.f18407l = xVar;
        for (int i10 = 0; i10 < this.f18397b.size(); i10++) {
            c cVar = (c) this.f18397b.get(i10);
            w(cVar);
            this.f18402g.add(cVar);
        }
        this.f18406k = true;
    }

    public void x() {
        for (b bVar : this.f18401f.values()) {
            try {
                bVar.f18410a.p(bVar.f18411b);
            } catch (RuntimeException e10) {
                AbstractC1477t.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f18410a.q(bVar.f18412c);
            bVar.f18410a.d(bVar.f18412c);
        }
        this.f18401f.clear();
        this.f18402g.clear();
        this.f18406k = false;
    }

    public void y(p236n2.C c10) {
        c cVar = (c) AbstractC1459a.e((c) this.f18398c.remove(c10));
        cVar.f18413a.g(c10);
        cVar.f18415c.remove(((C4028z) c10).f49883a);
        if (!this.f18398c.isEmpty()) {
            k();
        }
        u(cVar);
    }

    public R1.F z(int i10, int i11, p236n2.e0 e0Var) {
        AbstractC1459a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        this.f18405j = e0Var;
        A(i10, i11);
        return i();
    }
}
