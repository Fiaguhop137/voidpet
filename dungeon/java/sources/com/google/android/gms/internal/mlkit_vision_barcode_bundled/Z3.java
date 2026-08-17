package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
public final class Z3 extends AbstractC2704j1 implements M1 {
    private static final Z3 zzb;
    private int zzd;
    private InterfaceC2739q1 zze = AbstractC2704j1.p();
    private String zzf = "";

    static {
        Z3 z10 = new Z3();
        zzb = z10;
        AbstractC2704j1.v(Z3.class, z10);
    }

    private Z3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new Z3();
        }
        if (i11 == 4) {
            return new Y3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
