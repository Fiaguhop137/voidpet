package p040c3;

import R1.z;
import S2.s;
import S2.t;
import U1.AbstractC1459a;
import U1.E;
import U1.F;
import U1.S;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.r;
import p380v2.u;

/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC4253p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u f26817v = new J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f26821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F f26822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseIntArray f26823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final L.c f26824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s.a f26825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray f26826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f26827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SparseBooleanArray f26828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final I f26829l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private H f26830m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private r f26831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f26832o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f26833p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f26834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f26835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private L f26836s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f26837t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f26838u;

    private class a implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final E f26839a = new E(new byte[4]);

        public a() {
        }

        @Override // p040c3.D
        public void b(U1.K k10, r rVar, L.d dVar) {
        }

        @Override // p040c3.D
        public void c(F f10) {
            if (f10.L() == 0 && (f10.L() & 128) != 0) {
                f10.b0(6);
                int iA = f10.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    f10.p(this.f26839a, 4);
                    int iH = this.f26839a.h(16);
                    this.f26839a.r(3);
                    if (iH == 0) {
                        this.f26839a.r(13);
                    } else {
                        int iH2 = this.f26839a.h(13);
                        if (K.this.f26826i.get(iH2) == null) {
                            K.this.f26826i.put(iH2, new E(K.this.new b(iH2)));
                            K.m(K.this);
                        }
                    }
                }
                if (K.this.f26818a != 2) {
                    K.this.f26826i.remove(0);
                }
            }
        }
    }

    private class b implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final E f26841a = new E(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray f26842b = new SparseArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseIntArray f26843c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f26844d;

        public b(int i10) {
            this.f26844d = i10;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        private L.b a(F f10, int i10) {
            int i11;
            int iG = f10.g();
            int i12 = iG + i10;
            int i13 = -1;
            String str = null;
            ArrayList arrayList = null;
            int iL = 0;
            while (f10.g() < i12) {
                int iL2 = f10.L();
                int iG2 = f10.g() + f10.L();
                if (iG2 > i12) {
                    break;
                }
                if (iL2 == 5) {
                    long jN = f10.N();
                    if (jN == 1094921523) {
                        i13 = 129;
                    } else if (jN == 1161904947) {
                        i13 = 135;
                    } else if (jN == 1094921524) {
                        i13 = 172;
                    } else if (jN == 1212503619) {
                        i13 = 36;
                    }
                } else if (iL2 == 106) {
                    i13 = 129;
                } else if (iL2 == 122) {
                    i13 = 135;
                } else if (iL2 == 127) {
                    int iL3 = f10.L();
                    if (iL3 == 21) {
                        i13 = 172;
                    } else if (iL3 == 14) {
                        i13 = 136;
                    } else if (iL3 == 33) {
                        i13 = 139;
                    }
                } else {
                    if (iL2 == 123) {
                        i11 = 138;
                    } else if (iL2 == 10) {
                        String strTrim = f10.I(3).trim();
                        iL = f10.L();
                        str = strTrim;
                    } else if (iL2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (f10.g() < iG2) {
                            String strTrim2 = f10.I(3).trim();
                            int iL4 = f10.L();
                            byte[] bArr = new byte[4];
                            f10.q(bArr, 0, 4);
                            arrayList2.add(new L.a(strTrim2, iL4, bArr));
                        }
                        arrayList = arrayList2;
                        i13 = 89;
                    } else if (iL2 == 111) {
                        i11 = 257;
                    }
                    i13 = i11;
                }
                f10.b0(iG2 - f10.g());
            }
            f10.a0(i12);
            return new L.b(i13, str, iL, arrayList, Arrays.copyOfRange(f10.f(), iG, i12));
        }

        @Override // p040c3.D
        public void b(U1.K k10, r rVar, L.d dVar) {
        }

        @Override // p040c3.D
        public void c(F f10) {
            U1.K k10;
            if (f10.L() != 2) {
                return;
            }
            if (K.this.f26818a == 1 || K.this.f26818a == 2 || K.this.f26832o == 1) {
                k10 = (U1.K) K.this.f26821d.get(0);
            } else {
                k10 = new U1.K(((U1.K) K.this.f26821d.get(0)).d());
                K.this.f26821d.add(k10);
            }
            if ((f10.L() & 128) == 0) {
                return;
            }
            f10.b0(1);
            int iT = f10.T();
            int i10 = 3;
            f10.b0(3);
            f10.p(this.f26841a, 2);
            this.f26841a.r(3);
            int i11 = 13;
            K.this.f26838u = this.f26841a.h(13);
            f10.p(this.f26841a, 2);
            int i12 = 4;
            this.f26841a.r(4);
            f10.b0(this.f26841a.h(12));
            if (K.this.f26818a == 2 && K.this.f26836s == null) {
                L.b bVar = new L.b(21, null, 0, null, S.f12881f);
                K k11 = K.this;
                k11.f26836s = k11.f26824g.a(21, bVar);
                if (K.this.f26836s != null) {
                    K.this.f26836s.b(k10, K.this.f26831n, new L.d(iT, 21, 8192));
                }
            }
            this.f26842b.clear();
            this.f26843c.clear();
            int iA = f10.a();
            while (iA > 0) {
                f10.p(this.f26841a, 5);
                int iH = this.f26841a.h(8);
                this.f26841a.r(i10);
                int iH2 = this.f26841a.h(i11);
                this.f26841a.r(i12);
                int iH3 = this.f26841a.h(12);
                L.b bVarA = a(f10, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarA.f26849a;
                }
                iA -= iH3 + 5;
                int i13 = K.this.f26818a == 2 ? iH : iH2;
                if (!K.this.f26827j.get(i13)) {
                    L lA = (K.this.f26818a == 2 && iH == 21) ? K.this.f26836s : K.this.f26824g.a(iH, bVarA);
                    if (K.this.f26818a != 2 || iH2 < this.f26843c.get(i13, 8192)) {
                        this.f26843c.put(i13, iH2);
                        this.f26842b.put(i13, lA);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f26843c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f26843c.keyAt(i14);
                int iValueAt = this.f26843c.valueAt(i14);
                K.this.f26827j.put(iKeyAt, true);
                K.this.f26828k.put(iValueAt, true);
                L l10 = (L) this.f26842b.valueAt(i14);
                if (l10 != null) {
                    if (l10 != K.this.f26836s) {
                        l10.b(k10, K.this.f26831n, new L.d(iT, iKeyAt, 8192));
                    }
                    K.this.f26826i.put(iValueAt, l10);
                }
            }
            if (K.this.f26818a == 2) {
                if (K.this.f26833p) {
                    return;
                }
                K.this.f26831n.t();
                K.this.f26832o = 0;
                K.this.f26833p = true;
                return;
            }
            K.this.f26826i.remove(this.f26844d);
            K k12 = K.this;
            k12.f26832o = k12.f26818a == 1 ? 0 : K.this.f26832o - 1;
            if (K.this.f26832o == 0) {
                K.this.f26831n.t();
                K.this.f26833p = true;
            }
        }
    }

    public K(int i10, int i11, s.a aVar, U1.K k10, L.c cVar, int i12) {
        this.f26824g = (L.c) AbstractC1459a.e(cVar);
        this.f26820c = i12;
        this.f26818a = i10;
        this.f26819b = i11;
        this.f26825h = aVar;
        if (i10 == 1 || i10 == 2) {
            this.f26821d = Collections.singletonList(k10);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f26821d = arrayList;
            arrayList.add(k10);
        }
        this.f26822e = new F(new byte[9400], 0);
        this.f26827j = new SparseBooleanArray();
        this.f26828k = new SparseBooleanArray();
        this.f26826i = new SparseArray();
        this.f26823f = new SparseIntArray();
        this.f26829l = new I(i12);
        this.f26831n = r.f56144F1;
        this.f26838u = -1;
        z();
    }

    public K(int i10, s.a aVar) {
        this(1, i10, aVar, new U1.K(0L), new C2108j(0), 112800);
    }

    private boolean A(int i10) {
        return this.f26818a == 2 || this.f26833p || !this.f26828k.get(i10, false);
    }

    public static /* synthetic */ InterfaceC4253p[] c() {
        return new InterfaceC4253p[]{new K(1, s.a.f11528a)};
    }

    static /* synthetic */ int m(K k10) {
        int i10 = k10.f26832o;
        k10.f26832o = i10 + 1;
        return i10;
    }

    private boolean w(InterfaceC4254q interfaceC4254q) {
        byte[] bArrF = this.f26822e.f();
        if (9400 - this.f26822e.g() < 188) {
            int iA = this.f26822e.a();
            if (iA > 0) {
                System.arraycopy(bArrF, this.f26822e.g(), bArrF, 0, iA);
            }
            this.f26822e.Y(bArrF, iA);
        }
        while (this.f26822e.a() < 188) {
            int iJ = this.f26822e.j();
            int i10 = interfaceC4254q.read(bArrF, iJ, 9400 - iJ);
            if (i10 == -1) {
                return false;
            }
            this.f26822e.Z(iJ + i10);
        }
        return true;
    }

    private int x() throws z {
        int iG = this.f26822e.g();
        int iJ = this.f26822e.j();
        int iA = M.a(this.f26822e.f(), iG, iJ);
        this.f26822e.a0(iA);
        int i10 = iA + 188;
        if (i10 <= iJ) {
            this.f26837t = 0;
            return i10;
        }
        int i11 = this.f26837t + (iA - iG);
        this.f26837t = i11;
        if (this.f26818a != 2 || i11 <= 376) {
            return i10;
        }
        throw z.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void y(long j10) {
        if (this.f26834q) {
            return;
        }
        this.f26834q = true;
        if (this.f26829l.b() == -9223372036854775807L) {
            this.f26831n.p(new J.b(this.f26829l.b()));
            return;
        }
        H h10 = new H(this.f26829l.c(), this.f26829l.b(), j10, this.f26838u, this.f26820c);
        this.f26830m = h10;
        this.f26831n.p(h10.b());
    }

    private void z() {
        this.f26827j.clear();
        this.f26826i.clear();
        SparseArray sparseArrayB = this.f26824g.b();
        int size = sparseArrayB.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f26826i.put(sparseArrayB.keyAt(i10), (L) sparseArrayB.valueAt(i10));
        }
        this.f26826i.put(0, new E(new a()));
        this.f26836s = null;
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        H h10;
        AbstractC1459a.g(this.f26818a != 2);
        int size = this.f26821d.size();
        for (int i10 = 0; i10 < size; i10++) {
            U1.K k10 = (U1.K) this.f26821d.get(i10);
            boolean z10 = k10.f() == -9223372036854775807L;
            if (!z10) {
                long jD = k10.d();
                z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
            }
            if (z10) {
                k10.i(j11);
            }
        }
        if (j11 != 0 && (h10 = this.f26830m) != null) {
            h10.h(j11);
        }
        this.f26822e.W(0);
        this.f26823f.clear();
        for (int i11 = 0; i11 < this.f26826i.size(); i11++) {
            ((L) this.f26826i.valueAt(i11)).a();
        }
        this.f26837t = 0;
    }

    @Override // p380v2.InterfaceC4253p
    public void b(r rVar) {
        if ((this.f26819b & 1) == 0) {
            rVar = new t(rVar, this.f26825h);
        }
        this.f26831n = rVar;
    }

    @Override // p380v2.InterfaceC4253p
    public boolean f(InterfaceC4254q interfaceC4254q) {
        byte[] bArrF = this.f26822e.f();
        interfaceC4254q.o(bArrF, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    interfaceC4254q.l(i10);
                    return true;
                }
                if (bArrF[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @Override // p380v2.InterfaceC4253p
    public int j(InterfaceC4254q interfaceC4254q, I i10) throws z {
        int i11;
        long length = interfaceC4254q.getLength();
        boolean z10 = this.f26818a == 2;
        if (this.f26833p) {
            if (length != -1 && !z10 && !this.f26829l.d()) {
                return this.f26829l.e(interfaceC4254q, i10, this.f26838u);
            }
            y(length);
            if (this.f26835r) {
                this.f26835r = false;
                a(0L, 0L);
                if (interfaceC4254q.getPosition() != 0) {
                    i10.f55969a = 0L;
                    return 1;
                }
            }
            H h10 = this.f26830m;
            if (h10 != null && h10.d()) {
                return this.f26830m.c(interfaceC4254q, i10);
            }
        }
        if (!w(interfaceC4254q)) {
            for (int i12 = 0; i12 < this.f26826i.size(); i12++) {
                L l10 = (L) this.f26826i.valueAt(i12);
                if (l10 instanceof y) {
                    y yVar = (y) l10;
                    if (yVar.d(z10)) {
                        yVar.c(new F(), 1);
                    }
                }
            }
            return -1;
        }
        int iX = x();
        int iJ = this.f26822e.j();
        if (iX > iJ) {
            return 0;
        }
        int iU = this.f26822e.u();
        if ((8388608 & iU) != 0) {
            this.f26822e.a0(iX);
            return 0;
        }
        int i13 = (4194304 & iU) != 0 ? 1 : 0;
        int i14 = (2096896 & iU) >> 8;
        boolean z11 = (iU & 32) != 0;
        L l11 = (iU & 16) != 0 ? (L) this.f26826i.get(i14) : null;
        if (l11 == null) {
            this.f26822e.a0(iX);
            return 0;
        }
        if (this.f26818a != 2) {
            int i15 = iU & 15;
            i11 = 0;
            int i16 = this.f26823f.get(i14, i15 - 1);
            this.f26823f.put(i14, i15);
            if (i16 == i15) {
                this.f26822e.a0(iX);
                return 0;
            }
            if (i15 != ((i16 + 1) & 15)) {
                l11.a();
            }
        } else {
            i11 = 0;
        }
        if (z11) {
            int iL = this.f26822e.L();
            i13 |= (this.f26822e.L() & 64) != 0 ? 2 : i11;
            this.f26822e.b0(iL - 1);
        }
        boolean z12 = this.f26833p;
        if (A(i14)) {
            this.f26822e.Z(iX);
            l11.c(this.f26822e, i13);
            this.f26822e.Z(iJ);
        }
        if (this.f26818a != 2 && !z12 && this.f26833p && length != -1) {
            this.f26835r = true;
        }
        this.f26822e.a0(iX);
        return i11;
    }

    @Override // p380v2.InterfaceC4253p
    public void release() {
    }
}
