package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2790a3 extends F1 implements InterfaceC2804d2 {
    private static final C2790a3 zzb;
    private int zzd;
    private int zzf;
    private R2 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private J1 zzg = F1.v();
    private K1 zzh = F1.w();

    static {
        C2790a3 c2790a3 = new C2790a3();
        zzb = c2790a3;
        F1.f(C2790a3.class, c2790a3);
    }

    private C2790a3() {
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", Y2.f34680a, "zzg", V2.f34663a, "zzh", w3.class, "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C2790a3();
        }
        if (i11 == 4) {
            return new X2(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
