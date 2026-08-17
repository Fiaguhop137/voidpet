package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
abstract class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1 f32214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f32215b = 0;

    static {
        if (A1.u() && A1.v()) {
            int i10 = AbstractC2363d0.f32305a;
        }
        f32214a = new D1();
    }

    static /* bridge */ /* synthetic */ int a(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            byte b11 = bArr[i10];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i10];
        byte b13 = bArr[i10 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b10);
    }

    static boolean b(byte[] bArr) {
        return f32214a.b(bArr, 0, bArr.length);
    }

    static boolean c(byte[] bArr, int i10, int i11) {
        return f32214a.b(bArr, i10, i11);
    }
}
