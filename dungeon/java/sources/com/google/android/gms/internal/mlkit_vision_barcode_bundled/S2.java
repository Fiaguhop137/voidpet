package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
public final class S2 extends AbstractC2704j1 implements M1 {
    private static final S2 zzb;
    private int zzd;
    private String zze = "";
    private int zzf = 1;
    private boolean zzg;
    private int zzh;

    static {
        S2 s10 = new S2();
        zzb = s10;
        AbstractC2704j1.v(S2.class, s10);
    }

    private S2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", R2.f33369a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new S2();
        }
        if (i11 == 4) {
            return new Q2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
