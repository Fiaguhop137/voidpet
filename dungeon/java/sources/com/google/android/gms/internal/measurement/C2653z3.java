package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2653z3 extends AbstractC2461d5 implements F5 {
    private static final C2653z3 zzf;
    private int zzb;
    private String zzd = "";
    private InterfaceC2515j5 zze = AbstractC2461d5.y();

    static {
        C2653z3 c2653z3 = new C2653z3();
        zzf = c2653z3;
        AbstractC2461d5.s(C2653z3.class, c2653z3);
    }

    private C2653z3() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", G3.class});
        }
        if (i11 == 3) {
            return new C2653z3();
        }
        if (i11 == 4) {
            return new C2645y3(null);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }

    public final List D() {
        return this.zze;
    }
}
