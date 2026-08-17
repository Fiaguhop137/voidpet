package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1952h implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1951g f23470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23473d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23474a;

        static {
            int[] iArr = new int[m0.b.values().length];
            f23474a = iArr;
            try {
                iArr[m0.b.f23535j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23474a[m0.b.f23539n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23474a[m0.b.f23528c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23474a[m0.b.f23541p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23474a[m0.b.f23534i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23474a[m0.b.f23533h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23474a[m0.b.f23529d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23474a[m0.b.f23532g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23474a[m0.b.f23530e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23474a[m0.b.f23538m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23474a[m0.b.f23542q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23474a[m0.b.f23543r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23474a[m0.b.f23544s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23474a[m0.b.f23545t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23474a[m0.b.f23536k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23474a[m0.b.f23540o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23474a[m0.b.f23531f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C1952h(AbstractC1951g abstractC1951g) {
        AbstractC1951g abstractC1951g2 = (AbstractC1951g) AbstractC1964u.b(abstractC1951g, "input");
        this.f23470a = abstractC1951g2;
        abstractC1951g2.f23450d = this;
    }

    public static C1952h N(AbstractC1951g abstractC1951g) {
        C1952h c1952h = abstractC1951g.f23450d;
        return c1952h != null ? c1952h : new C1952h(abstractC1951g);
    }

    private void O(Object obj, a0 a0Var, C1957m c1957m) {
        int i10 = this.f23472c;
        this.f23472c = m0.c(m0.a(this.f23471b), 4);
        try {
            a0Var.h(obj, this, c1957m);
            if (this.f23471b != this.f23472c) {
                throw C1965v.h();
            }
            this.f23472c = i10;
        } catch (Throwable th) {
            this.f23472c = i10;
            throw th;
        }
    }

    private void P(Object obj, a0 a0Var, C1957m c1957m) throws C1965v {
        int iD = this.f23470a.D();
        AbstractC1951g abstractC1951g = this.f23470a;
        if (abstractC1951g.f23447a >= abstractC1951g.f23448b) {
            throw C1965v.i();
        }
        int iM = abstractC1951g.m(iD);
        this.f23470a.f23447a++;
        a0Var.h(obj, this, c1957m);
        this.f23470a.a(0);
        AbstractC1951g abstractC1951g2 = this.f23470a;
        abstractC1951g2.f23447a--;
        abstractC1951g2.l(iM);
    }

    private Object Q(m0.b bVar, Class cls, C1957m c1957m) {
        switch (a.f23474a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(d());
            case 2:
                return n();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(j());
            case 5:
                return Integer.valueOf(t());
            case 6:
                return Long.valueOf(a());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(o());
            case 9:
                return Long.valueOf(G());
            case 10:
                return T(cls, c1957m);
            case 11:
                return Integer.valueOf(D());
            case 12:
                return Long.valueOf(e());
            case 13:
                return Integer.valueOf(k());
            case 14:
                return Long.valueOf(x());
            case 15:
                return H();
            case 16:
                return Integer.valueOf(g());
            case 17:
                return Long.valueOf(r());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private Object R(a0 a0Var, C1957m c1957m) {
        Object objB = a0Var.b();
        O(objB, a0Var, c1957m);
        a0Var.c(objB);
        return objB;
    }

    private Object S(a0 a0Var, C1957m c1957m) throws C1965v {
        Object objB = a0Var.b();
        P(objB, a0Var, c1957m);
        a0Var.c(objB);
        return objB;
    }

    private void V(int i10) throws C1965v {
        if (this.f23470a.e() != i10) {
            throw C1965v.m();
        }
    }

    private void W(int i10) throws C1965v.a {
        if (m0.b(this.f23471b) != i10) {
            throw C1965v.e();
        }
    }

    private void X(int i10) throws C1965v {
        if ((i10 & 3) != 0) {
            throw C1965v.h();
        }
    }

    private void Y(int i10) throws C1965v {
        if ((i10 & 7) != 0) {
            throw C1965v.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void A(List list) throws C1965v.a {
        U(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void B(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 2) {
            int iD = this.f23470a.D();
            X(iD);
            int iE = this.f23470a.e() + iD;
            do {
                list.add(Float.valueOf(this.f23470a.t()));
            } while (this.f23470a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C1965v.e();
        }
        do {
            list.add(Float.valueOf(this.f23470a.t()));
            if (this.f23470a.f()) {
                return;
            } else {
                iC = this.f23470a.C();
            }
        } while (iC == this.f23471b);
        this.f23473d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public boolean C() {
        int i10;
        if (this.f23470a.f() || (i10 = this.f23471b) == this.f23472c) {
            return false;
        }
        return this.f23470a.F(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int D() throws C1965v.a {
        W(5);
        return this.f23470a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void E(List list) throws C1965v.a {
        int iC;
        if (m0.b(this.f23471b) != 2) {
            throw C1965v.e();
        }
        do {
            list.add(n());
            if (this.f23470a.f()) {
                return;
            } else {
                iC = this.f23470a.C();
            }
        } while (iC == this.f23471b);
        this.f23473d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void F(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 1) {
            do {
                list.add(Double.valueOf(this.f23470a.p()));
                if (this.f23470a.f()) {
                    return;
                } else {
                    iC = this.f23470a.C();
                }
            } while (iC == this.f23471b);
            this.f23473d = iC;
            return;
        }
        if (iB != 2) {
            throw C1965v.e();
        }
        int iD = this.f23470a.D();
        Y(iD);
        int iE = this.f23470a.e() + iD;
        do {
            list.add(Double.valueOf(this.f23470a.p()));
        } while (this.f23470a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public long G() throws C1965v.a {
        W(0);
        return this.f23470a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public String H() throws C1965v.a {
        W(2);
        return this.f23470a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void I(Object obj, a0 a0Var, C1957m c1957m) throws C1965v {
        W(2);
        P(obj, a0Var, c1957m);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void J(List list, a0 a0Var, C1957m c1957m) throws C1965v.a {
        int iC;
        if (m0.b(this.f23471b) != 2) {
            throw C1965v.e();
        }
        int i10 = this.f23471b;
        do {
            list.add(S(a0Var, c1957m));
            if (this.f23470a.f() || this.f23473d != 0) {
                return;
            } else {
                iC = this.f23470a.C();
            }
        } while (iC == i10);
        this.f23473d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void K(Map map, D.a aVar, C1957m c1957m) throws C1965v.a {
        W(2);
        int iM = this.f23470a.m(this.f23470a.D());
        Object objQ = aVar.f23361b;
        Object objQ2 = aVar.f23363d;
        while (true) {
            try {
                int iZ = z();
                if (iZ == Integer.MAX_VALUE || this.f23470a.f()) {
                    break;
                }
                if (iZ == 1) {
                    objQ = Q(aVar.f23360a, null, null);
                } else if (iZ != 2) {
                    try {
                        if (!C()) {
                            throw new C1965v("Unable to parse map entry.");
                        }
                    } catch (C1965v.a unused) {
                        if (!C()) {
                            throw new C1965v("Unable to parse map entry.");
                        }
                    }
                } else {
                    objQ2 = Q(aVar.f23362c, aVar.f23363d.getClass(), c1957m);
                }
            } catch (Throwable th) {
                this.f23470a.l(iM);
                throw th;
            }
        }
        map.put(objQ, objQ2);
        this.f23470a.l(iM);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void L(Object obj, a0 a0Var, C1957m c1957m) throws C1965v.a {
        W(3);
        O(obj, a0Var, c1957m);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void M(List list, a0 a0Var, C1957m c1957m) throws C1965v.a {
        int iC;
        if (m0.b(this.f23471b) != 3) {
            throw C1965v.e();
        }
        int i10 = this.f23471b;
        do {
            list.add(R(a0Var, c1957m));
            if (this.f23470a.f() || this.f23473d != 0) {
                return;
            } else {
                iC = this.f23470a.C();
            }
        } while (iC == i10);
        this.f23473d = iC;
    }

    public Object T(Class cls, C1957m c1957m) throws C1965v.a {
        W(2);
        return S(W.a().c(cls), c1957m);
    }

    public void U(List list, boolean z10) throws C1965v.a {
        int iC;
        if (m0.b(this.f23471b) != 2) {
            throw C1965v.e();
        }
        do {
            list.add(z10 ? H() : y());
            if (this.f23470a.f()) {
                return;
            } else {
                iC = this.f23470a.C();
            }
        } while (iC == this.f23471b);
        this.f23473d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public long a() throws C1965v.a {
        W(1);
        return this.f23470a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void b(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 2) {
            int iD = this.f23470a.D();
            X(iD);
            int iE = this.f23470a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f23470a.w()));
            } while (this.f23470a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C1965v.e();
        }
        do {
            list.add(Integer.valueOf(this.f23470a.w()));
            if (this.f23470a.f()) {
                return;
            } else {
                iC = this.f23470a.C();
            }
        } while (iC == this.f23471b);
        this.f23473d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void c(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f23470a.z()));
                if (this.f23470a.f()) {
                    return;
                } else {
                    iC = this.f23470a.C();
                }
            } while (iC == this.f23471b);
            this.f23473d = iC;
            return;
        }
        if (iB != 2) {
            throw C1965v.e();
        }
        int iE = this.f23470a.e() + this.f23470a.D();
        do {
            list.add(Long.valueOf(this.f23470a.z()));
        } while (this.f23470a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public boolean d() throws C1965v.a {
        W(0);
        return this.f23470a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public long e() throws C1965v.a {
        W(1);
        return this.f23470a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void f(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f23470a.E()));
                if (this.f23470a.f()) {
                    return;
                } else {
                    iC = this.f23470a.C();
                }
            } while (iC == this.f23471b);
            this.f23473d = iC;
            return;
        }
        if (iB != 2) {
            throw C1965v.e();
        }
        int iE = this.f23470a.e() + this.f23470a.D();
        do {
            list.add(Long.valueOf(this.f23470a.E()));
        } while (this.f23470a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int g() throws C1965v.a {
        W(0);
        return this.f23470a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int getTag() {
        return this.f23471b;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void h(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f23470a.v()));
                if (this.f23470a.f()) {
                    return;
                } else {
                    iC = this.f23470a.C();
                }
            } while (iC == this.f23471b);
            this.f23473d = iC;
            return;
        }
        if (iB != 2) {
            throw C1965v.e();
        }
        int iE = this.f23470a.e() + this.f23470a.D();
        do {
            list.add(Long.valueOf(this.f23470a.v()));
        } while (this.f23470a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void i(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f23470a.q()));
                if (this.f23470a.f()) {
                    return;
                } else {
                    iC = this.f23470a.C();
                }
            } while (iC == this.f23471b);
            this.f23473d = iC;
            return;
        }
        if (iB != 2) {
            throw C1965v.e();
        }
        int iE = this.f23470a.e() + this.f23470a.D();
        do {
            list.add(Integer.valueOf(this.f23470a.q()));
        } while (this.f23470a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int j() throws C1965v.a {
        W(0);
        return this.f23470a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int k() throws C1965v.a {
        W(0);
        return this.f23470a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void l(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 0) {
            do {
                list.add(Boolean.valueOf(this.f23470a.n()));
                if (this.f23470a.f()) {
                    return;
                } else {
                    iC = this.f23470a.C();
                }
            } while (iC == this.f23471b);
            this.f23473d = iC;
            return;
        }
        if (iB != 2) {
            throw C1965v.e();
        }
        int iE = this.f23470a.e() + this.f23470a.D();
        do {
            list.add(Boolean.valueOf(this.f23470a.n()));
        } while (this.f23470a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void m(List list) throws C1965v.a {
        U(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public AbstractC1950f n() throws C1965v.a {
        W(2);
        return this.f23470a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int o() throws C1965v.a {
        W(0);
        return this.f23470a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void p(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f23470a.s()));
                if (this.f23470a.f()) {
                    return;
                } else {
                    iC = this.f23470a.C();
                }
            } while (iC == this.f23471b);
            this.f23473d = iC;
            return;
        }
        if (iB != 2) {
            throw C1965v.e();
        }
        int iD = this.f23470a.D();
        Y(iD);
        int iE = this.f23470a.e() + iD;
        do {
            list.add(Long.valueOf(this.f23470a.s()));
        } while (this.f23470a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void q(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f23470a.y()));
                if (this.f23470a.f()) {
                    return;
                } else {
                    iC = this.f23470a.C();
                }
            } while (iC == this.f23471b);
            this.f23473d = iC;
            return;
        }
        if (iB != 2) {
            throw C1965v.e();
        }
        int iE = this.f23470a.e() + this.f23470a.D();
        do {
            list.add(Integer.valueOf(this.f23470a.y()));
        } while (this.f23470a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public long r() throws C1965v.a {
        W(0);
        return this.f23470a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public double readDouble() throws C1965v.a {
        W(1);
        return this.f23470a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public float readFloat() throws C1965v.a {
        W(5);
        return this.f23470a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void s(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f23470a.D()));
                if (this.f23470a.f()) {
                    return;
                } else {
                    iC = this.f23470a.C();
                }
            } while (iC == this.f23471b);
            this.f23473d = iC;
            return;
        }
        if (iB != 2) {
            throw C1965v.e();
        }
        int iE = this.f23470a.e() + this.f23470a.D();
        do {
            list.add(Integer.valueOf(this.f23470a.D()));
        } while (this.f23470a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int t() throws C1965v.a {
        W(5);
        return this.f23470a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void u(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f23470a.x()));
                if (this.f23470a.f()) {
                    return;
                } else {
                    iC = this.f23470a.C();
                }
            } while (iC == this.f23471b);
            this.f23473d = iC;
            return;
        }
        if (iB != 2) {
            throw C1965v.e();
        }
        int iD = this.f23470a.D();
        Y(iD);
        int iE = this.f23470a.e() + iD;
        do {
            list.add(Long.valueOf(this.f23470a.x()));
        } while (this.f23470a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void v(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f23470a.u()));
                if (this.f23470a.f()) {
                    return;
                } else {
                    iC = this.f23470a.C();
                }
            } while (iC == this.f23471b);
            this.f23473d = iC;
            return;
        }
        if (iB != 2) {
            throw C1965v.e();
        }
        int iE = this.f23470a.e() + this.f23470a.D();
        do {
            list.add(Integer.valueOf(this.f23470a.u()));
        } while (this.f23470a.e() < iE);
        V(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public void w(List list) throws C1965v {
        int iC;
        int iB = m0.b(this.f23471b);
        if (iB == 2) {
            int iD = this.f23470a.D();
            X(iD);
            int iE = this.f23470a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f23470a.r()));
            } while (this.f23470a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C1965v.e();
        }
        do {
            list.add(Integer.valueOf(this.f23470a.r()));
            if (this.f23470a.f()) {
                return;
            } else {
                iC = this.f23470a.C();
            }
        } while (iC == this.f23471b);
        this.f23473d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public long x() throws C1965v.a {
        W(0);
        return this.f23470a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public String y() throws C1965v.a {
        W(2);
        return this.f23470a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public int z() {
        int i10 = this.f23473d;
        if (i10 != 0) {
            this.f23471b = i10;
            this.f23473d = 0;
        } else {
            this.f23471b = this.f23470a.C();
        }
        int i11 = this.f23471b;
        if (i11 == 0 || i11 == this.f23472c) {
            return Integer.MAX_VALUE;
        }
        return m0.a(i11);
    }
}
