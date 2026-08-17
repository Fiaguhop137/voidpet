package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class S1 extends AbstractC2461d5 implements F5 {
    private static final S1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        S1 s10 = new S1();
        zzg = s10;
        AbstractC2461d5.s(S1.class, s10);
    }

    private S1() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", X1.f32771a, "zze", V1.f32750a, "zzf", C2449c2.f32881a});
        }
        if (i11 == 3) {
            return new S1();
        }
        if (i11 == 4) {
            return new R1(null);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int D() {
        int iA = Z1.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int E() {
        int iA = W1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int F() {
        int iA = AbstractC2458d2.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
