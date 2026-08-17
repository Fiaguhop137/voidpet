package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class w3 extends F1 implements InterfaceC2804d2 {
    private static final w3 zzb;
    private int zzd;
    private int zzf;
    private K1 zze = F1.w();
    private String zzg = "";

    static {
        w3 w3Var = new w3();
        zzb = w3Var;
        F1.f(w3.class, w3Var);
    }

    private w3() {
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new w3();
        }
        if (i11 == 4) {
            return new u3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
