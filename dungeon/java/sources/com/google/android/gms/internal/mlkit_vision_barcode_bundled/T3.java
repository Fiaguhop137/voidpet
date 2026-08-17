package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
public final class T3 extends AbstractC2704j1 implements M1 {
    private static final T3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        T3 t10 = new T3();
        zzb = t10;
        AbstractC2704j1.v(T3.class, t10);
    }

    private T3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", R3.f33370a, "zzg"});
        }
        if (i11 == 3) {
            return new T3();
        }
        if (i11 == 4) {
            return new S3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
