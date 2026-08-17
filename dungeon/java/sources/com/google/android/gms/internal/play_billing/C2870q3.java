package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2870q3 extends F1 implements InterfaceC2804d2 {
    private static final C2870q3 zzb;
    private int zzd;
    private K1 zze = F1.w();
    private String zzf = "";
    private boolean zzg;

    static {
        C2870q3 c2870q3 = new C2870q3();
        zzb = c2870q3;
        F1.f(C2870q3.class, c2870q3);
    }

    private C2870q3() {
    }

    public static C2870q3 D() {
        return zzb;
    }

    static /* synthetic */ void E(C2870q3 c2870q3, boolean z10) {
        c2870q3.zzd |= 2;
        c2870q3.zzg = z10;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", C2860o3.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2870q3();
        }
        if (i11 == 4) {
            return new C2845l3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
