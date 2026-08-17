package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2485g2 extends AbstractC2461d5 implements F5 {
    private static final C2485g2 zzg;
    private int zzb;
    private String zzd = "";
    private InterfaceC2515j5 zze = AbstractC2461d5.y();
    private boolean zzf;

    static {
        C2485g2 c2485g2 = new C2485g2();
        zzg = c2485g2;
        AbstractC2461d5.s(C2485g2.class, c2485g2);
    }

    private C2485g2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", C2575q2.class, "zzf"});
        }
        if (i11 == 3) {
            return new C2485g2();
        }
        if (i11 == 4) {
            return new C2476f2(null);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }
}
