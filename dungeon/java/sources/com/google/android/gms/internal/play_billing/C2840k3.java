package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2840k3 extends F1 implements InterfaceC2804d2 {
    private static final C2840k3 zzb;
    private int zzd;
    private int zze;

    static {
        C2840k3 c2840k3 = new C2840k3();
        zzb = c2840k3;
        F1.f(C2840k3.class, c2840k3);
    }

    private C2840k3() {
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    protected final Object m(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return F1.A(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C2830i3.f34735a});
        }
        if (i11 == 3) {
            return new C2840k3();
        }
        if (i11 == 4) {
            return new C2825h3(null);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
