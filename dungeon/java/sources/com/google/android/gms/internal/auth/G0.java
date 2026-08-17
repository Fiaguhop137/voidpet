package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f32216a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f32217b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f32218c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f32219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f32220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC2413u0 f32221f;

    static {
        byte[] bArr = new byte[0];
        f32219d = bArr;
        f32220e = ByteBuffer.wrap(bArr);
        int i10 = AbstractC2413u0.f32460a;
        C2407s0 c2407s0 = new C2407s0(bArr, 0, 0, false, null);
        try {
            c2407s0.c(0);
            f32221f = c2407s0;
        } catch (H0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f32217b);
    }
}
