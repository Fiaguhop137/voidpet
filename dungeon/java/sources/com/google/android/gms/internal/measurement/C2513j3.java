package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2513j3 extends AbstractC2461d5 implements F5 {
    private static final C2513j3 zzg;
    private InterfaceC2506i5 zzb = AbstractC2461d5.w();
    private InterfaceC2506i5 zzd = AbstractC2461d5.w();
    private InterfaceC2515j5 zze = AbstractC2461d5.y();
    private InterfaceC2515j5 zzf = AbstractC2461d5.y();

    static {
        C2513j3 c2513j3 = new C2513j3();
        zzg = c2513j3;
        AbstractC2461d5.s(C2513j3.class, c2513j3);
    }

    private C2513j3() {
    }

    public static C2504i3 K() {
        return (C2504i3) zzg.o();
    }

    public static C2513j3 L() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", Q2.class, "zzf", C2531l3.class});
        }
        if (i11 == 3) {
            return new C2513j3();
        }
        if (i11 == 4) {
            return new C2504i3(null);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List C() {
        return this.zzb;
    }

    public final int D() {
        return this.zzb.size();
    }

    public final List E() {
        return this.zzd;
    }

    public final int F() {
        return this.zzd.size();
    }

    public final List G() {
        return this.zze;
    }

    public final int H() {
        return this.zze.size();
    }

    public final List I() {
        return this.zzf;
    }

    public final int J() {
        return this.zzf.size();
    }

    final /* synthetic */ void M(Iterable iterable) {
        InterfaceC2506i5 interfaceC2506i5 = this.zzb;
        if (!interfaceC2506i5.zza()) {
            this.zzb = AbstractC2461d5.x(interfaceC2506i5);
        }
        AbstractC2612u4.g(iterable, this.zzb);
    }

    final /* synthetic */ void N() {
        this.zzb = AbstractC2461d5.w();
    }

    final /* synthetic */ void O(Iterable iterable) {
        InterfaceC2506i5 interfaceC2506i5 = this.zzd;
        if (!interfaceC2506i5.zza()) {
            this.zzd = AbstractC2461d5.x(interfaceC2506i5);
        }
        AbstractC2612u4.g(iterable, this.zzd);
    }

    final /* synthetic */ void P() {
        this.zzd = AbstractC2461d5.w();
    }

    final /* synthetic */ void Q(Iterable iterable) {
        InterfaceC2515j5 interfaceC2515j5 = this.zze;
        if (!interfaceC2515j5.zza()) {
            this.zze = AbstractC2461d5.z(interfaceC2515j5);
        }
        AbstractC2612u4.g(iterable, this.zze);
    }

    final /* synthetic */ void R() {
        this.zze = AbstractC2461d5.y();
    }

    final /* synthetic */ void S(Iterable iterable) {
        InterfaceC2515j5 interfaceC2515j5 = this.zzf;
        if (!interfaceC2515j5.zza()) {
            this.zzf = AbstractC2461d5.z(interfaceC2515j5);
        }
        AbstractC2612u4.g(iterable, this.zzf);
    }

    final /* synthetic */ void T() {
        this.zzf = AbstractC2461d5.y();
    }
}
