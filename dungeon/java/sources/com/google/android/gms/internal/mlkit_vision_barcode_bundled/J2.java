package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
public final class J2 extends AbstractC2704j1 implements M1 {
    private static final J2 zzb;
    private int zzd;
    private int zze;
    private Q3 zzf;
    private C3 zzg;
    private E3 zzh;

    static {
        J2 j10 = new J2();
        zzb = j10;
        AbstractC2704j1.v(J2.class, j10);
    }

    private J2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"zzd", "zze", C2706j3.f34238a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new J2();
        }
        if (i11 == 4) {
            return new I2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
