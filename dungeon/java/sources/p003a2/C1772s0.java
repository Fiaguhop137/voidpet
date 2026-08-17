package p003a2;

import B9.t;
import R1.F;
import U1.AbstractC1459a;
import U1.S;
import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p236n2.D;

/* JADX INFO: renamed from: a2.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1772s0 implements A1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t f19279i = new C1770r0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Random f19280j = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F.c f19281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F.b f19282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f19283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f19284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private A1.a f19285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private F f19286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f19287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19288h;

    /* JADX INFO: renamed from: a2.s0$a */
    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f19290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f19291c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private D.b f19292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f19293e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f19294f;

        public a(String str, int i10, D.b bVar) {
            this.f19289a = str;
            this.f19290b = i10;
            this.f19291c = bVar == null ? -1L : bVar.f49485d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f19292d = bVar;
        }

        private int l(F f10, F f11, int i10) {
            if (i10 >= f10.p()) {
                if (i10 < f11.p()) {
                    return i10;
                }
                return -1;
            }
            f10.n(i10, C1772s0.this.f19281a);
            for (int i11 = C1772s0.this.f19281a.f9958n; i11 <= C1772s0.this.f19281a.f9959o; i11++) {
                int iB = f11.b(f10.m(i11));
                if (iB != -1) {
                    return f11.f(iB, C1772s0.this.f19282b).f9924c;
                }
            }
            return -1;
        }

        public boolean i(int i10, D.b bVar) {
            if (bVar == null) {
                return i10 == this.f19290b;
            }
            D.b bVar2 = this.f19292d;
            if (bVar2 == null) {
                return !bVar.b() && bVar.f49485d == this.f19291c;
            }
            return bVar.f49485d == bVar2.f49485d && bVar.f49483b == bVar2.f49483b && bVar.f49484c == bVar2.f49484c;
        }

        public boolean j(InterfaceC1735b.a aVar) {
            D.b bVar = aVar.f19186d;
            if (bVar == null) {
                return this.f19290b != aVar.f19185c;
            }
            long j10 = this.f19291c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f49485d > j10) {
                return true;
            }
            if (this.f19292d == null) {
                return false;
            }
            int iB = aVar.f19184b.b(bVar.f49482a);
            int iB2 = aVar.f19184b.b(this.f19292d.f49482a);
            D.b bVar2 = aVar.f19186d;
            if (bVar2.f49485d < this.f19292d.f49485d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            if (!bVar2.b()) {
                int i10 = aVar.f19186d.f49486e;
                return i10 == -1 || i10 > this.f19292d.f49483b;
            }
            D.b bVar3 = aVar.f19186d;
            int i11 = bVar3.f49483b;
            int i12 = bVar3.f49484c;
            D.b bVar4 = this.f19292d;
            int i13 = bVar4.f49483b;
            return i11 > i13 || (i11 == i13 && i12 > bVar4.f49484c);
        }

        public void k(int i10, D.b bVar) {
            if (this.f19291c != -1 || i10 != this.f19290b || bVar == null || bVar.f49485d < C1772s0.this.n()) {
                return;
            }
            this.f19291c = bVar.f49485d;
        }

        public boolean m(F f10, F f11) {
            int iL = l(f10, f11, this.f19290b);
            this.f19290b = iL;
            if (iL == -1) {
                return false;
            }
            D.b bVar = this.f19292d;
            return bVar == null || f11.b(bVar.f49482a) != -1;
        }
    }

    public C1772s0() {
        this(f19279i);
    }

    public C1772s0(t tVar) {
        this.f19284d = tVar;
        this.f19281a = new F.c();
        this.f19282b = new F.b();
        this.f19283c = new HashMap();
        this.f19286f = F.f9913a;
        this.f19288h = -1L;
    }

    private void l(a aVar) {
        if (aVar.f19291c != -1) {
            this.f19288h = aVar.f19291c;
        }
        this.f19287g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f19280j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        a aVar = (a) this.f19283c.get(this.f19287g);
        return (aVar == null || aVar.f19291c == -1) ? this.f19288h + 1 : aVar.f19291c;
    }

    private a o(int i10, D.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f19283c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f19291c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) S.i(aVar)).f19292d != null && aVar2.f19292d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f19284d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f19283c.put(str, aVar3);
        return aVar3;
    }

    private void p(InterfaceC1735b.a aVar) {
        if (aVar.f19184b.q()) {
            String str = this.f19287g;
            if (str != null) {
                l((a) AbstractC1459a.e((a) this.f19283c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = (a) this.f19283c.get(this.f19287g);
        a aVarO = o(aVar.f19185c, aVar.f19186d);
        this.f19287g = aVarO.f19289a;
        c(aVar);
        D.b bVar = aVar.f19186d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f19291c == aVar.f19186d.f49485d && aVar2.f19292d != null && aVar2.f19292d.f49483b == aVar.f19186d.f49483b && aVar2.f19292d.f49484c == aVar.f19186d.f49484c) {
            return;
        }
        D.b bVar2 = aVar.f19186d;
        this.f19285e.n0(aVar, o(aVar.f19185c, new D.b(bVar2.f49482a, bVar2.f49485d)).f19289a, aVarO.f19289a);
    }

    @Override // p003a2.A1
    public synchronized String a() {
        return this.f19287g;
    }

    @Override // p003a2.A1
    public synchronized String b(F f10, D.b bVar) {
        return o(f10.h(bVar.f49482a, this.f19282b).f9924c, bVar).f19289a;
    }

    @Override // p003a2.A1
    public synchronized void c(InterfaceC1735b.a aVar) {
        AbstractC1459a.e(this.f19285e);
        if (aVar.f19184b.q()) {
            return;
        }
        D.b bVar = aVar.f19186d;
        if (bVar != null) {
            if (bVar.f49485d < n()) {
                return;
            }
            a aVar2 = (a) this.f19283c.get(this.f19287g);
            if (aVar2 != null && aVar2.f19291c == -1 && aVar2.f19290b != aVar.f19185c) {
                return;
            }
        }
        a aVarO = o(aVar.f19185c, aVar.f19186d);
        if (this.f19287g == null) {
            this.f19287g = aVarO.f19289a;
        }
        D.b bVar2 = aVar.f19186d;
        if (bVar2 != null && bVar2.b()) {
            D.b bVar3 = aVar.f19186d;
            D.b bVar4 = new D.b(bVar3.f49482a, bVar3.f49485d, bVar3.f49483b);
            a aVarO2 = o(aVar.f19185c, bVar4);
            if (!aVarO2.f19293e) {
                aVarO2.f19293e = true;
                aVar.f19184b.h(aVar.f19186d.f49482a, this.f19282b);
                this.f19285e.f0(new InterfaceC1735b.a(aVar.f19183a, aVar.f19184b, aVar.f19185c, bVar4, Math.max(0L, S.o1(this.f19282b.f(aVar.f19186d.f49483b)) + this.f19282b.m()), aVar.f19188f, aVar.f19189g, aVar.f19190h, aVar.f19191i, aVar.f19192j), aVarO2.f19289a);
            }
        }
        if (!aVarO.f19293e) {
            aVarO.f19293e = true;
            this.f19285e.f0(aVar, aVarO.f19289a);
        }
        if (aVarO.f19289a.equals(this.f19287g) && !aVarO.f19294f) {
            aVarO.f19294f = true;
            this.f19285e.N(aVar, aVarO.f19289a);
        }
    }

    @Override // p003a2.A1
    public synchronized void d(InterfaceC1735b.a aVar) {
        try {
            AbstractC1459a.e(this.f19285e);
            F f10 = this.f19286f;
            this.f19286f = aVar.f19184b;
            Iterator it = this.f19283c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (!aVar2.m(f10, this.f19286f) || aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f19293e) {
                        if (aVar2.f19289a.equals(this.f19287g)) {
                            l(aVar2);
                        }
                        this.f19285e.i0(aVar, aVar2.f19289a, false);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p003a2.A1
    public void e(A1.a aVar) {
        this.f19285e = aVar;
    }

    @Override // p003a2.A1
    public synchronized void f(InterfaceC1735b.a aVar, int i10) {
        try {
            AbstractC1459a.e(this.f19285e);
            boolean z10 = i10 == 0;
            Iterator it = this.f19283c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f19293e) {
                        boolean zEquals = aVar2.f19289a.equals(this.f19287g);
                        boolean z11 = z10 && zEquals && aVar2.f19294f;
                        if (zEquals) {
                            l(aVar2);
                        }
                        this.f19285e.i0(aVar, aVar2.f19289a, z11);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p003a2.A1
    public synchronized void g(InterfaceC1735b.a aVar) {
        A1.a aVar2;
        try {
            String str = this.f19287g;
            if (str != null) {
                l((a) AbstractC1459a.e((a) this.f19283c.get(str)));
            }
            Iterator it = this.f19283c.values().iterator();
            while (it.hasNext()) {
                a aVar3 = (a) it.next();
                it.remove();
                if (aVar3.f19293e && (aVar2 = this.f19285e) != null) {
                    aVar2.i0(aVar, aVar3.f19289a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
