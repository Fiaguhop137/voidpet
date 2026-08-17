package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class C2 extends AbstractC2461d5 implements F5 {
    private static final C2 zzk;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C2 c10 = new C2();
        zzk = c10;
        AbstractC2461d5.s(C2.class, c10);
    }

    private C2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C2();
        }
        if (i11 == 4) {
            return new B2(null);
        }
        if (i11 == 5) {
            return zzk;
        }
        throw null;
    }
}
