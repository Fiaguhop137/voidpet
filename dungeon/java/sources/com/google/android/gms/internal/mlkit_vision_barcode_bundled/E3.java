package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
public final class E3 extends AbstractC2704j1 implements M1 {
    private static final E3 zzb;
    private int zzd;
    private InterfaceC2739q1 zze = AbstractC2704j1.p();
    private G3 zzf;
    private L2 zzg;

    static {
        E3 e10 = new E3();
        zzb = e10;
        AbstractC2704j1.v(E3.class, e10);
    }

    private E3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", Q3.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new E3();
        }
        if (i11 == 4) {
            return new D3(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
