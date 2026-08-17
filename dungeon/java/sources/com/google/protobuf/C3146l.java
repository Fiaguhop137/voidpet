package com.google.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3146l implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC3145k f37981a;

    /* JADX INFO: renamed from: com.google.protobuf.l$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37982a;

        static {
            int[] iArr = new int[C0.b.values().length];
            f37982a = iArr;
            try {
                iArr[C0.b.f37700j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37982a[C0.b.f37699i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37982a[C0.b.f37697g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37982a[C0.b.f37707q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37982a[C0.b.f37709s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37982a[C0.b.f37705o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37982a[C0.b.f37698h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37982a[C0.b.f37695e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37982a[C0.b.f37708r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37982a[C0.b.f37710t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37982a[C0.b.f37696f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37982a[C0.b.f37701k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C3146l(AbstractC3145k abstractC3145k) {
        AbstractC3145k abstractC3145k2 = (AbstractC3145k) A.b(abstractC3145k, "output");
        this.f37981a = abstractC3145k2;
        abstractC3145k2.f37967a = this;
    }

    public static C3146l P(AbstractC3145k abstractC3145k) {
        C3146l c3146l = abstractC3145k.f37967a;
        return c3146l != null ? c3146l : new C3146l(abstractC3145k);
    }

    private void Q(int i10, boolean z10, Object obj, L.a aVar) {
        this.f37981a.T0(i10, 2);
        this.f37981a.V0(L.b(aVar, Boolean.valueOf(z10), obj));
        L.e(this.f37981a, aVar, Boolean.valueOf(z10), obj);
    }

    private void R(int i10, L.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            Object obj = map.get(Integer.valueOf(i13));
            this.f37981a.T0(i10, 2);
            this.f37981a.V0(L.b(aVar, Integer.valueOf(i13), obj));
            L.e(this.f37981a, aVar, Integer.valueOf(i13), obj);
        }
    }

    private void S(int i10, L.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            Object obj = map.get(Long.valueOf(j10));
            this.f37981a.T0(i10, 2);
            this.f37981a.V0(L.b(aVar, Long.valueOf(j10), obj));
            L.e(this.f37981a, aVar, Long.valueOf(j10), obj);
        }
    }

    private void T(int i10, L.a aVar, Map map) {
        switch (a.f37982a[aVar.f37829a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i10, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i10, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f37829a);
        }
    }

    private void U(int i10, L.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = (String) it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            Object obj = map.get(str);
            this.f37981a.T0(i10, 2);
            this.f37981a.V0(L.b(aVar, str, obj));
            L.e(this.f37981a, aVar, str, obj);
        }
    }

    private void V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f37981a.R0(i10, (String) obj);
        } else {
            this.f37981a.l0(i10, (AbstractC3142h) obj);
        }
    }

    @Override // com.google.protobuf.D0
    public void A(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.h0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iF = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iF += AbstractC3145k.f(((Boolean) list.get(i12)).booleanValue());
        }
        this.f37981a.V0(iF);
        while (i11 < list.size()) {
            this.f37981a.i0(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.D0
    public void B(int i10, float f10) {
        this.f37981a.v0(i10, f10);
    }

    @Override // com.google.protobuf.D0
    public void C(int i10) {
        this.f37981a.T0(i10, 4);
    }

    @Override // com.google.protobuf.D0
    public void D(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.N0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += AbstractC3145k.N(((Integer) list.get(i12)).intValue());
        }
        this.f37981a.V0(iN);
        while (i11 < list.size()) {
            this.f37981a.O0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.D0
    public void E(int i10, int i11) {
        this.f37981a.p0(i10, i11);
    }

    @Override // com.google.protobuf.D0
    public void F(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.D0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iZ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ += AbstractC3145k.z(((Long) list.get(i12)).longValue());
        }
        this.f37981a.V0(iZ);
        while (i11 < list.size()) {
            this.f37981a.E0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.D0
    public void G(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.n0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += AbstractC3145k.k(((Double) list.get(i12)).doubleValue());
        }
        this.f37981a.V0(iK);
        while (i11 < list.size()) {
            this.f37981a.o0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.D0
    public void H(int i10, int i11) {
        this.f37981a.N0(i10, i11);
    }

    @Override // com.google.protobuf.D0
    public void I(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f37981a.l0(i10, (AbstractC3142h) list.get(i11));
        }
    }

    @Override // com.google.protobuf.D0
    public void J(int i10, List list, n0 n0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), n0Var);
        }
    }

    @Override // com.google.protobuf.D0
    public void K(int i10, Object obj, n0 n0Var) {
        this.f37981a.y0(i10, (T) obj, n0Var);
    }

    @Override // com.google.protobuf.D0
    public void L(int i10, AbstractC3142h abstractC3142h) {
        this.f37981a.l0(i10, abstractC3142h);
    }

    @Override // com.google.protobuf.D0
    public void M(int i10, List list, n0 n0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            K(i10, list.get(i11), n0Var);
        }
    }

    @Override // com.google.protobuf.D0
    public void N(int i10, Object obj, n0 n0Var) {
        this.f37981a.F0(i10, (T) obj, n0Var);
    }

    @Override // com.google.protobuf.D0
    public void O(int i10, L.a aVar, Map map) {
        if (this.f37981a.b0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f37981a.T0(i10, 2);
            this.f37981a.V0(L.b(aVar, entry.getKey(), entry.getValue()));
            L.e(this.f37981a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.D0
    public void a(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.v0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS += AbstractC3145k.s(((Float) list.get(i12)).floatValue());
        }
        this.f37981a.V0(iS);
        while (i11 < list.size()) {
            this.f37981a.w0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.D0
    public final void b(int i10, Object obj) {
        if (obj instanceof AbstractC3142h) {
            this.f37981a.I0(i10, (AbstractC3142h) obj);
        } else {
            this.f37981a.H0(i10, (T) obj);
        }
    }

    @Override // com.google.protobuf.D0
    public void c(int i10, int i11) {
        this.f37981a.r0(i10, i11);
    }

    @Override // com.google.protobuf.D0
    public void d(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof H)) {
            while (i11 < list.size()) {
                this.f37981a.R0(i10, (String) list.get(i11));
                i11++;
            }
        } else {
            H h10 = (H) list;
            while (i11 < list.size()) {
                V(i10, h10.M3(i11));
                i11++;
            }
        }
    }

    @Override // com.google.protobuf.D0
    public void e(int i10, String str) {
        this.f37981a.R0(i10, str);
    }

    @Override // com.google.protobuf.D0
    public void f(int i10, long j10) {
        this.f37981a.W0(i10, j10);
    }

    @Override // com.google.protobuf.D0
    public void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.B0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += AbstractC3145k.x(((Integer) list.get(i12)).intValue());
        }
        this.f37981a.V0(iX);
        while (i11 < list.size()) {
            this.f37981a.C0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.D0
    public void h(int i10, int i11) {
        this.f37981a.B0(i10, i11);
    }

    @Override // com.google.protobuf.D0
    public void i(int i10, long j10) {
        this.f37981a.L0(i10, j10);
    }

    @Override // com.google.protobuf.D0
    public void j(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.r0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += AbstractC3145k.o(((Integer) list.get(i12)).intValue());
        }
        this.f37981a.V0(iO);
        while (i11 < list.size()) {
            this.f37981a.s0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.D0
    public void k(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.U0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iU = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iU += AbstractC3145k.U(((Integer) list.get(i12)).intValue());
        }
        this.f37981a.V0(iU);
        while (i11 < list.size()) {
            this.f37981a.V0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.D0
    public void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.P0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += AbstractC3145k.P(((Long) list.get(i12)).longValue());
        }
        this.f37981a.V0(iP);
        while (i11 < list.size()) {
            this.f37981a.Q0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.D0
    public void m(int i10, long j10) {
        this.f37981a.P0(i10, j10);
    }

    @Override // com.google.protobuf.D0
    public void n(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.p0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += AbstractC3145k.m(((Integer) list.get(i12)).intValue());
        }
        this.f37981a.V0(iM);
        while (i11 < list.size()) {
            this.f37981a.q0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.D0
    public void o(int i10, int i11) {
        this.f37981a.U0(i10, i11);
    }

    @Override // com.google.protobuf.D0
    public void p(int i10, double d10) {
        this.f37981a.n0(i10, d10);
    }

    @Override // com.google.protobuf.D0
    public void q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.L0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += AbstractC3145k.L(((Long) list.get(i12)).longValue());
        }
        this.f37981a.V0(iL);
        while (i11 < list.size()) {
            this.f37981a.M0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.D0
    public void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.W0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += AbstractC3145k.W(((Long) list.get(i12)).longValue());
        }
        this.f37981a.V0(iW);
        while (i11 < list.size()) {
            this.f37981a.X0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.D0
    public void s(int i10, long j10) {
        this.f37981a.t0(i10, j10);
    }

    @Override // com.google.protobuf.D0
    public D0.a t() {
        return D0.a.ASCENDING;
    }

    @Override // com.google.protobuf.D0
    public void u(int i10, long j10) {
        this.f37981a.D0(i10, j10);
    }

    @Override // com.google.protobuf.D0
    public void v(int i10, boolean z10) {
        this.f37981a.h0(i10, z10);
    }

    @Override // com.google.protobuf.D0
    public void w(int i10, int i11) {
        this.f37981a.J0(i10, i11);
    }

    @Override // com.google.protobuf.D0
    public void x(int i10) {
        this.f37981a.T0(i10, 3);
    }

    @Override // com.google.protobuf.D0
    public void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.t0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += AbstractC3145k.q(((Long) list.get(i12)).longValue());
        }
        this.f37981a.V0(iQ);
        while (i11 < list.size()) {
            this.f37981a.u0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.D0
    public void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37981a.J0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f37981a.T0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += AbstractC3145k.J(((Integer) list.get(i12)).intValue());
        }
        this.f37981a.V0(iJ);
        while (i11 < list.size()) {
            this.f37981a.K0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }
}
