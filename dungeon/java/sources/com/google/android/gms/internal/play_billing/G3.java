package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class G3 extends F1 implements InterfaceC2804d2 {
    private static final G3 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        G3 g10 = new G3();
        zzb = g10;
        F1.f(G3.class, g10);
    }

    private G3() {
    }

    public static E3 C() {
        return (E3) zzb.q();
    }

    static /* synthetic */ void E(G3 g10, boolean z10) {
        g10.zzd |= 8;
        g10.zzh = z10;
    }

    static /* synthetic */ void F(G3 g10, int i10) {
        g10.zzd |= 16;
        g10.zzi = i10;
    }

    static /* synthetic */ void G(G3 g10, long j10) {
        g10.zzd |= 4;
        g10.zzg = j10;
    }

    static /* synthetic */ void H(G3 g10, int i10) {
        g10.zzd |= 32;
        g10.zzj = 0;
    }

    static /* synthetic */ void I(G3 g10, boolean z10) {
        g10.zzd |= 2;
        g10.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new G3();
        }
        if (i11 == 4) {
            return new E3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
