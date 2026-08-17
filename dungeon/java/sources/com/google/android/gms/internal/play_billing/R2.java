package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class R2 extends F1 implements InterfaceC2804d2 {
    private static final R2 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        R2 r10 = new R2();
        zzb = r10;
        F1.f(R2.class, r10);
    }

    private R2() {
    }

    static /* synthetic */ void C(R2 r10, int i10) {
        r10.zzd |= 1;
        r10.zze = i10;
    }

    public static N2 D() {
        return (N2) zzb.q();
    }

    static /* synthetic */ void F(R2 r10, String str) {
        r10.zzd |= 8;
        r10.zzh = str;
    }

    static /* synthetic */ void G(R2 r10, String str) {
        str.getClass();
        r10.zzd |= 2;
        r10.zzf = str;
    }

    static /* synthetic */ void H(R2 r10, int i10) {
        r10.zzd |= 32;
        r10.zzj = 0;
    }

    static /* synthetic */ void I(R2 r10, int i10) {
        r10.zzd |= 16;
        r10.zzi = i10;
    }

    static /* synthetic */ void J(R2 r10, P2 p10) {
        r10.zzg = p10.zza();
        r10.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", O2.f34486a, "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new R2();
        }
        if (i11 == 4) {
            return new N2(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
