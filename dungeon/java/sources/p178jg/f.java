package p178jg;

import Ug.d;
import java.util.HashMap;
import java.util.Map;
import p143hg.b;

/* JADX INFO: loaded from: classes3.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f47474d;

    f(int i10) {
        HashMap map = new HashMap();
        this.f47474d = map;
        if (((-65535) & i10) != 1) {
            throw new IllegalArgumentException();
        }
        this.f47471a = i10;
        int i11 = (i10 + 63) >>> 6;
        this.f47472b = i11;
        this.f47473c = i11 * 2;
        b(map, i10);
    }

    private static int a(int i10, int i11, int i12) {
        int i13 = 1;
        while (i12 >= 32) {
            i13 = (int) ((((4294967295L & ((long) (i11 * i13))) * ((long) i10)) + ((long) i13)) >>> 32);
            i12 -= 32;
        }
        if (i12 <= 0) {
            return i13;
        }
        return (int) ((((4294967295L & ((long) ((i11 * i13) & ((-1) >>> (-i12))))) * ((long) i10)) + ((long) i13)) >>> i12);
    }

    private static void b(Map map, int i10) {
        int i11;
        int i12 = i10 - 2;
        int iA = 32 - d.a(i12);
        int iA2 = b.a(-i10);
        for (int i13 = 1; i13 < iA; i13++) {
            int i14 = 1 << (i13 - 1);
            if (i14 >= 64 && !map.containsKey(d.b(i14))) {
                map.put(d.b(i14), d.b(a(i10, iA2, i14)));
            }
            int i15 = 1 << i13;
            if ((i12 & i15) != 0 && (i11 = (i15 - 1) & i12) >= 64 && !map.containsKey(d.b(i11))) {
                map.put(d.b(i11), d.b(a(i10, iA2, i11)));
            }
        }
    }
}
