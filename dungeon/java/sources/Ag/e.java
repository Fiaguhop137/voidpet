package Ag;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f401c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f403b;

    static {
        HashMap map = new HashMap();
        map.put(b("SHA-256", 32, 16, 67, 10), new e(1, "XMSS_SHA2_10_256"));
        map.put(b("SHA-256", 32, 16, 67, 16), new e(2, "XMSS_SHA2_16_256"));
        map.put(b("SHA-256", 32, 16, 67, 20), new e(3, "XMSS_SHA2_20_256"));
        map.put(b("SHA-512", 64, 16, 131, 10), new e(4, "XMSS_SHA2_10_512"));
        map.put(b("SHA-512", 64, 16, 131, 16), new e(5, "XMSS_SHA2_16_512"));
        map.put(b("SHA-512", 64, 16, 131, 20), new e(6, "XMSS_SHA2_20_512"));
        map.put(b("SHAKE128", 32, 16, 67, 10), new e(7, "XMSS_SHAKE_10_256"));
        map.put(b("SHAKE128", 32, 16, 67, 16), new e(8, "XMSS_SHAKE_16_256"));
        map.put(b("SHAKE128", 32, 16, 67, 20), new e(9, "XMSS_SHAKE_20_256"));
        map.put(b("SHAKE256", 64, 16, 131, 10), new e(10, "XMSS_SHAKE_10_512"));
        map.put(b("SHAKE256", 64, 16, 131, 16), new e(11, "XMSS_SHAKE_16_512"));
        map.put(b("SHAKE256", 64, 16, 131, 20), new e(12, "XMSS_SHAKE_20_512"));
        f401c = Collections.unmodifiableMap(map);
    }

    private e(int i10, String str) {
        this.f402a = i10;
        this.f403b = str;
    }

    private static String b(String str, int i10, int i11, int i12, int i13) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i10 + "-" + i11 + "-" + i12 + "-" + i13;
    }

    public static e c(String str, int i10, int i11, int i12, int i13) {
        if (str != null) {
            return (e) f401c.get(b(str, i10, i11, i12, i13));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // Ag.w
    public int a() {
        return this.f402a;
    }

    public String toString() {
        return this.f403b;
    }
}
