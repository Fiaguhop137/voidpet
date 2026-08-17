package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class z3 extends F1 implements InterfaceC2804d2 {
    private static final z3 zzb;
    private int zzd;
    private R2 zze;
    private long zzf;

    static {
        z3 z3Var = new z3();
        zzb = z3Var;
        F1.f(z3.class, z3Var);
    }

    private z3() {
    }

    public static x3 C() {
        return (x3) zzb.q();
    }

    static /* synthetic */ void E(z3 z3Var, R2 r10) {
        r10.getClass();
        z3Var.zze = r10;
        z3Var.zzd |= 1;
    }

    static /* synthetic */ void F(z3 z3Var, long j10) {
        z3Var.zzd |= 2;
        z3Var.zzf = j10;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new z3();
        }
        if (i11 == 4) {
            return new x3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
