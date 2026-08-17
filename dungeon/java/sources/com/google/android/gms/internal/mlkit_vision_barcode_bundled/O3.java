package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
public final class O3 extends AbstractC2704j1 implements M1 {
    private static final O3 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        O3 o10 = new O3();
        zzb = o10;
        AbstractC2704j1.v(O3.class, o10);
    }

    private O3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new O3();
        }
        if (i11 == 4) {
            return new N3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
