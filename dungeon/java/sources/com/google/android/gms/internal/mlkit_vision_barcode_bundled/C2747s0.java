package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2747s0 extends AbstractC2704j1 implements M1 {
    private static final C2747s0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C2747s0 c2747s0 = new C2747s0();
        zzb = c2747s0;
        AbstractC2704j1.v(C2747s0.class, c2747s0);
    }

    private C2747s0() {
    }

    public static C2747s0 E() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C2738q0.f34276a, "zzf"});
        }
        if (i11 == 3) {
            return new C2747s0();
        }
        if (i11 == 4) {
            return new C2733p0(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String F() {
        return this.zzf;
    }

    public final int G() {
        int iA = AbstractC2742r0.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
