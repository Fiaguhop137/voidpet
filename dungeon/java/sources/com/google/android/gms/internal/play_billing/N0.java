package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class N0 extends F1 implements InterfaceC2804d2 {
    private static final N0 zzb;
    private int zzd;
    private T0 zze;
    private T0 zzf;
    private int zzg;

    static {
        N0 n10 = new N0();
        zzb = n10;
        F1.f(N0.class, n10);
    }

    private N0() {
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", W0.a()});
        }
        if (i11 == 3) {
            return new N0();
        }
        if (i11 == 4) {
            return new M0(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
