package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2440b2 extends AbstractC2461d5 implements F5 {
    private static final C2440b2 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        C2440b2 c2440b2 = new C2440b2();
        zzf = c2440b2;
        AbstractC2461d5.s(C2440b2.class, c2440b2);
    }

    private C2440b2() {
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
            return new C2440b2();
        }
        if (i11 == 4) {
            return new C2431a2(null);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }
}
