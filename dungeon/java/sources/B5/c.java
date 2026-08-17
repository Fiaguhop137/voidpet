package B5;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f588a;

    public c(int i10) {
        this.f588a = i10;
    }

    public final Map a(int i10, int i11, int i12) {
        float fD = e.d(e.i(e.e(i12, 1), this.f588a) * b(i10), 0.0f);
        float f10 = i11;
        float fH = f10 / e.h(fD, f10);
        int i13 = 0;
        IntRange intRangeT = e.t(0, i11);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.e(N.e(CollectionsKt.w(intRangeT, 10)), 16));
        for (Object obj : intRangeT) {
            int iIntValue = ((Number) obj).intValue();
            if (((int) (iIntValue % fH)) == 0) {
                i13 = iIntValue;
            }
            linkedHashMap.put(obj, Integer.valueOf(i13));
        }
        return linkedHashMap;
    }

    public final float b(int i10) {
        return i10 / 1000.0f;
    }
}
