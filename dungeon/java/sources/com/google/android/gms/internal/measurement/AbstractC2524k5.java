package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2524k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f32965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f32966b;

    static {
        Charset.forName("US-ASCII");
        f32965a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f32966b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = K4.f32555a;
        try {
            new J4(bArr, 0, 0, false, null).c(0);
        } catch (C2542m5 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static int b(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int c(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static boolean d(E5 e10) {
        return false;
    }
}
