package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2467e2 extends AbstractC2461d5 implements F5 {
    private static final C2467e2 zzi;
    private int zzb;
    private boolean zzg;
    private InterfaceC2515j5 zzd = AbstractC2461d5.y();
    private InterfaceC2515j5 zze = AbstractC2461d5.y();
    private InterfaceC2515j5 zzf = AbstractC2461d5.y();
    private InterfaceC2515j5 zzh = AbstractC2461d5.y();

    static {
        C2467e2 c2467e2 = new C2467e2();
        zzi = c2467e2;
        AbstractC2461d5.s(C2467e2.class, c2467e2);
    }

    private C2467e2() {
    }

    public static C2467e2 I() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", S1.class, "zze", U1.class, "zzf", C2440b2.class, "zzg", "zzh", S1.class});
        }
        if (i11 == 3) {
            return new C2467e2();
        }
        if (i11 == 4) {
            return new Q1(null);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List C() {
        return this.zzd;
    }

    public final List D() {
        return this.zze;
    }

    public final List E() {
        return this.zzf;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final boolean G() {
        return this.zzg;
    }

    public final List H() {
        return this.zzh;
    }
}
