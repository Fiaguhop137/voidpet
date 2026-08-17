package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2495h3 extends AbstractC2461d5 implements F5 {
    private static final C2495h3 zzf;
    private int zzb;
    private int zzd = 1;
    private InterfaceC2515j5 zze = AbstractC2461d5.y();

    static {
        C2495h3 c2495h3 = new C2495h3();
        zzf = c2495h3;
        AbstractC2461d5.s(C2495h3.class, c2495h3);
    }

    private C2495h3() {
    }

    public static C2477f3 C() {
        return (C2477f3) zzf.o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", C2486g3.f32918a, "zze", U2.class});
        }
        if (i11 == 3) {
            return new C2495h3();
        }
        if (i11 == 4) {
            return new C2477f3(null);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    final /* synthetic */ void D(U2 u10) {
        u10.getClass();
        InterfaceC2515j5 interfaceC2515j5 = this.zze;
        if (!interfaceC2515j5.zza()) {
            this.zze = AbstractC2461d5.z(interfaceC2515j5);
        }
        this.zze.add(u10);
    }
}
