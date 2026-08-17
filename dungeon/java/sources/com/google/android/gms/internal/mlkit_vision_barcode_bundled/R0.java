package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class R0 implements G2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q0 f33367a;

    private R0(Q0 q10) {
        byte[] bArr = AbstractC2743r1.f34293b;
        this.f33367a = q10;
        q10.f33366a = this;
    }

    public static R0 m(Q0 q10) {
        R0 r10 = q10.f33366a;
        return r10 != null ? r10 : new R0(q10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void A(int i10, long j10) {
        this.f33367a.l(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void B(int i10, String str) {
        this.f33367a.t(i10, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void C(int i10, Object obj, InterfaceC2675d2 interfaceC2675d2) {
        this.f33367a.q(i10, (L1) obj, interfaceC2675d2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void D(int i10, I0 i11) {
        this.f33367a.i(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void E(int i10, long j10) {
        this.f33367a.x(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void F(int i10, int i11) {
        this.f33367a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void G(int i10, int i11) {
        this.f33367a.v(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void H(int i10) {
        this.f33367a.u(i10, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void I(int i10, int i11) {
        this.f33367a.v(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void J(int i10, long j10) {
        this.f33367a.l(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void K(int i10, Object obj, InterfaceC2675d2 interfaceC2675d2) {
        Q0 q10 = this.f33367a;
        q10.u(i10, 3);
        interfaceC2675d2.h((L1) obj, q10.f33366a);
        q10.u(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void L(int i10, Object obj) {
        if (obj instanceof I0) {
            this.f33367a.s(i10, (I0) obj);
        } else {
            this.f33367a.r(i10, (L1) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void M(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f33367a.t(i10, (String) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void N(int i10, long j10) {
        this.f33367a.x(i10, j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void a(int i10, double d10) {
        this.f33367a.l(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void b(int i10, int i11) {
        this.f33367a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void c(int i10, int i11) {
        this.f33367a.n(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void d(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f33367a.i(i10, (I0) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void e(int i10, boolean z10) {
        this.f33367a.h(i10, z10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void f(int i10, long j10) {
        this.f33367a.x(i10, j10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f33367a.h(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        this.f33367a.w(i12);
        while (i11 < list.size()) {
            this.f33367a.g(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void h(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f33367a.l(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f33367a.w(i12);
        while (i11 < list.size()) {
            this.f33367a.m(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2709k1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f33367a.n(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f33367a.u(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iB += Q0.b(((Integer) list.get(i12)).intValue());
            }
            this.f33367a.w(iB);
            while (i11 < list.size()) {
                this.f33367a.o(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2709k1 c2709k1 = (C2709k1) list;
        if (!z10) {
            while (i11 < c2709k1.size()) {
                this.f33367a.n(i10, c2709k1.c(i11));
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < c2709k1.size(); i13++) {
            iB2 += Q0.b(c2709k1.c(i13));
        }
        this.f33367a.w(iB2);
        while (i11 < c2709k1.size()) {
            this.f33367a.o(c2709k1.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void j(int i10, int i11) {
        this.f33367a.n(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void k(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f33367a.x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB += Q0.b(((Long) list.get(i12)).longValue());
        }
        this.f33367a.w(iB);
        while (i11 < list.size()) {
            this.f33367a.y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f33367a.l(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f33367a.w(i12);
        while (i11 < list.size()) {
            this.f33367a.m(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void n(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2664b1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f33367a.j(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            this.f33367a.u(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f33367a.w(i12);
            while (i11 < list.size()) {
                this.f33367a.k(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        C2664b1 c2664b1 = (C2664b1) list;
        if (!z10) {
            while (i11 < c2664b1.size()) {
                this.f33367a.j(i10, Float.floatToRawIntBits(c2664b1.c(i11)));
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2664b1.size(); i15++) {
            c2664b1.c(i15);
            i14 += 4;
        }
        this.f33367a.w(i14);
        while (i11 < c2664b1.size()) {
            this.f33367a.k(Float.floatToRawIntBits(c2664b1.c(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void o(int i10) {
        this.f33367a.u(i10, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2709k1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f33367a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f33367a.u(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f33367a.w(i12);
            while (i11 < list.size()) {
                this.f33367a.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2709k1 c2709k1 = (C2709k1) list;
        if (!z10) {
            while (i11 < c2709k1.size()) {
                this.f33367a.j(i10, c2709k1.c(i11));
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2709k1.size(); i15++) {
            c2709k1.c(i15);
            i14 += 4;
        }
        this.f33367a.w(i14);
        while (i11 < c2709k1.size()) {
            this.f33367a.k(c2709k1.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2709k1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f33367a.v(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f33367a.u(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += Q0.a(((Integer) list.get(i12)).intValue());
            }
            this.f33367a.w(iA);
            while (i11 < list.size()) {
                this.f33367a.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2709k1 c2709k1 = (C2709k1) list;
        if (!z10) {
            while (i11 < c2709k1.size()) {
                this.f33367a.v(i10, c2709k1.c(i11));
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c2709k1.size(); i13++) {
            iA2 += Q0.a(c2709k1.c(i13));
        }
        this.f33367a.w(iA2);
        while (i11 < c2709k1.size()) {
            this.f33367a.w(c2709k1.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void s(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2709k1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f33367a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f33367a.u(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f33367a.w(i12);
            while (i11 < list.size()) {
                this.f33367a.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2709k1 c2709k1 = (C2709k1) list;
        if (!z10) {
            while (i11 < c2709k1.size()) {
                this.f33367a.j(i10, c2709k1.c(i11));
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2709k1.size(); i15++) {
            c2709k1.c(i15);
            i14 += 4;
        }
        this.f33367a.w(i14);
        while (i11 < c2709k1.size()) {
            this.f33367a.k(c2709k1.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2709k1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f33367a.n(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f33367a.u(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iB += Q0.b(((Integer) list.get(i12)).intValue());
            }
            this.f33367a.w(iB);
            while (i11 < list.size()) {
                this.f33367a.o(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2709k1 c2709k1 = (C2709k1) list;
        if (!z10) {
            while (i11 < c2709k1.size()) {
                this.f33367a.n(i10, c2709k1.c(i11));
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < c2709k1.size(); i13++) {
            iB2 += Q0.b(c2709k1.c(i13));
        }
        this.f33367a.w(iB2);
        while (i11 < c2709k1.size()) {
            this.f33367a.o(c2709k1.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void u(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2709k1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    Q0 q10 = this.f33367a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    q10.v(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.f33367a.u(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iA += Q0.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f33367a.w(iA);
            while (i11 < list.size()) {
                Q0 q11 = this.f33367a;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                q11.w((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        C2709k1 c2709k1 = (C2709k1) list;
        if (!z10) {
            while (i11 < c2709k1.size()) {
                Q0 q12 = this.f33367a;
                int iC = c2709k1.c(i11);
                q12.v(i10, (iC >> 31) ^ (iC + iC));
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c2709k1.size(); i13++) {
            int iC2 = c2709k1.c(i13);
            iA2 += Q0.a((iC2 >> 31) ^ (iC2 + iC2));
        }
        this.f33367a.w(iA2);
        while (i11 < c2709k1.size()) {
            Q0 q13 = this.f33367a;
            int iC3 = c2709k1.c(i11);
            q13.w((iC3 >> 31) ^ (iC3 + iC3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void v(int i10, float f10) {
        this.f33367a.j(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f33367a.x(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB += Q0.b(((Long) list.get(i12)).longValue());
        }
        this.f33367a.w(iB);
        while (i11 < list.size()) {
            this.f33367a.y(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                Q0 q10 = this.f33367a;
                long jLongValue = ((Long) list.get(i11)).longValue();
                q10.x(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iB += Q0.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f33367a.w(iB);
        while (i11 < list.size()) {
            Q0 q11 = this.f33367a;
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            q11.y((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G2
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f33367a.l(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f33367a.u(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f33367a.w(i12);
        while (i11 < list.size()) {
            this.f33367a.m(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }
}
