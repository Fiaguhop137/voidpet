package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class t3 extends F1 implements InterfaceC2804d2 {
    private static final t3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C2805d3 zzg;
    private C2820g3 zzh;

    static {
        t3 t3Var = new t3();
        zzb = t3Var;
        F1.f(t3.class, t3Var);
    }

    private t3() {
    }

    static /* synthetic */ void C(t3 t3Var, D3 d10) {
        t3Var.zzf = d10;
        t3Var.zze = 4;
    }

    public static C2874r3 D() {
        return (C2874r3) zzb.q();
    }

    static /* synthetic */ void F(t3 t3Var, H2 h10) {
        t3Var.zzf = h10;
        t3Var.zze = 2;
    }

    static /* synthetic */ void G(t3 t3Var, M2 m10) {
        t3Var.zzf = m10;
        t3Var.zze = 3;
    }

    static /* synthetic */ void H(t3 t3Var, U2 u10) {
        u10.getClass();
        t3Var.zzf = u10;
        t3Var.zze = 7;
    }

    static /* synthetic */ void I(t3 t3Var, C2805d3 c2805d3) {
        c2805d3.getClass();
        t3Var.zzg = c2805d3;
        t3Var.zzd |= 1;
    }

    static /* synthetic */ void J(t3 t3Var, z3 z3Var) {
        z3Var.getClass();
        t3Var.zzf = z3Var;
        t3Var.zze = 8;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", H2.class, M2.class, D3.class, C2790a3.class, "zzh", U2.class, z3.class});
        }
        if (i11 == 3) {
            return new t3();
        }
        if (i11 == 4) {
            return new C2874r3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
