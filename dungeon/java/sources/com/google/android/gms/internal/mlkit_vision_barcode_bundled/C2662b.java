package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2662b extends AbstractC2704j1 implements M1 {
    private static final C2662b zzb;
    private int zzd;
    private C2677e zze;
    private boolean zzf;

    static {
        C2662b c2662b = new C2662b();
        zzb = c2662b;
        AbstractC2704j1.v(C2662b.class, c2662b);
    }

    private C2662b() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2662b();
        }
        if (i11 == 4) {
            return new m4(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
