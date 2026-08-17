package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class T0 extends F1 implements InterfaceC2804d2 {
    private static final T0 zzb;
    private int zzd;
    private String zze = "";

    static {
        T0 t10 = new T0();
        zzb = t10;
        F1.f(T0.class, t10);
    }

    private T0() {
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new T0();
        }
        if (i11 == 4) {
            return new S0(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
