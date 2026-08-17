package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class C3 extends AbstractC2461d5 implements F5 {
    private static final C3 zzf;
    private int zzb;
    private InterfaceC2515j5 zzd = AbstractC2461d5.y();
    private C2637x3 zze;

    static {
        C3 c10 = new C3();
        zzf = c10;
        AbstractC2461d5.s(C3.class, c10);
    }

    private C3() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", G3.class, "zze"});
        }
        if (i11 == 3) {
            return new C3();
        }
        if (i11 == 4) {
            return new A3(null);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List C() {
        return this.zzd;
    }

    public final C2637x3 D() {
        C2637x3 c2637x3 = this.zze;
        return c2637x3 == null ? C2637x3.E() : c2637x3;
    }
}
