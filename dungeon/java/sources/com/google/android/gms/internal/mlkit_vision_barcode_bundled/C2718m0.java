package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2718m0 extends AbstractC2704j1 implements M1 {
    private static final C2718m0 zzb;
    private int zzd;
    private int zze;
    private A1 zzg;
    private byte zzh = 2;
    private InterfaceC2739q1 zzf = AbstractC2704j1.p();

    static {
        C2718m0 c2718m0 = new C2718m0();
        zzb = c2718m0;
        AbstractC2704j1.v(C2718m0.class, c2718m0);
    }

    private C2718m0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2704j1
    protected final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return AbstractC2704j1.s(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", C2708k0.f34239a, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2718m0();
        }
        if (i11 == 4) {
            return new C2703j0(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List E() {
        return this.zzf;
    }

    public final int F() {
        int iA = AbstractC2713l0.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
