package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2677e extends AbstractC2704j1 implements M1 {
    private static final C2677e zzb;
    private int zzd;
    private int zze = 4369;
    private String zzf = "";

    static {
        C2677e c2677e = new C2677e();
        zzb = c2677e;
        AbstractC2704j1.v(C2677e.class, c2677e);
    }

    private C2677e() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", d4.f33476a, "zzf"});
        }
        if (i11 == 3) {
            return new C2677e();
        }
        if (i11 == 4) {
            return new C2672d(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
