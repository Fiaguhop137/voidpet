package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2728o0 extends AbstractC2704j1 implements M1 {
    private static final C2728o0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        C2728o0 c2728o0 = new C2728o0();
        zzb = c2728o0;
        AbstractC2704j1.v(C2728o0.class, c2728o0);
    }

    private C2728o0() {
    }

    public static C2728o0 E() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C2728o0();
        }
        if (i11 == 4) {
            return new C2723n0(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String F() {
        return this.zzh;
    }

    public final String G() {
        return this.zze;
    }

    public final String I() {
        return this.zzj;
    }

    public final String J() {
        return this.zzi;
    }

    public final String K() {
        return this.zzg;
    }

    public final String L() {
        return this.zzf;
    }

    public final String P() {
        return this.zzk;
    }
}
