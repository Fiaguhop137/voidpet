package p324s0;

/* JADX INFO: loaded from: classes.dex */
abstract class A0 {
    public static final void a(int[] iArr, C4159y c4159y) {
        int iMin;
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (c(iArr)) {
            iMin = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i10 += ((iArr[4] != 0 ? 1 : 0) | (d(iArr) ? 1 : 0)) ^ 1;
            i11 += ((!d(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        } else {
            iMin = iArr[2] - iArr[0];
        }
        c4159y.g(i10, i11, iMin);
    }

    public static int[] b(int[] iArr) {
        return iArr;
    }

    private static final boolean c(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    private static final boolean d(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }
}
