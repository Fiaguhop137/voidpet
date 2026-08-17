package V4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        k.g(inputStream);
        k.g(outputStream);
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static int b(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        k.g(inputStream);
        k.g(bArr);
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }
}
