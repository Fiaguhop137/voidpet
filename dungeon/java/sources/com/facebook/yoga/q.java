package com.facebook.yoga;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q {
    public static long a(float f10, float f11) {
        return ((long) Float.floatToRawIntBits(f11)) | (((long) Float.floatToRawIntBits(f10)) << 32);
    }

    public static long b(int i10, int i11) {
        return a(i10, i11);
    }
}
