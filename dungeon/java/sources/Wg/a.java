package Wg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f15084a = 4096;

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        b(inputStream, outputStream, f15084a);
    }

    public static void b(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        while (true) {
            int i11 = inputStream.read(bArr, 0, i10);
            if (i11 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i11);
            }
        }
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int d(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (i13 < 0) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }
}
