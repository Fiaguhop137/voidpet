package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2716l3 extends AbstractC2704j1 implements M1 {
    private static final C2716l3 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C2716l3 c2716l3 = new C2716l3();
        zzb = c2716l3;
        AbstractC2704j1.v(C2716l3.class, c2716l3);
    }

    private C2716l3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2716l3();
        }
        if (i11 == 4) {
            return new C2711k3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
