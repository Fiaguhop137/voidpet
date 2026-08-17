package p236n2;

import R1.F;
import U1.AbstractC1459a;
import U1.S;
import W1.x;
import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p075e2.t;

/* JADX INFO: renamed from: n2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4011h extends AbstractC4004a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f49776h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f49777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private x f49778j;

    /* JADX INFO: renamed from: n2.h$a */
    private final class a implements L, t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f49779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private L.a f49780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t.a f49781c;

        public a(Object obj) {
            this.f49780b = AbstractC4011h.this.y(null);
            this.f49781c = AbstractC4011h.this.w(null);
            this.f49779a = obj;
        }

        private boolean a(int i10, D.b bVar) {
            D.b bVarH;
            if (bVar != null) {
                bVarH = AbstractC4011h.this.H(this.f49779a, bVar);
                if (bVarH == null) {
                    return false;
                }
            } else {
                bVarH = null;
            }
            int iJ = AbstractC4011h.this.J(this.f49779a, i10);
            L.a aVar = this.f49780b;
            if (aVar.f49509a != iJ || !Objects.equals(aVar.f49510b, bVarH)) {
                this.f49780b = AbstractC4011h.this.x(iJ, bVarH);
            }
            t.a aVar2 = this.f49781c;
            if (aVar2.f40349a == iJ && Objects.equals(aVar2.f40350b, bVarH)) {
                return true;
            }
            this.f49781c = AbstractC4011h.this.v(iJ, bVarH);
            return true;
        }

        private B c(B b10, D.b bVar) {
            long jI = AbstractC4011h.this.I(this.f49779a, b10.f49479f, bVar);
            long jI2 = AbstractC4011h.this.I(this.f49779a, b10.f49480g, bVar);
            return (jI == b10.f49479f && jI2 == b10.f49480g) ? b10 : new B(b10.f49474a, b10.f49475b, b10.f49476c, b10.f49477d, b10.f49478e, jI, jI2);
        }

        @Override // p075e2.t
        public void F(int i10, D.b bVar) {
            if (a(i10, bVar)) {
                this.f49781c.h();
            }
        }

        @Override // p075e2.t
        public void H(int i10, D.b bVar) {
            if (a(i10, bVar)) {
                this.f49781c.m();
            }
        }

        @Override // p236n2.L
        public void L(int i10, D.b bVar, C4027y c4027y, B b10) {
            if (a(i10, bVar)) {
                this.f49780b.q(c4027y, c(b10, bVar));
            }
        }

        @Override // p236n2.L
        public void N(int i10, D.b bVar, B b10) {
            if (a(i10, bVar)) {
                this.f49780b.k(c(b10, bVar));
            }
        }

        @Override // p236n2.L
        public void R(int i10, D.b bVar, C4027y c4027y, B b10, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f49780b.t(c4027y, c(b10, bVar), iOException, z10);
            }
        }

        @Override // p075e2.t
        public void V(int i10, D.b bVar) {
            if (a(i10, bVar)) {
                this.f49781c.i();
            }
        }

        @Override // p075e2.t
        public void c0(int i10, D.b bVar) {
            if (a(i10, bVar)) {
                this.f49781c.j();
            }
        }

        @Override // p236n2.L
        public void f0(int i10, D.b bVar, B b10) {
            if (a(i10, bVar)) {
                this.f49780b.z(c(b10, bVar));
            }
        }

        @Override // p236n2.L
        public void h0(int i10, D.b bVar, C4027y c4027y, B b10, int i11) {
            if (a(i10, bVar)) {
                this.f49780b.w(c4027y, c(b10, bVar), i11);
            }
        }

        @Override // p236n2.L
        public void j0(int i10, D.b bVar, C4027y c4027y, B b10) {
            if (a(i10, bVar)) {
                this.f49780b.n(c4027y, c(b10, bVar));
            }
        }

        @Override // p075e2.t
        public void l0(int i10, D.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f49781c.k(i11);
            }
        }

        @Override // p075e2.t
        public void o0(int i10, D.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f49781c.l(exc);
            }
        }
    }

    /* JADX INFO: renamed from: n2.h$b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D f49783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final D.c f49784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f49785c;

        public b(D d10, D.c cVar, a aVar) {
            this.f49783a = d10;
            this.f49784b = cVar;
            this.f49785c = aVar;
        }
    }

    protected AbstractC4011h() {
    }

    @Override // p236n2.AbstractC4004a
    protected void A() {
        for (b bVar : this.f49776h.values()) {
            bVar.f49783a.r(bVar.f49784b);
        }
    }

    @Override // p236n2.AbstractC4004a
    protected void D(x xVar) {
        this.f49778j = xVar;
        this.f49777i = S.z();
    }

    @Override // p236n2.AbstractC4004a
    protected void F() {
        for (b bVar : this.f49776h.values()) {
            bVar.f49783a.p(bVar.f49784b);
            bVar.f49783a.q(bVar.f49785c);
            bVar.f49783a.d(bVar.f49785c);
        }
        this.f49776h.clear();
    }

    protected abstract D.b H(Object obj, D.b bVar);

    protected long I(Object obj, long j10, D.b bVar) {
        return j10;
    }

    protected int J(Object obj, int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void K(Object obj, D d10, F f10);

    protected final void L(Object obj, D d10) {
        AbstractC1459a.a(!this.f49776h.containsKey(obj));
        D.c c4010g = new C4010g(this, obj);
        a aVar = new a(obj);
        this.f49776h.put(obj, new b(d10, c4010g, aVar));
        d10.a((Handler) AbstractC1459a.e(this.f49777i), aVar);
        d10.e((Handler) AbstractC1459a.e(this.f49777i), aVar);
        d10.b(c4010g, this.f49778j, B());
        if (C()) {
            return;
        }
        d10.h(c4010g);
    }

    @Override // p236n2.D
    public void s() {
        Iterator it = this.f49776h.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).f49783a.s();
        }
    }

    @Override // p236n2.AbstractC4004a
    protected void z() {
        for (b bVar : this.f49776h.values()) {
            bVar.f49783a.h(bVar.f49784b);
        }
    }
}
