package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2860o3 extends F1 implements InterfaceC2804d2 {
    private static final C2860o3 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C2860o3 c2860o3 = new C2860o3();
        zzb = c2860o3;
        F1.f(C2860o3.class, c2860o3);
    }

    private C2860o3() {
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C2855n3.f34792a, "zzf"});
        }
        if (i11 == 3) {
            return new C2860o3();
        }
        if (i11 == 4) {
            return new C2850m3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
