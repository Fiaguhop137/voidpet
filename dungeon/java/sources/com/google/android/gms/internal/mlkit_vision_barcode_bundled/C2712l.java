package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2712l extends AbstractC2704j1 implements M1 {
    private static final C2712l zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        C2712l c2712l = new C2712l();
        zzb = c2712l;
        AbstractC2704j1.v(C2712l.class, c2712l);
    }

    private C2712l() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2712l();
        }
        if (i11 == 4) {
            return new C2707k(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
