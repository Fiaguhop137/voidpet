package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2602t3 extends AbstractC2461d5 implements F5 {
    private static final C2602t3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C2602t3 c2602t3 = new C2602t3();
        zzg = c2602t3;
        AbstractC2461d5.s(C2602t3.class, c2602t3);
    }

    private C2602t3() {
    }

    public static C2540m3 D() {
        return (C2540m3) zzg.o();
    }

    public static C2602t3 E() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", C2584r3.f33107a, "zze", C2549n3.f33023a, "zzf", C2567p3.f33078a});
        }
        if (i11 == 3) {
            return new C2602t3();
        }
        if (i11 == 4) {
            return new C2540m3(null);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final EnumC2558o3 C() {
        EnumC2558o3 enumC2558o3E = EnumC2558o3.e(this.zze);
        return enumC2558o3E == null ? EnumC2558o3.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : enumC2558o3E;
    }

    final /* synthetic */ void F(EnumC2558o3 enumC2558o3) {
        this.zze = enumC2558o3.zza();
        this.zzb |= 2;
    }

    public final int H() {
        int iA = AbstractC2593s3.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int I() {
        int iA = AbstractC2576q3.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final /* synthetic */ void J(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void K(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }
}
