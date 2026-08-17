package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class L2 extends AbstractC2461d5 implements F5 {
    private static final L2 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        L2 l10 = new L2();
        zzf = l10;
        AbstractC2461d5.s(L2.class, l10);
    }

    private L2() {
    }

    public static K2 C() {
        return (K2) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", I2.f32534a, "zze", M2.f32573a});
        }
        if (i11 == 3) {
            return new L2();
        }
        if (i11 == 4) {
            return new K2(null);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int E() {
        int iA = J2.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int F() {
        int iA = N2.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final /* synthetic */ void G(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void H(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 2;
    }
}
