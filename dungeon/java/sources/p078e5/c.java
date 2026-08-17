package p078e5;

import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f40435a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f40436b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b f40437c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f40438d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f40439e = a("RIFF");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f40440f = a("WEBP");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f40441g = a("VP8 ");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f40442h = a("VP8L");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f40443i = a("VP8X");

    private static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static boolean b(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f40443i) && ((bArr[i10 + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i10, int i11) {
        return i11 >= 21 && j(bArr, i10 + 12, f40443i);
    }

    public static boolean d(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f40443i) && ((bArr[i10 + 20] & 16) == 16);
    }

    private static boolean e() {
        return true;
    }

    public static boolean f(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f40442h);
    }

    public static boolean g(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, f40441g);
    }

    public static boolean h(byte[] bArr, int i10, int i11) {
        return i11 >= 20 && j(bArr, i10, f40439e) && j(bArr, i10 + 8, f40440f);
    }

    public static b i() {
        b bVar;
        if (f40438d) {
            return f40437c;
        }
        try {
            bVar = (b) WebpBitmapFactoryImpl.class.newInstance();
        } catch (Throwable unused) {
            bVar = null;
        }
        f40438d = true;
        return bVar;
    }

    private static boolean j(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
