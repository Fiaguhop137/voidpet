package P2;

import C9.AbstractC0876t;
import R1.z;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.F;
import U1.K;
import U1.S;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p380v2.AbstractC4240c;
import p380v2.B;
import p380v2.C4244g;
import p380v2.C4245h;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.N;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
public class h implements InterfaceC4253p {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final p380v2.u f8645P = new f();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final byte[] f8646Q = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final R1.r f8647R = new R1.r.b().y0("application/x-emsg").P();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f8648A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f8649B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f8650C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private b f8651D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f8652E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f8653F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f8654G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f8655H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f8656I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private p380v2.r f8657J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private O[] f8658K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private O[] f8659L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f8660M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f8661N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f8662O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2.s.a f8663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f8665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f8666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f8667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F f8668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final F f8669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F f8670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f8671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final F f8672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final K f8673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final G2.c f8674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final F f8675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque f8676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayDeque f8677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final V1.k f8678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final O f8679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C4245h f8680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AbstractC0876t f8681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f8682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f8683u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f8684v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f8685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private F f8686x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f8687y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f8688z;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8691c;

        public a(long j10, boolean z10, int i10) {
            this.f8689a = j10;
            this.f8690b = z10;
            this.f8691c = i10;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final O f8692a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public w f8695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f8696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8698g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8699h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8700i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final R1.r f8701j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f8704m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f8693b = new v();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final F f8694c = new F();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final F f8702k = new F(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final F f8703l = new F();

        public b(O o10, w wVar, c cVar, R1.r rVar) {
            this.f8692a = o10;
            this.f8695d = wVar;
            this.f8696e = cVar;
            this.f8701j = rVar;
            j(wVar, cVar);
        }

        public int c() {
            int i10;
            if (this.f8704m) {
                i10 = this.f8693b.f8787k[this.f8697f] ? 1 : 0;
            } else {
                i10 = this.f8695d.f8801g[this.f8697f];
            }
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f8704m ? this.f8695d.f8797c[this.f8697f] : this.f8693b.f8783g[this.f8699h];
        }

        public long e() {
            return !this.f8704m ? this.f8695d.f8800f[this.f8697f] : this.f8693b.c(this.f8697f);
        }

        public int f() {
            return !this.f8704m ? this.f8695d.f8798d[this.f8697f] : this.f8693b.f8785i[this.f8697f];
        }

        public u g() {
            if (!this.f8704m) {
                return null;
            }
            int i10 = ((c) S.i(this.f8693b.f8777a)).f8632a;
            u uVarB = this.f8693b.f8790n;
            if (uVarB == null) {
                uVarB = this.f8695d.f8795a.b(i10);
            }
            if (uVarB == null || !uVarB.f8772a) {
                return null;
            }
            return uVarB;
        }

        public boolean h() {
            this.f8697f++;
            if (!this.f8704m) {
                return false;
            }
            int i10 = this.f8698g + 1;
            this.f8698g = i10;
            int[] iArr = this.f8693b.f8784h;
            int i11 = this.f8699h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f8699h = i11 + 1;
            this.f8698g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            F f10;
            u uVarG = g();
            if (uVarG == null) {
                return 0;
            }
            int length = uVarG.f8775d;
            if (length != 0) {
                f10 = this.f8693b.f8791o;
            } else {
                byte[] bArr = (byte[]) S.i(uVarG.f8776e);
                this.f8703l.Y(bArr, bArr.length);
                F f11 = this.f8703l;
                length = bArr.length;
                f10 = f11;
            }
            boolean zG = this.f8693b.g(this.f8697f);
            boolean z10 = zG || i11 != 0;
            this.f8702k.f()[0] = (byte) ((z10 ? 128 : 0) | length);
            this.f8702k.a0(0);
            this.f8692a.e(this.f8702k, 1, 1);
            this.f8692a.e(f10, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f8694c.W(8);
                byte[] bArrF = this.f8694c.f();
                bArrF[0] = 0;
                bArrF[1] = 1;
                bArrF[2] = (byte) ((i11 >> 8) & 255);
                bArrF[3] = (byte) (i11 & 255);
                bArrF[4] = (byte) ((i10 >> 24) & 255);
                bArrF[5] = (byte) ((i10 >> 16) & 255);
                bArrF[6] = (byte) ((i10 >> 8) & 255);
                bArrF[7] = (byte) (i10 & 255);
                this.f8692a.e(this.f8694c, 8, 1);
                return length + 9;
            }
            F f12 = this.f8693b.f8791o;
            int iT = f12.T();
            f12.b0(-2);
            int i12 = (iT * 6) + 2;
            if (i11 != 0) {
                this.f8694c.W(i12);
                byte[] bArrF2 = this.f8694c.f();
                f12.q(bArrF2, 0, i12);
                int i13 = (((bArrF2[2] & 255) << 8) | (bArrF2[3] & 255)) + i11;
                bArrF2[2] = (byte) ((i13 >> 8) & 255);
                bArrF2[3] = (byte) (i13 & 255);
                f12 = this.f8694c;
            }
            this.f8692a.e(f12, i12, 1);
            return length + 1 + i12;
        }

        public void j(w wVar, c cVar) {
            this.f8695d = wVar;
            this.f8696e = cVar;
            this.f8692a.b(this.f8701j);
            k();
        }

        public void k() {
            this.f8693b.f();
            this.f8697f = 0;
            this.f8699h = 0;
            this.f8698g = 0;
            this.f8700i = 0;
            this.f8704m = false;
        }

        public void l(long j10) {
            int i10 = this.f8697f;
            while (true) {
                v vVar = this.f8693b;
                if (i10 >= vVar.f8782f || vVar.c(i10) > j10) {
                    return;
                }
                if (this.f8693b.f8787k[i10]) {
                    this.f8700i = i10;
                }
                i10++;
            }
        }

        public void m() {
            u uVarG = g();
            if (uVarG == null) {
                return;
            }
            F f10 = this.f8693b.f8791o;
            int i10 = uVarG.f8775d;
            if (i10 != 0) {
                f10.b0(i10);
            }
            if (this.f8693b.g(this.f8697f)) {
                f10.b0(f10.T() * 6);
            }
        }

        public void n(R1.n nVar) {
            u uVarB = this.f8695d.f8795a.b(((c) S.i(this.f8693b.f8777a)).f8632a);
            this.f8692a.b(this.f8701j.b().c0(nVar.k(uVarB != null ? uVarB.f8773b : null)).P());
        }
    }

    public h(S2.s.a aVar, int i10) {
        this(aVar, i10, null, null, AbstractC0876t.w(), null);
    }

    public h(S2.s.a aVar, int i10, K k10, t tVar, List list, O o10) {
        this.f8663a = aVar;
        this.f8664b = i10;
        this.f8673k = k10;
        this.f8665c = tVar;
        this.f8666d = Collections.unmodifiableList(list);
        this.f8679q = o10;
        this.f8674l = new G2.c();
        this.f8675m = new F(16);
        this.f8668f = new F(V1.h.f13920a);
        this.f8669g = new F(6);
        this.f8670h = new F();
        byte[] bArr = new byte[16];
        this.f8671i = bArr;
        this.f8672j = new F(bArr);
        this.f8676n = new ArrayDeque();
        this.f8677o = new ArrayDeque();
        this.f8667e = new SparseArray();
        this.f8681s = AbstractC0876t.w();
        this.f8649B = -9223372036854775807L;
        this.f8648A = -9223372036854775807L;
        this.f8650C = -9223372036854775807L;
        this.f8657J = p380v2.r.f56144F1;
        this.f8658K = new O[0];
        this.f8659L = new O[0];
        this.f8678p = new V1.k(new g(this));
        this.f8680r = new C4245h();
        this.f8662O = -1L;
    }

    private static long A(F f10) {
        f10.a0(8);
        return P2.b.q(f10.u()) == 0 ? f10.N() : f10.S();
    }

    private static void B(V1.e.b bVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) throws z {
        int size = bVar.f13913d.size();
        for (int i11 = 0; i11 < size; i11++) {
            V1.e.b bVar2 = (V1.e.b) bVar.f13913d.get(i11);
            if (bVar2.f13910a == 1953653094) {
                K(bVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void C(F f10, v vVar) throws z {
        f10.a0(8);
        int iU = f10.u();
        if ((P2.b.p(iU) & 1) == 1) {
            f10.b0(8);
        }
        int iP = f10.P();
        if (iP == 1) {
            vVar.f8780d += P2.b.q(iU) == 0 ? f10.N() : f10.S();
        } else {
            throw z.a("Unexpected saio entry count: " + iP, null);
        }
    }

    private static void D(u uVar, F f10, v vVar) throws z {
        int i10;
        int i11 = uVar.f8775d;
        f10.a0(8);
        if ((P2.b.p(f10.u()) & 1) == 1) {
            f10.b0(8);
        }
        int iL = f10.L();
        int iP = f10.P();
        if (iP > vVar.f8782f) {
            throw z.a("Saiz sample count " + iP + " is greater than fragment sample count" + vVar.f8782f, null);
        }
        if (iL == 0) {
            boolean[] zArr = vVar.f8789m;
            i10 = 0;
            for (int i12 = 0; i12 < iP; i12++) {
                int iL2 = f10.L();
                i10 += iL2;
                zArr[i12] = iL2 > i11;
            }
        } else {
            i10 = iL * iP;
            Arrays.fill(vVar.f8789m, 0, iP, iL > i11);
        }
        Arrays.fill(vVar.f8789m, iP, vVar.f8782f, false);
        if (i10 > 0) {
            vVar.d(i10);
        }
    }

    private static void E(V1.e.b bVar, String str, v vVar) throws z {
        byte[] bArr = null;
        F f10 = null;
        F f11 = null;
        for (int i10 = 0; i10 < bVar.f13912c.size(); i10++) {
            V1.e.c cVar = (V1.e.c) bVar.f13912c.get(i10);
            F f12 = cVar.f13914b;
            int i11 = cVar.f13910a;
            if (i11 == 1935828848) {
                f12.a0(12);
                if (f12.u() == 1936025959) {
                    f10 = f12;
                }
            } else if (i11 == 1936158820) {
                f12.a0(12);
                if (f12.u() == 1936025959) {
                    f11 = f12;
                }
            }
        }
        if (f10 == null || f11 == null) {
            return;
        }
        f10.a0(8);
        int iQ = P2.b.q(f10.u());
        f10.b0(4);
        if (iQ == 1) {
            f10.b0(4);
        }
        if (f10.u() != 1) {
            throw z.d("Entry count in sbgp != 1 (unsupported).");
        }
        f11.a0(8);
        int iQ2 = P2.b.q(f11.u());
        f11.b0(4);
        if (iQ2 == 1) {
            if (f11.N() == 0) {
                throw z.d("Variable length description in sgpd found (unsupported)");
            }
        } else if (iQ2 >= 2) {
            f11.b0(4);
        }
        if (f11.N() != 1) {
            throw z.d("Entry count in sgpd != 1 (unsupported).");
        }
        f11.b0(1);
        int iL = f11.L();
        int i12 = (iL & 240) >> 4;
        int i13 = iL & 15;
        boolean z10 = f11.L() == 1;
        if (z10) {
            int iL2 = f11.L();
            byte[] bArr2 = new byte[16];
            f11.q(bArr2, 0, 16);
            if (iL2 == 0) {
                int iL3 = f11.L();
                bArr = new byte[iL3];
                f11.q(bArr, 0, iL3);
            }
            vVar.f8788l = true;
            vVar.f8790n = new u(z10, str, iL2, bArr2, i12, i13, bArr);
        }
    }

    private static void F(F f10, int i10, v vVar) throws z {
        f10.a0(i10 + 8);
        int iP = P2.b.p(f10.u());
        if ((iP & 1) != 0) {
            throw z.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iP & 2) != 0;
        int iP2 = f10.P();
        if (iP2 == 0) {
            Arrays.fill(vVar.f8789m, 0, vVar.f8782f, false);
            return;
        }
        if (iP2 == vVar.f8782f) {
            Arrays.fill(vVar.f8789m, 0, iP2, z10);
            vVar.d(f10.a());
            vVar.a(f10);
        } else {
            throw z.a("Senc sample count " + iP2 + " is different from fragment sample count" + vVar.f8782f, null);
        }
    }

    private static void G(F f10, v vVar) throws z {
        F(f10, 0, vVar);
    }

    private static Pair H(F f10, long j10) throws z {
        long jS;
        long jS2;
        f10.a0(8);
        int iQ = P2.b.q(f10.u());
        f10.b0(4);
        long jN = f10.N();
        if (iQ == 0) {
            jS = f10.N();
            jS2 = f10.N();
        } else {
            jS = f10.S();
            jS2 = f10.S();
        }
        long j11 = j10 + jS2;
        long jA1 = S.a1(jS, 1000000L, jN);
        f10.b0(2);
        int iT = f10.T();
        int[] iArr = new int[iT];
        long[] jArr = new long[iT];
        long[] jArr2 = new long[iT];
        long[] jArr3 = new long[iT];
        long j12 = j11;
        long jA2 = jA1;
        int i10 = 0;
        while (i10 < iT) {
            int iU = f10.u();
            if ((Integer.MIN_VALUE & iU) != 0) {
                throw z.a("Unhandled indirect reference", null);
            }
            long jN2 = f10.N();
            iArr[i10] = iU & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = jA2;
            jS += jN2;
            long[] jArr4 = jArr3;
            jA2 = S.a1(jS, 1000000L, jN);
            jArr2[i10] = jA2 - jArr4[i10];
            f10.b0(4);
            j12 += (long) iArr[i10];
            i10++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jA1), new C4244g(iArr, jArr, jArr2, jArr3));
    }

    private static long I(F f10) {
        f10.a0(8);
        return P2.b.q(f10.u()) == 1 ? f10.S() : f10.N();
    }

    private static b J(F f10, SparseArray sparseArray, boolean z10) {
        f10.a0(8);
        int iP = P2.b.p(f10.u());
        b bVar = (b) (z10 ? sparseArray.valueAt(0) : sparseArray.get(f10.u()));
        if (bVar == null) {
            return null;
        }
        if ((iP & 1) != 0) {
            long jS = f10.S();
            v vVar = bVar.f8693b;
            vVar.f8779c = jS;
            vVar.f8780d = jS;
        }
        c cVar = bVar.f8696e;
        bVar.f8693b.f8777a = new c((iP & 2) != 0 ? f10.u() - 1 : cVar.f8632a, (iP & 8) != 0 ? f10.u() : cVar.f8633b, (iP & 16) != 0 ? f10.u() : cVar.f8634c, (iP & 32) != 0 ? f10.u() : cVar.f8635d);
        return bVar;
    }

    private static void K(V1.e.b bVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) throws z {
        b bVarJ = J(((V1.e.c) AbstractC1459a.e(bVar.e(1952868452))).f13914b, sparseArray, z10);
        if (bVarJ == null) {
            return;
        }
        v vVar = bVarJ.f8693b;
        long j10 = vVar.f8793q;
        boolean z11 = vVar.f8794r;
        bVarJ.k();
        bVarJ.f8704m = true;
        V1.e.c cVarE = bVar.e(1952867444);
        if (cVarE == null || (i10 & 2) != 0) {
            vVar.f8793q = j10;
            vVar.f8794r = z11;
        } else {
            vVar.f8793q = I(cVarE.f13914b);
            vVar.f8794r = true;
        }
        N(bVar, bVarJ, i10);
        u uVarB = bVarJ.f8695d.f8795a.b(((c) AbstractC1459a.e(vVar.f8777a)).f8632a);
        V1.e.c cVarE2 = bVar.e(1935763834);
        if (cVarE2 != null) {
            D((u) AbstractC1459a.e(uVarB), cVarE2.f13914b, vVar);
        }
        V1.e.c cVarE3 = bVar.e(1935763823);
        if (cVarE3 != null) {
            C(cVarE3.f13914b, vVar);
        }
        V1.e.c cVarE4 = bVar.e(1936027235);
        if (cVarE4 != null) {
            G(cVarE4.f13914b, vVar);
        }
        E(bVar, uVarB != null ? uVarB.f8773b : null, vVar);
        int size = bVar.f13912c.size();
        for (int i11 = 0; i11 < size; i11++) {
            V1.e.c cVar = (V1.e.c) bVar.f13912c.get(i11);
            if (cVar.f13910a == 1970628964) {
                O(cVar.f13914b, vVar, bArr);
            }
        }
    }

    private static Pair L(F f10) {
        f10.a0(12);
        return Pair.create(Integer.valueOf(f10.u()), new c(f10.u() - 1, f10.u(), f10.u(), f10.u()));
    }

    private static int M(b bVar, int i10, int i11, F f10, int i12) throws z {
        int iU;
        f10.a0(8);
        int iP = P2.b.p(f10.u());
        t tVar = bVar.f8695d.f8795a;
        v vVar = bVar.f8693b;
        c cVar = (c) S.i(vVar.f8777a);
        vVar.f8784h[i10] = f10.P();
        long[] jArr = vVar.f8783g;
        long j10 = vVar.f8779c;
        jArr[i10] = j10;
        if ((iP & 1) != 0) {
            jArr[i10] = j10 + ((long) f10.u());
        }
        boolean z10 = (iP & 4) != 0;
        int iU2 = cVar.f8635d;
        if (z10) {
            iU2 = f10.u();
        }
        boolean z11 = (iP & 256) != 0;
        boolean z12 = (iP & 512) != 0;
        boolean z13 = (iP & 1024) != 0;
        boolean z14 = (iP & 2048) != 0;
        long j11 = r(tVar) ? ((long[]) S.i(tVar.f8769j))[0] : 0L;
        int[] iArr = vVar.f8785i;
        long[] jArr2 = vVar.f8786j;
        boolean[] zArr = vVar.f8787k;
        boolean z15 = z14;
        boolean z16 = tVar.f8761b == 2 && (i11 & 1) != 0;
        int i13 = i12 + vVar.f8784h[i10];
        boolean z17 = z10;
        long j12 = tVar.f8762c;
        long j13 = vVar.f8793q;
        int i14 = i12;
        while (i14 < i13) {
            int iH = h(z11 ? f10.u() : cVar.f8633b);
            int iH2 = h(z12 ? f10.u() : cVar.f8634c);
            if (z13) {
                iU = f10.u();
            } else {
                iU = (i14 == 0 && z17) ? iU2 : cVar.f8635d;
            }
            int i15 = i14;
            long jA1 = S.a1((((long) (z15 ? f10.u() : 0)) + j13) - j11, 1000000L, j12);
            jArr2[i15] = jA1;
            if (!vVar.f8794r) {
                jArr2[i15] = jA1 + bVar.f8695d.f8802h;
            }
            iArr[i15] = iH2;
            zArr[i15] = ((iU >> 16) & 1) == 0 && (!z16 || i15 == 0);
            j13 += (long) iH;
            i14 = i15 + 1;
            i13 = i13;
            z16 = z16;
        }
        int i16 = i13;
        vVar.f8793q = j13;
        return i16;
    }

    private static void N(V1.e.b bVar, b bVar2, int i10) throws z {
        List list = bVar.f13912c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            V1.e.c cVar = (V1.e.c) list.get(i13);
            if (cVar.f13910a == 1953658222) {
                F f10 = cVar.f13914b;
                f10.a0(12);
                int iP = f10.P();
                if (iP > 0) {
                    i12 += iP;
                    i11++;
                }
            }
        }
        bVar2.f8699h = 0;
        bVar2.f8698g = 0;
        bVar2.f8697f = 0;
        bVar2.f8693b.e(i11, i12);
        int i14 = 0;
        int iM = 0;
        for (int i15 = 0; i15 < size; i15++) {
            V1.e.c cVar2 = (V1.e.c) list.get(i15);
            if (cVar2.f13910a == 1953658222) {
                iM = M(bVar2, i14, i10, cVar2.f13914b, iM);
                i14++;
            }
        }
    }

    private static void O(F f10, v vVar, byte[] bArr) throws z {
        f10.a0(8);
        f10.q(bArr, 0, 16);
        if (Arrays.equals(bArr, f8646Q)) {
            F(f10, 16, vVar);
        }
    }

    private void P(long j10) throws z {
        while (!this.f8676n.isEmpty() && ((V1.e.b) this.f8676n.peek()).f13911b == j10) {
            u((V1.e.b) this.f8676n.pop());
        }
        l();
    }

    private boolean Q(InterfaceC4254q interfaceC4254q) throws z {
        if (this.f8685w == 0) {
            if (!interfaceC4254q.g(this.f8675m.f(), 0, 8, true)) {
                return false;
            }
            this.f8685w = 8;
            this.f8675m.a0(0);
            this.f8684v = this.f8675m.N();
            this.f8683u = this.f8675m.u();
        }
        long j10 = this.f8684v;
        if (j10 == 1) {
            interfaceC4254q.readFully(this.f8675m.f(), 8, 8);
            this.f8685w += 8;
            this.f8684v = this.f8675m.S();
        } else if (j10 == 0) {
            long length = interfaceC4254q.getLength();
            if (length == -1 && !this.f8676n.isEmpty()) {
                length = ((V1.e.b) this.f8676n.peek()).f13911b;
            }
            if (length != -1) {
                this.f8684v = (length - interfaceC4254q.getPosition()) + ((long) this.f8685w);
            }
        }
        long j11 = this.f8684v;
        int i10 = this.f8685w;
        if (j11 < i10) {
            throw z.d("Atom size less than header length (unsupported).");
        }
        if (this.f8662O != -1) {
            if (this.f8683u == 1936286840) {
                this.f8672j.W((int) j11);
                System.arraycopy(this.f8675m.f(), 0, this.f8672j.f(), 0, 8);
                interfaceC4254q.readFully(this.f8672j.f(), 8, (int) (this.f8684v - ((long) this.f8685w)));
                this.f8680r.a((C4244g) H(new V1.e.c(1936286840, this.f8672j).f13914b, interfaceC4254q.h()).second);
            } else {
                interfaceC4254q.b((int) (j11 - ((long) i10)), true);
            }
            l();
            return true;
        }
        long position = interfaceC4254q.getPosition() - ((long) this.f8685w);
        int i11 = this.f8683u;
        if ((i11 == 1836019558 || i11 == 1835295092) && !this.f8660M) {
            this.f8657J.p(new J.b(this.f8649B, position));
            this.f8660M = true;
        }
        if (this.f8683u == 1836019558) {
            int size = this.f8667e.size();
            for (int i12 = 0; i12 < size; i12++) {
                v vVar = ((b) this.f8667e.valueAt(i12)).f8693b;
                vVar.f8778b = position;
                vVar.f8780d = position;
                vVar.f8779c = position;
            }
        }
        int i13 = this.f8683u;
        if (i13 == 1835295092) {
            this.f8651D = null;
            this.f8687y = position + this.f8684v;
            this.f8682t = 2;
            return true;
        }
        if (U(i13)) {
            long position2 = interfaceC4254q.getPosition();
            long j12 = this.f8684v;
            long j13 = (position2 + j12) - 8;
            if (j12 != this.f8685w && this.f8683u == 1835365473) {
                s(interfaceC4254q);
            }
            this.f8676n.push(new V1.e.b(this.f8683u, j13));
            if (this.f8684v == this.f8685w) {
                P(j13);
            } else {
                l();
            }
        } else if (V(this.f8683u)) {
            if (this.f8685w != 8) {
                throw z.d("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f8684v > 2147483647L) {
                throw z.d("Leaf atom with length > 2147483647 (unsupported).");
            }
            F f10 = new F((int) this.f8684v);
            System.arraycopy(this.f8675m.f(), 0, f10.f(), 0, 8);
            this.f8686x = f10;
            this.f8682t = 1;
        } else {
            if (this.f8684v > 2147483647L) {
                throw z.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f8686x = null;
            this.f8682t = 1;
        }
        return true;
    }

    private void R(InterfaceC4254q interfaceC4254q) throws z {
        int i10 = (int) (this.f8684v - ((long) this.f8685w));
        F f10 = this.f8686x;
        if (f10 != null) {
            interfaceC4254q.readFully(f10.f(), 8, i10);
            w(new V1.e.c(this.f8683u, f10), interfaceC4254q);
        } else {
            interfaceC4254q.l(i10);
        }
        P(interfaceC4254q.getPosition());
    }

    private void S(InterfaceC4254q interfaceC4254q) throws z {
        int size = this.f8667e.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = ((b) this.f8667e.valueAt(i10)).f8693b;
            if (vVar.f8792p) {
                long j11 = vVar.f8780d;
                if (j11 < j10) {
                    bVar = (b) this.f8667e.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f8682t = 3;
            return;
        }
        int position = (int) (j10 - interfaceC4254q.getPosition());
        if (position < 0) {
            throw z.a("Offset to encryption data was negative.", null);
        }
        interfaceC4254q.l(position);
        bVar.f8693b.b(interfaceC4254q);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    private boolean T(InterfaceC4254q interfaceC4254q) throws z {
        int iA;
        int iO;
        b bVarO = this.f8651D;
        if (bVarO == null) {
            bVarO = o(this.f8667e);
            if (bVarO == null) {
                int position = (int) (this.f8687y - interfaceC4254q.getPosition());
                if (position < 0) {
                    throw z.a("Offset to end of mdat was negative.", null);
                }
                interfaceC4254q.l(position);
                l();
                return false;
            }
            int iD = (int) (bVarO.d() - interfaceC4254q.getPosition());
            if (iD < 0) {
                AbstractC1477t.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iD = 0;
            }
            interfaceC4254q.l(iD);
            this.f8651D = bVarO;
        }
        if (this.f8682t == 3) {
            this.f8652E = bVarO.f();
            this.f8655H = !e(bVarO.f8695d.f8795a.f8766g);
            if (bVarO.f8697f < bVarO.f8700i) {
                interfaceC4254q.l(this.f8652E);
                bVarO.m();
                if (!bVarO.h()) {
                    this.f8651D = null;
                }
                this.f8682t = 3;
                return true;
            }
            if (bVarO.f8695d.f8795a.f8767h == 1) {
                this.f8652E -= 8;
                interfaceC4254q.l(8);
            }
            if ("audio/ac4".equals(bVarO.f8695d.f8795a.f8766g.f10277o)) {
                this.f8653F = bVarO.i(this.f8652E, 7);
                AbstractC4240c.b(this.f8652E, this.f8672j);
                bVarO.f8692a.f(this.f8672j, 7);
                this.f8653F += 7;
            } else {
                this.f8653F = bVarO.i(this.f8652E, 0);
            }
            this.f8652E += this.f8653F;
            this.f8682t = 4;
            this.f8654G = 0;
        }
        t tVar = bVarO.f8695d.f8795a;
        O o10 = bVarO.f8692a;
        long jE = bVarO.e();
        K k10 = this.f8673k;
        if (k10 != null) {
            jE = k10.a(jE);
        }
        if (tVar.f8770k == 0) {
            while (true) {
                int i10 = this.f8653F;
                int i11 = this.f8652E;
                if (i10 >= i11) {
                    break;
                }
                this.f8653F += o10.a(interfaceC4254q, i11 - i10, false);
            }
        } else {
            byte[] bArrF = this.f8669g.f();
            bArrF[0] = 0;
            bArrF[1] = 0;
            bArrF[2] = 0;
            int i12 = 4 - tVar.f8770k;
            while (this.f8653F < this.f8652E) {
                int i13 = this.f8654G;
                if (i13 == 0) {
                    if (this.f8659L.length > 0 || !this.f8655H) {
                        iO = V1.h.o(tVar.f8766g);
                        if (tVar.f8770k + iO > this.f8652E - this.f8653F) {
                            iO = 0;
                        }
                    } else {
                        iO = 0;
                    }
                    interfaceC4254q.readFully(bArrF, i12, tVar.f8770k + iO);
                    this.f8669g.a0(0);
                    int iU = this.f8669g.u();
                    if (iU < 0) {
                        throw z.a("Invalid NAL length", null);
                    }
                    this.f8654G = iU - iO;
                    this.f8668f.a0(0);
                    o10.f(this.f8668f, 4);
                    this.f8653F += 4;
                    this.f8652E += i12;
                    this.f8656I = this.f8659L.length > 0 && iO > 0 && V1.h.n(tVar.f8766g, bArrF[4]);
                    o10.f(this.f8669g, iO);
                    this.f8653F += iO;
                    if (iO > 0 && !this.f8655H && V1.h.k(bArrF, 4, iO, tVar.f8766g)) {
                        this.f8655H = true;
                    }
                } else {
                    if (this.f8656I) {
                        this.f8670h.W(i13);
                        interfaceC4254q.readFully(this.f8670h.f(), 0, this.f8654G);
                        o10.f(this.f8670h, this.f8654G);
                        iA = this.f8654G;
                        int iL = V1.h.L(this.f8670h.f(), this.f8670h.j());
                        this.f8670h.a0(0);
                        this.f8670h.Z(iL);
                        if (tVar.f8766g.f10279q != -1) {
                            int iF = this.f8678p.f();
                            int i14 = tVar.f8766g.f10279q;
                            if (iF != i14) {
                                this.f8678p.g(i14);
                            }
                        } else if (this.f8678p.f() != 0) {
                            this.f8678p.g(0);
                        }
                        this.f8678p.a(jE, this.f8670h);
                        if ((bVarO.c() & 4) != 0) {
                            this.f8678p.d();
                        }
                    } else {
                        iA = o10.a(interfaceC4254q, i13, false);
                    }
                    this.f8653F += iA;
                    this.f8654G -= iA;
                }
            }
        }
        int iC = bVarO.c();
        if (!this.f8655H) {
            iC |= 67108864;
        }
        int i15 = iC;
        u uVarG = bVarO.g();
        o10.c(jE, i15, this.f8652E, 0, uVarG != null ? uVarG.f8774c : null);
        z(jE);
        if (!bVarO.h()) {
            this.f8651D = null;
        }
        this.f8682t = 3;
        return true;
    }

    private static boolean U(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean V(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    public static /* synthetic */ InterfaceC4253p[] c() {
        return new InterfaceC4253p[]{new h(S2.s.a.f11528a, 32)};
    }

    private boolean e(R1.r rVar) {
        if (Objects.equals(rVar.f10277o, "video/avc")) {
            return (this.f8664b & 64) != 0;
        }
        return Objects.equals(rVar.f10277o, "video/hevc") && (this.f8664b & 128) != 0;
    }

    private static int h(int i10) throws z {
        if (i10 >= 0) {
            return i10;
        }
        throw z.a("Unexpected negative value: " + i10, null);
    }

    public static int i(int i10) {
        int i11 = (i10 & 1) != 0 ? 64 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private void l() {
        this.f8682t = 0;
        this.f8685w = 0;
    }

    private c m(SparseArray sparseArray, int i10) {
        return sparseArray.size() == 1 ? (c) sparseArray.valueAt(0) : (c) AbstractC1459a.e((c) sparseArray.get(i10));
    }

    private static R1.n n(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            V1.e.c cVar = (V1.e.c) list.get(i10);
            if (cVar.f13910a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrF = cVar.f13914b.f();
                UUID uuidF = p.f(bArrF);
                if (uuidF == null) {
                    AbstractC1477t.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new R1.n.b(uuidF, "video/mp4", bArrF));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new R1.n(arrayList);
    }

    private static b o(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) sparseArray.valueAt(i10);
            if ((bVar2.f8704m || bVar2.f8697f != bVar2.f8695d.f8796b) && (!bVar2.f8704m || bVar2.f8699h != bVar2.f8693b.f8781e)) {
                long jD = bVar2.d();
                if (jD < j10) {
                    bVar = bVar2;
                    j10 = jD;
                }
            }
        }
        return bVar;
    }

    private void q() {
        int i10;
        O[] oArr = new O[2];
        this.f8658K = oArr;
        O o10 = this.f8679q;
        int i11 = 0;
        if (o10 != null) {
            oArr[0] = o10;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f8664b & 4) != 0) {
            oArr[i10] = this.f8657J.f(100, 5);
            i12 = 101;
            i10++;
        }
        O[] oArr2 = (O[]) S.S0(this.f8658K, i10);
        this.f8658K = oArr2;
        for (O o11 : oArr2) {
            o11.b(f8647R);
        }
        this.f8659L = new O[this.f8666d.size()];
        while (i11 < this.f8659L.length) {
            O oF = this.f8657J.f(i12, 3);
            oF.b((R1.r) this.f8666d.get(i11));
            this.f8659L[i11] = oF;
            i11++;
            i12++;
        }
    }

    private static boolean r(t tVar) {
        long[] jArr = tVar.f8768i;
        if (jArr != null && jArr.length == 1 && tVar.f8769j != null) {
            long j10 = jArr[0];
            if (j10 == 0 || S.a1(j10, 1000000L, tVar.f8763d) + S.a1(tVar.f8769j[0], 1000000L, tVar.f8762c) >= tVar.f8764e) {
                return true;
            }
        }
        return false;
    }

    private void s(InterfaceC4254q interfaceC4254q) {
        this.f8672j.W(8);
        interfaceC4254q.o(this.f8672j.f(), 0, 8);
        P2.b.g(this.f8672j);
        interfaceC4254q.l(this.f8672j.g());
        interfaceC4254q.d();
    }

    private void u(V1.e.b bVar) throws z {
        int i10 = bVar.f13910a;
        if (i10 == 1836019574) {
            y(bVar);
        } else if (i10 == 1836019558) {
            x(bVar);
        } else {
            if (this.f8676n.isEmpty()) {
                return;
            }
            ((V1.e.b) this.f8676n.peek()).b(bVar);
        }
    }

    private void v(F f10) {
        String str;
        String str2;
        long jA1;
        long jA2;
        long jN;
        long jA;
        if (this.f8658K.length == 0) {
            return;
        }
        f10.a0(8);
        int iQ = P2.b.q(f10.u());
        if (iQ == 0) {
            str = (String) AbstractC1459a.e(f10.F());
            str2 = (String) AbstractC1459a.e(f10.F());
            long jN2 = f10.N();
            jA1 = S.a1(f10.N(), 1000000L, jN2);
            long j10 = this.f8650C;
            long j11 = j10 != -9223372036854775807L ? j10 + jA1 : -9223372036854775807L;
            jA2 = S.a1(f10.N(), 1000L, jN2);
            jN = f10.N();
            jA = j11;
        } else {
            if (iQ != 1) {
                AbstractC1477t.h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iQ);
                return;
            }
            long jN3 = f10.N();
            jA = S.a1(f10.S(), 1000000L, jN3);
            long jA3 = S.a1(f10.N(), 1000L, jN3);
            long jN4 = f10.N();
            str = (String) AbstractC1459a.e(f10.F());
            str2 = (String) AbstractC1459a.e(f10.F());
            jA2 = jA3;
            jN = jN4;
            jA1 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[f10.a()];
        f10.q(bArr, 0, f10.a());
        F f11 = new F(this.f8674l.a(new G2.a(str3, str4, jA2, jN, bArr)));
        int iA = f11.a();
        for (O o10 : this.f8658K) {
            f11.a0(0);
            o10.f(f11, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f8677o.addLast(new a(jA1, true, iA));
            this.f8688z += iA;
            return;
        }
        if (!this.f8677o.isEmpty()) {
            this.f8677o.addLast(new a(jA, false, iA));
            this.f8688z += iA;
            return;
        }
        K k10 = this.f8673k;
        if (k10 != null && !k10.g()) {
            this.f8677o.addLast(new a(jA, false, iA));
            this.f8688z += iA;
            return;
        }
        K k11 = this.f8673k;
        if (k11 != null) {
            jA = k11.a(jA);
        }
        long j12 = jA;
        for (O o11 : this.f8658K) {
            o11.c(j12, 1, iA, 0, null);
        }
    }

    private void w(V1.e.c cVar, InterfaceC4254q interfaceC4254q) throws z {
        if (!this.f8676n.isEmpty()) {
            ((V1.e.b) this.f8676n.peek()).c(cVar);
            return;
        }
        int i10 = cVar.f13910a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                v(cVar.f13914b);
                return;
            }
            return;
        }
        Pair pairH = H(cVar.f13914b, interfaceC4254q.getPosition());
        this.f8680r.a((C4244g) pairH.second);
        if (!this.f8660M) {
            this.f8650C = ((Long) pairH.first).longValue();
            this.f8657J.p((J) pairH.second);
            this.f8660M = true;
        } else {
            if ((this.f8664b & 256) == 0 || this.f8661N || this.f8680r.c() <= 1) {
                return;
            }
            this.f8662O = interfaceC4254q.getPosition();
        }
    }

    private void x(V1.e.b bVar) throws z {
        B(bVar, this.f8667e, this.f8665c != null, this.f8664b, this.f8671i);
        R1.n nVarN = n(bVar.f13912c);
        if (nVarN != null) {
            int size = this.f8667e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f8667e.valueAt(i10)).n(nVarN);
            }
        }
        if (this.f8648A != -9223372036854775807L) {
            int size2 = this.f8667e.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) this.f8667e.valueAt(i11)).l(this.f8648A);
            }
            this.f8648A = -9223372036854775807L;
        }
    }

    private void y(V1.e.b bVar) {
        int i10 = 0;
        AbstractC1459a.h(this.f8665c == null, "Unexpected moov box.");
        R1.n nVarN = n(bVar.f13912c);
        V1.e.b bVar2 = (V1.e.b) AbstractC1459a.e(bVar.d(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = bVar2.f13912c.size();
        long jA = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            V1.e.c cVar = (V1.e.c) bVar2.f13912c.get(i11);
            int i12 = cVar.f13910a;
            if (i12 == 1953654136) {
                Pair pairL = L(cVar.f13914b);
                sparseArray.put(((Integer) pairL.first).intValue(), (c) pairL.second);
            } else if (i12 == 1835362404) {
                jA = A(cVar.f13914b);
            }
        }
        V1.e.b bVarD = bVar.d(1835365473);
        R1.x xVarI = null;
        R1.x xVarU = bVarD != null ? P2.b.u(bVarD) : null;
        B b10 = new B();
        V1.e.c cVarE = bVar.e(1969517665);
        if (cVarE != null) {
            xVarI = P2.b.I(cVarE);
            b10.c(xVarI);
        }
        R1.x xVar = xVarI;
        R1.x xVar2 = new R1.x(P2.b.w(((V1.e.c) AbstractC1459a.e(bVar.e(1836476516))).f13914b));
        List listH = P2.b.H(bVar, b10, jA, nVarN, (this.f8664b & 16) != 0, false, new e(this));
        int size2 = listH.size();
        if (this.f8667e.size() != 0) {
            AbstractC1459a.g(this.f8667e.size() == size2);
            while (i10 < size2) {
                w wVar = (w) listH.get(i10);
                t tVar = wVar.f8795a;
                ((b) this.f8667e.get(tVar.f8760a)).j(wVar, m(sparseArray, tVar.f8760a));
                i10++;
            }
            return;
        }
        String strB = k.b(listH);
        while (i10 < size2) {
            w wVar2 = (w) listH.get(i10);
            t tVar2 = wVar2.f8795a;
            O oF = this.f8657J.f(i10, tVar2.f8761b);
            oF.d(tVar2.f8764e);
            R1.r.b bVarB = tVar2.f8766g.b();
            bVarB.W(strB);
            j.l(tVar2.f8761b, b10, bVarB);
            j.m(tVar2.f8761b, xVarU, bVarB, tVar2.f8766g.f10274l, xVar, xVar2);
            this.f8667e.put(tVar2.f8760a, new b(oF, wVar2, m(sparseArray, tVar2.f8760a), bVarB.P()));
            this.f8649B = Math.max(this.f8649B, tVar2.f8764e);
            i10++;
            b10 = b10;
        }
        this.f8657J.t();
    }

    private void z(long j10) {
        while (!this.f8677o.isEmpty()) {
            a aVar = (a) this.f8677o.removeFirst();
            this.f8688z -= aVar.f8691c;
            long jA = aVar.f8689a;
            if (aVar.f8690b) {
                jA += j10;
            }
            K k10 = this.f8673k;
            if (k10 != null) {
                jA = k10.a(jA);
            }
            long j11 = jA;
            for (O o10 : this.f8658K) {
                o10.c(j11, 1, aVar.f8691c, this.f8688z, null);
            }
        }
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        int size = this.f8667e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) this.f8667e.valueAt(i10)).k();
        }
        this.f8677o.clear();
        this.f8688z = 0;
        this.f8678p.b();
        this.f8648A = j11;
        this.f8676n.clear();
        l();
    }

