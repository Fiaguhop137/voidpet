package P2;

import C9.AbstractC0876t;
import R1.z;
import U1.AbstractC1459a;
import U1.F;
import U1.S;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p380v2.AbstractC4240c;
import p380v2.B;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.K;
import p380v2.N;
import p380v2.O;
import p380v2.P;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC4253p, J {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final p380v2.u f8708G = new m();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private a[] f8709A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long[][] f8710B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f8711C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f8712D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f8713E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private K2.a f8714F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2.s.a f8715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f8717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F f8718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F f8719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F f8720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f8721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q f8722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f8723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AbstractC0876t f8724j = AbstractC0876t.w();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f8727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private F f8729o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8730p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8731q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f8732r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8734t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8736v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f8737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f8739y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p380v2.r f8740z;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f8741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f8742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final O f8743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final P f8744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8745e;

        public a(t tVar, w wVar, O o10) {
            this.f8741a = tVar;
            this.f8742b = wVar;
            this.f8743c = o10;
            this.f8744d = "audio/true-hd".equals(tVar.f8766g.f10277o) ? new P() : null;
        }
    }

    public n(S2.s.a aVar, int i10) {
        this.f8715a = aVar;
        this.f8716b = i10;
        this.f8725k = (i10 & 4) != 0 ? 3 : 0;
        this.f8722h = new q();
        this.f8723i = new ArrayList();
        this.f8720f = new F(16);
        this.f8721g = new ArrayDeque();
        this.f8717c = new F(V1.h.f13920a);
        this.f8718d = new F(6);
        this.f8719e = new F();
        this.f8730p = -1;
        this.f8740z = p380v2.r.f56144F1;
        this.f8709A = new a[0];
    }

    private void A(R1.x xVar) {
        V1.c cVarA = j.a(xVar, "auxiliary.tracks.interleaved");
        if (cVarA == null || cVarA.f13906b[0] != 0) {
            return;
        }
        this.f8739y = this.f8737w + 16;
    }

    private void B(InterfaceC4254q interfaceC4254q) {
        this.f8719e.W(8);
        interfaceC4254q.o(this.f8719e.f(), 0, 8);
        b.g(this.f8719e);
        interfaceC4254q.l(this.f8719e.g());
        interfaceC4254q.d();
    }

    private void C(long j10) {
        while (!this.f8721g.isEmpty() && ((V1.e.b) this.f8721g.peek()).f13911b == j10) {
            V1.e.b bVar = (V1.e.b) this.f8721g.pop();
            if (bVar.f13910a == 1836019574) {
                F(bVar);
                this.f8721g.clear();
                if (!this.f8736v) {
                    this.f8725k = 2;
                }
            } else if (!this.f8721g.isEmpty()) {
                ((V1.e.b) this.f8721g.peek()).b(bVar);
            }
        }
        if (this.f8725k != 2) {
            t();
        }
    }

    private void D() {
        if (this.f8713E != 2 || (this.f8716b & 2) == 0) {
            return;
        }
        O oF = this.f8740z.f(0, 4);
        K2.a aVar = this.f8714F;
        oF.b(new R1.r.b().r0(aVar == null ? null : new R1.x(aVar)).P());
        this.f8740z.t();
        this.f8740z.p(new J.b(-9223372036854775807L));
    }

    private static int E(F f10) {
        f10.a0(8);
        int iP = p(f10.u());
        if (iP != 0) {
            return iP;
        }
        f10.b0(4);
        while (f10.a() > 0) {
            int iP2 = p(f10.u());
            if (iP2 != 0) {
                return iP2;
            }
        }
        return 0;
    }

    private void F(V1.e.b bVar) {
        List list;
        R1.x xVar;
        R1.x xVar2;
        R1.x xVar3;
        String str;
        ArrayList arrayList;
        V1.e.b bVarD = bVar.d(1835365473);
        List arrayList2 = new ArrayList();
        if (bVarD != null) {
            R1.x xVarU = b.u(bVarD);
            if (this.f8738x) {
                AbstractC1459a.i(xVarU);
                A(xVarU);
                arrayList2 = u(xVarU);
            } else if (N(xVarU)) {
                this.f8736v = true;
                return;
            }
            xVar = xVarU;
            list = arrayList2;
        } else {
            list = arrayList2;
            xVar = null;
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z10 = this.f8713E == 1;
        B b10 = new B();
        V1.e.c cVarE = bVar.e(1969517665);
        if (cVarE != null) {
            R1.x xVarI = b.I(cVarE);
            b10.c(xVarI);
            xVar2 = xVarI;
        } else {
            xVar2 = null;
        }
        R1.x xVar4 = new R1.x(b.w(((V1.e.c) AbstractC1459a.e(bVar.e(1836476516))).f13914b));
        List listH = b.H(bVar, b10, -9223372036854775807L, null, (this.f8716b & 1) != 0, z10, new l());
        if (this.f8738x) {
            AbstractC1459a.h(list.size() == listH.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(listH.size())));
        }
        String strB = k.b(listH);
        int i10 = 0;
        int i11 = 0;
        long jMax = -9223372036854775807L;
        int size = -1;
        while (i10 < listH.size()) {
            w wVar = (w) listH.get(i10);
            if (wVar.f8796b == 0) {
                b10 = b10;
                str = strB;
                xVar3 = xVar;
                arrayList = arrayList3;
            } else {
                t tVar = wVar.f8795a;
                ArrayList arrayList4 = arrayList3;
                int i12 = i11 + 1;
                String str2 = strB;
                a aVar = new a(tVar, wVar, this.f8740z.f(i11, tVar.f8761b));
                xVar3 = xVar;
                long j10 = tVar.f8764e;
                if (j10 == -9223372036854775807L) {
                    j10 = wVar.f8802h;
                }
                aVar.f8743c.d(j10);
                jMax = Math.max(jMax, j10);
                int i13 = "audio/true-hd".equals(tVar.f8766g.f10277o) ? wVar.f8799e * 16 : wVar.f8799e + 30;
                R1.r.b bVarB = tVar.f8766g.b();
                bVarB.o0(i13);
                if (tVar.f8761b == 2) {
                    int i14 = tVar.f8766g.f10268f;
                    if ((this.f8716b & 8) != 0) {
                        i14 |= size == -1 ? 1 : 2;
                    }
                    if (this.f8738x) {
                        i14 |= 32768;
                        bVarB.R(((Integer) list.get(i10)).intValue());
                    }
                    bVarB.w0(i14);
                }
                j.l(tVar.f8761b, b10, bVarB);
                j.m(tVar.f8761b, xVar3, bVarB, tVar.f8766g.f10274l, this.f8723i.isEmpty() ? null : new R1.x(this.f8723i), xVar2, xVar4);
                str = str2;
                bVarB.W(str);
                aVar.f8743c.b(bVarB.P());
                if (tVar.f8761b == 2 && size == -1) {
                    size = arrayList4.size();
                }
                arrayList = arrayList4;
                arrayList.add(aVar);
                i11 = i12;
            }
            i10++;
            xVar = xVar3;
            arrayList3 = arrayList;
            listH = listH;
            strB = str;
            b10 = b10;
        }
        this.f8711C = size;
        this.f8712D = jMax;
        a[] aVarArr = (a[]) arrayList3.toArray(new a[0]);
        this.f8709A = aVarArr;
        this.f8710B = q(aVarArr);
        this.f8740z.t();
        this.f8740z.p(this);
    }

    private void G(long j10) {
        if (this.f8726l == 1836086884) {
            int i10 = this.f8728n;
            this.f8714F = new K2.a(0L, j10, -9223372036854775807L, j10 + ((long) i10), this.f8727m - ((long) i10));
        }
    }

    private boolean H(InterfaceC4254q interfaceC4254q) throws z {
        V1.e.b bVar;
        if (this.f8728n == 0) {
            if (!interfaceC4254q.g(this.f8720f.f(), 0, 8, true)) {
                D();
                return false;
            }
            this.f8728n = 8;
            this.f8720f.a0(0);
            this.f8727m = this.f8720f.N();
            this.f8726l = this.f8720f.u();
        }
        long j10 = this.f8727m;
        if (j10 == 1) {
            interfaceC4254q.readFully(this.f8720f.f(), 8, 8);
            this.f8728n += 8;
            this.f8727m = this.f8720f.S();
        } else if (j10 == 0) {
            long length = interfaceC4254q.getLength();
            if (length == -1 && (bVar = (V1.e.b) this.f8721g.peek()) != null) {
                length = bVar.f13911b;
            }
            if (length != -1) {
                this.f8727m = (length - interfaceC4254q.getPosition()) + ((long) this.f8728n);
            }
        }
        if (this.f8727m < this.f8728n) {
            throw z.d("Atom size less than header length (unsupported).");
        }
        if (L(this.f8726l)) {
            long position = interfaceC4254q.getPosition();
            long j11 = this.f8727m;
            int i10 = this.f8728n;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.f8726l == 1835365473) {
                B(interfaceC4254q);
            }
            this.f8721g.push(new V1.e.b(this.f8726l, j12));
            if (this.f8727m == this.f8728n) {
                C(j12);
            } else {
                t();
            }
        } else if (M(this.f8726l)) {
            AbstractC1459a.g(this.f8728n == 8);
            AbstractC1459a.g(this.f8727m <= 2147483647L);
            F f10 = new F((int) this.f8727m);
            System.arraycopy(this.f8720f.f(), 0, f10.f(), 0, 8);
            this.f8729o = f10;
            this.f8725k = 1;
        } else {
            G(interfaceC4254q.getPosition() - ((long) this.f8728n));
            this.f8729o = null;
            this.f8725k = 1;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    private boolean I(InterfaceC4254q interfaceC4254q, I i10) {
        boolean z10;
        long j10 = this.f8727m - ((long) this.f8728n);
        long position = interfaceC4254q.getPosition() + j10;
        F f10 = this.f8729o;
        if (f10 == null) {
            if (!this.f8735u && this.f8726l == 1835295092) {
                this.f8713E = 1;
            }
            if (j10 < 262144) {
                interfaceC4254q.l((int) j10);
            } else {
                i10.f55969a = interfaceC4254q.getPosition() + j10;
                z10 = true;
            }
            C(position);
            if (this.f8736v) {
                this.f8738x = true;
                i10.f55969a = this.f8737w;
                this.f8736v = false;
                z10 = true;
            }
            return (z10 || this.f8725k == 2) ? false : true;
        }
        interfaceC4254q.readFully(f10.f(), this.f8728n, (int) j10);
        if (this.f8726l == 1718909296) {
            this.f8735u = true;
            this.f8713E = E(f10);
        } else if (!this.f8721g.isEmpty()) {
            ((V1.e.b) this.f8721g.peek()).c(new V1.e.c(this.f8726l, f10));
        }
        z10 = false;
        C(position);
        if (this.f8736v) {
            this.f8738x = true;
            i10.f55969a = this.f8737w;
            this.f8736v = false;
            z10 = true;
        }
        if (z10) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    private int J(InterfaceC4254q interfaceC4254q, I i10) throws z {
        O.a aVar;
        ?? r10;
        boolean z10;
        int iO;
        long position = interfaceC4254q.getPosition();
        if (this.f8730p == -1) {
            int iY = y(position);
            this.f8730p = iY;
            if (iY == -1) {
                return -1;
            }
        }
        a aVar2 = this.f8709A[this.f8730p];
        O o10 = aVar2.f8743c;
        int i11 = aVar2.f8745e;
        w wVar = aVar2.f8742b;
        long j10 = wVar.f8797c[i11] + this.f8739y;
        int i12 = wVar.f8798d[i11];
        P p10 = aVar2.f8744d;
        long j11 = (j10 - position) + ((long) this.f8731q);
        if (j11 < 0 || j11 >= 262144) {
            i10.f55969a = j10;
            return 1;
        }
        if (aVar2.f8741a.f8767h == 1) {
            j11 += 8;
            i12 -= 8;
        }
        interfaceC4254q.l((int) j11);
        if (!r(aVar2.f8741a.f8766g)) {
            this.f8734t = true;
        }
        t tVar = aVar2.f8741a;
        if (tVar.f8770k == 0) {
            aVar = null;
            if ("audio/ac4".equals(tVar.f8766g.f10277o)) {
                if (this.f8732r == 0) {
                    AbstractC4240c.b(i12, this.f8719e);
                    o10.f(this.f8719e, 7);
                    this.f8732r += 7;
                }
                i12 += 7;
            } else if (p10 != null) {
                p10.d(interfaceC4254q);
            }
            while (true) {
                int i13 = this.f8732r;
                if (i13 >= i12) {
                    break;
                }
                int iA = o10.a(interfaceC4254q, i12 - i13, false);
                this.f8731q += iA;
                this.f8732r += iA;
                this.f8733s -= iA;
            }
        } else {
            byte[] bArrF = this.f8718d.f();
            bArrF[0] = 0;
            bArrF[1] = 0;
            bArrF[2] = 0;
            int i14 = 4 - aVar2.f8741a.f8770k;
            i12 += i14;
            while (this.f8732r < i12) {
                int i15 = this.f8733s;
                if (i15 == 0) {
                    t tVar2 = aVar2.f8741a;
                    int i16 = tVar2.f8770k;
                    if (this.f8734t || V1.h.o(tVar2.f8766g) + i16 > aVar2.f8742b.f8798d[i11] - this.f8731q) {
                        iO = 0;
                    } else {
                        iO = V1.h.o(aVar2.f8741a.f8766g);
                        i16 = aVar2.f8741a.f8770k + iO;
                    }
                    interfaceC4254q.readFully(bArrF, i14, i16);
                    this.f8731q += i16;
                    this.f8718d.a0(0);
                    int iU = this.f8718d.u();
                    if (iU < 0) {
                        throw z.a("Invalid NAL length", null);
                    }
                    this.f8733s = iU - iO;
                    this.f8717c.a0(0);
                    o10.f(this.f8717c, 4);
                    this.f8732r += 4;
                    if (iO > 0) {
                        o10.f(this.f8718d, iO);
                        this.f8732r += iO;
                        if (V1.h.k(bArrF, 4, iO, aVar2.f8741a.f8766g)) {
                            this.f8734t = true;
                        }
                    }
                } else {
                    int iA2 = o10.a(interfaceC4254q, i15, false);
                    this.f8731q += iA2;
                    this.f8732r += iA2;
                    this.f8733s -= iA2;
                }
            }
            aVar = null;
        }
        int i17 = i12;
        w wVar2 = aVar2.f8742b;
        long j12 = wVar2.f8800f[i11];
        int i18 = wVar2.f8801g[i11];
        if (!this.f8734t) {
            i18 |= 67108864;
        }
        int i19 = i18;
        if (p10 != null) {
            z10 = false;
            p10.c(o10, j12, i19, i17, 0, null);
            if (i11 + 1 == aVar2.f8742b.f8796b) {
                r10 = z10;
                p10.a(o10, aVar);
                r10 = z10;
            }
        } else {
            r10 = 0;
            o10.c(j12, i19, i17, 0, null);
        }
        r10 = z10;
        aVar2.f8745e++;
        this.f8730p = -1;
        this.f8731q = r10;
        this.f8732r = r10;
        this.f8733s = r10;
        this.f8734t = r10;
        return r10;
    }

    private int K(InterfaceC4254q interfaceC4254q, I i10) throws z {
        int iC = this.f8722h.c(interfaceC4254q, i10, this.f8723i);
        if (iC == 1 && i10.f55969a == 0) {
            t();
        }
        return iC;
    }

    private static boolean L(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1635284069;
    }

    private static boolean M(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private boolean N(R1.x xVar) {
        V1.c cVarA;
        if (xVar != null && (this.f8716b & 64) != 0 && (cVarA = j.a(xVar, "auxiliary.tracks.offset")) != null) {
            long jS = new F(cVarA.f13906b).S();
            if (jS > 0) {
                this.f8737w = jS;
                return true;
            }
        }
        return false;
    }

    private void O(a aVar, long j10) {
        w wVar = aVar.f8742b;
        int iA = wVar.a(j10);
        if (iA == -1) {
            iA = wVar.b(j10);
        }
        aVar.f8745e = iA;
    }

    public static /* synthetic */ t n(t tVar) {
        return tVar;
    }

    public static /* synthetic */ InterfaceC4253p[] o() {
        return new InterfaceC4253p[]{new n(S2.s.a.f11528a, 16)};
    }

    private static int p(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] q(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f8742b.f8796b];
            jArr2[i10] = aVarArr[i10].f8742b.f8800f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            w wVar = aVarArr[i12].f8742b;
            j10 += (long) wVar.f8798d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = wVar.f8800f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private boolean r(R1.r rVar) {
        if (Objects.equals(rVar.f10277o, "video/avc")) {
            return (this.f8716b & 32) != 0;
        }
        return Objects.equals(rVar.f10277o, "video/hevc") && (this.f8716b & 128) != 0;
    }

    public static int s(int i10) {
        int i11 = (i10 & 1) != 0 ? 32 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private void t() {
        this.f8725k = 0;
        this.f8728n = 0;
    }

    private List u(R1.x xVar) {
        List listD = ((V1.c) AbstractC1459a.i(j.a(xVar, "auxiliary.tracks.map"))).d();
        ArrayList arrayList = new ArrayList(listD.size());
        for (int i10 = 0; i10 < listD.size(); i10++) {
            int iIntValue = ((Integer) listD.get(i10)).intValue();
            int i11 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i11 = 3;
                    if (iIntValue != 2) {
                        i11 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i11 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    private static int x(w wVar, long j10) {
        int iA = wVar.a(j10);
        return iA == -1 ? wVar.b(j10) : iA;
    }

    private int y(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f8709A;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f8745e;
            w wVar = aVar.f8742b;
            if (i13 != wVar.f8796b) {
                long j14 = wVar.f8797c[i13];
                long j15 = ((long[][]) S.i(this.f8710B))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j12 = j15;
                    i11 = i12;
                    j13 = j16;
                }
                if (j15 < j11) {
                    z10 = z12;
                    j11 = j15;
                    i10 = i12;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    private static long z(w wVar, long j10, long j11) {
        int iX = x(wVar, j10);
        return iX == -1 ? j11 : Math.min(wVar.f8797c[iX], j11);
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        this.f8721g.clear();
        this.f8728n = 0;
        this.f8730p = -1;
        this.f8731q = 0;
        this.f8732r = 0;
        this.f8733s = 0;
        this.f8734t = false;
        if (j10 == 0) {
            if (this.f8725k != 3) {
                t();
                return;
            } else {
                this.f8722h.g();
                this.f8723i.clear();
                return;
            }
        }
        for (a aVar : this.f8709A) {
            O(aVar, j11);
            P p10 = aVar.f8744d;
            if (p10 != null) {
                p10.b();
            }
        }
    }

    @Override // p380v2.InterfaceC4253p
    public void b(p380v2.r rVar) {
        if ((this.f8716b & 16) == 0) {
            rVar = new S2.t(rVar, this.f8715a);
        }
        this.f8740z = rVar;
    }

    @Override // p380v2.J
    public J.a e(long j10) {
        return v(j10, -1);
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        N nD = s.d(interfaceC4254q, (this.f8716b & 2) != 0);
        this.f8724j = nD != null ? AbstractC0876t.x(nD) : AbstractC0876t.w();
        return nD == null;
    }

    @Override // p380v2.J
    public boolean i() {
        return true;
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) {
        while (true) {
            int i11 = this.f8725k;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return J(interfaceC4254q, i10);
                    }
                    if (i11 == 3) {
                        return K(interfaceC4254q, i10);
                    }
                    throw new IllegalStateException();
                }
                if (I(interfaceC4254q, i10)) {
                    return 1;
                }
            } else if (!H(interfaceC4254q)) {
                return -1;
            }
        }
    }

    @Override // p380v2.J
    public long m() {
        return this.f8712D;
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080 A[EDGE_INSN: B:43:0x0080->B:37:0x0080 BREAK  A[LOOP:0: B:28:0x0063->B:36:0x007d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007d A[SYNTHETIC] */
    public J.a v(long j10, int i10) {
        long j11;
        long j12;
        long jZ;
        long j13;
        int i11;
        a[] aVarArr;
        w wVar;
        int iB;
        a[] aVarArr2 = this.f8709A;
        if (aVarArr2.length == 0) {
            return new J.a(K.f55974c);
        }
        int i12 = i10 != -1 ? i10 : this.f8711C;
        if (i12 != -1) {
            w wVar2 = aVarArr2[i12].f8742b;
            int iX = x(wVar2, j10);
            if (iX == -1) {
                return new J.a(K.f55974c);
            }
            j12 = wVar2.f8800f[iX];
            j11 = wVar2.f8797c[iX];
            if (j12 < j10 && iX < wVar2.f8796b - 1 && (iB = wVar2.b(j10)) != -1 && iB != iX) {
                j13 = wVar2.f8800f[iB];
                jZ = wVar2.f8797c[iB];
            }
            if (i10 == -1) {
                i11 = 0;
                while (true) {
                    aVarArr = this.f8709A;
                    if (i11 < aVarArr.length) {
                        break;
                    }
                    if (i11 != this.f8711C) {
                        wVar = aVarArr[i11].f8742b;
                        long jZ2 = z(wVar, j12, j11);
                        if (j13 != -9223372036854775807L) {
                            jZ = z(wVar, j13, jZ);
                        }
                        j11 = jZ2;
                    }
                    i11++;
                }
            }
            K k10 = new K(j12, j11);
            return j13 == -9223372036854775807L ? new J.a(k10) : new J.a(k10, new K(j13, jZ));
        }
        j11 = Long.MAX_VALUE;
        j12 = j10;
        jZ = -1;
        j13 = -9223372036854775807L;
        if (i10 == -1) {
            i11 = 0;
            while (true) {
                aVarArr = this.f8709A;
                if (i11 < aVarArr.length) {
                    break;
                    break;
                }
                if (i11 != this.f8711C) {
                    wVar = aVarArr[i11].f8742b;
                    long jZ3 = z(wVar, j12, j11);
                    if (j13 != -9223372036854775807L) {
                        jZ = z(wVar, j13, jZ);
                    }
                    j11 = jZ3;
                }
                i11++;
            }
        }
        K k11 = new K(j12, j11);
        if (j13 == -9223372036854775807L) {
        }
    }

    @Override // p380v2.InterfaceC4253p
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public AbstractC0876t k() {
        return this.f8724j;
    }
}
