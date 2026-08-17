package Vg;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f14365a = new d();

    public static byte[] a(String str) {
        try {
            return f14365a.a(str, 0, str.length());
        } catch (Exception e10) {
            throw new a("exception decoding Hex string: " + e10.getMessage(), e10);
        }
    }

    public static byte[] b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public static byte[] c(byte[] bArr, int i10, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f14365a.b(bArr, i10, i11, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new b("exception encoding Hex string: " + e10.getMessage(), e10);
        }
    }
}
