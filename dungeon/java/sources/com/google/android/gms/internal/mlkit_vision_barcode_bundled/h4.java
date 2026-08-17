package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
public final class h4 extends AbstractC2704j1 implements M1 {
    private static final h4 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private W3 zzg;
    private byte zzh = 2;

    static {
        h4 h4Var = new h4();
        zzb = h4Var;
        AbstractC2704j1.v(h4.class, h4Var);
        AbstractC2704j1.g(W3.F(), h4Var, h4Var, null, 13258261, E2.f33310l, h4.class);
    }

    private h4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new h4();
        }
        if (i11 == 4) {
            return new g4(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
