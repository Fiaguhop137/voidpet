package C5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.K;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1457a;

    public h(int i10) {
        this.f1457a = i10;
    }

    public final int a(int i10) {
        int i11 = i10 % this.f1457a;
        Integer numValueOf = Integer.valueOf(i11);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11 + this.f1457a;
    }

    public final int b() {
        return this.f1457a;
    }

    public final boolean c(int i10, int i11, int i12) {
        int iA = a(i12 + i10);
        if (i10 < iA) {
            return i10 <= i11 && i11 <= iA;
        }
        return (i10 <= i11 && i11 <= this.f1457a) || (i11 >= 0 && i11 <= iA);
    }

    public final List d(int i10, int i11) {
        IntRange intRangeT = kotlin.ranges.e.t(0, i11);
        ArrayList arrayList = new ArrayList(CollectionsKt.w(intRangeT, 10));
        Iterator it = intRangeT.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(a(((K) it).nextInt() + i10)));
        }
        return arrayList;
    }
}
