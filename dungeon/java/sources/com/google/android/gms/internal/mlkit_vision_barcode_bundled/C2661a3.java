package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2661a3 extends AbstractC2704j1 implements M1 {
    private static final C2661a3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private InterfaceC2739q1 zzg = AbstractC2704j1.p();
    private int zzh;

    static {
        C2661a3 c2661a3 = new C2661a3();
        zzb = c2661a3;
        AbstractC2704j1.v(C2661a3.class, c2661a3);
    }

    private C2661a3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zzd", "zze", Y2.f33402a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2661a3();
        }
        if (i11 == 4) {
            return new X2(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
