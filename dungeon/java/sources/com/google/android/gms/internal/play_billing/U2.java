package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class U2 extends F1 implements InterfaceC2804d2 {
    private static final U2 zzb;

    static {
        U2 u10 = new U2();
        zzb = u10;
        F1.f(U2.class, u10);
    }

    private U2() {
    }

    public static U2 D() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new U2();
        }
        if (i11 == 4) {
            return new S2(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
