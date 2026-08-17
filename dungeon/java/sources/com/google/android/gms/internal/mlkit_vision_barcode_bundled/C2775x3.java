package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2775x3 extends AbstractC2704j1 implements M1 {
    private static final C2775x3 zzb;
    private int zzd;
    private int zze;
    private int zzf = 100;
    private int zzg;

    static {
        C2775x3 c2775x3 = new C2775x3();
        zzb = c2775x3;
        AbstractC2704j1.v(C2775x3.class, c2775x3);
    }

    private C2775x3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", C2765v3.f34330a, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2775x3();
        }
        if (i11 == 4) {
            return new C2770w3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
