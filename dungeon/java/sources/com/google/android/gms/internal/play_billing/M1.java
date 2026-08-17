package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f34480a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f34481b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f34481b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = AbstractC2858o1.f34793a;
        try {
            new C2848m1(bArr, 0, 0, false, null).c(0);
        } catch (O1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
