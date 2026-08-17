package A;

/* JADX INFO: loaded from: classes.dex */
public interface H {
    static /* synthetic */ long c(H h10, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
        }
        if ((i14 & 16) != 0) {
            z10 = false;
        }
        return h10.a(i10, i11, i12, i13, z10);
    }

    long a(int i10, int i11, int i12, int i13, boolean z10);

    void b(int i10, int[] iArr, int[] iArr2, androidx.compose.ui.layout.k kVar);

    p288q0.y d(androidx.compose.ui.layout.p[] pVarArr, androidx.compose.ui.layout.k kVar, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15);

    int e(androidx.compose.ui.layout.p pVar);

    int f(androidx.compose.ui.layout.p pVar);
}
