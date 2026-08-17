package Ag;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class l implements w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f429c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f431b;

    static {
        HashMap map = new HashMap();
        map.put(b("SHA-256", 32, 16, 67), new l(16777217, "WOTSP_SHA2-256_W16"));
        map.put(b("SHA-512", 64, 16, 131), new l(33554434, "WOTSP_SHA2-512_W16"));
        map.put(b("SHAKE128", 32, 16, 67), new l(50331651, "WOTSP_SHAKE128_W16"));
        map.put(b("SHAKE256", 64, 16, 131), new l(67108868, "WOTSP_SHAKE256_W16"));
        f429c = Collections.unmodifiableMap(map);
    }

    private l(int i10, String str) {
        this.f430a = i10;
        this.f431b = str;
    }

    private static String b(String str, int i10, int i11, int i12) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + "-" + i10 + "-" + i11 + "-" + i12;
    }

    protected static l c(String str, int i10, int i11, int i12) {
        if (str != null) {
            return (l) f429c.get(b(str, i10, i11, i12));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // Ag.w
    public int a() {
        return this.f430a;
    }

    public String toString() {
        return this.f431b;
    }
}
