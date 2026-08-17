package H8;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SecureRandom f4238a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f4238a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
