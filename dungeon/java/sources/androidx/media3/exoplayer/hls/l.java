package androidx.media3.exoplayer.hls;

import C9.AbstractC0876t;
import C9.AbstractC0879w;
import R1.G;
import R1.InterfaceC1350j;
import R1.n;
import R1.x;
import R1.y;
import R1.z;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.F;
import U1.S;
import W1.s;
import Z1.R0;
import Z1.U0;
import Z1.z1;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p075e2.t;
import p075e2.u;
import p236n2.B;
import p236n2.C4027y;
import p236n2.L;
import p236n2.b0;
import p236n2.c0;
import p236n2.d0;
import p236n2.m0;
import p290q2.D;
import p308r2.m;
import p380v2.C4251n;
import p380v2.J;
import p380v2.O;
import p380v2.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class l implements m.b, m.f, d0, r, b0.d {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final Set f24704Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f24705A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f24706B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f24707C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f24708D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f24709E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private R1.r f24710F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private R1.r f24711G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f24712H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private m0 f24713I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Set f24714J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int[] f24715K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f24716L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f24717M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean[] f24718N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean[] f24719O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private long f24720P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private long f24721Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f24722R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f24723S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f24724T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f24725U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private long f24726V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private n f24727W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private e f24728X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f24731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.hls.c f24732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p308r2.b f24733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final R1.r f24734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u f24735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t.a f24736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p308r2.k f24737i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final L.a f24739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f24740l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f24742n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f24743o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f24744p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f24745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Handler f24746r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ArrayList f24747s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f24748t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p254o2.e f24749u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d[] f24750v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Set f24752x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private SparseIntArray f24753y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private O f24754z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f24738j = new m("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.media3.exoplayer.hls.c.b f24741m = new androidx.media3.exoplayer.hls.c.b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f24751w = new int[0];

    public interface b extends d0.a {
        void j();

        void l(Uri uri);
    }

    private static class c implements O {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final R1.r f24755g = new R1.r.b().y0("application/id3").P();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final R1.r f24756h = new R1.r.b().y0("application/x-emsg").P();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final G2.b f24757a = new G2.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final O f24758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final R1.r f24759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private R1.r f24760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f24761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f24762f;

        public c(O o10, int i10) {
            this.f24758b = o10;
            if (i10 == 1) {
                this.f24759c = f24755g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
                this.f24759c = f24756h;
            }
            this.f24761e = new byte[0];
            this.f24762f = 0;
        }

        private boolean h(G2.a aVar) {
            R1.r rVarA = aVar.a();
            return rVarA != null && Objects.equals(this.f24759c.f10277o, rVarA.f10277o);
        }

        private void i(int i10) {
            byte[] bArr = this.f24761e;
            if (bArr.length < i10) {
                this.f24761e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private F j(int i10, int i11) {
            int i12 = this.f24762f - i11;
            F f10 = new F(Arrays.copyOfRange(this.f24761e, i12 - i10, i12));
            byte[] bArr = this.f24761e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f24762f = i11;
            return f10;
        }

        @Override // p380v2.O
        public void b(R1.r rVar) {
            this.f24760d = rVar;
            this.f24758b.b(this.f24759c);
        }

        @Override // p380v2.O
        public void c(long j10, int i10, int i11, int i12, O.a aVar) {
            AbstractC1459a.e(this.f24760d);
            F fJ = j(i11, i12);
            if (!Objects.equals(this.f24760d.f10277o, this.f24759c.f10277o)) {
                if (!"application/x-emsg".equals(this.f24760d.f10277o)) {
                    AbstractC1477t.h("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f24760d.f10277o);
                    return;
                }
                G2.a aVarC = this.f24757a.c(fJ);
                if (!h(aVarC)) {
                    AbstractC1477t.h("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f24759c.f10277o, aVarC.a()));
                    return;
                }
                fJ = new F((byte[]) AbstractC1459a.e(aVarC.c()));
            }
            int iA = fJ.a();
            this.f24758b.f(fJ, iA);
            this.f24758b.c(j10, i10, iA, 0, aVar);
        }

        @Override // p380v2.O
        public void e(F f10, int i10, int i11) {
            i(this.f24762f + i10);
            f10.q(this.f24761e, this.f24762f, i10);
            this.f24762f += i10;
        }

        @Override // p380v2.O
        public int g(InterfaceC1350j interfaceC1350j, int i10, boolean z10, int i11) throws EOFException {
            i(this.f24762f + i10);
            int i12 = interfaceC1350j.read(this.f24761e, this.f24762f, i10);
            if (i12 != -1) {
                this.f24762f += i12;
                return i12;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
    }

    private static final class d extends b0 {

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private final Map f24763H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private n f24764I;

        private d(p308r2.b bVar, u uVar, t.a aVar, Map map) {
            super(bVar, uVar, aVar);
            this.f24763H = map;
        }

        /* synthetic */ d(p308r2.b bVar, u uVar, t.a aVar, Map map, a aVar2) {
            this(bVar, uVar, aVar, map);
        }

        private x j0(x xVar) {
            if (xVar == null) {
                return null;
            }
            int iE = xVar.e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= iE) {
                    i11 = -1;
                    break;
                }
                x.a aVarD = xVar.d(i11);
                if ((aVarD instanceof J2.m) && "com.apple.streaming.transportStreamTimestamp".equals(((J2.m) aVarD).f5724b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return xVar;
            }
            if (iE == 1) {
                return null;
            }
            x.a[] aVarArr = new x.a[iE - 1];
            while (i10 < iE) {
                if (i10 != i11) {
                    aVarArr[i10 < i11 ? i10 : i10 - 1] = xVar.d(i10);
                }
                i10++;
            }
            return new x(aVarArr);
        }

        @Override // p236n2.b0, p380v2.O
        public void c(long j10, int i10, int i11, int i12, O.a aVar) {
            super.c(j10, i10, i11, i12, aVar);
        }

        public void k0(n nVar) {
            this.f24764I = nVar;
            L();
        }

        public void l0(e eVar) {
            h0(eVar.f24654k);
        }

        @Override // p236n2.b0
        public R1.r z(R1.r rVar) {
            n nVar;
            n nVar2 = this.f24764I;
            if (nVar2 == null) {
                nVar2 = rVar.f10281s;
            }
            if (nVar2 != null && (nVar = (n) this.f24763H.get(nVar2.f10198c)) != null) {
                nVar2 = nVar;
            }
            x xVarJ0 = j0(rVar.f10274l);
            if (nVar2 != rVar.f10281s || xVarJ0 != rVar.f10274l) {
                rVar = rVar.b().c0(nVar2).r0(xVarJ0).P();
            }
            return super.z(rVar);
        }
    }

    public l(String str, int i10, b bVar, androidx.media3.exoplayer.hls.c cVar, Map map, p308r2.b bVar2, long j10, R1.r rVar, u uVar, t.a aVar, p308r2.k kVar, L.a aVar2, int i11) {
        this.f24729a = str;
        this.f24730b = i10;
        this.f24731c = bVar;
        this.f24732d = cVar;
        this.f24748t = map;
        this.f24733e = bVar2;
        this.f24734f = rVar;
        this.f24735g = uVar;
        this.f24736h = aVar;
        this.f24737i = kVar;
        this.f24739k = aVar2;
        this.f24740l = i11;
        Set set = f24704Y;
        this.f24752x = new HashSet(set.size());
        this.f24753y = new SparseIntArray(set.size());
        this.f24750v = new d[0];
        this.f24719O = new boolean[0];
        this.f24718N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f24742n = arrayList;
        this.f24743o = Collections.unmodifiableList(arrayList);
        this.f24747s = new ArrayList();
        this.f24744p = new j(this);
        this.f24745q = new k(this);
        this.f24746r = S.z();
        this.f24720P = j10;
        this.f24721Q = j10;
    }

    private void B() {
        R1.r rVar;
        int length = this.f24750v.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int i13 = 2;
            if (i12 >= length) {
                break;
            }
            String str = ((R1.r) AbstractC1459a.i(this.f24750v[i12].I())).f10277o;
            if (!y.t(str)) {
                i13 = y.o(str) ? 1 : y.s(str) ? 3 : -2;
            }
            if (O(i13) > O(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        G gL = this.f24732d.l();
        int i14 = gL.f9963a;
        this.f24716L = -1;
        this.f24715K = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.f24715K[i15] = i15;
        }
        G[] gArr = new G[length];
        int i16 = 0;
        while (i16 < length) {
            R1.r rVar2 = (R1.r) AbstractC1459a.i(this.f24750v[i16].I());
            if (i16 == i11) {
                R1.r[] rVarArr = new R1.r[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    R1.r rVarA = gL.a(i17);
                    if (i10 == 1 && (rVar = this.f24734f) != null) {
                        rVarA = rVarA.i(rVar);
                    }
                    rVarArr[i17] = i14 == 1 ? rVar2.i(rVarA) : H(rVarA, rVar2, true);
                }
                gArr[i16] = new G(this.f24729a, rVarArr);
                this.f24716L = i16;
            } else {
                R1.r rVar3 = (i10 == 2 && y.o(rVar2.f10277o)) ? this.f24734f : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f24729a);
                sb2.append(":muxed:");
                sb2.append(i16 < i11 ? i16 : i16 - 1);
                gArr[i16] = new G(sb2.toString(), H(rVar3, rVar2, false));
            }
            i16++;
        }
        this.f24713I = G(gArr);
        AbstractC1459a.g(this.f24714J == null);
        this.f24714J = Collections.EMPTY_SET;
    }

    private boolean C(int i10) {
        for (int i11 = i10; i11 < this.f24742n.size(); i11++) {
            if (((e) this.f24742n.get(i11)).x()) {
                return false;
            }
        }
        e eVar = (e) this.f24742n.get(i10);
        for (int i12 = 0; i12 < this.f24750v.length; i12++) {
            if (this.f24750v[i12].F() > eVar.n(i12)) {
                return false;
            }
        }
        return true;
    }

    private static C4251n E(int i10, int i11) {
        AbstractC1477t.h("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new C4251n();
    }

    private b0 F(int i10, int i11) {
        int length = this.f24750v.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f24733e, this.f24735g, this.f24736h, this.f24748t, null);
        dVar.d0(this.f24720P);
        if (z10) {
            dVar.k0(this.f24727W);
        }
        dVar.c0(this.f24726V);
        e eVar = this.f24728X;
        if (eVar != null) {
            dVar.l0(eVar);
        }
        dVar.f0(this);
        int i12 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f24751w, i12);
        this.f24751w = iArrCopyOf;
        iArrCopyOf[length] = i10;
        this.f24750v = (d[]) S.Q0(this.f24750v, dVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.f24719O, i12);
        this.f24719O = zArrCopyOf;
        zArrCopyOf[length] = z10;
        this.f24717M |= z10;
        this.f24752x.add(Integer.valueOf(i11));
        this.f24753y.append(i11, length);
        if (O(i11) > O(this.f24705A)) {
            this.f24706B = length;
            this.f24705A = i11;
        }
        this.f24718N = Arrays.copyOf(this.f24718N, i12);
        return dVar;
    }

    private m0 G(G[] gArr) {
        for (int i10 = 0; i10 < gArr.length; i10++) {
            G g10 = gArr[i10];
            R1.r[] rVarArr = new R1.r[g10.f9963a];
            for (int i11 = 0; i11 < g10.f9963a; i11++) {
                R1.r rVarA = g10.a(i11);
                rVarArr[i11] = rVarA.c(this.f24735g.d(rVarA));
            }
            gArr[i10] = new G(g10.f9964b, rVarArr);
        }
        return new m0(gArr);
    }

    private static R1.r H(R1.r rVar, R1.r rVar2, boolean z10) {
        String strD;
        String strG;
        if (rVar == null) {
            return rVar2;
        }
        int iK = y.k(rVar2.f10277o);
        if (S.S(rVar.f10273k, iK) == 1) {
            strD = S.T(rVar.f10273k, iK);
            strG = y.g(strD);
        } else {
            strD = y.d(rVar.f10273k, rVar2.f10277o);
            strG = rVar2.f10277o;
        }
        R1.r.b bVarU = rVar2.b().j0(rVar.f10263a).l0(rVar.f10264b).m0(rVar.f10265c).n0(rVar.f10266d).A0(rVar.f10267e).w0(rVar.f10268f).S(z10 ? rVar.f10270h : -1).t0(z10 ? rVar.f10271i : -1).U(strD);
        if (iK == 2) {
            bVarU.F0(rVar.f10284v).h0(rVar.f10285w).f0(rVar.f10288z);
        }
        if (strG != null) {
            bVarU.y0(strG);
        }
        int i10 = rVar.f10252G;
        if (i10 != -1 && iK == 1) {
            bVarU.T(i10);
        }
        x xVarB = rVar.f10274l;
        if (xVarB != null) {
            x xVar = rVar2.f10274l;
            if (xVar != null) {
                xVarB = xVar.b(xVarB);
            }
            bVarU.r0(xVarB);
        }
        return bVarU.P();
    }

    private void I(int i10) {
        AbstractC1459a.g(!this.f24738j.j());
        while (true) {
            if (i10 >= this.f24742n.size()) {
                i10 = -1;
                break;
            } else if (C(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = M().f50356h;
        e eVarJ = J(i10);
        if (this.f24742n.isEmpty()) {
            this.f24721Q = this.f24720P;
        } else {
            ((e) AbstractC0879w.d(this.f24742n)).q();
        }
        this.f24724T = false;
        this.f24739k.y(this.f24705A, eVarJ.f50355g, j10);
    }

    private e J(int i10) {
        e eVar = (e) this.f24742n.get(i10);
        ArrayList arrayList = this.f24742n;
        S.Y0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f24750v.length; i11++) {
            this.f24750v[i11].w(eVar.n(i11));
        }
        return eVar;
    }

    private boolean K(e eVar) {
        int i10 = eVar.f24654k;
        int length = this.f24750v.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f24718N[i11] && this.f24750v[i11].S() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean L(R1.r rVar, R1.r rVar2) {
        String str = rVar.f10277o;
        String str2 = rVar2.f10277o;
        int iK = y.k(str);
        if (iK != 3) {
            return iK == y.k(str2);
        }
        if (Objects.equals(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || rVar.f10257L == rVar2.f10257L;
        }
        return false;
    }

    private e M() {
        ArrayList arrayList = this.f24742n;
        return (e) arrayList.get(arrayList.size() - 1);
    }

    private O N(int i10, int i11) {
        AbstractC1459a.a(f24704Y.contains(Integer.valueOf(i11)));
        int i12 = this.f24753y.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f24752x.add(Integer.valueOf(i11))) {
            this.f24751w[i12] = i10;
        }
        return this.f24751w[i12] == i10 ? this.f24750v[i12] : E(i10, i11);
    }

    private static int O(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    private void P(e eVar) {
        this.f24728X = eVar;
        this.f24710F = eVar.f50352d;
        this.f24721Q = -9223372036854775807L;
        this.f24742n.add(eVar);
        AbstractC0876t.a aVarL = AbstractC0876t.l();
        for (d dVar : this.f24750v) {
            aVarL.a(Integer.valueOf(dVar.J()));
        }
        eVar.p(this, aVarL.k());
        for (d dVar2 : this.f24750v) {
            dVar2.l0(eVar);
            if (eVar.x()) {
                dVar2.i0();
            }
        }
    }

    private static boolean Q(p254o2.e eVar) {
        return eVar instanceof e;
    }

    private boolean R() {
        return this.f24721Q != -9223372036854775807L;
    }

    private void U() {
        int i10 = this.f24713I.f49821a;
        int[] iArr = new int[i10];
        this.f24715K = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f24750v;
                if (i12 >= dVarArr.length) {
                    break;
                }
                if (L((R1.r) AbstractC1459a.i(dVarArr[i12].I()), this.f24713I.b(i11).a(0))) {
                    this.f24715K[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator it = this.f24747s.iterator();
        while (it.hasNext()) {
            ((h) it.next()).b();
        }
    }

    private void V(e eVar) {
        if (this.f24742n.isEmpty()) {
            return;
        }
        if (!M().r()) {
            I(this.f24742n.size() - 1);
        }
        if (eVar.f24657n && eVar.x()) {
            for (int size = this.f24742n.size() - 1; size >= 0; size--) {
                long j10 = ((e) this.f24742n.get(size)).f50355g;
                long j11 = eVar.f50355g;
                if (j10 < j11) {
                    return;
                }
                if (j10 == j11 && C(size)) {
                    I(size);
                    eVar.j();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        if (!this.f24712H && this.f24715K == null && this.f24707C) {
            for (d dVar : this.f24750v) {
                if (dVar.I() == null) {
                    return;
                }
            }
            if (this.f24713I != null) {
                U();
                return;
            }
            B();
            p0();
            this.f24731c.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        this.f24707C = true;
        W();
    }

    private void k0() {
        for (d dVar : this.f24750v) {
            dVar.Y(this.f24722R);
        }
        this.f24722R = false;
    }

    private boolean l0(long j10, e eVar) throws Throwable {
        boolean zB0;
        int length = this.f24750v.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                return true;
            }
            d dVar = this.f24750v[i10];
            if (eVar != null) {
                zB0 = dVar.a0(eVar.n(i10));
            } else {
                long jB = b();
                if (jB != Long.MIN_VALUE && j10 >= jB) {
                    z10 = false;
                }
                zB0 = dVar.b0(j10, z10);
            }
            if (!zB0 && (this.f24719O[i10] || !this.f24717M)) {
                return false;
            }
            i10++;
        }
    }

    private void p0() {
        this.f24708D = true;
    }

    private void u0(c0[] c0VarArr) {
        this.f24747s.clear();
        for (c0 c0Var : c0VarArr) {
            if (c0Var != null) {
                this.f24747s.add((h) c0Var);
            }
        }
    }

    private void z() {
        AbstractC1459a.g(this.f24708D);
        AbstractC1459a.e(this.f24713I);
        AbstractC1459a.e(this.f24714J);
    }

    public int A(int i10) {
        z();
        AbstractC1459a.e(this.f24715K);
        int i11 = this.f24715K[i10];
        if (i11 == -1) {
            return this.f24714J.contains(this.f24713I.b(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.f24718N;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }

    public void D() {
        if (this.f24708D) {
            return;
        }
        d(new U0.b().f(this.f24720P).d());
    }

    public boolean S(int i10) {
        return !R() && this.f24750v[i10].N(this.f24724T);
    }

    public boolean T() {
        return this.f24705A == 2;
    }

    public void X() throws IOException {
        this.f24738j.a();
        this.f24732d.r();
    }

    public void Y(int i10) throws IOException {
        X();
        this.f24750v[i10].P();
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void i(p254o2.e eVar, long j10, long j11, boolean z10) {
        this.f24749u = null;
        C4027y c4027y = new C4027y(eVar.f50349a, eVar.f50350b, eVar.f(), eVar.e(), j10, j11, eVar.b());
        this.f24737i.d(eVar.f50349a);
        this.f24739k.m(c4027y, eVar.f50351c, this.f24730b, eVar.f50352d, eVar.f50353e, eVar.f50354f, eVar.f50355g, eVar.f50356h);
        if (z10) {
            return;
        }
        if (R() || this.f24709E == 0) {
            k0();
        }
        if (this.f24709E > 0) {
            this.f24731c.i(this);
        }
    }

    @Override // n2.b0.d
    public void a(R1.r rVar) {
        this.f24746r.post(this.f24744p);
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void j(p254o2.e eVar, long j10, long j11) {
        this.f24749u = null;
        this.f24732d.t(eVar);
        C4027y c4027y = new C4027y(eVar.f50349a, eVar.f50350b, eVar.f(), eVar.e(), j10, j11, eVar.b());
        this.f24737i.d(eVar.f50349a);
        this.f24739k.p(c4027y, eVar.f50351c, this.f24730b, eVar.f50352d, eVar.f50353e, eVar.f50354f, eVar.f50355g, eVar.f50356h);
        if (this.f24708D) {
            this.f24731c.i(this);
        } else {
            d(new U0.b().f(this.f24720P).d());
        }
    }

    @Override // p236n2.d0
    public long b() {
        if (R()) {
            return this.f24721Q;
        }
        if (this.f24724T) {
            return Long.MIN_VALUE;
        }
        return M().f50356h;
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public m.c n(p254o2.e eVar, long j10, long j11, IOException iOException, int i10) {
        m.c cVarH;
        int i11;
        boolean zQ = Q(eVar);
        if (zQ && !((e) eVar).r() && (iOException instanceof s) && ((i11 = ((s) iOException).f14548d) == 410 || i11 == 404)) {
            return m.f52085d;
        }
        long jB = eVar.b();
        C4027y c4027y = new C4027y(eVar.f50349a, eVar.f50350b, eVar.f(), eVar.e(), j10, j11, jB);
        r2.k.c cVar = new r2.k.c(c4027y, new B(eVar.f50351c, this.f24730b, eVar.f50352d, eVar.f50353e, eVar.f50354f, S.o1(eVar.f50355g), S.o1(eVar.f50356h)), iOException, i10);
        r2.k.b bVarC = this.f24737i.c(D.c(this.f24732d.m()), cVar);
        boolean zQ2 = (bVarC == null || bVarC.f52079a != 2) ? false : this.f24732d.q(eVar, bVarC.f52080b);
        if (zQ2) {
            if (zQ && jB == 0) {
                ArrayList arrayList = this.f24742n;
                AbstractC1459a.g(((e) arrayList.remove(arrayList.size() - 1)) == eVar);
                if (this.f24742n.isEmpty()) {
                    this.f24721Q = this.f24720P;
                } else {
                    ((e) AbstractC0879w.d(this.f24742n)).q();
                }
            }
            cVarH = m.f52087f;
        } else {
            long jA = this.f24737i.a(cVar);
            cVarH = jA != -9223372036854775807L ? m.h(false, jA) : m.f52088g;
        }
        m.c cVar2 = cVarH;
        boolean zC = cVar2.c();
        this.f24739k.r(c4027y, eVar.f50351c, this.f24730b, eVar.f50352d, eVar.f50353e, eVar.f50354f, eVar.f50355g, eVar.f50356h, iOException, !zC);
        if (!zC) {
            this.f24749u = null;
            this.f24737i.d(eVar.f50349a);
        }
        if (zQ2) {
            if (!this.f24708D) {
                d(new U0.b().f(this.f24720P).d());
                return cVar2;
            }
            this.f24731c.i(this);
        }
        return cVar2;
    }

    @Override // p236n2.d0
    public boolean c() {
        return this.f24738j.j();
    }

    @Override // r2.m.b
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void l(p254o2.e eVar, long j10, long j11, int i10) {
        this.f24739k.v(i10 == 0 ? new C4027y(eVar.f50349a, eVar.f50350b, j10) : new C4027y(eVar.f50349a, eVar.f50350b, eVar.f(), eVar.e(), j10, j11, eVar.b()), eVar.f50351c, this.f24730b, eVar.f50352d, eVar.f50353e, eVar.f50354f, eVar.f50355g, eVar.f50356h, i10);
    }

    @Override // p236n2.d0
    public boolean d(U0 u10) {
        List list;
        long j10;
        long j11;
        if (this.f24724T || this.f24738j.j() || this.f24738j.i()) {
            return false;
        }
        if (R()) {
            List list2 = Collections.EMPTY_LIST;
            long j12 = this.f24721Q;
            for (d dVar : this.f24750v) {
                dVar.d0(this.f24721Q);
            }
            list = list2;
            j10 = j12;
            j11 = j10;
        } else {
            List list3 = this.f24743o;
            e eVarM = M();
            long jO = (eVarM.h() && eVarM.r()) ? eVarM.o() : Math.max(this.f24720P, eVarM.f50355g);
            long jMax = this.f24720P;
            if (this.f24707C) {
                for (d dVar2 : this.f24750v) {
                    jMax = Math.max(jMax, dVar2.D());
                }
            }
            list = list3;
            j10 = jO;
            j11 = jMax;
        }
        this.f24741m.a();
        this.f24732d.f(u10, j10, j11, list, this.f24708D || !list.isEmpty(), this.f24741m);
        androidx.media3.exoplayer.hls.c.b bVar = this.f24741m;
        boolean z10 = bVar.f24627b;
        p254o2.e eVar = bVar.f24626a;
        Uri uri = bVar.f24628c;
        if (z10) {
            this.f24721Q = -9223372036854775807L;
            this.f24724T = true;
            return true;
        }
        if (eVar == null) {
            if (uri != null) {
                this.f24731c.l(uri);
            }
            return false;
        }
        if (Q(eVar)) {
            e eVar2 = (e) eVar;
            V(eVar2);
            P(eVar2);
        }
        this.f24749u = eVar;
        this.f24738j.n(eVar, this, this.f24737i.b(eVar.f50351c));
        return true;
    }

    public void d0() {
        this.f24752x.clear();
    }

    public long e(long j10, z1 z1Var) {
        return this.f24732d.c(j10, z1Var);
    }

    public boolean e0(Uri uri, r2.k.c cVar, boolean z10) {
        r2.k.b bVarC;
        if (this.f24732d.s(uri)) {
            return this.f24732d.u(uri, (z10 || (bVarC = this.f24737i.c(D.c(this.f24732d.m()), cVar)) == null || bVarC.f52079a != 2) ? -9223372036854775807L : bVarC.f52080b);
        }
        return true;
    }

    @Override // p380v2.r
    public O f(int i10, int i11) {
        O oF;
        if (!f24704Y.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                O[] oArr = this.f24750v;
                if (i12 >= oArr.length) {
                    oF = null;
                    break;
                }
                if (this.f24751w[i12] == i10) {
                    oF = oArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            oF = N(i10, i11);
        }
        if (oF == null) {
            if (this.f24725U) {
                return E(i10, i11);
            }
            oF = F(i10, i11);
        }
        if (i11 != 5) {
            return oF;
        }
        if (this.f24754z == null) {
            this.f24754z = new c(oF, this.f24740l);
        }
        return this.f24754z;
    }

    public void f0() {
        if (this.f24742n.isEmpty()) {
            return;
        }
        e eVar = (e) AbstractC0879w.d(this.f24742n);
        int iD = this.f24732d.d(eVar);
        if (iD == 1) {
            if (eVar.r()) {
                return;
            }
            eVar.w(this.f24732d.j(eVar));
        } else if (iD == 0) {
            this.f24746r.post(new i(this, eVar));
        } else if (iD == 2 && !this.f24724T && this.f24738j.j()) {
            this.f24738j.f();
        }
    }

    @Override // p236n2.d0
    public long g() {
        if (this.f24724T) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.f24721Q;
        }
        long jMax = this.f24720P;
        e eVarM = M();
        if (!eVarM.h()) {
            if (this.f24742n.size() > 1) {
                ArrayList arrayList = this.f24742n;
                eVarM = (e) arrayList.get(arrayList.size() - 2);
            } else {
                eVarM = null;
            }
        }
        if (eVarM != null) {
            jMax = Math.max(jMax, eVarM.f50356h);
        }
        if (this.f24707C) {
            for (d dVar : this.f24750v) {
                jMax = Math.max(jMax, dVar.C());
            }
        }
        return jMax;
    }

    @Override // p236n2.d0
    public void h(long j10) {
        if (this.f24738j.i() || R()) {
            return;
        }
        if (this.f24738j.j()) {
            AbstractC1459a.e(this.f24749u);
            if (this.f24732d.z(j10, this.f24749u, this.f24743o)) {
                this.f24738j.f();
                return;
            }
            return;
        }
        int size = this.f24743o.size();
        while (size > 0 && this.f24732d.d((e) this.f24743o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f24743o.size()) {
            I(size);
        }
        int i10 = this.f24732d.i(j10, this.f24743o);
        if (i10 < this.f24742n.size()) {
            I(i10);
        }
    }

    public void h0(G[] gArr, int i10, int... iArr) {
        this.f24713I = G(gArr);
        this.f24714J = new HashSet();
        for (int i11 : iArr) {
            this.f24714J.add(this.f24713I.b(i11));
        }
        this.f24716L = i10;
        Handler handler = this.f24746r;
        b bVar = this.f24731c;
        Objects.requireNonNull(bVar);
        handler.post(new p093f2.g(bVar));
        p0();
    }

    public int i0(int i10, R0 r10, Y1.f fVar, int i11) {
        if (R()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f24742n.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f24742n.size() - 1 && K((e) this.f24742n.get(i13))) {
                i13++;
            }
            S.Y0(this.f24742n, 0, i13);
            e eVar = (e) this.f24742n.get(0);
            R1.r rVar = eVar.f50352d;
            if (!rVar.equals(this.f24711G)) {
                this.f24739k.j(this.f24730b, rVar, eVar.f50353e, eVar.f50354f, eVar.f50355g);
            }
            this.f24711G = rVar;
        }
        if (!this.f24742n.isEmpty() && !((e) this.f24742n.get(0)).r()) {
            return -3;
        }
        int iU = this.f24750v[i10].U(r10, fVar, i11, this.f24724T);
        if (iU == -5) {
            R1.r rVarI = (R1.r) AbstractC1459a.e(r10.f18152b);
            if (i10 == this.f24706B) {
                int iE = F9.f.e(this.f24750v[i10].S());
                while (i12 < this.f24742n.size() && ((e) this.f24742n.get(i12)).f24654k != iE) {
                    i12++;
                }
                rVarI = rVarI.i(i12 < this.f24742n.size() ? ((e) this.f24742n.get(i12)).f50352d : (R1.r) AbstractC1459a.e(this.f24710F));
            }
            r10.f18152b = rVarI;
        }
        return iU;
    }

    public void j0() {
        if (this.f24708D) {
            for (d dVar : this.f24750v) {
                dVar.T();
            }
        }
        this.f24732d.v();
        this.f24738j.m(this);
        this.f24746r.removeCallbacksAndMessages(null);
        this.f24712H = true;
        this.f24747s.clear();
    }

    public boolean m0(long j10, boolean z10) {
        e eVar;
        this.f24720P = j10;
        if (R()) {
            this.f24721Q = j10;
            return true;
        }
        if (!this.f24732d.n()) {
            eVar = null;
            break;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f24742n.size()) {
                eVar = null;
                break;
            }
            eVar = (e) this.f24742n.get(i10);
            if (eVar.f50355g == j10) {
                break;
            }
            i10++;
        }
        if (this.f24707C && !z10 && !this.f24742n.isEmpty() && l0(j10, eVar)) {
            return false;
        }
        this.f24721Q = j10;
        this.f24724T = false;
        this.f24742n.clear();
        if (this.f24738j.j()) {
            if (this.f24707C) {
                for (d dVar : this.f24750v) {
                    dVar.s();
                }
            }
            this.f24738j.f();
        } else {
            this.f24738j.g();
            k0();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0114  */
    public boolean n0(p290q2.y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10, boolean z10) {
        boolean z11;
        z();
        int i10 = this.f24709E;
        int i11 = 0;
        for (int i12 = 0; i12 < yVarArr.length; i12++) {
            h hVar = (h) c0VarArr[i12];
            if (hVar != null && (yVarArr[i12] == null || !zArr[i12])) {
                this.f24709E--;
                hVar.d();
                c0VarArr[i12] = null;
            }
        }
        boolean z12 = z10 || (!this.f24723S ? j10 == this.f24720P : i10 != 0);
        p290q2.y yVarM = this.f24732d.m();
        boolean z13 = z12;
        p290q2.y yVar = yVarM;
        for (int i13 = 0; i13 < yVarArr.length; i13++) {
            p290q2.y yVar2 = yVarArr[i13];
            if (yVar2 != null) {
                int iD = this.f24713I.d(yVar2.k());
                if (iD == this.f24716L) {
                    this.f24732d.y(yVar2);
                    yVar = yVar2;
                }
                if (c0VarArr[i13] == null) {
                    this.f24709E++;
                    h hVar2 = new h(this, iD);
                    c0VarArr[i13] = hVar2;
                    zArr2[i13] = true;
                    if (this.f24715K != null) {
                        hVar2.b();
                        if (!z13) {
                            d dVar = this.f24750v[this.f24715K[iD]];
                            z13 = (dVar.F() == 0 || dVar.b0(j10, true)) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.f24709E == 0) {
            this.f24732d.v();
            this.f24711G = null;
            this.f24722R = true;
            this.f24742n.clear();
            if (this.f24738j.j()) {
                if (this.f24707C) {
                    d[] dVarArr = this.f24750v;
                    int length = dVarArr.length;
                    while (i11 < length) {
                        dVarArr[i11].s();
                        i11++;
                    }
                }
                this.f24738j.f();
            } else {
                k0();
            }
        } else {
            if (this.f24742n.isEmpty() || Objects.equals(yVar, yVarM)) {
                z11 = z10;
            } else {
                if (!this.f24723S) {
                    long j11 = j10 < 0 ? -j10 : 0L;
                    e eVarM = M();
                    p290q2.y yVar3 = yVar;
                    yVar3.l(j10, j11, -9223372036854775807L, this.f24743o, this.f24732d.a(eVarM, j10));
                    if (yVar3.o() == this.f24732d.l().b(eVarM.f50352d)) {
                        z11 = z10;
                    }
                }
                this.f24722R = true;
                z11 = true;
                z13 = true;
            }
            if (z13) {
                m0(j10, z11);
                while (i11 < c0VarArr.length) {
                    if (c0VarArr[i11] != null) {
                        zArr2[i11] = true;
                    }
                    i11++;
                }
            }
        }
        u0(c0VarArr);
        this.f24723S = true;
        return z13;
    }

    @Override // r2.m.f
    public void o() {
        for (d dVar : this.f24750v) {
            dVar.V();
        }
    }

    public void o0(n nVar) {
        if (Objects.equals(this.f24727W, nVar)) {
            return;
        }
        this.f24727W = nVar;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f24750v;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.f24719O[i10]) {
                dVarArr[i10].k0(nVar);
            }
            i10++;
        }
    }

    @Override // p380v2.r
    public void p(J j10) {
    }

    public void q0(boolean z10) {
        this.f24732d.x(z10);
    }

    public void r0(long j10) {
        if (this.f24726V != j10) {
            this.f24726V = j10;
            for (d dVar : this.f24750v) {
                dVar.c0(j10);
            }
        }
    }

    public void s() throws IOException {
        X();
        if (this.f24724T && !this.f24708D) {
            throw z.a("Loading finished before preparation is complete.", null);
        }
    }

    public int s0(int i10, long j10) throws Throwable {
        if (R()) {
            return 0;
        }
        d dVar = this.f24750v[i10];
        int iH = dVar.H(j10, this.f24724T);
        e eVar = (e) AbstractC0879w.e(this.f24742n, null);
        if (eVar != null && !eVar.r()) {
            iH = Math.min(iH, eVar.n(i10) - dVar.F());
        }
        dVar.g0(iH);
        return iH;
    }

    @Override // p380v2.r
    public void t() {
        this.f24725U = true;
        this.f24746r.post(this.f24745q);
    }

    public void t0(int i10) {
        z();
        AbstractC1459a.e(this.f24715K);
        int i11 = this.f24715K[i10];
        AbstractC1459a.g(this.f24718N[i11]);
        this.f24718N[i11] = false;
    }

    public m0 u() {
        z();
        return this.f24713I;
    }

    public void v(long j10, boolean z10) {
        if (!this.f24707C || R()) {
            return;
        }
        int length = this.f24750v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f24750v[i10].r(j10, z10, this.f24718N[i10]);
        }
    }
}
