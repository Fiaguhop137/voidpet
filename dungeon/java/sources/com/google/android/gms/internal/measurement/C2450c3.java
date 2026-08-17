package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2450c3 extends AbstractC2461d5 implements F5 {
    private static final C2450c3 zzh;
    private int zzb;
    private InterfaceC2515j5 zzd = AbstractC2461d5.y();
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        C2450c3 c2450c3 = new C2450c3();
        zzh = c2450c3;
        AbstractC2461d5.s(C2450c3.class, c2450c3);
    }

    private C2450c3() {
    }

    public static Z2 J() {
        return (Z2) zzh.o();
    }

    public static Z2 K(C2450c3 c2450c3) {
        AbstractC2443b5 abstractC2443b5O = zzh.o();
        abstractC2443b5O.r(c2450c3);
        return (Z2) abstractC2443b5O;
    }

    private final void S() {
        InterfaceC2515j5 interfaceC2515j5 = this.zzd;
        if (interfaceC2515j5.zza()) {
            return;
        }
        this.zzd = AbstractC2461d5.z(interfaceC2515j5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2461d5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2461d5.t(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", C2468e3.class, "zze", "zzf", "zzg", C2441b3.f32866a});
        }
        if (i11 == 3) {
            return new C2450c3();
        }
        if (i11 == 4) {
            return new Z2(null);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List C() {
        return this.zzd;
    }

    public final int D() {
        return this.zzd.size();
    }

    public final C2468e3 E(int i10) {
        return (C2468e3) this.zzd.get(i10);
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final String G() {
        return this.zze;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final String I() {
        return this.zzf;
    }

    final /* synthetic */ void L(int i10, C2468e3 c2468e3) {
        c2468e3.getClass();
        S();
        this.zzd.set(i10, c2468e3);
    }

    final /* synthetic */ void M(C2468e3 c2468e3) {
        c2468e3.getClass();
        S();
        this.zzd.add(c2468e3);
    }

    final /* synthetic */ void N(Iterable iterable) {
        S();
        AbstractC2612u4.g(iterable, this.zzd);
    }

    final /* synthetic */ void O() {
        this.zzd = AbstractC2461d5.y();
    }

    final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }
}
