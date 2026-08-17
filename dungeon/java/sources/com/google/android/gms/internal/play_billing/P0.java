package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class P0 extends F1 implements InterfaceC2804d2 {
    private static final P0 zzb;
    private K1 zzd = F1.w();

    static {
        P0 p10 = new P0();
        zzb = p10;
        F1.f(P0.class, p10);
    }

    private P0() {
    }

    public static O0 C() {
        return (O0) zzb.q();
    }

    static /* synthetic */ void E(P0 p10, Iterable iterable) {
        K1 k10 = p10.zzd;
        if (!k10.zzc()) {
            int size = k10.size();
            p10.zzd = k10.m(size + size);
        }
        Y0.d(iterable, p10.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", N0.class});
        }
        if (i11 == 3) {
            return new P0();
        }
        if (i11 == 4) {
            return new O0(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
