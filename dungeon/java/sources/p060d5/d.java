package p060d5;

import V4.k;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static long a(InputStream inputStream, long j10) throws IOException {
        k.g(inputStream);
        k.b(Boolean.valueOf(j10 >= 0));
        long j11 = j10;
        while (j11 > 0) {
            long jSkip = inputStream.skip(j11);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    return j10 - j11;
                }
                jSkip = 1;
            }
            j11 -= jSkip;
        }
        return j10;
    }
}
