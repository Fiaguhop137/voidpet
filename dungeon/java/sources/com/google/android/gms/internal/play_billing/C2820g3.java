package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2820g3 extends F1 implements InterfaceC2804d2 {
    private static final C2820g3 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C2820g3 c2820g3 = new C2820g3();
        zzb = c2820g3;
        F1.f(C2820g3.class, c2820g3);
    }

    private C2820g3() {
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2820g3();
        }
        if (i11 == 4) {
            return new C2810e3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
