package p236n2;

import U1.AbstractC1459a;
import Y1.f;
import Z1.R0;
import Z1.U0;
import Z1.z1;
import p290q2.y;

/* JADX INFO: loaded from: classes.dex */
final class j0 implements C, C.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f49809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f49810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C.a f49811c;

    private static final class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0 f49812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f49813b;

        public a(c0 c0Var, long j10) {
            this.f49812a = c0Var;
            this.f49813b = j10;
        }

        @Override // p236n2.c0
        public void a() {
            this.f49812a.a();
        }

        public c0 b() {
            return this.f49812a;
        }

        @Override // p236n2.c0
        public boolean f() {
            return this.f49812a.f();
        }

        @Override // p236n2.c0
        public int p(long j10) {
            return this.f49812a.p(j10 - this.f49813b);
        }

        @Override // p236n2.c0
        public int t(R0 r10, f fVar, int i10) {
            int iT = this.f49812a.t(r10, fVar, i10);
            if (iT == -4) {
                fVar.f16813f += this.f49813b;
            }
            return iT;
        }
    }

    public j0(C c10, long j10) {
        this.f49809a = c10;
        this.f49810b = j10;
    }

    public C a() {
        return this.f49809a;
    }

    @Override // p236n2.C, p236n2.d0
    public long b() {
        long jB = this.f49809a.b();
        if (jB == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jB + this.f49810b;
    }

    @Override // p236n2.C, p236n2.d0
    public boolean c() {
        return this.f49809a.c();
    }

    @Override // p236n2.C, p236n2.d0
    public boolean d(U0 u10) {
        return this.f49809a.d(u10.a().f(u10.f18166a - this.f49810b).d());
    }

    @Override // p236n2.C
    public long e(long j10, z1 z1Var) {
        return this.f49809a.e(j10 - this.f49810b, z1Var) + this.f49810b;
    }

    @Override // n2.C.a
    public void f(C c10) {
        ((C.a) AbstractC1459a.e(this.f49811c)).f(this);
    }

    @Override // p236n2.C, p236n2.d0
    public long g() {
        long jG = this.f49809a.g();
        if (jG == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jG + this.f49810b;
    }

    @Override // p236n2.C, p236n2.d0
    public void h(long j10) {
        this.f49809a.h(j10 - this.f49810b);
    }

    @Override // p236n2.C
    public long k(long j10) {
        return this.f49809a.k(j10 - this.f49810b) + this.f49810b;
    }

    @Override // p236n2.C
    public long m() {
        long jM = this.f49809a.m();
        if (jM == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jM + this.f49810b;
    }

    @Override // n2.d0.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void i(C c10) {
        ((C.a) AbstractC1459a.e(this.f49811c)).i(this);
    }

    @Override // p236n2.C
    public long q(y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        c0[] c0VarArr2 = new c0[c0VarArr.length];
        int i10 = 0;
        while (true) {
            c0 c0VarB = null;
            if (i10 >= c0VarArr.length) {
                break;
            }
            a aVar = (a) c0VarArr[i10];
            if (aVar != null) {
                c0VarB = aVar.b();
            }
            c0VarArr2[i10] = c0VarB;
            i10++;
        }
        long jQ = this.f49809a.q(yVarArr, zArr, c0VarArr2, zArr2, j10 - this.f49810b);
        for (int i11 = 0; i11 < c0VarArr.length; i11++) {
            c0 c0Var = c0VarArr2[i11];
            if (c0Var == null) {
                c0VarArr[i11] = null;
            } else {
                c0 c0Var2 = c0VarArr[i11];
                if (c0Var2 == null || ((a) c0Var2).b() != c0Var) {
                    c0VarArr[i11] = new a(c0Var, this.f49810b);
                }
            }
        }
        return jQ + this.f49810b;
    }

    @Override // p236n2.C
    public void r(C.a aVar, long j10) {
        this.f49811c = aVar;
        this.f49809a.r(this, j10 - this.f49810b);
    }

    @Override // p236n2.C
    public void s() {
        this.f49809a.s();
    }

    @Override // p236n2.C
    public m0 u() {
        return this.f49809a.u();
    }

    @Override // p236n2.C
    public void v(long j10, boolean z10) {
        this.f49809a.v(j10 - this.f49810b, z10);
    }
}
