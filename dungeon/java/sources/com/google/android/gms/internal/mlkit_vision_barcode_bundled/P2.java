package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
public final class P2 extends AbstractC2704j1 implements M1 {
    private static final P2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        P2 p10 = new P2();
        zzb = p10;
        AbstractC2704j1.v(P2.class, p10);
    }

    private P2() {
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
            return new P2();
        }
        if (i11 == 4) {
            return new O2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