    @Override // p380v2.InterfaceC4253p
    public void b(p380v2.r rVar) {
        if ((this.f8664b & 32) == 0) {
            rVar = new S2.t(rVar, this.f8663a);
        }
        this.f8657J = rVar;
        l();
        q();
        t tVar = this.f8665c;
        if (tVar != null) {
            R1.r.b bVarB = tVar.f8766g.b();
            bVarB.W(k.a(this.f8665c.f8766g));
            this.f8667e.put(0, new b(this.f8657J.f(0, this.f8665c.f8761b), new w(this.f8665c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0), bVarB.P()));
            this.f8657J.t();
        }
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        N nB = s.b(interfaceC4254q);
        this.f8681s = nB != null ? AbstractC0876t.x(nB) : AbstractC0876t.w();
        return nB == null;
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) throws z {
        while (true) {
            int i11 = this.f8682t;
            if (i11 != 0) {
                if (i11 == 1) {
                    R(interfaceC4254q);
                } else if (i11 == 2) {
                    S(interfaceC4254q);
                } else if (T(interfaceC4254q)) {
                    return 0;
                }
            } else if (!Q(interfaceC4254q)) {
                long j10 = this.f8662O;
                if (j10 == -1) {
                    this.f8678p.d();
                    return -1;
                }
                i10.f55969a = j10;
                this.f8662O = -1L;
                this.f8657J.p(this.f8680r.b());
                this.f8661N = true;
                return 1;
            }
        }
    }

    @Override // p380v2.InterfaceC4253p
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC0876t k() {
        return this.f8681s;
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }

    protected t t(t tVar) {
        return tVar;
    }
}
