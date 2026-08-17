package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class W2 extends AbstractC2461d5 implements F5 {
    private static final W2 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private InterfaceC2515j5 zzi = AbstractC2461d5.y();

    static {
        W2 w10 = new W2();
        zzj = w10;
        AbstractC2461d5.s(W2.class, w10);
    }

    private W2() {
    }

    public static V2 O() {
        return (V2) zzj.o();
    }

    private final void a0() {
        InterfaceC2515j5 interfaceC2515j5 = this.zzi;
        if (interfaceC2515j5.zza()) {
            return;
        }
        this.zzi = AbstractC2461d5.z(interfaceC2515j5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", W2.class});
        }
        if (i11 == 3) {
            return new W2();
        }
        if (i11 == 4) {
            return new V2(null);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean C() {
        return (this.zzb & 1) != 0;
    }

    public final String D() {
        return this.zzd;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final String F() {
        return this.zze;
    }

    public final boolean G() {
        return (this.zzb & 4) != 0;
    }

    public final long H() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final float J() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzb & 16) != 0;
    }

    public final double L() {
        return this.zzh;
    }

    public final List M() {
        return this.zzi;
    }

    public final int N() {
        return this.zzi.size();
    }

    final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void R() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    final /* synthetic */ void S(long j10) {
        this.zzb |= 4;
        this.zzf = j10;
    }

    final /* synthetic */ void T() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    final /* synthetic */ void U(double d10) {
        this.zzb |= 16;
        this.zzh = d10;
    }

    final /* synthetic */ void V() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    final /* synthetic */ void W(W2 w10) {
        w10.getClass();
        a0();
        this.zzi.add(w10);
    }

    final /* synthetic */ void X(Iterable iterable) {
        a0();
        AbstractC2612u4.g(iterable, this.zzi);
    }

    final /* synthetic */ void Y() {
        this.zzi = AbstractC2461d5.y();
    }
}
