package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
public final class V2 extends AbstractC2704j1 implements M1 {
    private static final V2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        V2 v10 = new V2();
        zzb = v10;
        AbstractC2704j1.v(V2.class, v10);
    }

    private V2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", U2.f33391a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new V2();
        }
        if (i11 == 4) {
            return new T2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
