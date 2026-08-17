package Be;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f766b;

    public interface a {
        int getNumber();
    }

    public interface b {
        a a(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f765a = bArr;
        f766b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return x.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }
}
