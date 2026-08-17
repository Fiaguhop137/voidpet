package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
public final class k4 extends AbstractC2704j1 implements M1 {
    private static final k4 zzb;
    private int zzd;
    private C2662b zze;

    static {
        k4 k4Var = new k4();
        zzb = k4Var;
        AbstractC2704j1.v(k4.class, k4Var);
    }

    private k4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new k4();
        }
        if (i11 == 4) {
            return new j4(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
