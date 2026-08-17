package com.google.android.gms.internal.auth;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class H1 extends C0 implements InterfaceC2355a1 {
    private static final H1 zzb;
    private E0 zzd = C0.g();

    static {
        H1 h10 = new H1();
        zzb = h10;
        C0.l(H1.class, h10);
    }

    private H1() {
    }

    public static H1 r(byte[] bArr) {
        return (H1) C0.f(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.auth.C0
    protected final Object o(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return C0.i(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new H1();
        }
        if (i11 == 4) {
            return new G1(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final List s() {
        return this.zzd;
    }
}
