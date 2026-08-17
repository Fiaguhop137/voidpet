package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
public final class W3 extends AbstractC2689g1 implements M1 {
    private static final W3 zzd;
    private byte zze = 2;

    static {
        W3 w10 = new W3();
        zzd = w10;
        AbstractC2704j1.v(W3.class, w10);
    }

    private W3() {
    }

    public static W3 F() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzd, "\u0003\u0000", null);
        }
        if (i11 == 3) {
            return new W3();
        }
        if (i11 == 4) {
            return new V3(null);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
