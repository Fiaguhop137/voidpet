package T0;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f11855q = 1000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f11856r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static long f11857s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static long f11858t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f11861c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    T0.b[] f11864f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final c f11871m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f11874p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f11859a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap f11860b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11862d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11863e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11865g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11866h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean[] f11867i = new boolean[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f11868j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f11869k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f11870l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i[] f11872n = new i[f11855q];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f11873o = 0;

    interface a {
        void a(a aVar);

        void b(i iVar);

        i c(d dVar, boolean[] zArr);

        void clear();

        i getKey();
    }

    class b extends T0.b {
        public b(c cVar) {
            this.f11849e = new j(this, cVar);
        }
    }

    public d() {
        this.f11864f = null;
        this.f11864f = new T0.b[32];
        C();
        c cVar = new c();
        this.f11871m = cVar;
        this.f11861c = new h(cVar);
        if (f11856r) {
            this.f11874p = new b(cVar);
        } else {
            this.f11874p = new T0.b(cVar);
        }
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f11868j; i10++) {
            this.f11867i[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f11868j * 2) {
                if (aVar.getKey() != null) {
                    this.f11867i[aVar.getKey().f11891c] = true;
                }
                i iVarC = aVar.c(this, this.f11867i);
                if (iVarC != null) {
                    boolean[] zArr = this.f11867i;
                    int i12 = iVarC.f11891c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarC != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f11869k; i14++) {
                        T0.b bVar = this.f11864f[i14];
                        if (bVar.f11845a.f11898j != i.a.UNRESTRICTED && !bVar.f11850f && bVar.t(iVarC)) {
                            float fI = bVar.f11849e.i(iVarC);
                            if (fI < 0.0f) {
                                float f11 = (-bVar.f11846b) / fI;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        T0.b bVar2 = this.f11864f[i13];
                        bVar2.f11845a.f11892d = -1;
                        bVar2.y(iVarC);
                        i iVar = bVar2.f11845a;
                        iVar.f11892d = i13;
                        iVar.g(bVar2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f11856r) {
            while (true) {
                T0.b[] bVarArr = this.f11864f;
                if (i10 >= bVarArr.length) {
                    return;
                }
                T0.b bVar = bVarArr[i10];
                if (bVar != null) {
                    this.f11871m.f11851a.a(bVar);
                }
                this.f11864f[i10] = null;
                i10++;
            }
        } else {
            while (true) {
                T0.b[] bVarArr2 = this.f11864f;
                if (i10 >= bVarArr2.length) {
                    return;
                }
                T0.b bVar2 = bVarArr2[i10];
                if (bVar2 != null) {
                    this.f11871m.f11852b.a(bVar2);
                }
                this.f11864f[i10] = null;
                i10++;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f11871m.f11853c.acquire();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.f(aVar, str);
        } else {
            iVar.d();
            iVar.f(aVar, str);
        }
        int i10 = this.f11873o;
        int i11 = f11855q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f11855q = i12;
            this.f11872n = (i[]) Arrays.copyOf(this.f11872n, i12);
        }
        i[] iVarArr = this.f11872n;
        int i13 = this.f11873o;
        this.f11873o = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    private final void l(T0.b bVar) {
        if (f11856r) {
            T0.b bVar2 = this.f11864f[this.f11869k];
            if (bVar2 != null) {
                this.f11871m.f11851a.a(bVar2);
            }
        } else {
            T0.b bVar3 = this.f11864f[this.f11869k];
            if (bVar3 != null) {
                this.f11871m.f11852b.a(bVar3);
            }
        }
        T0.b[] bVarArr = this.f11864f;
        int i10 = this.f11869k;
        bVarArr[i10] = bVar;
        i iVar = bVar.f11845a;
        iVar.f11892d = i10;
        this.f11869k = i10 + 1;
        iVar.g(bVar);
    }

    private void n() {
        for (int i10 = 0; i10 < this.f11869k; i10++) {
            T0.b bVar = this.f11864f[i10];
            bVar.f11845a.f11894f = bVar.f11846b;
        }
    }

    public static T0.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        for (int i10 = 0; i10 < this.f11869k; i10++) {
            T0.b bVar = this.f11864f[i10];
            if (bVar.f11845a.f11898j != i.a.UNRESTRICTED && bVar.f11846b < 0.0f) {
                boolean z10 = false;
                int i11 = 0;
                while (!z10) {
                    i11++;
                    float f10 = Float.MAX_VALUE;
                    int i12 = -1;
                    int i13 = -1;
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        if (i14 >= this.f11869k) {
                            break;
                        }
                        T0.b bVar2 = this.f11864f[i14];
                        if (bVar2.f11845a.f11898j != i.a.UNRESTRICTED && !bVar2.f11850f && bVar2.f11846b < 0.0f) {
                            for (int i16 = 1; i16 < this.f11868j; i16++) {
                                i iVar = this.f11871m.f11854d[i16];
                                float fI = bVar2.f11849e.i(iVar);
                                if (fI > 0.0f) {
                                    for (int i17 = 0; i17 < 9; i17++) {
                                        float f11 = iVar.f11896h[i17] / fI;
                                        if ((f11 < f10 && i17 == i15) || i17 > i15) {
                                            f10 = f11;
                                            i12 = i14;
                                            i13 = i16;
                                            i15 = i17;
                                        }
                                    }
                                }
                            }
                        }
                        i14++;
                    }
                    if (i12 != -1) {
                        T0.b bVar3 = this.f11864f[i12];
                        bVar3.f11845a.f11892d = -1;
                        bVar3.y(this.f11871m.f11854d[i13]);
                        i iVar2 = bVar3.f11845a;
                        iVar2.f11892d = i12;
                        iVar2.g(bVar3);
                    } else {
                        z10 = true;
                    }
                    if (i11 > this.f11868j / 2) {
                        z10 = true;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i10 = this.f11862d * 2;
        this.f11862d = i10;
        this.f11864f = (T0.b[]) Arrays.copyOf(this.f11864f, i10);
        c cVar = this.f11871m;
        cVar.f11854d = (i[]) Arrays.copyOf(cVar.f11854d, this.f11862d);
        int i11 = this.f11862d;
        this.f11867i = new boolean[i11];
        this.f11863e = i11;
        this.f11870l = i11;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f11871m;
            i[] iVarArr = cVar.f11854d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.d();
            }
            i10++;
        }
        cVar.f11853c.b(this.f11872n, this.f11873o);
        this.f11873o = 0;
        Arrays.fill(this.f11871m.f11854d, (Object) null);
        HashMap map = this.f11860b;
        if (map != null) {
            map.clear();
        }
        this.f11859a = 0;
        this.f11861c.clear();
        this.f11868j = 1;
        for (int i11 = 0; i11 < this.f11869k; i11++) {
            this.f11864f[i11].f11847c = false;
        }
        C();
        this.f11869k = 0;
        if (f11856r) {
            this.f11874p = new b(this.f11871m);
        } else {
            this.f11874p = new T0.b(this.f11871m);
        }
    }

    public void b(U0.e eVar, U0.e eVar2, float f10, int i10) {
        U0.d.b bVar = U0.d.b.LEFT;
        i iVarQ = q(eVar.m(bVar));
        U0.d.b bVar2 = U0.d.b.TOP;
        i iVarQ2 = q(eVar.m(bVar2));
        U0.d.b bVar3 = U0.d.b.RIGHT;
        i iVarQ3 = q(eVar.m(bVar3));
        U0.d.b bVar4 = U0.d.b.BOTTOM;
        i iVarQ4 = q(eVar.m(bVar4));
        i iVarQ5 = q(eVar2.m(bVar));
        i iVarQ6 = q(eVar2.m(bVar2));
        i iVarQ7 = q(eVar2.m(bVar3));
        i iVarQ8 = q(eVar2.m(bVar4));
        T0.b bVarR = r();
        double d10 = f10;
        double d11 = i10;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d10) * d11));
        d(bVarR);
        T0.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d10) * d11));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        T0.b bVarR = r();
        bVarR.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            bVarR.d(this, i12);
        }
        d(bVarR);
    }

    public void d(T0.b bVar) {
        i iVarW;
        if (bVar == null) {
            return;
        }
        boolean z10 = true;
        if (this.f11869k + 1 >= this.f11870l || this.f11868j + 1 >= this.f11863e) {
            y();
        }
        boolean z11 = false;
        if (!bVar.f11850f) {
            bVar.D(this);
            if (bVar.u()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f11845a = iVarP;
                l(bVar);
                this.f11874p.a(bVar);
                B(this.f11874p, true);
                if (iVarP.f11892d == -1) {
                    if (bVar.f11845a == iVarP && (iVarW = bVar.w(iVarP)) != null) {
                        bVar.y(iVarW);
                    }
                    if (!bVar.f11850f) {
                        bVar.f11845a.g(bVar);
                    }
                    this.f11869k--;
                }
            } else {
                z10 = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z11 = z10;
            }
        }
        if (z11) {
            return;
        }
        l(bVar);
    }

    public T0.b e(i iVar, i iVar2, int i10, int i11) {
        if (i11 == 8 && iVar2.f11895g && iVar.f11892d == -1) {
            iVar.e(this, iVar2.f11894f + i10);
            return null;
        }
        T0.b bVarR = r();
        bVarR.n(iVar, iVar2, i10);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i10) {
        int i11 = iVar.f11892d;
        if (i11 == -1) {
            iVar.e(this, i10);
            return;
        }
        if (i11 == -1) {
            T0.b bVarR = r();
            bVarR.i(iVar, i10);
            d(bVarR);
            return;
        }
        T0.b bVar = this.f11864f[i11];
        if (bVar.f11850f) {
            bVar.f11846b = i10;
            return;
        }
        if (bVar.f11849e.f() == 0) {
            bVar.f11850f = true;
            bVar.f11846b = i10;
        } else {
            T0.b bVarR2 = r();
            bVarR2.m(iVar, i10);
            d(bVarR2);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        T0.b bVarR = r();
        i iVarT = t();
        iVarT.f11893e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        T0.b bVarR = r();
        i iVarT = t();
        iVarT.f11893e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f11849e.i(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        T0.b bVarR = r();
        i iVarT = t();
        iVarT.f11893e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        T0.b bVarR = r();
        i iVarT = t();
        iVarT.f11893e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f11849e.i(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        T0.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
    }

    void m(T0.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f11868j + 1 >= this.f11863e) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f11859a + 1;
        this.f11859a = i11;
        this.f11868j++;
        iVarA.f11891c = i11;
        iVarA.f11893e = i10;
        this.f11871m.f11854d[i11] = iVarA;
        this.f11861c.b(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f11868j + 1 >= this.f11863e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f11859a + 1;
        this.f11859a = i10;
        this.f11868j++;
        iVarA.f11891c = i10;
        this.f11871m.f11854d[i10] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarF = null;
        if (obj == null) {
            return null;
        }
        if (this.f11868j + 1 >= this.f11863e) {
            y();
        }
        if (obj instanceof U0.d) {
            U0.d dVar = (U0.d) obj;
            iVarF = dVar.f();
            if (iVarF == null) {
                dVar.m(this.f11871m);
                iVarF = dVar.f();
            }
            int i10 = iVarF.f11891c;
            if (i10 != -1 && i10 <= this.f11859a && this.f11871m.f11854d[i10] != null) {
                return iVarF;
            }
            if (i10 != -1) {
                iVarF.d();
            }
            int i11 = this.f11859a + 1;
            this.f11859a = i11;
            this.f11868j++;
            iVarF.f11891c = i11;
            iVarF.f11898j = i.a.UNRESTRICTED;
            this.f11871m.f11854d[i11] = iVarF;
        }
        return iVarF;
    }

    public T0.b r() {
        T0.b bVar;
        if (f11856r) {
            bVar = (T0.b) this.f11871m.f11851a.acquire();
            if (bVar == null) {
                bVar = new b(this.f11871m);
                f11858t++;
            } else {
                bVar.z();
            }
        } else {
            bVar = (T0.b) this.f11871m.f11852b.acquire();
            if (bVar == null) {
                bVar = new T0.b(this.f11871m);
                f11857s++;
            } else {
                bVar.z();
            }
        }
        i.b();
        return bVar;
    }

    public i t() {
        if (this.f11868j + 1 >= this.f11863e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f11859a + 1;
        this.f11859a = i10;
        this.f11868j++;
        iVarA.f11891c = i10;
        this.f11871m.f11854d[i10] = iVarA;
        return iVarA;
    }

    public c v() {
        return this.f11871m;
    }

    public int x(Object obj) {
        i iVarF = ((U0.d) obj).f();
        if (iVarF != null) {
            return (int) (iVarF.f11894f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (!this.f11865g && !this.f11866h) {
            A(this.f11861c);
            return;
        }
        for (int i10 = 0; i10 < this.f11869k; i10++) {
            if (!this.f11864f[i10].f11850f) {
                A(this.f11861c);
                return;
            }
        }
        n();
    }
}
