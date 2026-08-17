package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2531l3 extends AbstractC2461d5 implements F5 {
    private static final C2531l3 zzf;
    private int zzb;
    private int zzd;
    private InterfaceC2506i5 zze = AbstractC2461d5.w();

    static {
        C2531l3 c2531l3 = new C2531l3();
        zzf = c2531l3;
        AbstractC2461d5.s(C2531l3.class, c2531l3);
    }

    private C2531l3() {
    }

    public static C2522k3 H() {
        return (C2522k3) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C2531l3();
        }
        if (i11 == 4) {
            return new C2522k3(null);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final int D() {
        return this.zzd;
    }

    public final List E() {
        return this.zze;
    }

    public final int F() {
        return this.zze.size();
    }

    public final long G(int i10) {
        return this.zze.R0(i10);
    }

    final /* synthetic */ void I(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    final /* synthetic */ void J(Iterable iterable) {
        InterfaceC2506i5 interfaceC2506i5 = this.zze;
        if (!interfaceC2506i5.zza()) {
            this.zze = AbstractC2461d5.x(interfaceC2506i5);
        }
        AbstractC2612u4.g(iterable, this.zze);
    }
}
