package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2592s2 extends AbstractC2461d5 implements F5 {
    private static final C2592s2 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        C2592s2 c2592s2 = new C2592s2();
        zzf = c2592s2;
        AbstractC2461d5.s(C2592s2.class, c2592s2);
    }

    private C2592s2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C2592s2();
        }
        if (i11 == 4) {
            return new C2583r2(null);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }

    public final String D() {
        return this.zze;
    }
}
