package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes2.dex */
public final class c4 extends AbstractC2704j1 implements M1 {
    private static final c4 zzb;
    private int zzd;
    private W3 zzj;
    private byte zzk = 2;
    private InterfaceC2734p1 zze = AbstractC2704j1.o();
    private InterfaceC2729o1 zzf = AbstractC2704j1.m();
    private boolean zzg = true;
    private String zzh = "";
    private String zzi = "";

    static {
        c4 c4Var = new c4();
        zzb = c4Var;
        AbstractC2704j1.v(c4.class, c4Var);
    }

    private c4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new c4();
        }
        if (i11 == 4) {
            return new b4(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
