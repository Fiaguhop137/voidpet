package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class Y2 extends AbstractC2461d5 implements F5 {
    private static final Y2 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private C2 zzf;

    static {
        Y2 y10 = new Y2();
        zzg = y10;
        AbstractC2461d5.s(Y2.class, y10);
    }

    private Y2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new Y2();
        }
        if (i11 == 4) {
            return new X2(null);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }
}
