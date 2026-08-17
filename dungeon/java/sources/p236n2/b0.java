package p236n2;

import R1.InterfaceC1350j;
import R1.n;
import R1.r;
import R1.y;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.F;
import Y1.f;
import Z1.R0;
import java.util.Objects;
import p075e2.InterfaceC3263m;
import p075e2.t;
import p075e2.u;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
public class b0 implements O {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private r f49659A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private r f49660B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f49661C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f49663E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f49664F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f49665G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f49666a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f49669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t.a f49670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f49671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r f49672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC3263m f49673h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f49681p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f49682q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f49683r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f49684s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f49688w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f49691z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f49667b = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f49674i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f49675j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f49676k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f49679n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f49678m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f49677l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private O.a[] f49680o = new O.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i0 f49668c = new i0(new a0());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f49685t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f49686u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f49687v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f49690y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f49689x = true;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f49662D = true;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f49693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public O.a f49694c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f49695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u.b f49696b;

        private c(r rVar, u.b bVar) {
            this.f49695a = rVar;
            this.f49696b = bVar;
        }

        /* synthetic */ c(r rVar, u.b bVar, a aVar) {
            this(rVar, bVar);
        }
    }

    public interface d {
        void a(r rVar);
    }

    protected b0(p308r2.b bVar, u uVar, t.a aVar) {
        this.f49669d = uVar;
        this.f49670e = aVar;
        this.f49666a = new Z(bVar);
    }

    private long E(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iG = G(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f49679n[iG]);
            if ((this.f49678m[iG] & 1) != 0) {
                return jMax;
            }
            iG--;
            if (iG == -1) {
                iG = this.f49674i - 1;
            }
        }
        return jMax;
    }

    private int G(int i10) {
        int i11 = this.f49683r + i10;
        int i12 = this.f49674i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean K() {
        return this.f49684s != this.f49681p;
    }

    private boolean O(int i10) {
        InterfaceC3263m interfaceC3263m = this.f49673h;
        if (interfaceC3263m == null || interfaceC3263m.getState() == 4) {
            return true;
        }
        return (this.f49678m[i10] & 1073741824) == 0 && this.f49673h.b();
    }

    private void Q(r rVar, R0 r10) {
        r rVar2 = this.f49672g;
        boolean z10 = rVar2 == null;
        n nVar = rVar2 == null ? null : rVar2.f10281s;
        this.f49672g = rVar;
        n nVar2 = rVar.f10281s;
        u uVar = this.f49669d;
        r10.f18152b = uVar != null ? rVar.c(uVar.d(rVar)) : rVar;
        r10.f18151a = this.f49673h;
        if (this.f49669d == null) {
            return;
        }
        if (z10 || !Objects.equals(nVar, nVar2)) {
            InterfaceC3263m interfaceC3263m = this.f49673h;
            InterfaceC3263m interfaceC3263mA = this.f49669d.a(this.f49670e, rVar);
            this.f49673h = interfaceC3263mA;
            r10.f18151a = interfaceC3263mA;
            if (interfaceC3263m != null) {
                interfaceC3263m.e(this.f49670e);
            }
        }
    }

    private synchronized int R(R0 r10, f fVar, boolean z10, boolean z11, b bVar) {
        try {
            fVar.f16812e = false;
            if (!K()) {
                if (!z11 && !this.f49688w) {
                    r rVar = this.f49660B;
                    if (rVar == null || (!z10 && rVar == this.f49672g)) {
                        return -3;
                    }
                    Q((r) AbstractC1459a.e(rVar), r10);
                    return -5;
                }
                fVar.y(4);
                fVar.f16813f = Long.MIN_VALUE;
                return -4;
            }
            r rVar2 = ((c) this.f49668c.e(F())).f49695a;
            if (!z10 && rVar2 == this.f49672g) {
                int iG = G(this.f49684s);
                if (!O(iG)) {
                    fVar.f16812e = true;
                    return -3;
                }
                fVar.y(this.f49678m[iG]);
                if (this.f49684s == this.f49681p - 1 && (z11 || this.f49688w)) {
                    fVar.o(536870912);
                }
                fVar.f16813f = this.f49679n[iG];
                bVar.f49692a = this.f49677l[iG];
                bVar.f49693b = this.f49676k[iG];
                bVar.f49694c = this.f49680o[iG];
                return -4;
            }
            Q(rVar2, r10);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void W() {
        InterfaceC3263m interfaceC3263m = this.f49673h;
        if (interfaceC3263m != null) {
            interfaceC3263m.e(this.f49670e);
            this.f49673h = null;
            this.f49672g = null;
        }
    }

    private synchronized void Z() {
        this.f49684s = 0;
        this.f49666a.o();
    }

    private synchronized boolean e0(r rVar) {
        try {
            this.f49690y = false;
            if (Objects.equals(rVar, this.f49660B)) {
                return false;
            }
            if (this.f49668c.g() || !((c) this.f49668c.f()).f49695a.equals(rVar)) {
                this.f49660B = rVar;
            } else {
                this.f49660B = ((c) this.f49668c.f()).f49695a;
            }
            boolean z10 = this.f49662D;
            r rVar2 = this.f49660B;
            this.f49662D = z10 & y.a(rVar2.f10277o, rVar2.f10273k);
            this.f49663E = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized boolean i(long j10) {
        if (this.f49681p == 0) {
            return j10 > this.f49686u;
        }
        if (D() >= j10) {
            return false;
        }
        v(this.f49682q + k(j10));
        return true;
    }

    private synchronized void j(long j10, int i10, long j11, int i11, O.a aVar) {
        try {
            int i12 = this.f49681p;
            if (i12 > 0) {
                int iG = G(i12 - 1);
                AbstractC1459a.a(this.f49676k[iG] + ((long) this.f49677l[iG]) <= j11);
            }
            this.f49688w = (536870912 & i10) != 0;
            this.f49687v = Math.max(this.f49687v, j10);
            int iG2 = G(this.f49681p);
            this.f49679n[iG2] = j10;
            this.f49676k[iG2] = j11;
            this.f49677l[iG2] = i11;
            this.f49678m[iG2] = i10;
            this.f49680o[iG2] = aVar;
            this.f49675j[iG2] = this.f49661C;
            if (this.f49668c.g() || !((c) this.f49668c.f()).f49695a.equals(this.f49660B)) {
                r rVar = (r) AbstractC1459a.e(this.f49660B);
                u uVar = this.f49669d;
                this.f49668c.a(J(), new c(rVar, uVar != null ? uVar.c(this.f49670e, rVar) : u.b.f40355a, null));
            }
            int i13 = this.f49681p + 1;
            this.f49681p = i13;
            int i14 = this.f49674i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                O.a[] aVarArr = new O.a[i15];
                int i16 = this.f49683r;
                int i17 = i14 - i16;
                System.arraycopy(this.f49676k, i16, jArr2, 0, i17);
                System.arraycopy(this.f49679n, this.f49683r, jArr3, 0, i17);
                System.arraycopy(this.f49678m, this.f49683r, iArr, 0, i17);
                System.arraycopy(this.f49677l, this.f49683r, iArr2, 0, i17);
                System.arraycopy(this.f49680o, this.f49683r, aVarArr, 0, i17);
                System.arraycopy(this.f49675j, this.f49683r, jArr, 0, i17);
                int i18 = this.f49683r;
                System.arraycopy(this.f49676k, 0, jArr2, i17, i18);
                System.arraycopy(this.f49679n, 0, jArr3, i17, i18);
                System.arraycopy(this.f49678m, 0, iArr, i17, i18);
                System.arraycopy(this.f49677l, 0, iArr2, i17, i18);
                System.arraycopy(this.f49680o, 0, aVarArr, i17, i18);
                System.arraycopy(this.f49675j, 0, jArr, i17, i18);
                this.f49676k = jArr2;
                this.f49679n = jArr3;
                this.f49678m = iArr;
                this.f49677l = iArr2;
                this.f49680o = aVarArr;
                this.f49675j = jArr;
                this.f49683r = 0;
                this.f49674i = i15;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private int k(long j10) {
        int i10 = this.f49681p;
        int iG = G(i10 - 1);
        while (i10 > this.f49684s && this.f49679n[iG] >= j10) {
            i10--;
            iG--;
            if (iG == -1) {
                iG = this.f49674i - 1;
            }
        }
        return i10;
    }

    public static b0 l(p308r2.b bVar, u uVar, t.a aVar) {
        return new b0(bVar, (u) AbstractC1459a.e(uVar), (t.a) AbstractC1459a.e(aVar));
    }

    public static b0 m(p308r2.b bVar) {
        return new b0(bVar, null, null);
    }

    private synchronized long n(long j10, boolean z10, boolean z11) throws Throwable {
        Throwable th;
        try {
            try {
                int i10 = this.f49681p;
                if (i10 != 0) {
                    long[] jArr = this.f49679n;
                    int i11 = this.f49683r;
                    if (j10 >= jArr[i11]) {
                        if (z11) {
                            try {
                                int i12 = this.f49684s;
                                if (i12 != i10) {
                                    i10 = i12 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iY = y(i11, i10, j10, z10);
                        if (iY == -1) {
                            return -1L;
                        }
                        return q(iY);
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    private synchronized long o() {
        int i10 = this.f49681p;
        if (i10 == 0) {
            return -1L;
        }
        return q(i10);
    }

    private long q(int i10) {
        this.f49686u = Math.max(this.f49686u, E(i10));
        this.f49681p -= i10;
        int i11 = this.f49682q + i10;
        this.f49682q = i11;
        int i12 = this.f49683r + i10;
        this.f49683r = i12;
        int i13 = this.f49674i;
        if (i12 >= i13) {
            this.f49683r = i12 - i13;
        }
        int i14 = this.f49684s - i10;
        this.f49684s = i14;
        if (i14 < 0) {
            this.f49684s = 0;
        }
        this.f49668c.d(i11);
        if (this.f49681p != 0) {
            return this.f49676k[this.f49683r];
        }
        int i15 = this.f49683r;
        if (i15 == 0) {
            i15 = this.f49674i;
        }
        int i16 = i15 - 1;
        return this.f49676k[i16] + ((long) this.f49677l[i16]);
    }

    private long v(int i10) {
        int iJ = J() - i10;
        boolean z10 = false;
        AbstractC1459a.a(iJ >= 0 && iJ <= this.f49681p - this.f49684s);
        int i11 = this.f49681p - iJ;
        this.f49681p = i11;
        this.f49687v = Math.max(this.f49686u, E(i11));
        if (iJ == 0 && this.f49688w) {
            z10 = true;
        }
        this.f49688w = z10;
        this.f49668c.c(i10);
        int i12 = this.f49681p;
        if (i12 == 0) {
            return 0L;
        }
        int iG = G(i12 - 1);
        return this.f49676k[iG] + ((long) this.f49677l[iG]);
    }

    private int x(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f49679n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f49674i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    private int y(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f49679n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f49678m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f49674i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final int A() {
        return this.f49682q;
    }

    public final synchronized long B() {
        return this.f49681p == 0 ? Long.MIN_VALUE : this.f49679n[this.f49683r];
    }

    public final synchronized long C() {
        return this.f49687v;
    }

    public final synchronized long D() {
        return Math.max(this.f49686u, E(this.f49684s));
    }

    public final int F() {
        return this.f49682q + this.f49684s;
    }

    public final synchronized int H(long j10, boolean z10) throws Throwable {
        Throwable th;
        try {
            try {
                int iG = G(this.f49684s);
                if (!K() || j10 < this.f49679n[iG]) {
                    return 0;
                }
                if (j10 <= this.f49687v || !z10) {
                    int iY = y(iG, this.f49681p - this.f49684s, j10, true);
                    if (iY == -1) {
                        return 0;
                    }
                    return iY;
                }
                try {
                    return this.f49681p - this.f49684s;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    public final synchronized r I() {
        return this.f49690y ? null : this.f49660B;
    }

    public final int J() {
        return this.f49682q + this.f49681p;
    }

    protected final void L() {
        this.f49691z = true;
    }

    public final synchronized boolean M() {
        return this.f49688w;
    }

    public synchronized boolean N(boolean z10) {
        r rVar;
        boolean z11 = true;
        if (K()) {
            if (((c) this.f49668c.e(F())).f49695a != this.f49672g) {
                return true;
            }
            return O(G(this.f49684s));
        }
        if (!z10 && !this.f49688w && ((rVar = this.f49660B) == null || rVar == this.f49672g)) {
            z11 = false;
        }
        return z11;
    }

    public void P() throws InterfaceC3263m.a {
        InterfaceC3263m interfaceC3263m = this.f49673h;
        if (interfaceC3263m != null && interfaceC3263m.getState() == 1) {
            throw ((InterfaceC3263m.a) AbstractC1459a.e(this.f49673h.f()));
        }
    }

    public final synchronized long S() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return K() ? this.f49675j[G(this.f49684s)] : this.f49661C;
    }

    public void T() {
        s();
        W();
    }

    public int U(R0 r10, f fVar, int i10, boolean z10) {
        int iR = R(r10, fVar, (i10 & 2) != 0, z10, this.f49667b);
        if (iR == -4 && !fVar.t()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f49666a.f(fVar, this.f49667b);
                } else {
                    this.f49666a.m(fVar, this.f49667b);
                }
            }
            if (!z11) {
                this.f49684s++;
            }
        }
        return iR;
    }

    public void V() {
        Y(true);
        W();
    }

    public final void X() {
        Y(false);
    }

    public void Y(boolean z10) {
        this.f49666a.n();
        this.f49681p = 0;
        this.f49682q = 0;
        this.f49683r = 0;
        this.f49684s = 0;
        this.f49689x = true;
        this.f49685t = Long.MIN_VALUE;
        this.f49686u = Long.MIN_VALUE;
        this.f49687v = Long.MIN_VALUE;
        this.f49688w = false;
        this.f49668c.b();
        if (z10) {
            this.f49659A = null;
            this.f49660B = null;
            this.f49690y = true;
            this.f49662D = true;
        }
    }

    public final synchronized boolean a0(int i10) {
        Z();
        int i11 = this.f49682q;
        if (i10 >= i11 && i10 <= this.f49681p + i11) {
            this.f49685t = Long.MIN_VALUE;
            this.f49684s = i10 - i11;
            return true;
        }
        return false;
    }

    @Override // p380v2.O
    public final void b(r rVar) {
        r rVarZ = z(rVar);
        this.f49691z = false;
        this.f49659A = rVar;
        boolean zE0 = e0(rVarZ);
        d dVar = this.f49671f;
        if (dVar == null || !zE0) {
            return;
        }
        dVar.a(rVarZ);
    }

    public final synchronized boolean b0(long j10, boolean z10) throws Throwable {
        b0 b0Var;
        long j11;
        int iY;
        try {
            try {
                Z();
                int iG = G(this.f49684s);
                if (!K() || j10 < this.f49679n[iG] || (j10 > this.f49687v && !z10)) {
                    return false;
                }
                if (this.f49662D) {
                    b0Var = this;
                    j11 = j10;
                    iY = b0Var.x(iG, this.f49681p - this.f49684s, j11, z10);
                } else {
                    b0Var = this;
                    j11 = j10;
                    iY = b0Var.y(iG, b0Var.f49681p - b0Var.f49684s, j11, true);
                }
                if (iY == -1) {
                    return false;
                }
                b0Var.f49685t = j11;
                b0Var.f49684s += iY;
                return true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    @Override // p380v2.O
    public void c(long j10, int i10, int i11, int i12, O.a aVar) {
        int i13;
        if (this.f49691z) {
            b((r) AbstractC1459a.i(this.f49659A));
        }
        int i14 = i10 & 1;
        boolean z10 = i14 != 0;
        if (this.f49689x) {
            if (!z10) {
                return;
            } else {
                this.f49689x = false;
            }
        }
        long j11 = this.f49664F + j10;
        if (!this.f49662D) {
            i13 = i10;
        } else {
            if (j11 < this.f49685t) {
                return;
            }
            if (i14 == 0) {
                if (!this.f49663E) {
                    AbstractC1477t.h("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f49660B);
                    this.f49663E = true;
                }
                i13 = i10 | 1;
            } else {
                i13 = i10;
            }
        }
        if (this.f49665G) {
            if (!z10 || !i(j11)) {
                return;
            } else {
                this.f49665G = false;
            }
        }
        j(j11, i13, (this.f49666a.e() - ((long) i11)) - ((long) i12), i11, aVar);
    }

    public final void c0(long j10) {
        if (this.f49664F != j10) {
            this.f49664F = j10;
            L();
        }
    }

    public final void d0(long j10) {
        this.f49685t = j10;
    }

    @Override // p380v2.O
    public final void e(F f10, int i10, int i11) {
        this.f49666a.q(f10, i10);
    }

    public final void f0(d dVar) {
        this.f49671f = dVar;
    }

    @Override // p380v2.O
    public final int g(InterfaceC1350j interfaceC1350j, int i10, boolean z10, int i11) {
        return this.f49666a.p(interfaceC1350j, i10, z10);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void g0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f49684s + i10 <= this.f49681p) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z10 = false;
        }
        AbstractC1459a.a(z10);
        this.f49684s += i10;
    }

    public final void h0(long j10) {
        this.f49661C = j10;
    }

    public final void i0() {
        this.f49665G = true;
    }

    public synchronized long p() {
        int i10 = this.f49684s;
        if (i10 == 0) {
            return -1L;
        }
        return q(i10);
    }

    public final void r(long j10, boolean z10, boolean z11) {
        this.f49666a.b(n(j10, z10, z11));
    }

    public final void s() {
        this.f49666a.b(o());
    }

    public final void t() {
        this.f49666a.b(p());
    }

    public final void u(long j10) {
        if (this.f49681p == 0) {
            return;
        }
        AbstractC1459a.a(j10 > D());
        w(this.f49682q + k(j10));
    }

    public final void w(int i10) {
        this.f49666a.c(v(i10));
    }

    protected r z(r rVar) {
        return (this.f49664F == 0 || rVar.f10282t == Long.MAX_VALUE) ? rVar : rVar.b().C0(rVar.f10282t + this.f49664F).P();
    }
}
