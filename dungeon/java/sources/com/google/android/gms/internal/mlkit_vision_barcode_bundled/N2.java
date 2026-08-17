package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
public final class N2 extends AbstractC2704j1 implements M1 {
    private static final N2 zzb;
    private int zzd;
    private int zze = -1;

    static {
        N2 n10 = new N2();
        zzb = n10;
        AbstractC2704j1.v(N2.class, n10);
    }

    private N2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new N2();
        }
        if (i11 == 4) {
            return new M2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
