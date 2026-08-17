package Y4;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f16950b;

    public l(a aVar) {
        this(aVar, 16384);
    }

    public l(a aVar, int i10) {
        V4.k.b(Boolean.valueOf(i10 > 0));
        this.f16949a = i10;
        this.f16950b = aVar;
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = (byte[]) this.f16950b.get(this.f16949a);
        long j10 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, this.f16949a);
                if (i10 == -1) {
                    this.f16950b.a(bArr);
                    return j10;
                }
                outputStream.write(bArr, 0, i10);
                j10 += (long) i10;
            } catch (Throwable th) {
                this.f16950b.a(bArr);
                throw th;
            }
        }
    }
}
