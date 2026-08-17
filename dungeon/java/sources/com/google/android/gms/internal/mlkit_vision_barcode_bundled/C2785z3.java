package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2785z3 extends AbstractC2704j1 implements M1 {
    private static final C2785z3 zzb;
    private int zzd;
    private int zze;

    static {
        C2785z3 c2785z3 = new C2785z3();
        zzb = c2785z3;
        AbstractC2704j1.v(C2785z3.class, c2785z3);
    }

    private C2785z3() {
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
            return new C2785z3();
        }
        if (i11 == 4) {
            return new C2780y3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
