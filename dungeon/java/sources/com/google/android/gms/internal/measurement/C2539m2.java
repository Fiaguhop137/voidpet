package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2539m2 extends AbstractC2461d5 implements F5 {
    private static final C2539m2 zzd;
    private InterfaceC2515j5 zzb = AbstractC2461d5.y();

    static {
        C2539m2 c2539m2 = new C2539m2();
        zzd = c2539m2;
        AbstractC2461d5.s(C2539m2.class, c2539m2);
    }

    private C2539m2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new C2539m2();
        }
        if (i11 == 4) {
            return new C2530l2(null);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
