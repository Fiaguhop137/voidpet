package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2885u1 implements E2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2881t1 f34816a;

    private C2885u1(AbstractC2881t1 abstractC2881t1) {
        byte[] bArr = M1.f34481b;
        this.f34816a = abstractC2881t1;
        abstractC2881t1.f34809a = this;
    }

    public static C2885u1 K(AbstractC2881t1 abstractC2881t1) {
        Object obj = abstractC2881t1.f34809a;
        return obj != null ? (C2885u1) obj : new C2885u1(abstractC2881t1);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void A(int i10, long j10) {
        this.f34816a.i(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    AbstractC2881t1 abstractC2881t1 = this.f34816a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    abstractC2881t1.o(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            AbstractC2881t1 abstractC2881t2 = this.f34816a;
            abstractC2881t2.n(i10, 2);
            int iS = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iS += AbstractC2881t1.s((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            abstractC2881t2.p(iS);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                abstractC2881t2.p((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        G1 g10 = (G1) list;
        if (!z10) {
            while (i11 < g10.size()) {
                AbstractC2881t1 abstractC2881t3 = this.f34816a;
                int iC = g10.c(i11);
                abstractC2881t3.o(i10, (iC >> 31) ^ (iC + iC));
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t4 = this.f34816a;
        abstractC2881t4.n(i10, 2);
        int iS2 = 0;
        for (int i13 = 0; i13 < g10.size(); i13++) {
            int iC2 = g10.c(i13);
            iS2 += AbstractC2881t1.s((iC2 >> 31) ^ (iC2 + iC2));
        }
        abstractC2881t4.p(iS2);
        while (i11 < g10.size()) {
            int iC3 = g10.c(i11);
            abstractC2881t4.p((iC3 >> 31) ^ (iC3 + iC3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                AbstractC2881t1 abstractC2881t1 = this.f34816a;
                long jLongValue = ((Long) list.get(i11)).longValue();
                abstractC2881t1.q(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t2 = this.f34816a;
        abstractC2881t2.n(i10, 2);
        int iT = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iT += AbstractC2881t1.t((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        abstractC2881t2.p(iT);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            abstractC2881t2.r((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void D(int i10, int i11) {
        this.f34816a.g(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void E(int i10, Object obj, InterfaceC2849m2 interfaceC2849m2) {
        AbstractC2881t1 abstractC2881t1 = this.f34816a;
        Y0 y10 = (Y0) obj;
        abstractC2881t1.n(i10, 2);
        abstractC2881t1.p(y10.c(interfaceC2849m2));
        interfaceC2849m2.i(y10, this);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void F(int i10, long j10) {
        this.f34816a.q(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void G(int i10, AbstractC2843l1 abstractC2843l1) {
        this.f34816a.f(i10, abstractC2843l1);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void H(int i10, Object obj, InterfaceC2849m2 interfaceC2849m2) {
        AbstractC2881t1 abstractC2881t1 = this.f34816a;
        abstractC2881t1.n(i10, 3);
        interfaceC2849m2.i((Y0) obj, this);
        abstractC2881t1.n(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void I(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f34816a.m(i10, (String) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void J(int i10, int i11) {
        this.f34816a.o(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void a(int i10, double d10) {
        this.f34816a.i(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void b(int i10, int i11) {
        this.f34816a.g(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void c(int i10, int i11) {
        this.f34816a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void d(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f34816a.f(i10, (AbstractC2843l1) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void e(int i10, boolean z10) {
        this.f34816a.e(i10, z10);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void f(int i10, long j10) {
        this.f34816a.q(i10, j10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.play_billing.E2
    public final void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f34816a.e(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t1 = this.f34816a;
        abstractC2881t1.n(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        abstractC2881t1.p(i12);
        while (i11 < list.size()) {
            abstractC2881t1.d(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void h(int i10, long j10) {
        this.f34816a.i(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34816a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2881t1 abstractC2881t1 = this.f34816a;
            abstractC2881t1.n(i10, 2);
            int iT = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iT += AbstractC2881t1.t(((Integer) list.get(i12)).intValue());
            }
            abstractC2881t1.p(iT);
            while (i11 < list.size()) {
                abstractC2881t1.l(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        G1 g10 = (G1) list;
        if (!z10) {
            while (i11 < g10.size()) {
                this.f34816a.k(i10, g10.c(i11));
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t2 = this.f34816a;
        abstractC2881t2.n(i10, 2);
        int iT2 = 0;
        for (int i13 = 0; i13 < g10.size(); i13++) {
            iT2 += AbstractC2881t1.t(g10.c(i13));
        }
        abstractC2881t2.p(iT2);
        while (i11 < g10.size()) {
            abstractC2881t2.l(g10.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void j(int i10, int i11) {
        this.f34816a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void k(int i10, String str) {
        this.f34816a.m(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f34816a.i(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t1 = this.f34816a;
        abstractC2881t1.n(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        abstractC2881t1.p(i12);
        while (i11 < list.size()) {
            abstractC2881t1.j(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34816a.o(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2881t1 abstractC2881t1 = this.f34816a;
            abstractC2881t1.n(i10, 2);
            int iS = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iS += AbstractC2881t1.s(((Integer) list.get(i12)).intValue());
            }
            abstractC2881t1.p(iS);
            while (i11 < list.size()) {
                abstractC2881t1.p(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        G1 g10 = (G1) list;
        if (!z10) {
            while (i11 < g10.size()) {
                this.f34816a.o(i10, g10.c(i11));
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t2 = this.f34816a;
        abstractC2881t2.n(i10, 2);
        int iS2 = 0;
        for (int i13 = 0; i13 < g10.size(); i13++) {
            iS2 += AbstractC2881t1.s(g10.c(i13));
        }
        abstractC2881t2.p(iS2);
        while (i11 < g10.size()) {
            abstractC2881t2.p(g10.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void n(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f34816a.g(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t1 = this.f34816a;
        abstractC2881t1.n(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        abstractC2881t1.p(i12);
        while (i11 < list.size()) {
            abstractC2881t1.h(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void o(int i10) {
        this.f34816a.n(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void p(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34816a.g(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2881t1 abstractC2881t1 = this.f34816a;
            abstractC2881t1.n(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            abstractC2881t1.p(i12);
            while (i11 < list.size()) {
                abstractC2881t1.h(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        G1 g10 = (G1) list;
        if (!z10) {
            while (i11 < g10.size()) {
                this.f34816a.g(i10, g10.c(i11));
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t2 = this.f34816a;
        abstractC2881t2.n(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < g10.size(); i15++) {
            g10.c(i15);
            i14 += 4;
        }
        abstractC2881t2.p(i14);
        while (i11 < g10.size()) {
            abstractC2881t2.h(g10.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void q(int i10) {
        this.f34816a.n(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void r(int i10, long j10) {
        this.f34816a.q(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void s(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34816a.g(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2881t1 abstractC2881t1 = this.f34816a;
            abstractC2881t1.n(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            abstractC2881t1.p(i12);
            while (i11 < list.size()) {
                abstractC2881t1.h(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        G1 g10 = (G1) list;
        if (!z10) {
            while (i11 < g10.size()) {
                this.f34816a.g(i10, g10.c(i11));
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t2 = this.f34816a;
        abstractC2881t2.n(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < g10.size(); i15++) {
            g10.c(i15);
            i14 += 4;
        }
        abstractC2881t2.p(i14);
        while (i11 < g10.size()) {
            abstractC2881t2.h(g10.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof G1)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f34816a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2881t1 abstractC2881t1 = this.f34816a;
            abstractC2881t1.n(i10, 2);
            int iT = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iT += AbstractC2881t1.t(((Integer) list.get(i12)).intValue());
            }
            abstractC2881t1.p(iT);
            while (i11 < list.size()) {
                abstractC2881t1.l(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        G1 g10 = (G1) list;
        if (!z10) {
            while (i11 < g10.size()) {
                this.f34816a.k(i10, g10.c(i11));
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t2 = this.f34816a;
        abstractC2881t2.n(i10, 2);
        int iT2 = 0;
        for (int i13 = 0; i13 < g10.size(); i13++) {
            iT2 += AbstractC2881t1.t(g10.c(i13));
        }
        abstractC2881t2.p(iT2);
        while (i11 < g10.size()) {
            abstractC2881t2.l(g10.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void u(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f34816a.q(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t1 = this.f34816a;
        abstractC2881t1.n(i10, 2);
        int iT = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iT += AbstractC2881t1.t(((Long) list.get(i12)).longValue());
        }
        abstractC2881t1.p(iT);
        while (i11 < list.size()) {
            abstractC2881t1.r(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void v(int i10, float f10) {
        this.f34816a.g(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void w(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f34816a.i(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t1 = this.f34816a;
        abstractC2881t1.n(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        abstractC2881t1.p(i12);
        while (i11 < list.size()) {
            abstractC2881t1.j(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f34816a.q(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t1 = this.f34816a;
        abstractC2881t1.n(i10, 2);
        int iT = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iT += AbstractC2881t1.t(((Long) list.get(i12)).longValue());
        }
        abstractC2881t1.p(iT);
        while (i11 < list.size()) {
            abstractC2881t1.r(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void y(int i10, int i11) {
        this.f34816a.o(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.E2
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f34816a.i(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        AbstractC2881t1 abstractC2881t1 = this.f34816a;
        abstractC2881t1.n(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        abstractC2881t1.p(i12);
        while (i11 < list.size()) {
            abstractC2881t1.j(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }
}
