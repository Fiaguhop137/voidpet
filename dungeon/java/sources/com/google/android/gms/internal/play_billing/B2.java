package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
abstract class B2 {
    protected static final int a(String str, byte[] bArr, int i10, int i11) {
        byte[] bytes = str.getBytes(M1.f34480a);
        int length = bytes.length;
        if (length - i10 > i11) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i10, length);
        return i10 + length;
    }
}
