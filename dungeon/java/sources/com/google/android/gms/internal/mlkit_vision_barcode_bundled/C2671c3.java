package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2671c3 extends AbstractC2704j1 implements M1 {
    private static final C2671c3 zzb;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        C2671c3 c2671c3 = new C2671c3();
        zzb = c2671c3;
        AbstractC2704j1.v(C2671c3.class, c2671c3);
    }

    private C2671c3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", C2676d3.f33475a, "zzf"});
        }
        if (i11 == 3) {
            return new C2671c3();
        }
        if (i11 == 4) {
            return new C2666b3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
