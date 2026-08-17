package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class B1 extends AbstractC2461d5 implements F5 {
    private static final B1 zzi;
    private int zzb;
    private int zzd;
    private InterfaceC2515j5 zze = AbstractC2461d5.y();
    private InterfaceC2515j5 zzf = AbstractC2461d5.y();
    private boolean zzg;
    private boolean zzh;

    static {
        B1 b10 = new B1();
        zzi = b10;
        AbstractC2461d5.s(B1.class, b10);
    }

    private B1() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", L1.class, "zzf", D1.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new B1();
        }
        if (i11 == 4) {
            return new A1(null);
        }
        if (i11 == 5) {
            return zzi;
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

    public final L1 G(int i10) {
        return (L1) this.zze.get(i10);
    }

    public final List H() {
        return this.zzf;
    }

    public final int I() {
        return this.zzf.size();
    }

    public final D1 J(int i10) {
        return (D1) this.zzf.get(i10);
    }

    final /* synthetic */ void K(int i10, L1 l10) {
        l10.getClass();
        InterfaceC2515j5 interfaceC2515j5 = this.zze;
        if (!interfaceC2515j5.zza()) {
            this.zze = AbstractC2461d5.z(interfaceC2515j5);
        }
        this.zze.set(i10, l10);
    }

    final /* synthetic */ void L(int i10, D1 d10) {
        d10.getClass();
        InterfaceC2515j5 interfaceC2515j5 = this.zzf;
        if (!interfaceC2515j5.zza()) {
            this.zzf = AbstractC2461d5.z(interfaceC2515j5);
        }
        this.zzf.set(i10, d10);
    }
}
