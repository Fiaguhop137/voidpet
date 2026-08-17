package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2637x3 extends AbstractC2461d5 implements F5 {
    private static final C2637x3 zzd;
    private InterfaceC2515j5 zzb = AbstractC2461d5.y();

    static {
        C2637x3 c2637x3 = new C2637x3();
        zzd = c2637x3;
        AbstractC2461d5.s(C2637x3.class, c2637x3);
    }

    private C2637x3() {
    }

    public static C2637x3 E() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C2653z3.class});
        }
        if (i11 == 3) {
            return new C2637x3();
        }
        if (i11 == 4) {
            return new C2629w3(null);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List C() {
        return this.zzb;
    }

    public final int D() {
        return this.zzb.size();
    }
}
