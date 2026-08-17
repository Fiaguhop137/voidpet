package I;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class F1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long[] f4461a = new long[0];

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1021b n(ArrayList arrayList, int i10, int i11) {
        int iS = s(arrayList, i10, i11);
        if (iS >= 0) {
            return (C1021b) arrayList.get(iS);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12, int i12, int i13) {
        int i14 = i10 * 5;
        iArr[i14] = i11;
        iArr[i14 + 1] = ((z10 ? 1 : 0) << 30) | ((z11 ? 1 : 0) << 29) | ((z12 ? 1 : 0) << 28);
        iArr[i14 + 2] = i12;
        iArr[i14 + 3] = 0;
        iArr[i14 + 4] = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(ArrayList arrayList, int i10, int i11) {
        int iS = s(arrayList, i10, i11);
        return iS >= 0 ? iS : -(iS + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int s(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int iA = ((C1021b) arrayList.get(i13)).a();
            if (iA < 0) {
                iA += i11;
            }
            int iE = Intrinsics.e(iA, i10);
            if (iE < 0) {
                i12 = i13 + 1;
            } else {
                if (iE <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 28);
    }

    public static final void u() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = ((z10 ? 1 : 0) << 26) | (iArr[i11] & (-67108865));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 3] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = ((z10 ? 1 : 0) << 27) | (iArr[i11] & (-134217729));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(int[] iArr, int i10, int i11) {
        if (i11 >= 0) {
        }
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }
}
