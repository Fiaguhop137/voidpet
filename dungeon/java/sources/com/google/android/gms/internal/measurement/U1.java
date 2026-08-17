package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class U1 extends AbstractC2461d5 implements F5 {
    private static final U1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        U1 u10 = new U1();
        zzf = u10;
        AbstractC2461d5.s(U1.class, u10);
    }

    private U1() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            InterfaceC2488g5 interfaceC2488g5 = X1.f32771a;
            return AbstractC2461d5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", interfaceC2488g5, "zze", interfaceC2488g5});
        }
        if (i11 == 3) {
            return new U1();
        }
        if (i11 == 4) {
            return new T1(null);
        }
        if (i11 == 5) {
            return zzf;
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
        int iA = Z1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
