package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class D3 extends F1 implements InterfaceC2804d2 {
    private static final D3 zzb;
    private int zzd;
    private int zze;

    static {
        D3 d10 = new D3();
        zzb = d10;
        F1.f(D3.class, d10);
    }

    private D3() {
    }

    public static D3 D() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", B3.f34426a});
        }
        if (i11 == 3) {
            return new D3();
        }
        if (i11 == 4) {
            return new A3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
