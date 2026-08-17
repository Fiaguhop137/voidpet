package Mf;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    private static byte[] a(MessageDigest messageDigest, InputStream inputStream) {
        return e(messageDigest, inputStream).digest();
    }

    public static MessageDigest b(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static MessageDigest c() {
        return b("MD5");
    }

    public static byte[] d(InputStream inputStream) {
        return a(c(), inputStream);
    }

    public static MessageDigest e(MessageDigest messageDigest, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        int i10 = inputStream.read(bArr, 0, 1024);
        while (i10 > -1) {
            messageDigest.update(bArr, 0, i10);
            i10 = inputStream.read(bArr, 0, 1024);
        }
        return messageDigest;
    }
}
