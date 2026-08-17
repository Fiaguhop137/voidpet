package p236n2;

import C9.z;
import R1.G;
import R1.r;
import U1.AbstractC1459a;
import Z1.U0;
import Z1.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import p290q2.A;
import p290q2.y;

/* JADX INFO: loaded from: classes.dex */
final class O implements C, C.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C[] f49515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean[] f49516b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4013j f49518d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C.a f49521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m0 f49522h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d0 f49524j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f49519e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f49520f = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f49517c = new IdentityHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C[] f49523i = new C[0];

    private static final class a extends A {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final G f49525b;

        public a(y yVar, G g10) {
            super(yVar);
            this.f49525b = g10;
        }

        @Override // p290q2.C
        public r c(int i10) {
            return this.f49525b.a(t().d(i10));
        }

        @Override // p290q2.A
        public boolean equals(Object obj) {
            if (super.equals(obj) && (obj instanceof a)) {
                return this.f49525b.equals(((a) obj).f49525b);
            }
            return false;
        }

        @Override // p290q2.A
        public int hashCode() {
            return (super.hashCode() * 31) + this.f49525b.hashCode();
        }

        @Override // p290q2.C
        public G k() {
            return this.f49525b;
        }

        @Override // p290q2.y
        public r p() {
            return this.f49525b.a(t().o());
        }

        @Override // p290q2.C
        public int r(r rVar) {
            return t().j(this.f49525b.b(rVar));
        }
    }

    public O(InterfaceC4013j interfaceC4013j, long[] jArr, C... cArr) {
        this.f49518d = interfaceC4013j;
        this.f49515a = cArr;
        this.f49524j = interfaceC4013j.empty();
        this.f49516b = new boolean[cArr.length];
        for (int i10 = 0; i10 < cArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f49516b[i10] = true;
                this.f49515a[i10] = new j0(cArr[i10], j10);
            }
        }
    }

    @Override // p236n2.C, p236n2.d0
    public long b() {
        return this.f49524j.b();
    }

    @Override // p236n2.C, p236n2.d0
    public boolean c() {
        return this.f49524j.c();
    }

    @Override // p236n2.C, p236n2.d0
    public boolean d(U0 u10) {
        if (this.f49519e.isEmpty()) {
            return this.f49524j.d(u10);
        }
        int size = this.f49519e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C) this.f49519e.get(i10)).d(u10);
        }
        return false;
    }

    @Override // p236n2.C
    public long e(long j10, z1 z1Var) {
        C[] cArr = this.f49523i;
        return (cArr.length > 0 ? cArr[0] : this.f49515a[0]).e(j10, z1Var);
    }

    @Override // n2.C.a
    public void f(C c10) {
        this.f49519e.remove(c10);
        if (!this.f49519e.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (C c11 : this.f49515a) {
            i10 += c11.u().f49821a;
        }
        G[] gArr = new G[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            C[] cArr = this.f49515a;
            if (i11 >= cArr.length) {
                this.f49522h = new m0(gArr);
                ((C.a) AbstractC1459a.e(this.f49521g)).f(this);
                return;
            }
            m0 m0VarU = cArr[i11].u();
            int i13 = m0VarU.f49821a;
            int i14 = 0;
            while (i14 < i13) {
                G gB = m0VarU.b(i14);
                r[] rVarArr = new r[gB.f9963a];
                for (int i15 = 0; i15 < gB.f9963a; i15++) {
                    r rVarA = gB.a(i15);
                    r.b bVarB = rVarA.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(":");
                    String str = rVarA.f10263a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    rVarArr[i15] = bVarB.j0(sb2.toString()).P();
                }
                G g10 = new G(i11 + ":" + gB.f9964b, rVarArr);
                this.f49520f.put(g10, gB);
                gArr[i12] = g10;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // p236n2.C, p236n2.d0
    public long g() {
        return this.f49524j.g();
    }

    @Override // p236n2.C, p236n2.d0
    public void h(long j10) {
        this.f49524j.h(j10);
    }

    @Override // p236n2.C
    public long k(long j10) {
        long jK = this.f49523i[0].k(j10);
        int i10 = 1;
        while (true) {
            C[] cArr = this.f49523i;
            if (i10 >= cArr.length) {
                return jK;
            }
            if (cArr[i10].k(jK) != jK) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // p236n2.C
    public long m() {
        long j10 = -9223372036854775807L;
        for (C c10 : this.f49523i) {
            long jM = c10.m();
            if (jM == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && c10.k(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (C c11 : this.f49523i) {
                    if (c11 == c10) {
                        break;
                    }
                    if (c11.k(jM) != jM) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jM;
            } else if (jM != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    public C n(int i10) {
        return this.f49516b[i10] ? ((j0) this.f49515a[i10]).a() : this.f49515a[i10];
    }

    @Override // n2.d0.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void i(C c10) {
        ((C.a) AbstractC1459a.e(this.f49521g)).i(this);
    }

    @Override // p236n2.C
    public long q(y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[yVarArr.length];
        int[] iArr2 = new int[yVarArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < yVarArr.length; i11++) {
            c0 c0Var = c0VarArr[i11];
            Integer num = c0Var == null ? null : (Integer) this.f49517c.get(c0Var);
            iArr[i11] = num == null ? -1 : num.intValue();
            y yVar = yVarArr[i11];
            if (yVar != null) {
                String str = yVar.k().f9964b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
        }
        this.f49517c.clear();
        int length = yVarArr.length;
        c0[] c0VarArr2 = new c0[length];
        c0[] c0VarArr3 = new c0[yVarArr.length];
        y[] yVarArr2 = new y[yVarArr.length];
        ArrayList arrayList = new ArrayList(this.f49515a.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f49515a.length) {
            for (int i13 = i10; i13 < yVarArr.length; i13++) {
                c0VarArr3[i13] = iArr[i13] == i12 ? c0VarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    y yVar2 = (y) AbstractC1459a.e(yVarArr[i13]);
                    yVarArr2[i13] = new a(yVar2, (G) AbstractC1459a.e((G) this.f49520f.get(yVar2.k())));
                } else {
                    yVarArr2[i13] = null;
                }
            }
            int i14 = i12;
            long jQ = this.f49515a[i12].q(yVarArr2, zArr, c0VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jQ;
            } else if (jQ != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < yVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    c0 c0Var2 = (c0) AbstractC1459a.e(c0VarArr3[i15]);
                    c0VarArr2[i15] = c0VarArr3[i15];
                    this.f49517c.put(c0Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    AbstractC1459a.g(c0VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(this.f49515a[i14]);
            }
            i12 = i14 + 1;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(c0VarArr2, i16, c0VarArr, i16, length);
        this.f49523i = (C[]) arrayList.toArray(new C[i16]);
        this.f49524j = this.f49518d.a(arrayList, z.k(arrayList, new N()));
        return j11;
    }

    @Override // p236n2.C
    public void r(C.a aVar, long j10) {
        this.f49521g = aVar;
        Collections.addAll(this.f49519e, this.f49515a);
        for (C c10 : this.f49515a) {
            c10.r(this, j10);
        }
    }

    @Override // p236n2.C
    public void s() {
        for (C c10 : this.f49515a) {
            c10.s();
        }
    }

    @Override // p236n2.C
    public m0 u() {
        return (m0) AbstractC1459a.e(this.f49522h);
    }

    @Override // p236n2.C
    public void v(long j10, boolean z10) {
        for (C c10 : this.f49523i) {
            c10.v(j10, z10);
        }
    }
}
